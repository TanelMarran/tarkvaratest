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
    def _test_apps_delete(self):
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
    def _test_move_folders(self):
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
     
if __name__ == '__main__':
    #suite = unittest.TestLoader().loadTestsFromModule(sys.modules[__name__])
    suite = unittest.TestLoader().loadTestsFromTestCase(Folders) 
    unittest.TextTestRunner().run(suite) #verbosity=3
    #reporter = createReporter(NAME)
    #reporter.run(suite)