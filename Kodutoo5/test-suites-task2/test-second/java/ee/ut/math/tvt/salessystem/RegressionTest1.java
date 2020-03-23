import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass7 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        java.lang.Class<?> wildcardClass12 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
        java.lang.Class<?> wildcardClass12 = soldItemList11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
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
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass8 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
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
        java.lang.Class<?> wildcardClass13 = soldItemList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
        java.lang.Class<?> wildcardClass18 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
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
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass8 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass11 = soldItemList10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass14 = soldItemList13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        shoppingCart1.cancelCurrentPurchase();
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
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
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
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass19 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass17 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass15 = soldItemList14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass11 = soldItemList10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        java.lang.Class<?> wildcardClass10 = soldItemList9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList19 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList19);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
        java.lang.Class<?> wildcardClass14 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        shoppingCart1.cancelCurrentPurchase();
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
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
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
        java.lang.Class<?> wildcardClass15 = soldItemList14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass7 = soldItemList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        java.lang.Class<?> wildcardClass17 = shoppingCart1.getClass();
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
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
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
        java.lang.Class<?> wildcardClass14 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        java.lang.Class<?> wildcardClass17 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass13 = soldItemList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
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
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        java.lang.Class<?> wildcardClass17 = shoppingCart1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
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
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem19 = null;
        shoppingCart1.addItem(soldItem19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
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
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
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
        shoppingCart1.cancelCurrentPurchase();
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
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass18 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
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
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        java.lang.Class<?> wildcardClass14 = soldItemList13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
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
        java.lang.Class<?> wildcardClass16 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass17 = soldItemList16.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
        java.lang.Class<?> wildcardClass12 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass17 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
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
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
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
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList17);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
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
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        java.lang.Class<?> wildcardClass14 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        java.lang.Class<?> wildcardClass11 = soldItemList10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass10 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        java.lang.Class<?> wildcardClass11 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
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
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass9 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass14 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass14 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        java.lang.Class<?> wildcardClass14 = soldItemList13.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        java.lang.Class<?> wildcardClass10 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
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
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        java.lang.Class<?> wildcardClass13 = soldItemList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
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
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass9 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass16 = soldItemList15.getClass();
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
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
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
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass14 = shoppingCart1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
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
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass13 = soldItemList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass8 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
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
        java.lang.Class<?> wildcardClass11 = shoppingCart1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass10 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass20 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass14 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        java.lang.Class<?> wildcardClass11 = soldItemList10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass14 = soldItemList13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
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
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList17);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass10 = soldItemList9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass14 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        java.lang.Class<?> wildcardClass10 = soldItemList9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass10 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
        java.lang.Class<?> wildcardClass18 = soldItemList17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        java.lang.Class<?> wildcardClass14 = soldItemList13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass9 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
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
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
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
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        shoppingCart1.addItem(soldItem17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList17);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
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
        java.lang.Class<?> wildcardClass16 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass18 = shoppingCart1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        shoppingCart1.addItem(soldItem17);
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass20 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass15 = soldItemList14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass14 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass9 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        java.lang.Class<?> wildcardClass15 = soldItemList14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
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
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass12 = soldItemList11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList19 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList19);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
        java.lang.Class<?> wildcardClass16 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
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
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass17 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass12 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
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
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
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
        java.lang.Class<?> wildcardClass11 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
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
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass9 = soldItemList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass6 = soldItemList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
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
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        java.lang.Class<?> wildcardClass11 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
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
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        java.lang.Class<?> wildcardClass11 = shoppingCart1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
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
        java.lang.Class<?> wildcardClass12 = soldItemList11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList17);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass17 = soldItemList16.getClass();
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
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass13 = soldItemList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList20 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList21 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList21);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass13 = soldItemList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass9 = soldItemList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        java.lang.Class<?> wildcardClass14 = shoppingCart1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass14 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass14 = shoppingCart1.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass14 = soldItemList13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass11 = soldItemList10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
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
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass19 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
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
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        java.lang.Class<?> wildcardClass15 = soldItemList14.getClass();
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
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass7 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass14 = soldItemList13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.lang.Class<?> wildcardClass7 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass13 = soldItemList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
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
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        shoppingCart1.addItem(soldItem17);
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
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass8 = soldItemList7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass12 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
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
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass9 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        java.lang.Class<?> wildcardClass13 = soldItemList12.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.lang.Class<?> wildcardClass11 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
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
        java.lang.Class<?> wildcardClass14 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        shoppingCart1.addItem(soldItem17);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList19 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList19);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass11 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass9 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass12 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        java.lang.Class<?> wildcardClass15 = soldItemList14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass12 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass15 = soldItemList14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
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
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem19 = null;
        shoppingCart1.addItem(soldItem19);
        java.lang.Class<?> wildcardClass21 = shoppingCart1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
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
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
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
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        java.lang.Class<?> wildcardClass10 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
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
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList20 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList21 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList21);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        java.lang.Class<?> wildcardClass19 = shoppingCart1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass12 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass19 = shoppingCart1.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        java.lang.Class<?> wildcardClass18 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
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
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass8 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        shoppingCart1.addItem(soldItem17);
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
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass11 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass14 = soldItemList13.getClass();
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
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
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
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
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
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
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
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        shoppingCart1.addItem(soldItem17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        org.junit.Assert.assertNotNull(soldItemList17);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
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
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass12 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        java.lang.Class<?> wildcardClass12 = soldItemList11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass14 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.lang.Class<?> wildcardClass10 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass15 = soldItemList14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass14 = soldItemList13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass16 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass10 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        java.lang.Class<?> wildcardClass12 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass12 = shoppingCart1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList17);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
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
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass20 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
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
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList18 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem5 = null;
        shoppingCart1.addItem(soldItem5);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass9 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass12 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList19 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList20 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList20);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass11 = soldItemList10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
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
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass12 = soldItemList11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass9 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList19 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass20 = soldItemList19.getClass();
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
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        java.lang.Class<?> wildcardClass15 = soldItemList14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass14 = soldItemList13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
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
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        java.lang.Class<?> wildcardClass16 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList22 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass23 = soldItemList22.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        shoppingCart1.addItem(soldItem17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        shoppingCart1.addItem(soldItem17);
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
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass16 = soldItemList15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass11 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass18 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList21 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList21);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
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
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass16 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
        java.lang.Class<?> wildcardClass18 = shoppingCart1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        java.lang.Class<?> wildcardClass11 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass9 = soldItemList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
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
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass16 = soldItemList15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
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
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem7 = null;
        shoppingCart1.addItem(soldItem7);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
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
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem2 = null;
        shoppingCart1.addItem(soldItem2);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        java.lang.Class<?> wildcardClass10 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList17);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        shoppingCart1.addItem(soldItem17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
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
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass11 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass7 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
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
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass11 = soldItemList10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass14 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
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
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
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
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        java.lang.Class<?> wildcardClass15 = soldItemList14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
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
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass19 = shoppingCart1.getClass();
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
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem14 = null;
        shoppingCart1.addItem(soldItem14);
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
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
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
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
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
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem6 = null;
        shoppingCart1.addItem(soldItem6);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass10 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
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
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        java.lang.Class<?> wildcardClass16 = shoppingCart1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass16 = soldItemList15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass15 = soldItemList14.getClass();
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
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass17 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        java.lang.Class<?> wildcardClass12 = soldItemList11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass8 = soldItemList7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem17 = null;
        shoppingCart1.addItem(soldItem17);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList19 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass20 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem15 = null;
        shoppingCart1.addItem(soldItem15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass15 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList15);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem13 = null;
        shoppingCart1.addItem(soldItem13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass14 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
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
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        java.lang.Class<?> wildcardClass13 = soldItemList12.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem3 = null;
        shoppingCart1.addItem(soldItem3);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass8 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList17 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem18 = null;
        shoppingCart1.addItem(soldItem18);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList17);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList15 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem16 = null;
        shoppingCart1.addItem(soldItem16);
        java.lang.Class<?> wildcardClass18 = shoppingCart1.getClass();
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
        org.junit.Assert.assertNotNull(soldItemList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList16 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass17 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem4 = null;
        shoppingCart1.addItem(soldItem4);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList6 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
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
        java.lang.Class<?> wildcardClass12 = shoppingCart1.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
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
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
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
        java.lang.Class<?> wildcardClass13 = shoppingCart1.getClass();
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
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList8 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem9 = null;
        shoppingCart1.addItem(soldItem9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass11 = soldItemList10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList11 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        java.lang.Class<?> wildcardClass11 = soldItemList10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList5 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.lang.Class<?> wildcardClass9 = shoppingCart1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList2 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList3 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList4 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem8 = null;
        shoppingCart1.addItem(soldItem8);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList10 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList10);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem10 = null;
        shoppingCart1.addItem(soldItem10);
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList12 = shoppingCart1.getAll();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList13 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem12 = null;
        shoppingCart1.addItem(soldItem12);
        shoppingCart1.cancelCurrentPurchase();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        ee.ut.math.tvt.salessystem.dao.SalesSystemDAO salesSystemDAO0 = null;
        ee.ut.math.tvt.salessystem.logic.ShoppingCart shoppingCart1 = new ee.ut.math.tvt.salessystem.logic.ShoppingCart(salesSystemDAO0);
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList7 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList9 = shoppingCart1.getAll();
        shoppingCart1.cancelCurrentPurchase();
        ee.ut.math.tvt.salessystem.dataobjects.SoldItem soldItem11 = null;
        shoppingCart1.addItem(soldItem11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList9);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        java.util.List<ee.ut.math.tvt.salessystem.dataobjects.SoldItem> soldItemList14 = shoppingCart1.getAll();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(soldItemList14);
    }
}

