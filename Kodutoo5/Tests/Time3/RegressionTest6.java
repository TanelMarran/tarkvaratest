import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 0, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, 10, 0);
        java.lang.String str11 = nextDate3.run(0, (int) '4', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) ' ', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(0, 0, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) -1, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) '#', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 100, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(0, (int) 'a', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 0, 0);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) 0, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (short) 0, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 100, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run(0, (int) '4', (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 100, 10);
        java.lang.String str7 = nextDate3.run(1, (int) (byte) 100, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) -1, (int) 'a');
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 10, 1);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (byte) 100, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (short) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 0, 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (byte) 1, (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) (byte) -1, 0);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 100, (int) '#');
        java.lang.String str7 = nextDate3.run((int) (short) 0, 10, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 10, (-1));
        java.lang.String str7 = nextDate3.run(10, 0, (int) '4');
        java.lang.String str11 = nextDate3.run((int) '4', (int) 'a', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 100, (int) 'a');
        java.lang.String str23 = nextDate3.run((-1), (-1), 0);
        java.lang.String str27 = nextDate3.run(10, 0, (int) (short) 0);
        java.lang.String str31 = nextDate3.run((int) (byte) 10, (int) (short) 0, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "invalid Input Date" + "'", str27.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "invalid Input Date" + "'", str31.equals("invalid Input Date"));
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) '#', (int) '4');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (byte) -1, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 100, (int) (short) 100);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 0, 1);
        java.lang.String str7 = nextDate3.run(0, (-1), (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 0, 100);
        java.lang.String str7 = nextDate3.run((int) (short) 100, 10, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) -1, 1);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) -1, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) 'a', (-1), (int) ' ');
        java.lang.String str15 = nextDate3.run((int) (byte) 100, (int) (short) 0, 0);
        java.lang.String str19 = nextDate3.run((int) (byte) 0, 0, 0);
        java.lang.String str23 = nextDate3.run((int) (short) 0, (int) (byte) 0, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 0, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run(10, (int) (byte) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 10, (int) ' ');
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 0, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, 10, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) '4', (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 1, (int) (short) 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 100);
        java.lang.String str15 = nextDate3.run((int) (short) 10, 0, 10);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 1, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run(0, 100, (int) '#');
        java.lang.String str15 = nextDate3.run((int) (byte) 10, 0, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 10, 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (-1), (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 10, 0, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, 0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, 1, (int) '4');
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (-1), (-1));
        java.lang.String str15 = nextDate3.run((int) ' ', (int) (short) 10, (int) 'a');
        java.lang.String str19 = nextDate3.run((int) 'a', (int) (byte) 1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 1, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (short) 1, 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 100, (int) ' ');
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (-1), (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (byte) 100, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 0, (int) 'a');
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) '4', (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (-1), (int) (short) 1);
        java.lang.String str11 = nextDate3.run((int) (short) 0, (int) '4', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 100, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) ' ', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 1, (int) '4');
        java.lang.String str7 = nextDate3.run(1, (int) (byte) 10, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (-1), (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (short) 10, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 0, (int) (byte) 10);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 0, (int) '4');
        java.lang.String str7 = nextDate3.run((-1), (int) (byte) -1, 1);
        java.lang.String str11 = nextDate3.run(1, 0, (int) (byte) -1);
        java.lang.String str15 = nextDate3.run((int) (short) -1, (int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 100, (int) ' ');
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (-1), (int) '#');
        java.lang.String str11 = nextDate3.run((int) '#', (int) (short) 0, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (short) 10, (-1));
        java.lang.String str7 = nextDate3.run(0, (int) (short) 1, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(0, (int) (short) 100, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) '#', (int) (short) 100);
        java.lang.String str15 = nextDate3.run((int) (short) 1, (int) (byte) 0, (int) (byte) 1);
        java.lang.String str19 = nextDate3.run((int) (byte) 1, 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) 1, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (byte) 0, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) '4', (int) (short) 1);
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) (byte) 0, 100);
        java.lang.String str15 = nextDate3.run((int) (short) 1, (int) (short) 1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) '4', (-1));
        java.lang.String str7 = nextDate3.run(0, (int) (short) -1, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 1, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (short) 10, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) '4', (int) 'a');
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) 100, 10);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (short) 0, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 10, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run(0, (int) (byte) 10, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (-1), 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (byte) 0, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) '4', (int) '4');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) 'a', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '4', (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (short) 1, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) -1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run(1, (int) ' ', (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) (short) 100, (-1), (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 0, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) '4', (-1));
        java.lang.String str11 = nextDate3.run((int) ' ', (int) ' ', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) '#', (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (short) 0, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 10, (int) ' ');
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) 100, 10);
        java.lang.String str7 = nextDate3.run(0, 0, 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) -1, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, 100, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) -1, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(1, (int) (byte) -1, (int) 'a');
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) (byte) 0, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 100, (int) (byte) 100, 1);
        java.lang.String str19 = nextDate3.run((int) '#', (int) (short) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) 'a', (int) '4');
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 1, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(1, (-1), (int) '#');
        java.lang.String str11 = nextDate3.run((int) ' ', (int) '4', (-1));
        java.lang.String str15 = nextDate3.run(1, 0, (int) '4');
        java.lang.String str19 = nextDate3.run(0, (int) '4', (int) ' ');
        java.lang.String str23 = nextDate3.run((int) '4', (int) (byte) 10, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 100, 100);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (short) 10, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, (int) (short) 10, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) 'a', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 10, (int) (short) 0);
        java.lang.String str7 = nextDate3.run(1, 1, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (-1), 1);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (-1), (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 0, 1);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 100, (int) (short) 100);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 0, (int) '#');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 0, (int) '#');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 10, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) ' ', (int) '#');
        java.lang.String str11 = nextDate3.run(100, 10, (-1));
        java.lang.String str15 = nextDate3.run(0, 100, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) '4', 1, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((-1), (int) (short) -1, 0);
        java.lang.String str19 = nextDate3.run((int) (byte) 1, (int) ' ', (int) ' ');
        java.lang.String str23 = nextDate3.run((int) (short) 100, (int) '#', (int) (byte) 100);
        java.lang.String str27 = nextDate3.run(10, (int) (byte) 10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "invalid Input Date" + "'", str27.equals("invalid Input Date"));
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) '4', (int) (short) 1);
        java.lang.String str7 = nextDate3.run(10, (int) (byte) 0, (-1));
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (-1), 100);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) -1, 1);
        java.lang.String str7 = nextDate3.run(0, (int) (byte) 10, (int) (byte) 1);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) (byte) -1, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run(100, (int) (short) 10, (int) (short) 1);
        java.lang.String str19 = nextDate3.run((int) (byte) -1, (int) '4', (int) (short) 100);
        java.lang.String str23 = nextDate3.run((int) (byte) 10, (int) (byte) -1, 100);
        java.lang.String str27 = nextDate3.run(100, (int) 'a', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "invalid Input Date" + "'", str27.equals("invalid Input Date"));
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '#', (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (byte) 0, (int) (byte) 1);
        java.lang.String str11 = nextDate3.run((-1), 1, (-1));
        java.lang.String str15 = nextDate3.run((int) (short) 1, (int) (short) 100, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) 'a', 10);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 0, (int) (short) 1);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 100, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) '#', (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) 'a', 100);
        java.lang.String str7 = nextDate3.run((int) (short) 1, 0, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run(100, (int) (short) 10, (int) (short) 1);
        java.lang.String str19 = nextDate3.run((int) (byte) -1, (int) '4', (int) (short) 100);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 10, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) ' ', 100);
        java.lang.String str11 = nextDate3.run((int) '4', (int) (byte) 0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 100, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (short) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, (int) (short) 0, (int) (byte) 10);
        java.lang.String str15 = nextDate3.run((int) (byte) -1, (int) (byte) 100, 0);
        java.lang.String str19 = nextDate3.run(0, 0, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) ' ', (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (byte) 0, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) (byte) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (byte) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '#', 0);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) 1, (int) '#');
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 100, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run(1, (int) (short) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 100, 10);
        java.lang.String str7 = nextDate3.run(0, (-1), (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 100, (int) (short) 0);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) '#', (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (-1), (-1));
        java.lang.String str15 = nextDate3.run((int) ' ', (int) (short) 10, (int) 'a');
        java.lang.String str19 = nextDate3.run((int) (byte) 0, 0, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) '4', (-1), (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) '#', (-1));
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) 'a', (int) (byte) 10);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) 100, 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) ' ', (int) '#');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 100, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) '4', 100, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 0, (int) '4');
        java.lang.String str7 = nextDate3.run(1, (int) (short) -1, (int) (short) 10);
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) (byte) -1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 1, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (byte) 1, 10, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) '#', (int) '#');
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 1, (int) (short) 10);
        java.lang.String str7 = nextDate3.run(0, (int) (short) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '#');
        java.lang.String str7 = nextDate3.run(100, (int) ' ', (int) (short) -1);
        java.lang.String str11 = nextDate3.run(0, (int) '#', (int) (short) 0);
        java.lang.String str15 = nextDate3.run(10, (int) (byte) 1, (int) (byte) 100);
        java.lang.String str19 = nextDate3.run((int) (short) 10, (int) '#', (int) 'a');
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 100, 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (short) -1, 100);
        java.lang.String str11 = nextDate3.run((int) (short) 0, 10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 10, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (byte) 100, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 1, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (-1), (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 0, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 100, (int) '4');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 0, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) 'a', 100, (int) (short) 0);
        java.lang.String str11 = nextDate3.run((-1), (int) (short) 100, (int) 'a');
        java.lang.String str15 = nextDate3.run((int) (byte) -1, (int) (short) 1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (short) 1, (int) '4');
        java.lang.String str7 = nextDate3.run((int) '4', (int) (byte) 10, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 10, (int) (short) 10);
        java.lang.String str7 = nextDate3.run(1, 1, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 10, 100);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 10, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) ' ', (int) '#');
        java.lang.String str11 = nextDate3.run(100, 10, (-1));
        java.lang.String str15 = nextDate3.run((int) (byte) 10, (int) (byte) 0, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) 10, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run(100, 0, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run(1, (-1), (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(0, (int) (short) 100, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run(1, (int) (short) 1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) -1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 100, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 1, (int) '4');
        java.lang.String str15 = nextDate3.run((int) (short) 10, (int) (short) 0, (int) (short) 100);
        java.lang.String str19 = nextDate3.run((int) (short) 100, (int) (short) 0, 1);
        java.lang.String str23 = nextDate3.run((int) 'a', (int) (byte) 1, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 1, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(1, (-1), (int) '#');
        java.lang.String str11 = nextDate3.run((int) ' ', (int) '4', (-1));
        java.lang.String str15 = nextDate3.run(1, 0, (int) '4');
        java.lang.String str19 = nextDate3.run(0, (int) '4', (int) ' ');
        java.lang.String str23 = nextDate3.run((int) (short) 0, (int) (short) 100, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 10, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(0, (int) ' ', (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) (short) 1, 1);
        java.lang.String str15 = nextDate3.run((int) (short) 0, (int) (byte) 10, (int) (byte) 1);
        java.lang.String str19 = nextDate3.run(1, (int) (byte) -1, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 10, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) 100, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) -1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (short) 1, (-1));
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 100, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) ' ', (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 10, 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) '4', 1);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 100, (-1));
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 100, (int) ' ');
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) -1, 0);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) -1, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (byte) 100, (-1));
        java.lang.String str11 = nextDate3.run((int) (short) 100, (int) '4', 10);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run(1, (int) (byte) 100, 0);
        java.lang.String str23 = nextDate3.run((int) '4', (-1), (int) (short) 1);
        java.lang.String str27 = nextDate3.run((int) (short) 100, 1, 1);
        java.lang.String str31 = nextDate3.run((int) (byte) -1, 100, (int) '#');
        java.lang.String str35 = nextDate3.run((int) 'a', (int) (byte) -1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "invalid Input Date" + "'", str27.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "invalid Input Date" + "'", str31.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "invalid Input Date" + "'", str35.equals("invalid Input Date"));
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 0, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) '4', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 0, 0);
        java.lang.String str23 = nextDate3.run(1, (int) (short) 10, 100);
        java.lang.String str27 = nextDate3.run((int) '#', (int) '#', 0);
        java.lang.String str31 = nextDate3.run((int) (short) 0, (int) ' ', (int) (byte) 100);
        java.lang.Class<?> wildcardClass32 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "invalid Input Date" + "'", str27.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "invalid Input Date" + "'", str31.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 1, (int) '#');
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) 'a', (int) '#');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) '#', 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 100, 1);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, 10, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) '4', (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (-1), (int) (short) 1);
        java.lang.String str11 = nextDate3.run(100, (int) (short) 100, (int) (short) 100);
        java.lang.String str15 = nextDate3.run((int) '#', (int) (byte) 10, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) -1, 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) '4', 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 10, (int) (short) 0, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 10, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (short) -1, (int) ' ');
        java.lang.String str11 = nextDate3.run((int) (short) 0, 1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (short) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) '#', (int) (short) 100);
        java.lang.String str15 = nextDate3.run((int) ' ', (int) '4', (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 0, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (byte) 0, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 10, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 1, (-1));
        java.lang.String str11 = nextDate3.run((int) (byte) 100, (int) (short) 1, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 100, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) '4', 100, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) '4', (int) 'a', (int) (short) -1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 100, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) '#', 0, (int) (short) 1);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, 0, (int) (byte) -1);
        java.lang.String str15 = nextDate3.run((int) (short) -1, (int) (byte) -1, (int) '4');
        java.lang.String str19 = nextDate3.run((int) (short) 100, (int) (byte) 100, (int) (byte) 0);
        java.lang.String str23 = nextDate3.run((int) (byte) 0, 1, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (byte) 1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((-1), 100, (int) (short) 0);
        java.lang.String str11 = nextDate3.run((-1), (int) 'a', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) '#', 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) 100, (int) 'a');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 1, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) 'a', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (byte) 10, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) '4', 100);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 10, 100);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) (byte) 0, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((int) ' ', 0, (int) (short) 0);
        java.lang.String str19 = nextDate3.run((int) 'a', 0, 1);
        java.lang.String str23 = nextDate3.run((int) ' ', (int) (byte) 0, 1);
        java.lang.String str27 = nextDate3.run((int) 'a', (int) (byte) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass28 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "invalid Input Date" + "'", str27.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) '4', (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) '#', (int) 'a', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) 10, 1);
        java.lang.String str7 = nextDate3.run(0, (int) (short) 1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 100, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (short) -1, 0);
        java.lang.String str11 = nextDate3.run((int) (short) 100, (int) (short) 100, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) 'a', (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) (byte) -1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 10, 100);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) (byte) 0, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((int) (short) -1, (int) 'a', 0);
        java.lang.String str19 = nextDate3.run((-1), (int) (short) 10, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) '#', (int) (byte) 0, (int) 'a');
        java.lang.String str19 = nextDate3.run(10, (int) ' ', (int) (byte) -1);
        java.lang.String str23 = nextDate3.run((int) (byte) 0, (int) (short) 100, (int) (short) 100);
        java.lang.String str27 = nextDate3.run((int) (short) -1, (int) '#', 1);
        java.lang.String str31 = nextDate3.run((int) (short) 1, (-1), (int) (short) -1);
        java.lang.Class<?> wildcardClass32 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "invalid Input Date" + "'", str27.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "invalid Input Date" + "'", str31.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (-1), (-1));
        java.lang.String str15 = nextDate3.run(1, 0, (-1));
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) 10, (-1));
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (-1), (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((-1), 10, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run(0, (int) (short) 10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 1, 0);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 100, (int) 'a');
        java.lang.String str23 = nextDate3.run((int) (short) 10, (int) (byte) 1, (int) (byte) 1);
        java.lang.String str27 = nextDate3.run((int) (short) 0, 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass28 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "invalid Input Date" + "'", str27.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) -1, 1);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 0, 0);
        java.lang.String str23 = nextDate3.run(1, (int) (short) 10, 100);
        java.lang.String str27 = nextDate3.run((int) '#', (int) '#', 0);
        java.lang.Class<?> wildcardClass28 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "invalid Input Date" + "'", str27.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run(1, (-1), (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 1, (int) ' ');
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 10, (int) '#');
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run(0, (int) ' ', 1);
        java.lang.String str19 = nextDate3.run(0, (int) '#', (int) (short) 1);
        java.lang.String str23 = nextDate3.run((int) (byte) 100, (int) 'a', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) 'a', 10);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 100, (int) 'a');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 100, (int) (short) 100);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 1, (int) '#');
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) 10, 1);
        java.lang.String str7 = nextDate3.run((int) 'a', 100, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) 'a', (-1));
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 10, (-1));
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (-1), 0);
        java.lang.String str7 = nextDate3.run((int) ' ', 0, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((-1), (int) '#', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (-1), 100);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 100, 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) '#', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) -1, (int) (byte) -1);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(100, (-1), (int) (short) 10);
        java.lang.String str11 = nextDate3.run((-1), (int) (short) 0, (int) (byte) 1);
        java.lang.String str15 = nextDate3.run((int) (byte) -1, (int) (byte) 1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 1, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, 0, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) '#', (int) (short) 100, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 0, 100);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 10, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(100, 0, (int) (short) 0);
        java.lang.String str11 = nextDate3.run((int) (short) 100, (int) (short) 1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, 1);
        java.lang.String str7 = nextDate3.run(0, (int) (short) 0, (int) (short) 1);
        java.lang.String str11 = nextDate3.run((int) (byte) 10, 0, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 1, (int) '#');
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 0, 10);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 10, (int) (byte) 10);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (byte) 0, 1);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (byte) -1, 10);
        java.lang.String str11 = nextDate3.run((int) (byte) 10, (int) (short) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) -1, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (byte) 10, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 100, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) ' ', 0, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 10, (int) 'a');
        java.lang.String str7 = nextDate3.run(10, (int) (byte) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) 'a', (int) '#');
        java.lang.String str7 = nextDate3.run(0, (int) '4', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 1, 0);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) -1, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) '#', (int) (short) 100);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 10, 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (-1), (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) (short) 0, 10, (int) (short) 1);
        java.lang.String str15 = nextDate3.run((int) (byte) 10, 0, (int) (byte) 0);
        java.lang.String str19 = nextDate3.run((int) (short) -1, (int) (byte) 0, (int) (short) -1);
        java.lang.String str23 = nextDate3.run((int) (byte) 10, 10, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 10, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 10, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '4', (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) (short) -1, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (-1), (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) (byte) 10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(10, 0, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((-1), (int) (short) 0, (int) (byte) 10);
        java.lang.String str15 = nextDate3.run((int) (short) 1, (int) (byte) 0, 10);
        java.lang.String str19 = nextDate3.run((int) (short) 100, (int) ' ', 0);
        java.lang.String str23 = nextDate3.run((int) (byte) 100, (int) '#', (int) (byte) 10);
        java.lang.String str27 = nextDate3.run(0, (int) ' ', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "invalid Input Date" + "'", str27.equals("invalid Input Date"));
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) '4', (int) (short) 100);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) -1, (-1));
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (byte) 0, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (short) 1, (int) 'a');
        java.lang.String str11 = nextDate3.run((int) (short) -1, 100, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 0, (-1));
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) '#', 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 10, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (short) 100, 10);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, 0, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (short) -1, 10);
        java.lang.String str7 = nextDate3.run((int) ' ', 1, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 100, (-1));
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) 'a');
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) '#', (int) 'a');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (short) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) 0, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) 'a', 0, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, (int) (short) 0, (int) '4');
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 100, (-1));
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) ' ', (int) '#');
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (short) 10, (-1));
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 1, (-1));
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) 'a', (int) 'a');
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) 'a', (int) (short) 0);
        java.lang.String str15 = nextDate3.run(1, 0, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) '#', 0);
        java.lang.String str7 = nextDate3.run((int) '#', (int) '4', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) ' ', (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', (int) (short) 0);
        java.lang.String str11 = nextDate3.run((int) '#', (int) ' ', (int) 'a');
        java.lang.String str15 = nextDate3.run(0, (-1), (int) (short) -1);
        java.lang.String str19 = nextDate3.run((int) '#', (int) (byte) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 0, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (byte) 100, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) ' ', (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) (short) 100, (int) (short) 10, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) (short) -1, (int) (short) 10, 100);
        java.lang.String str19 = nextDate3.run((int) (byte) 0, 0, 10);
        java.lang.String str23 = nextDate3.run((int) (short) 0, (int) (byte) 100, (int) (byte) 10);
        java.lang.String str27 = nextDate3.run((-1), (int) '#', (int) (byte) -1);
        java.lang.String str31 = nextDate3.run((int) (short) -1, (int) (byte) 1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "invalid Input Date" + "'", str27.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "invalid Input Date" + "'", str31.equals("invalid Input Date"));
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) '#', (int) (byte) 0, (int) 'a');
        java.lang.String str19 = nextDate3.run((int) 'a', (int) ' ', 100);
        java.lang.String str23 = nextDate3.run((int) 'a', (int) (byte) 0, (int) (short) 1);
        java.lang.String str27 = nextDate3.run((-1), (-1), (int) (short) 10);
        java.lang.String str31 = nextDate3.run((int) '4', (int) (byte) 0, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "invalid Input Date" + "'", str27.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "invalid Input Date" + "'", str31.equals("invalid Input Date"));
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 10, 100);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) (byte) 0, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((int) ' ', 0, (int) (short) 0);
        java.lang.String str19 = nextDate3.run(100, 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 0, 1);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 100, (int) '4');
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 10, (int) '4');
        java.lang.String str7 = nextDate3.run(0, 10, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 1, 10);
        java.lang.String str7 = nextDate3.run((-1), (int) (short) 1, (int) (short) 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, (int) '#', 100);
        java.lang.String str15 = nextDate3.run((int) '4', (int) '4', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) (short) 1, (-1), (int) (byte) 100);
        java.lang.String str19 = nextDate3.run((int) (short) 0, (int) 'a', 0);
        java.lang.String str23 = nextDate3.run((-1), (int) (byte) 1, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) 'a', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(100, 100, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) (short) -1, (int) (short) 10, 100);
        java.lang.String str19 = nextDate3.run((-1), (int) (byte) 1, 0);
        java.lang.String str23 = nextDate3.run(100, 10, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 1, 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, (int) (short) 100, (int) 'a');
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 10, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (short) 100, 10, 100);
        java.lang.String str11 = nextDate3.run(0, 0, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 0, 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) (short) 1, (int) (short) 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 100, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (short) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, (int) (short) 0, (int) (byte) 10);
        java.lang.String str15 = nextDate3.run((int) (byte) -1, (int) (byte) 100, 0);
        java.lang.String str19 = nextDate3.run((int) (short) 0, (int) 'a', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (-1), (int) '#');
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 10, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (byte) 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) (short) 0, (int) (byte) 100, (int) ' ');
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) '4', 1);
        java.lang.String str7 = nextDate3.run((int) '#', (int) '#', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) '#', (int) 'a');
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) -1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run(1, (int) ' ', (int) (short) -1);
        java.lang.String str11 = nextDate3.run(1, (int) '4', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) '#', 0);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 10, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) ' ', (int) (byte) 1);
        java.lang.String str11 = nextDate3.run((int) (short) 10, 0, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) -1, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) ' ', 100, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run(0, 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) -1, 0);
        java.lang.String str7 = nextDate3.run(1, (int) (byte) 0, 1);
        java.lang.String str11 = nextDate3.run((int) '4', (int) (short) 10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 1, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) -1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run(10, (int) 'a', (int) (byte) 0);
        java.lang.String str11 = nextDate3.run(100, (int) ' ', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 0, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (short) 1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) 10, 1);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) (short) 100, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 0, 1);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run(1, (int) (byte) 100, 0);
        java.lang.String str23 = nextDate3.run(10, (int) (short) 1, (int) (short) -1);
        java.lang.String str27 = nextDate3.run(1, 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "invalid Input Date" + "'", str27.equals("invalid Input Date"));
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 10, 100);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) -1, (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) 'a', (int) '#');
        java.lang.String str15 = nextDate3.run((int) '4', 0, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) '#', 0);
        java.lang.String str7 = nextDate3.run((int) ' ', 10, (int) (short) 1);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 1, 0);
        java.lang.String str15 = nextDate3.run((-1), (int) (short) 10, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) ' ', 1);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 100, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (short) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, (int) (short) 0, (int) (byte) 10);
        java.lang.String str15 = nextDate3.run((int) (short) -1, (int) (byte) 100, (int) (short) 0);
        java.lang.String str19 = nextDate3.run((int) 'a', (int) (short) 100, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 0, 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) (short) 10, (int) '#', (int) ' ');
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', (int) (short) 0);
        java.lang.String str7 = nextDate3.run((-1), (int) (byte) 0, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 0, (int) ' ');
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) (byte) 1, (-1));
        java.lang.String str15 = nextDate3.run((int) (byte) 100, (int) (short) 100, 100);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) ' ', (int) '4');
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (-1), (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) '#', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (short) 1, 1);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 100, 10);
        java.lang.String str15 = nextDate3.run((int) (byte) 10, (int) (byte) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) '4', (int) (short) 10);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 1, 100);
        java.lang.String str7 = nextDate3.run((int) ' ', (-1), (int) ' ');
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 1, 0);
        java.lang.String str15 = nextDate3.run((int) (short) 0, (int) '#', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) 'a', (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) '#', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) -1, 0);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 0, (int) 'a');
        java.lang.String str7 = nextDate3.run(100, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '4', (int) ' ', (int) (byte) 0);
        java.lang.String str15 = nextDate3.run(1, (int) '#', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) '4', (int) (short) 1);
        java.lang.String str11 = nextDate3.run(1, (int) (byte) 10, (int) (byte) -1);
        java.lang.String str15 = nextDate3.run(0, (int) '4', (int) (byte) 10);
        java.lang.String str19 = nextDate3.run(1, (int) 'a', 0);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 0, (int) '4');
        java.lang.String str7 = nextDate3.run(1, (int) (short) -1, (int) (short) 10);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, (int) (short) 1, (int) '#');
        java.lang.String str15 = nextDate3.run((int) (byte) 0, (int) (short) 10, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (-1), 10);
        java.lang.String str7 = nextDate3.run((int) '#', 100, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 100, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) 'a', 100, (int) 'a');
        java.lang.String str11 = nextDate3.run((int) '#', (int) 'a', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (byte) 10, (int) (byte) 1);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, (int) (byte) 10, 10);
        java.lang.String str15 = nextDate3.run(0, (int) (short) 1, (int) (byte) 0);
        java.lang.String str19 = nextDate3.run((int) (short) 1, (int) '#', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 1, (int) 'a');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 100, (int) '#');
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 100, (int) '#');
        java.lang.String str7 = nextDate3.run(0, (int) '#', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 100, (int) 'a');
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) 100, (int) '#');
        java.lang.String str7 = nextDate3.run((int) (short) 100, 0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) ' ', (int) '#');
        java.lang.String str7 = nextDate3.run((int) '#', (int) (byte) 10, (int) (short) 0);
        java.lang.String str11 = nextDate3.run((-1), (int) (short) 100, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 10, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 100, 10);
        java.lang.String str7 = nextDate3.run(1, (int) (byte) 100, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) -1, (int) 'a');
        java.lang.String str15 = nextDate3.run((int) (byte) -1, (int) (short) -1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (short) -1, (int) (short) 1);
        java.lang.String str11 = nextDate3.run(1, 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 100, 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (short) 100, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run(10, (int) '4', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) 'a', (int) '#');
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) (byte) 1, (int) '#');
        java.lang.String str11 = nextDate3.run((int) '4', 0, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 100, 0);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (byte) 10, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) (short) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) 'a', 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) 'a', (int) (byte) 1);
        java.lang.String str11 = nextDate3.run((int) (short) 0, (int) (byte) 10, (int) (byte) -1);
        java.lang.String str15 = nextDate3.run((int) (short) -1, 1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) ' ', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(0, 0, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) '4', (int) (byte) 0, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (short) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((-1), (int) ' ', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) 'a', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (byte) 100, 0, 100);
        java.lang.String str11 = nextDate3.run((-1), 0, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (-1), 100);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) -1, 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 10, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) ' ', (int) '#');
        java.lang.String str11 = nextDate3.run(100, 10, (-1));
        java.lang.String str15 = nextDate3.run((int) (short) 10, (int) (short) 10, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 100, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 0, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 1, (int) (short) 0, (int) (short) 10);
        java.lang.String str15 = nextDate3.run((-1), (int) '4', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 100, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((-1), 0, 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 100, 1, (int) (byte) -1);
        java.lang.String str15 = nextDate3.run((int) (byte) -1, 0, 1);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 1, (int) ' ');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 0, (int) (short) 100);
        java.lang.String str7 = nextDate3.run(100, 0, 0);
        java.lang.String str11 = nextDate3.run((int) 'a', (int) ' ', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) ' ', (int) ' ');
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 1, 100);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) 'a', (-1));
        java.lang.String str7 = nextDate3.run((int) (short) 0, 0, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 100, 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) 0, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (-1), 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 0, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (byte) 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 0, 10);
        java.lang.String str7 = nextDate3.run(10, 10, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (-1), (int) (short) 0);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) '#', (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) '4', (int) '4');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 100, (int) '#');
        java.lang.String str7 = nextDate3.run(0, (int) (byte) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) '4', (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (-1), (int) '4');
        java.lang.String str11 = nextDate3.run((int) '4', (int) (short) 100, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) '4', (int) (short) 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 100, (int) 'a');
        java.lang.String str23 = nextDate3.run((int) ' ', (int) (byte) -1, (int) (byte) 0);
        java.lang.String str27 = nextDate3.run((int) ' ', (int) ' ', (int) (short) 1);
        java.lang.String str31 = nextDate3.run((int) (short) -1, (-1), (int) (byte) 0);
        java.lang.String str35 = nextDate3.run(0, (int) (byte) 1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "invalid Input Date" + "'", str27.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "invalid Input Date" + "'", str31.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "invalid Input Date" + "'", str35.equals("invalid Input Date"));
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, 1, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(1, (int) '4', 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) -1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 100, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (byte) -1, (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) 10, 0);
        java.lang.String str15 = nextDate3.run((int) ' ', 100, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 1, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) (byte) 100, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 100, (int) ' ');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 100, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (byte) 10, (int) (short) 1);
        java.lang.String str11 = nextDate3.run((int) 'a', 10, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 1, 1);
        java.lang.String str7 = nextDate3.run((int) '4', 0, (int) (short) 10);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, 100, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 0, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) '#', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) '#', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (byte) 1, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, (int) '4', (int) (short) -1);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 100, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) ' ', (int) (byte) 10, 10);
        java.lang.String str19 = nextDate3.run((int) '#', 1, 0);
        java.lang.String str23 = nextDate3.run((int) (short) -1, (int) (byte) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass24 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "invalid Input Date" + "'", str23.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 0, (int) (short) 100);
        java.lang.String str7 = nextDate3.run(10, 1, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) '4', (int) (short) 100);
        java.lang.String str7 = nextDate3.run(0, 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 100, (int) (short) 1);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 1, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(100, (int) 'a', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 0, (int) (short) 100);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 0, (int) 'a');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) '4', (int) (short) 1);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, (int) (byte) 1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) '4', (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) (short) 1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 0, 10);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 1, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (short) 10, 0);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 1, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 0, (int) (byte) -1);
    }
}

