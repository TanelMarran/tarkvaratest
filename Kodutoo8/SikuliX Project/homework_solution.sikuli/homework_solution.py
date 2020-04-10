import helperClass
reload(helperClass)
from helperClass import *
import time
import unittest

class Folders(unittest.TestCase):

    # At first we create an instance of helperClass. 
    h = Helper("Homework")  # name of the jar
    
    def setUp(self):
        self.h.openSUT()
        #click(*tab that you want to open*)
        time.sleep(0.2)

    def tearDown(self):
        self.h.closeSUT()

    def create_reg(self):

        app_image = findAllList("1586508081742.png")[0]

        return Region(app_image.x,app_image.y,app_image.w,app_image.h)

    # Dragging an icon to the folder makes it disappear from the screen.
    # [“test_apps_delete”]
    def test_apps_delete(self):
        app_image = "app_image.png"
        blue_folder = "blue_folder.png"
        number_of_apps = len(findAllList(app_image))
        mouseMove(app_image)
        mouseDown(Button.LEFT)
        mouseMove(blue_folder)
        mouseUp()
        self.assertEqual(len(findAllList(app_image)),number_of_apps-1)

    # Dragging a folder over a folder doesn’t make anything disappear.
    # Dragged folder should appear to be on top of other folder. [“test_move_folders”]
    def test_move_folders(self):
        blue_folder = Pattern("blue_folder.png").similar(0.75)
        orange_folder = Pattern("orange_folder.png").similar(0.91)
        green_folder = Pattern("green_folder.png").similar(0.91)
        images = [blue_folder,orange_folder,green_folder]
        for i in range(3):
            mouseMove(images[i])
            reset = Env.getMouseLocation()
            for j in range(3):
                if i == j:
                    pass
                else:
                    mouseDown(Button.LEFT)
                    mouseMove(images[j])
                    mouseUp()
                    self.assertNotEqual(exists(images[i]),None)
            mouseDown(Button.LEFT)
            mouseMove(reset)
            mouseUp()

    # Context menu should always stay in the borders of the “toy” application. (Test
    # each border). [“test_menu”]
    def test_menu(self):
        app_region = self.create_reg()
        blue_folder = "blue_folder.png"
        pad = 25
        for x in range(2):
            for y in range(2):
                mouseMove(blue_folder)
                mouseDown(Button.LEFT)
                target = Location(app_region.getX()+pad+x*(app_region.getW()-2*pad),app_region.getY()+pad+y*(app_region.getH()-2*pad))
                mouseMove(target)
                mouseUp()
                rightClick(blue_folder)
                try:
                    mouseMove("1586509381219.png")
                except:
                    mouseMove("1586509560088.png")
                self.assertEquals(len(app_region.findAllList("1586509423568.png")),1)
                mouseMove("1586507956362.png")
                click()

class Calculator(unittest.TestCase):

    # At first we create an instance of helperClass. 
    h = Helper("Homework")  # name of the jar
    
    def setUp(self):
        self.h.openSUT()
        click("1586510426740.png")
        time.sleep(0.2)

    def tearDown(self):
        self.h.closeSUT()

    # Black output rectangle must be empty when nothing was typed. When
    # something was typed, the rectangle must show everything that was typed.
    # The rectangle must display 20 characters at the most. [“test_calc_black”]
    def test_calc_black(self):
        calculator = Pattern("calculator.png").targetOffset(-88,-3)
        invalid_result = "invalid_result.png"
        for i in range(21):
            click(calculator)
        assert exists(invalid_result) == None

    #Purple output rectangle must show “0” when nothing was typed. When
    #something is typed, the rectangle must output only the answer (e.g. typing
    #“2+2” outputs “4”). When expression is not full (e.g. “2*3+”) rectangle must
    #output the last answer (“6” in this case). [“test_calc_purple”]
    def test_calc_purple(self):
        purple = "purple.png"
        delete = Pattern("calculator.png").targetOffset(0,102)
        one = Pattern("calculator.png").targetOffset(-81,-1)
        eight = Pattern("calculator.png").targetOffset(-30,-102)
        plus = Pattern("calculator.png").targetOffset(86,48)
        divide = Pattern("calculator.png").targetOffset(86,-96)
       
        self.assertEqual('0',findAllList(purple)[0].collectLinesText()[0])
        click(eight)
        click(plus)
        self.assertEqual('8',findAllList(purple)[0].collectLinesText()[0])
        click(one)
        self.assertEqual('9',findAllList(purple)[0].collectLinesText()[0])
        click(divide)
        click(eight)
        self.assertEqual('8.125',findAllList(purple)[0].collectLinesText()[0])
        for i in range(5):
            click(delete)
        self.assertEqual('0',findAllList(purple)[0].collectLinesText()[0])
        
    # When typing an expression that is mathematically impossible, the purple
    # output rectangle must show “Error”. [“test_calc_err”]
    def test_calc_err(self):
        purple = "purple.png"
        click(Pattern("calculator.png").targetOffset(-28,-55))
        click(Pattern("calculator.png").targetOffset(82,-98))
        click(Pattern("calculator.png").targetOffset(-42,46))
        self.assertEqual('Error',findAllList(purple)[0].collectLinesText()[0])
        

if __name__ == '__main__':
    #suite = unittest.TestLoader().loadTestsFromModule(sys.modules[__name__])
    suite = unittest.TestLoader().loadTestsFromTestCase(Calculator) 
    unittest.TextTestRunner().run(suite) #verbosity=3
    #reporter = createReporter(NAME)
    #reporter.run(suite)