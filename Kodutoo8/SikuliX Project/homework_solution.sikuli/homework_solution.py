import helperClass
reload(helperClass)
from helperClass import *
import time
import unittest

# ---------------------------------
# HERE IS WHERE THE LAB PART STARTS
# ---------------------------------

class Buttons(unittest.TestCase):

    # At first we create an instance of helperClass. 
    h = Helper("Lab")  # name of the jar
    
    def setUp(self):
        self.h.openSUT()
        #click(*tab that you want to open*)
        time.sleep(0.2)

    def tearDown(self):
        self.h.closeSUT()

    # After clicking each button, a text will appear below the buttons. For green
    # button it will be "Green button was clicked!", red -> "Red button was clicked!"
    # and pink -> "Pink button was clicked!". ["test_buttons_text"]
    def test_buttons_text(self):
        buttons = [Pattern("button-1.png").similar(0.77), Pattern("button2-1.png").exact(), Pattern("button_pink-1.png").exact()]
        expectations = [ "Green button was clicked!", "Red button was clicked!",  "Pink button was clicked!"] 
        for i in range(3):
            click(buttons[i])
            time.sleep(1)
            area = Pattern("area-1.png").similar(0.75)
            r = find(area)
            actual = r.collectLinesText()[0]
            # expected vs actual
            self.assertEquals(expectations[i], actual)

    def test_buttons_unchanged(self):
        btns = [Pattern("button-1.png").similar(0.77), Pattern("button2-1.png").similar(0.87), Pattern("button_pink-1.png").exact()]
        for i in range(3):
            click(btns[i])
            time.sleep(1)
            self.assertIsNotNone(exists(btns[i]))

class Editor(unittest.TestCase):

    # At first we create an instance of helperClass. 
    h = Helper("Lab")  # name of the jar
    
    def setUp(self):
        self.h.openSUT()
        click("1586498314931-1.png")
        time.sleep(0.2)

    def tearDown(self):
        self.h.closeSUT()

    # After closing and opening the pane, text in the text editor must stay the same.
    # [“test_editor”]
    def test_editor(self):
        time.sleep(2)
        if exists(Pattern("1586502582598-1.png").similar(0.74).targetOffset(-285,-209)):
            click()
            
        click(Pattern("1586498485123-1.png").targetOffset(-230,-137))
        type("test")
        
        copied = copyAllText()
        self.assertEqual(copied, "test")
        
        click("1586498528002-1.png")
        click()
        click(Pattern("1586498485123-1.png").targetOffset(-230,-137))
        
        copied = copyAllText()
        self.assertEqual(copied, "test")

class Copyable(unittest.TestCase):

    # At first we create an instance of helperClass. 
    h = Helper("Lab")  # name of the jar
    
    def setUp(self):
        self.h.openSUT()
        click("1586499194863-1.png")
        time.sleep(0.2)

    def tearDown(self):
        self.h.closeSUT()

    # Each word should be copyable. [“test_copyable”]
    def test_copyable(self):
        images = [Pattern("1586499624846-1.png").similar(0.43).targetOffset(-2,-109),Pattern("1586499883857-1.png").similar(0.53),Pattern("1586499890253-1.png").similar(0.55),Pattern("1586499899454-1.png").similar(0.44),"1586499907128-1.png"]
        texts = ['First','Second','Third','Forth','Fifth']
        for i in range(len(images)):
            doubleClick(images[i])
            copied = copySelectedText()
            self.assertEqual(copied,texts[i])
            click()
            copied = ''

class Folder(unittest.TestCase):

    # At first we create an instance of helperClass. 
    h = Helper("Lab")  # name of the jar
    
    def _setUp(self):
        self.h.openSUT()
        click("1586500540757-1.png")
        time.sleep(0.2)

    def _tearDown(self):
        self.h.closeSUT()

    # Folders can take a maximum of two “apps”. [“test_folder”]
    def _test_folder(self):
        folder = "folder-1.png"
        app = "app-1.png"
        currentapps = len(list(findAll(app)))
        for i in range(3):
            mouseMove(app)
            mouseDown(Button.LEFT)
            mouseMove(folder)
            mouseUp()
        self.assertEqual(currentapps-2,len(list(findAll(app))))

class Resizer(unittest.TestCase):

    # At first we create an instance of helperClass. 
    h = Helper("Lab")  # name of the jar
    
    def _setUp(self):
        self.h.openSUT()
        click("1586501772982-1.png")
        time.sleep(0.2)

    def _tearDown(self):
        self.h.closeSUT()

    def _create_reg(self):
        borders = findAllList("1586501807934-1.png") #Get both of the borders
        sorted_borders = sorted(borders, key=lambda m:m.x) #sort them by their x coord
        reg = Region(sorted_borders[0].x + sorted_borders[0].w, #create a region between these two borders
                    sorted_borders[0].y,
                    sorted_borders[1].x - sorted_borders[0].x - sorted_borders[0].w,
                    sorted_borders[0].h)
        return reg

    # After “resizing” the screen folder buttons should stay in the confinements of
    # the borders. [“test_resizer”]
    def _test_resizer(self):
        device = [Pattern("1586501881540-1.png").targetOffset(-124,-7),"1586501881540-1.png",Pattern("1586501881540-1.png").targetOffset(128,-2)]
        number_of_folders = len(findAllList("1586502065536-1.png"))
        for i in range(len(device)):
            click(device[i])
            region = self.create_reg()
            self.assertEqual(number_of_folders,len(region.findAllList("1586502065536-1.png")))






# --------------------------------------
# HERE IS WHERE THE HOMEWORK PART STARTS
# --------------------------------------

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
        app_image = Pattern("app_image.png").targetOffset(-1,-1)
        blue_folder = "blue_folder_core.png"
        number_of_apps = len(findAllList(app_image))
        mouseMove(app_image)
        mouseDown(Button.LEFT)
        mouseMove(blue_folder)
        mouseUp()
        self.assertEqual(len(findAllList(app_image)),number_of_apps-1)

    # Dragging a folder over a folder doesn’t make anything disappear.
    # Dragged folder should appear to be on top of other folder. [“test_move_folders”]
    def test_move_folders(self):
        blue_folder = Pattern("blue_folder_core.png").similar(0.75)
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
        blue_folder = "blue_folder_core.png"
        pad = 15
        for i in range(4):
            x = 0 if i > 1 else (i*2-1)
            y = 0 if i < 2 else ((i-2)*2-1)
            mouseMove(blue_folder)
            mouseDown(Button.LEFT)
            target = Location(app_region.getX()+app_region.getW()/2+x*(app_region.getW()/2-pad),app_region.getY()+app_region.getH()/2+y*(app_region.getH()/2-pad))
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
        self.assertEqual(exists(invalid_result), None)

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
        
class PinCode(unittest.TestCase):

    # At first we create an instance of helperClass. 
    h = Helper("Homework")  # name of the jar
    
    def setUp(self):
        self.h.openSUT()
        click("1586513393232.png")
        time.sleep(0.2)

    def tearDown(self):
        self.h.closeSUT()

    def pressKey(self, number):
        if number == 0:
            number = 10
        else:
            number -= 1
        click(Pattern('pin_pad.png').targetOffset(-63+55*(number%3),-94+45*int(number/3)))
        
    #For each number pressed (max is 4) an “X” should appear in the output
    #rectangle. [“test_pin_x”]
    def test_pin_x(self):
        for i in range(10):
            self.pressKey(i)
            self.assertNotEqual('XXXXX',find("pin_pad.png").collectLinesText()[0])
    # When 4 numbers are pressed and password is correct (“1234”), pin code
    # system should be replaced by empty screen with message “Welcome, *user*!”
    # (where *user* is a random name). [“test_pin_unlock”]
    def test_pin_unlock(self):
        for i in range(4):
            self.pressKey(i+1)
        self.assertNotEqual(exists("1586514403692.png"),None)

    # Only when 4 numbers are pressed and password is wrong, an icon of closed
    # lock appears on top of the output rectangle. [“test_pin_lock”]
    def test_pin_lock(self):
        lock = "lock.png"
        self.pressKey(1)
        self.assertEqual(exists(lock),None)
        self.pressKey(3)
        self.assertEqual(exists(lock),None)
        self.pressKey(5)
        self.assertEqual(exists(lock),None)
        self.pressKey(3)
        self.assertNotEqual(exists(lock),None)
        erase = "erase.png"
        click(erase)
        click(erase)
        click(erase)
        click(erase)
        for i in range(4):
            self.pressKey(i+1)
        self.assertEqual(exists(lock),None)
        
class Converter(unittest.TestCase):
    h = Helper("Homework")
    
    def setUp(self):
        self.h.openSUT()
        click("1586628848063.png")
        time.sleep(0.2)

    def tearDown(self):
        self.h.closeSUT()

    def test_text2uni(self):
        click(find(Pattern("1586629627550.png").targetOffset(-2,3)))
        type("test")
        res = find("1586630698349.png").collectLinesText()[0]
        isUnicode = True
        for el in res:
            if el in "0123456789 ":
                continue
            else:
                isUnicode = False
        click(find(Pattern("1586629627550.png").targetOffset(-2,3)))
        type(Key.BACKSPACE)
        type(Key.BACKSPACE)
        type(Key.BACKSPACE)
        type(Key.BACKSPACE)
        self.assertEqual(isUnicode, True)
        
    def test_fields(self):
        click(find(Pattern("1586629627550.png").targetOffset(-2,3)))
        type("test")
        type(Key.BACKSPACE)
        type(Key.BACKSPACE)
        type(Key.BACKSPACE)
        type(Key.BACKSPACE)
        copiedInitial = copyAllText()
        click(find(Pattern("1586798617755.png").targetOffset(-2,4)))
        type("test")
        copiedAgain = copyAllText()
        self.assertEqual(copiedAgain, copiedInitial)

    def test_switch(self):
        arrow = "arrow.png"
        area = find(arrow)
        click(Pattern("1586638926804.png").targetOffset(-20,-137))
        wait(0.2)

        self.assertEqual(area.exists(arrow), None)

    def test_uni2text(self):
        click(Pattern("1586637589650.png").targetOffset(-18,4))
        click(Pattern("1586637658034.png").targetOffset(-155,39))
        s = "116 101 115 116"
        type(s)
        click(Pattern("1586637658034.png").targetOffset(150,7))
        copied = copyAllText() 

        self.assertEqual(copied, "test")

        click(Pattern("1586637658034.png").targetOffset(-155,39))
        for i in range(len(s)):
            type(Key.BACKSPACE)
            
        type("test")
        click(Pattern("1586637658034.png").targetOffset(150,7))
        copiedAgain = copyAllText()
        click(Pattern("1586636624086.png").targetOffset(18,3))
        self.assertEqual(copiedAgain, "Error! Not unicode")

class CatFlower(unittest.TestCase):
    h = Helper("Homework")

    def setUp(self):
        self.h.openSUT()
        click("1586726765620.png")
        time.sleep(0.2)

    def tearDown(self):
        self.h.closeSUT()
        
    def test_place_cat(self):
        cats = ["1586792026663.png","1586792042800.png","1586792058107.png"]
        rock = find("1586791864697.png")
        for cat in cats:
            if exists(cat) is not None:
                click(cat)
                click(rock)
                wait(0.2)
                self.assertIsNotNone(rock.exists(cat))
                break
        

    def test_cat_moves(self):
        cats = ["1586792026663.png","1586792042800.png","1586792058107.png"]
        selectedCat = None
        coordinates = []
        rock = Pattern("rock.png").targetOffset(-10,-124)
        for cat in cats:
            if exists(cat) is not None:
                selectedCat = cat
                click(selectedCat)
                click(rock)
                break

        for t in range(10):
            t1 = time.time()
            coordinates.append(find(selectedCat).getTarget())
            t2 = time.time()
            wait(1 - (t2 - t1))

        d1 = coordinates[0].x - coordinates[1].x
        for i in range(1, len(coordinates) - 1):
            d2 = coordinates[i].x - coordinates[i+1].x
            if d2 == 0:
                i += 1
                continue
            self.assertEqual(d2, d1)
        
    def test_flower_gone(self):
        flower = "flower.png"
        count = 0
        for i in findAll(flower):
            count += 1
        click(Pattern("1586728969885.png").similar(0.39).targetOffset(-4,-48))
        click(Pattern("1586729051924.png").targetOffset(-5,118))
        wait(10)
        secondCount = 0
        for i in findAll(flower):
            secondCount += 1
        self.assertNotEqual(count - secondCount, 0)

    def test_cats_win(self):
        checkmark = "1586728816812.png"
        click(Pattern("1586728969885.png").similar(0.10).targetOffset(-4,-48))
        click(Pattern("1586729051924.png").targetOffset(-6,-124))
        self.assertEqual(exists(checkmark),None)
        click(Pattern("1586728969885.png").targetOffset(-4,-48))
        click(Pattern("1586729051924.png").targetOffset(-5,-4))
        self.assertEqual(exists(checkmark),None)
        click(Pattern("1586728969885.png").targetOffset(-4,-48))
        click(Pattern("1586729051924.png").targetOffset(-5,118))
        self.assertIsNotNone(exists(checkmark))

    def test_cat_backup(self):
        firstCat = Pattern("firstCat.png").similar(0.90)
        secondCat = Pattern("secondCat.png").similar(0.90)
        thirdCat = Pattern("thirdCat.png").similar(0.90)

        count = 0
        if exists(firstCat):
            for i in findAll(firstCat):
                count += 1
        if exists(secondCat):
            for i in findAll(secondCat):
                count += 1
        if exists(thirdCat):
            for i in findAll(thirdCat):
                count += 1

        click(Pattern("1586728969885.png").similar(0.39).targetOffset(-4,-48))
        click(Pattern("1586729051924.png").targetOffset(-5,118))

        secondCount = 0
        if exists(firstCat):
            for i in findAll(firstCat):
                secondCount += 1
        if exists(secondCat):
            for i in findAll(secondCat):
                secondCount += 1
        if exists(thirdCat):
            for i in findAll(thirdCat):
                secondCount += 1

        self.assertEqual(count,secondCount)


    
if __name__ == '__main__':
    suite = unittest.TestLoader().loadTestsFromModule(sys.modules[__name__])
    #suite = unittest.TestLoader().loadTestsFromTestCase(Folders) 
    #unittest.TextTestRunner().run(suite) #verbosity=3
    reporter = createReporter("swt08")
    reporter.run(suite)