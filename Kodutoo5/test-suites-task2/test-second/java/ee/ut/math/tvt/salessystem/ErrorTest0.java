import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem9);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem12);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem4);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem12);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem8);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem9);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem12);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem14);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem11);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem8);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem14);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem12);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem12);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem12);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem9);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem12);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem14);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem9);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem13);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem8);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem9);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem15);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem9);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem7);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem13);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem13);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem17);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem13);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem14);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem14);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem16);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem12);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem13);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem12);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem10);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem15);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem9);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem8);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem12);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem14);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem5);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem9);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem8);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem11);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem14);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem17);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem14);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem11);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem12);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem11);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem8);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem10);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem12);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem11);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem14);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem15);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem16);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem18);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem13);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem14);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem18);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem15);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem14);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem16);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem14);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem8);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem15);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem8);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem11);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem15);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem14);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem13);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem10);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem14);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem15);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem14);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem12);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem13);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem17);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem14);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem18);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem15);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem14);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem16);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem15);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem13);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem13);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem13);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem9);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem13);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem13);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem12);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem11);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem17);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem9);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem14);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem13);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem8);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem15);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem20 = null;
        shoppingCart1.addItem(soldItem20);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem22 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem22);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem16);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem11);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem14);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem13);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem12);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem11);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem12);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem6);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem11);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem7);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem9);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem15);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem14);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem13);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.addItem(soldItem18);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        shoppingCart1.cancelCurrentPurchase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        shoppingCart1.submitCurrentPurchase();
    }
}

