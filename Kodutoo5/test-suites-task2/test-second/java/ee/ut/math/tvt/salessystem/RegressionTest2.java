import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        java.lang.Class<?> wildcardClass16 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass12 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass10 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass8 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        java.lang.Class<?> wildcardClass17 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass9 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass14 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass14 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem19 = null;
        shoppingCart1.addItem(soldItem19);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList22 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem24 = null;
        shoppingCart1.addItem(soldItem24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList22);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        java.lang.Class<?> wildcardClass18 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass18 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass14 = soldItemList13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass11 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass13 = soldItemList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass17 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        java.lang.Class<?> wildcardClass19 = soldItemList18.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList19 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList20 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList20);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
    }
}

