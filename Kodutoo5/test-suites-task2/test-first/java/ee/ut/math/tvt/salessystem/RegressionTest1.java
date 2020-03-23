import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        java.lang.Class<?> wildcardClass16 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass11 = soldItemList10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
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
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass18 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem20 = null;
        shoppingCart1.addItem(soldItem20);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass19 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
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
        shoppingCart1.addItem(soldItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
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
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem19 = null;
        shoppingCart1.addItem(soldItem19);
        java.lang.Class<?> wildcardClass21 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass20 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        shoppingCart1.addItem(soldItem17);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem19 = null;
        shoppingCart1.addItem(soldItem19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.lang.Class<?> wildcardClass10 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem20 = null;
        shoppingCart1.addItem(soldItem20);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem23 = null;
        shoppingCart1.addItem(soldItem23);
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass26 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        shoppingCart1.addItem(soldItem17);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem20 = null;
        shoppingCart1.addItem(soldItem20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass11 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem20 = null;
        shoppingCart1.addItem(soldItem20);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem23 = null;
        shoppingCart1.addItem(soldItem23);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList25 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList25);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList19 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass20 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass16 = soldItemList15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        shoppingCart1.addItem(soldItem17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass10 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass18 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass21 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass14 = soldItemList13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass11 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        shoppingCart1.addItem(soldItem17);
        java.lang.Class<?> wildcardClass19 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList20 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList21 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList22 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList22);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList20 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList20);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass18 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass9 = shoppingCart1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass11 = soldItemList10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList19 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList19);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        java.lang.Class<?> wildcardClass20 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem20 = null;
        shoppingCart1.addItem(soldItem20);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList22 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList23 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList23);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass15 = soldItemList14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
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
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass9 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList20 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem21 = null;
        shoppingCart1.addItem(soldItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList20);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.lang.Class<?> wildcardClass11 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass6 = soldItemList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem19 = null;
        shoppingCart1.addItem(soldItem19);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList21 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList21);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass10 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass12 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass8 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        shoppingCart1.addItem(soldItem17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        shoppingCart1.addItem(soldItem17);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList19 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList19);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass15 = soldItemList14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem20 = null;
        shoppingCart1.addItem(soldItem20);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem23 = null;
        shoppingCart1.addItem(soldItem23);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList26 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList27 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList27);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem20 = null;
        shoppingCart1.addItem(soldItem20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.lang.Class<?> wildcardClass12 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        shoppingCart1.cancelCurrentPurchase();
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass9 = soldItemList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
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
        shoppingCart1.addItem(soldItem9);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList20 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem21 = null;
        shoppingCart1.addItem(soldItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList20);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList19 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass20 = soldItemList19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass12 = soldItemList11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
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
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
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
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.lang.Class<?> wildcardClass8 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
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
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
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
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass12 = soldItemList11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
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
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass19 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList20 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList21 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList21);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem19 = null;
        shoppingCart1.addItem(soldItem19);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem21 = null;
        shoppingCart1.addItem(soldItem21);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList23 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList23);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass12 = soldItemList11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.lang.Class<?> wildcardClass8 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem19 = null;
        shoppingCart1.addItem(soldItem19);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem19 = null;
        shoppingCart1.addItem(soldItem19);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem22 = null;
        shoppingCart1.addItem(soldItem22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        shoppingCart1.addItem(soldItem17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList22 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList22);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass15 = soldItemList14.getClass();
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
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        java.lang.Class<?> wildcardClass14 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass14 = soldItemList13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass14 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        java.lang.Class<?> wildcardClass16 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        shoppingCart1.addItem(soldItem17);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem20 = null;
        shoppingCart1.addItem(soldItem20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList20 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList20);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
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
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        java.lang.Class<?> wildcardClass20 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        shoppingCart1.addItem(soldItem17);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList19 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList19);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList19 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList19);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.lang.Class<?> wildcardClass12 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem19 = null;
        shoppingCart1.addItem(soldItem19);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList22 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass23 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
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
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        shoppingCart1.addItem(soldItem17);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem19 = null;
        shoppingCart1.addItem(soldItem19);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem21 = null;
        shoppingCart1.addItem(soldItem21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.lang.Class<?> wildcardClass9 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass14 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        shoppingCart1.addItem(soldItem17);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.lang.Class<?> wildcardClass12 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass7 = soldItemList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        shoppingCart1.addItem(soldItem17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem20 = null;
        shoppingCart1.addItem(soldItem20);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem23 = null;
        shoppingCart1.addItem(soldItem23);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem25 = null;
        shoppingCart1.addItem(soldItem25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem20 = null;
        shoppingCart1.addItem(soldItem20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
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
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
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
        java.lang.Class<?> wildcardClass10 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        java.lang.Class<?> wildcardClass17 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass8 = soldItemList7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
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
        shoppingCart1.addItem(soldItem9);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass12 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
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
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList20 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList20);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem19 = null;
        shoppingCart1.addItem(soldItem19);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList21 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass22 = soldItemList21.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass14 = soldItemList13.getClass();
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
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass7 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
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
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass12 = shoppingCart1.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        shoppingCart1.addItem(soldItem17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList20 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem21 = null;
        shoppingCart1.addItem(soldItem21);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem23 = null;
        shoppingCart1.addItem(soldItem23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList20);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
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
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        java.lang.Class<?> wildcardClass17 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList20 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass21 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        java.lang.Class<?> wildcardClass16 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass9 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.lang.Class<?> wildcardClass9 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass19 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }
}

