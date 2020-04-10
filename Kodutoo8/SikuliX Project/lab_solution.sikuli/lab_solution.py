import helperClass
reload(helperClass)
from helperClass import *
import time
import unittest

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
        buttons = [Pattern("button.png").similar(0.77), Pattern("button2.png").exact(), Pattern("button_pink.png").exact()]
        expectations = [ "Green button was clicked!", "Red button was clicked!",  "Pink button was clicked!"] 
        for i in range(3):
            click(buttons[i])
            time.sleep(1)
            area = Pattern("area.png").similar(0.75)
            r = find(area)
            actual = r.collectLinesText()[0]
            # expected vs actual
            self.assertEquals(expectations[i], actual)

    def test_buttons_unchanged(self):
        btns = [Pattern("button.png").similar(0.77), Pattern("button2.png").similar(0.87), Pattern("button_pink.png").exact()]
        for i in range(3):
            click(btns[i])
            time.sleep(1)
            self.assertIsNotNone(exists(btns[i]))

class Editor(unittest.TestCase):

    # At first we create an instance of helperClass. 
    h = Helper("Lab")  # name of the jar
    
    def setUp(self):
        self.h.openSUT()
        click("1586498314931.png")
        time.sleep(0.2)

    def tearDown(self):
        self.h.closeSUT()

    # After closing and opening the pane, text in the text editor must stay the same.
    # [“test_editor”]
    def test_editor(self):
        time.sleep(2)
        if exists(Pattern("1586502582598.png").similar(0.74).targetOffset(-285,-209)):
            click()
            
        click(Pattern("1586498485123.png").targetOffset(-230,-137))
        type("test")
        
        copied = copyAllText()
        self.assertEqual(copied, "test")
        
        click("1586498528002.png")
        click()
        click(Pattern("1586498485123.png").targetOffset(-230,-137))
        
        copied = copyAllText()
        self.assertEqual(copied, "test")

class Copyable(unittest.TestCase):

    # At first we create an instance of helperClass. 
    h = Helper("Lab")  # name of the jar
    
    def setUp(self):
        self.h.openSUT()
        click("1586499194863.png")
        time.sleep(0.2)

    def tearDown(self):
        self.h.closeSUT()

    # Each word should be copyable. [“test_copyable”]
    def test_copyable(self):
        images = [Pattern("1586499624846.png").similar(0.43).targetOffset(-2,-109),Pattern("1586499883857.png").similar(0.53),Pattern("1586499890253.png").similar(0.55),Pattern("1586499899454.png").similar(0.44),"1586499907128.png"]
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
    
    def setUp(self):
        self.h.openSUT()
        click("1586500540757.png")
        time.sleep(0.2)

    def tearDown(self):
        self.h.closeSUT()

    # Folders can take a maximum of two “apps”. [“test_folder”]
    def test_folder(self):
        folder = "folder.png"
        app = "app.png"
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
    
    def setUp(self):
        self.h.openSUT()
        click("1586501772982.png")
        time.sleep(0.2)

    def tearDown(self):
        self.h.closeSUT()

    def create_reg(self):
        borders = findAllList("1586501807934.png") #Get both of the borders
        sorted_borders = sorted(borders, key=lambda m:m.x) #sort them by their x coord
        reg = Region(sorted_borders[0].x + sorted_borders[0].w, #create a region between these two borders
                    sorted_borders[0].y,
                    sorted_borders[1].x - sorted_borders[0].x - sorted_borders[0].w,
                    sorted_borders[0].h)
        return reg

    # After “resizing” the screen folder buttons should stay in the confinements of
    # the borders. [“test_resizer”]
    def test_resizer(self):
        device = [Pattern("1586501881540.png").targetOffset(-124,-7),"1586501881540.png",Pattern("1586501881540.png").targetOffset(128,-2)]
        number_of_folders = len(findAllList("1586502065536.png"))
        for i in range(len(device)):
            click(device[i])
            region = self.create_reg()
            self.assertEqual(number_of_folders,len(region.findAllList("1586502065536.png")))
     
if __name__ == '__main__':
    suite = unittest.TestLoader().loadTestsFromModule(sys.modules[__name__])
    #suite = unittest.TestLoader().loadTestsFromTestCase(Resizer) 
    unittest.TextTestRunner(verbosity=3).run(suite)
    #reporter = createReporter(NAME)
    #reporter.run(suite)