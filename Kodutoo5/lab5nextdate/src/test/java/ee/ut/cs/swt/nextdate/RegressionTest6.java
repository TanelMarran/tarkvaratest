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
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 2020, (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (byte) 100, 9, 2);
        java.lang.String str11 = nextDate3.run(0, 1, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 7, 2);
        java.lang.String str7 = nextDate3.run((int) (short) 1, 0, 1);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 1, 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1800, 4, (int) (short) 100);
        java.lang.String str7 = nextDate3.run(2000, 2, 29);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(4, 4, (int) 'a');
        java.lang.String str7 = nextDate3.run(1800, (int) (short) 100, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(30, (int) (byte) 100, 7);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 11, 0);
        java.lang.String str7 = nextDate3.run(10, 2021, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 1, 12);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2, 0, 2);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run(29, 7, 0);
        java.lang.String str15 = nextDate3.run(11, 11, 3);
        java.lang.String str19 = nextDate3.run((int) (byte) 10, (int) (byte) -1, 0);
        java.lang.String str23 = nextDate3.run(31, 11, 4);
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
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(6, (int) 'a', (int) (short) 100);
        java.lang.String str7 = nextDate3.run(100, 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(13, 2, (int) (short) -1);
        java.lang.String str7 = nextDate3.run(9, 3, (int) (short) 100);
        java.lang.String str11 = nextDate3.run(4, (int) (byte) 0, 16);
        java.lang.String str15 = nextDate3.run((int) (byte) 100, 2000, 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(11, 30, 12);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, 2020, (int) (short) 1);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2020, 31, 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 1800, 2020);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2, 100, 9);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) ' ', 0);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(5, 0, 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (byte) 100, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run(1800, 0, 6);
        java.lang.String str15 = nextDate3.run((int) (short) -1, 0, 2020);
        java.lang.String str19 = nextDate3.run((int) (short) 10, (int) (byte) 100, (int) (short) 10);
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
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(9, 0, (int) (short) 0);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 11, 4);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, 2);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(9, 0, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(12, (int) '4', 30);
        java.lang.String str11 = nextDate3.run(1, 4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(8, 2020, 2004);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, 16, 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 12, 8);
        java.lang.String str7 = nextDate3.run(8, 7, (int) (short) -1);
        java.lang.String str11 = nextDate3.run(8, 6, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 0, 16);
        java.lang.String str7 = nextDate3.run(2021, (int) (byte) -1, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(13, (int) (short) -1, 6);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(4, 0, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run(0, 2000, (int) ' ');
        java.lang.String str11 = nextDate3.run(10, (int) (byte) -1, (int) '4');
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 5, 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (short) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 1800, (int) (short) 1);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) -1, 7);
        java.lang.String str7 = nextDate3.run(1, 31, (int) '4');
        java.lang.String str11 = nextDate3.run((-1), 13, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) 'a', 10);
        java.lang.String str7 = nextDate3.run(10, 2021, 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 10, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 1, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run(31, 2020, 10);
        java.lang.String str15 = nextDate3.run(0, (int) (byte) -1, 2000);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 10, 7);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(11, (int) ' ', 0);
        java.lang.String str7 = nextDate3.run(0, 2021, 0);
        java.lang.String str11 = nextDate3.run(0, (int) ' ', (int) '4');
        java.lang.String str15 = nextDate3.run(1800, 0, (int) (byte) 1);
        java.lang.String str19 = nextDate3.run(7, 2000, 0);
        java.lang.String str23 = nextDate3.run(30, 13, (int) (short) 10);
        java.lang.String str27 = nextDate3.run(12, 11, (int) (byte) 0);
        java.lang.String str31 = nextDate3.run((int) (short) 10, 10, 2020);
        java.lang.String str35 = nextDate3.run(1, 30, 2021);
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
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "10/11/2020" + "'", str31.equals("10/11/2020"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "1/31/2021" + "'", str35.equals("1/31/2021"));
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 16, (int) (short) -1);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(16, 2, 8);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(9, 0, 0);
        java.lang.String str7 = nextDate3.run((int) '#', 0, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(11, (int) ' ', 0);
        java.lang.String str7 = nextDate3.run(0, 2021, 0);
        java.lang.String str11 = nextDate3.run(1, 6, (-1));
        java.lang.String str15 = nextDate3.run(2, (int) 'a', 3);
        java.lang.String str19 = nextDate3.run(10, (int) (byte) 10, (int) (byte) 0);
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
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 0, 10);
        java.lang.String str7 = nextDate3.run(0, (int) (byte) 1, (int) '#');
        java.lang.String str11 = nextDate3.run(2020, (int) (byte) 100, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(29, 10, (int) (short) 0);
        java.lang.String str7 = nextDate3.run(6, 1, 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 6, (int) (short) 10);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 100, 7);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(4, 0, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run(3, (-1), (int) (byte) -1);
        java.lang.String str11 = nextDate3.run(1, (int) 'a', 100);
        java.lang.String str15 = nextDate3.run(13, 30, 16);
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
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 1, 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 1, (int) ' ');
        java.lang.String str11 = nextDate3.run((int) 'a', (int) (short) 100, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(13, 2, 2020);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2004, (int) '#', (int) (short) -1);
        java.lang.String str7 = nextDate3.run(0, (int) (byte) 0, 1800);
        java.lang.String str11 = nextDate3.run(2, 5, 100);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(9, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(30, (-1), 10);
        java.lang.String str7 = nextDate3.run(8, 0, 0);
        java.lang.String str11 = nextDate3.run(30, 1800, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) '#', 1800);
        java.lang.String str7 = nextDate3.run(1, (int) 'a', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(12, 1800, (int) ' ');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(3, 10, 2000);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 1800, (int) 'a');
        java.lang.String str7 = nextDate3.run(0, 10, 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(11, 4, 10);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 2020, (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (short) -1, 16, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 2000, 2020);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (byte) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1800, 5, 10);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 2000, 13);
        java.lang.String str7 = nextDate3.run((int) (short) 10, 0, 2);
        java.lang.String str11 = nextDate3.run(29, (int) (byte) 1, (int) (byte) 1);
        java.lang.String str15 = nextDate3.run(13, 2021, 2020);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 2000, 10);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 100, 29);
        java.lang.String str7 = nextDate3.run((int) '#', 0, (int) '#');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(9, (-1), (int) ' ');
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(11, (int) ' ', 0);
        java.lang.String str7 = nextDate3.run(0, 2021, 0);
        java.lang.String str11 = nextDate3.run(0, (int) ' ', (int) '4');
        java.lang.String str15 = nextDate3.run(1800, 0, (int) (byte) 1);
        java.lang.String str19 = nextDate3.run(7, 2000, 0);
        java.lang.String str23 = nextDate3.run(30, 13, (int) (short) 10);
        java.lang.String str27 = nextDate3.run(12, 11, (int) (byte) 0);
        java.lang.String str31 = nextDate3.run((int) (short) 10, 10, 2020);
        java.lang.String str35 = nextDate3.run(100, (int) (byte) 100, 4);
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
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "10/11/2020" + "'", str31.equals("10/11/2020"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "invalid Input Date" + "'", str35.equals("invalid Input Date"));
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 100, 4);
        java.lang.String str7 = nextDate3.run(2020, 10, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, 2021, 2020);
        java.lang.String str15 = nextDate3.run((int) (short) 100, 100, 0);
        java.lang.String str19 = nextDate3.run((int) (short) 0, (int) (byte) 100, 1800);
        java.lang.String str23 = nextDate3.run(16, (int) (short) 0, 2);
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
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(29, 6, 5);
        java.lang.String str7 = nextDate3.run(4, 0, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 0, 1);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) 1, 0);
        java.lang.String str11 = nextDate3.run((int) (short) -1, 30, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 5, 7);
        java.lang.String str7 = nextDate3.run(0, 1800, 6);
        java.lang.String str11 = nextDate3.run((int) 'a', (int) (byte) 0, 100);
        java.lang.String str15 = nextDate3.run(1, 0, 29);
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
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 100, 5);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(3, 12, 10);
        java.lang.String str7 = nextDate3.run(13, 31, 31);
        java.lang.String str11 = nextDate3.run(2004, 7, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 2021, 2004);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 7, 2000);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2021, 1, (int) ' ');
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(8, 2000, (int) (short) -1);
        java.lang.String str7 = nextDate3.run(0, (int) (byte) -1, 30);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 2020, (int) (byte) 100);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(30, 5, 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 0, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(9, (int) ' ', 2004);
        java.lang.String str11 = nextDate3.run(1, 100, (int) (short) 100);
        java.lang.String str15 = nextDate3.run((int) (byte) 0, 7, 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Invalid Input Date" + "'", str7.equals("Invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 0, 2);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2004, 3, 4);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(7, 2020, (-1));
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 2021, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 10, (int) '4');
        java.lang.String str7 = nextDate3.run(2, 7, 9);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(5, 3, (int) '4');
        java.lang.String str7 = nextDate3.run(0, 4, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) '#', 8);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (byte) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) 'a', 1, 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) 0, (-1));
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 3, 100);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 7, 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 10, 1800);
        java.lang.String str7 = nextDate3.run(0, 30, (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(16, 0, 1);
        java.lang.String str7 = nextDate3.run(0, 6, 11);
        java.lang.String str11 = nextDate3.run(13, 12, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, 8, 12);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(13, 2, (int) (short) -1);
        java.lang.String str7 = nextDate3.run(9, 3, (int) (short) 100);
        java.lang.String str11 = nextDate3.run(8, 16, 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(11, (int) ' ', 0);
        java.lang.String str7 = nextDate3.run(0, 2021, 0);
        java.lang.String str11 = nextDate3.run(9, 30, 0);
        java.lang.String str15 = nextDate3.run(1, (int) (short) 100, 10);
        java.lang.String str19 = nextDate3.run(2020, 7, 13);
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
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 10, 2004);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 12, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) 'a', 10);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 13, (int) (short) -1);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 8, 4);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 6, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run(4, 1, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(4, (int) (short) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 1, (int) '4');
        java.lang.String str7 = nextDate3.run(1, 100, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2020, (int) (short) 100, 2004);
        java.lang.String str7 = nextDate3.run(30, (int) 'a', 10);
        java.lang.String str11 = nextDate3.run(0, 10, 10);
        java.lang.String str15 = nextDate3.run(9, 0, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 7, 29);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2, 13, (int) '4');
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2000, 30, 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 0, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (short) 0, 29, 16);
        java.lang.String str15 = nextDate3.run(0, 10, 2021);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(9, (int) '#', (int) '4');
        java.lang.String str7 = nextDate3.run(16, (int) '#', 5);
        java.lang.String str11 = nextDate3.run(29, (int) (short) 1, 1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2021, (int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 31, 2000);
        java.lang.String str7 = nextDate3.run((int) (short) 1, 10, 2004);
        java.lang.String str11 = nextDate3.run(0, (int) (short) 10, 3);
        java.lang.String str15 = nextDate3.run((int) (short) 100, 2021, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1/11/2004" + "'", str7.equals("1/11/2004"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2021, (int) 'a', (int) ' ');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2020, 10, 2020);
        java.lang.String str7 = nextDate3.run(9, (int) '4', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(13, 0, 9);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 31, (int) ' ');
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2, (int) (byte) 1, 12);
        java.lang.String str7 = nextDate3.run(5, 100, (int) (byte) 1);
        java.lang.String str11 = nextDate3.run((int) (short) 0, 6, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 5, 10);
        java.lang.String str7 = nextDate3.run(7, (int) (byte) 1, 4);
        java.lang.String str11 = nextDate3.run(3, 1800, 29);
        java.lang.String str15 = nextDate3.run(6, (int) (short) 0, 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) '4', 3);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(4, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 12, 11);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(29, (int) (short) 0, (int) (short) -1);
        java.lang.String str7 = nextDate3.run(100, (int) (short) 0, 3);
        java.lang.String str11 = nextDate3.run((int) ' ', 9, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(5, 31, 100);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(13, 0, 4);
        java.lang.String str7 = nextDate3.run(13, 8, 1800);
        java.lang.String str11 = nextDate3.run(11, (int) (byte) -1, 29);
        java.lang.String str15 = nextDate3.run(11, (int) (byte) 0, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 1, 0);
        java.lang.String str7 = nextDate3.run(2020, 5, 2004);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, (int) (byte) 10, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2, 0, 2);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) (short) 1, 12, 9);
        java.lang.String str15 = nextDate3.run((int) 'a', (int) (short) 0, 30);
        java.lang.String str19 = nextDate3.run(0, 30, 2020);
        java.lang.String str23 = nextDate3.run(1, (int) '4', 1);
        java.lang.String str27 = nextDate3.run(0, 8, 29);
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
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(8, 0, 1);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 2004, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(4, 11, 5);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(29, (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) 'a', 12);
        java.lang.String str11 = nextDate3.run(3, 5, 1);
        java.lang.String str15 = nextDate3.run(10, 4, 13);
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
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) 'a', 0);
        java.lang.String str7 = nextDate3.run((int) ' ', 12, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(11, (int) ' ', 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, 100, 9);
        java.lang.String str11 = nextDate3.run(0, 2020, 100);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, 4, 13);
        java.lang.String str19 = nextDate3.run(6, 12, 9);
        java.lang.String str23 = nextDate3.run(2020, (int) '4', 7);
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
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 2000, 31);
        java.lang.String str7 = nextDate3.run(5, (int) ' ', (int) 'a');
        java.lang.String str11 = nextDate3.run(2000, (int) '#', (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) '#', (int) (short) -1, 12);
        java.lang.String str19 = nextDate3.run(2004, (int) '#', 29);
        java.lang.String str23 = nextDate3.run(11, (int) (byte) 1, 16);
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
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 2020, 3);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(16, (int) (short) 1, 1);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 7, 1);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) '#', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(3, 2004, (int) (short) 100);
        java.lang.String str7 = nextDate3.run(2021, 7, 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(8, 2020, 2004);
        java.lang.String str7 = nextDate3.run(2004, 10, (int) '4');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 6, 5);
        java.lang.String str7 = nextDate3.run(31, 0, 1800);
        java.lang.String str11 = nextDate3.run(12, 1, 6);
        java.lang.String str15 = nextDate3.run((int) (byte) 10, 1, 2004);
        java.lang.String str19 = nextDate3.run((int) (short) 100, (int) ' ', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "10/2/2004" + "'", str15.equals("10/2/2004"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "invalid Input Date" + "'", str19.equals("invalid Input Date"));
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(3, (int) (byte) -1, 0);
        java.lang.String str7 = nextDate3.run(0, 1, 16);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 7, 1800);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 10, 5);
        java.lang.String str7 = nextDate3.run(4, 29, 2004);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4/30/2004" + "'", str7.equals("4/30/2004"));
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(6, 2004, 10);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2, 31, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (-1), 0);
        java.lang.String str11 = nextDate3.run(3, 0, 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(4, 11, 2020);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2021, 0, 2021);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 6, 1);
        java.lang.String str7 = nextDate3.run(29, 2000, 5);
        java.lang.String str11 = nextDate3.run(1, 13, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2021, 3, (int) '4');
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(7, 4, 8);
        java.lang.String str7 = nextDate3.run(0, 30, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 2020, 1);
        java.lang.String str7 = nextDate3.run(9, 9, 5);
        java.lang.String str11 = nextDate3.run(4, (int) (short) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 11, 0);
        java.lang.String str7 = nextDate3.run(10, 12, 9);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2000, 11, 8);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 2, (int) (short) -1);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(16, 13, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(0, (int) 'a', 5);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 12, 16);
        java.lang.String str7 = nextDate3.run((int) ' ', 30, 0);
        java.lang.String str11 = nextDate3.run(2000, (int) (byte) 10, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 1, 5);
        java.lang.String str7 = nextDate3.run(29, 11, 1);
        java.lang.String str11 = nextDate3.run(6, 30, 31);
        java.lang.String str15 = nextDate3.run((int) '4', 1800, 1);
        java.lang.String str19 = nextDate3.run((-1), 5, (int) (short) -1);
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
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) -1, 7);
        java.lang.String str7 = nextDate3.run(1, 31, (int) '4');
        java.lang.String str11 = nextDate3.run((-1), (int) (short) -1, (int) (short) 100);
        java.lang.String str15 = nextDate3.run((int) (byte) 0, (int) (short) 1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 10, 0);
        java.lang.String str7 = nextDate3.run(2000, (int) '#', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 1, 100);
        java.lang.String str7 = nextDate3.run(4, (int) (short) -1, (int) 'a');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 1, (int) '4');
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(5, 4, 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 0, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) '4', (int) (short) 10);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1800, 8, 10);
        java.lang.String str7 = nextDate3.run((int) '4', 16, 0);
        java.lang.String str11 = nextDate3.run((int) (short) 100, (int) (byte) 100, 100);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, 9, 10);
        java.lang.String str19 = nextDate3.run(0, (int) (byte) 0, 1);
        java.lang.String str23 = nextDate3.run(29, 0, 2000);
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
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 3, 2021);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(29, 2, 8);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(5, (int) (byte) 0, 29);
        java.lang.String str7 = nextDate3.run(31, 5, 1);
        java.lang.String str11 = nextDate3.run((int) 'a', 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(30, (-1), 2004);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, 11, 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 0, 13);
        java.lang.String str11 = nextDate3.run(3, 2, (int) ' ');
        java.lang.String str15 = nextDate3.run(0, (int) (byte) -1, 30);
        java.lang.String str19 = nextDate3.run(9, (int) 'a', 1);
        java.lang.String str23 = nextDate3.run(2004, 0, (int) (byte) 10);
        java.lang.String str27 = nextDate3.run((int) (short) -1, 2004, 30);
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
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 13, 2020);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(3, (int) (short) -1, 0);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 30, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) ' ', 8, (int) (short) 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, 2004, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(3, 31, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (byte) 100, 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(6, 3, 8);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(8, (int) (short) 1, 29);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 16, 12);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 2021, 1);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) -1, 7);
        java.lang.String str7 = nextDate3.run(1, 31, (int) '4');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(5, 10, (int) '4');
        java.lang.String str7 = nextDate3.run(8, 0, 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 0, 2004);
        java.lang.String str7 = nextDate3.run((int) (short) 1, 0, 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 7, 2004);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 6, 30);
        java.lang.String str7 = nextDate3.run((int) (short) 1, 6, 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 2000, 31);
        java.lang.String str7 = nextDate3.run(10, 1800, (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 0, 7);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) '#', 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(8, 1, 31);
        java.lang.String str7 = nextDate3.run(2, 0, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run(1800, 9, 2020);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) 0, (int) '4');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 29, 0);
        java.lang.String str7 = nextDate3.run(9, (int) (short) 0, (int) (byte) 1);
        java.lang.String str11 = nextDate3.run((int) '4', (int) 'a', 2004);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) ' ', (int) (byte) 10);
        java.lang.String str7 = nextDate3.run(5, 13, 2021);
        java.lang.String str11 = nextDate3.run(2000, (int) (byte) 1, 13);
        java.lang.String str15 = nextDate3.run((int) (byte) 100, (int) '4', 2);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "5/14/2021" + "'", str7.equals("5/14/2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', (-1));
        java.lang.String str7 = nextDate3.run((int) (short) -1, 31, (int) (short) 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 31, 2020);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2, 0, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(4, 8, (int) ' ');
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2004, 16, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) -1, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((-1), 4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(8, 16, 30);
        java.lang.String str7 = nextDate3.run(30, 0, 1);
        java.lang.String str11 = nextDate3.run(0, 100, (int) (byte) 10);
        java.lang.String str15 = nextDate3.run(31, 0, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (byte) 0, 5);
        java.lang.String str7 = nextDate3.run(12, (int) 'a', 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1800, 4, (int) (short) 100);
        java.lang.String str7 = nextDate3.run(12, (int) '#', 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(13, 0, 4);
        java.lang.String str7 = nextDate3.run(100, 2021, 6);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 7, 8);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(5, 5, (int) (byte) 100);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2020, 1, 12);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 0, 0);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2021, (-1), 10);
        java.lang.String str7 = nextDate3.run(13, 16, 2);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 0, 11);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(11, (int) ' ', 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, 100, 9);
        java.lang.String str11 = nextDate3.run((int) 'a', 8, (int) ' ');
        java.lang.String str15 = nextDate3.run(7, 9, (int) (short) 10);
        java.lang.String str19 = nextDate3.run((int) (short) 10, (int) (short) -1, (-1));
        java.lang.String str23 = nextDate3.run((int) (byte) 100, 1, 16);
        java.lang.String str27 = nextDate3.run(6, (int) (short) 1, (int) (short) 0);
        java.lang.String str31 = nextDate3.run(0, 30, 1800);
        java.lang.String str35 = nextDate3.run(3, 4, (int) (short) 1);
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
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(30, 1, 16);
        java.lang.String str7 = nextDate3.run(2020, (int) (byte) 100, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 4, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 0, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (short) 0, (int) (short) 0);
        java.lang.String str7 = nextDate3.run(11, (int) (byte) 0, 29);
        java.lang.String str11 = nextDate3.run(31, 13, 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2020, (int) 'a', 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(8, 2004, (int) 'a');
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(30, (int) (short) 100, 0);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(13, 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) ' ', 31);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(7, (int) (byte) 0, 2);
        java.lang.String str7 = nextDate3.run((int) (short) 100, 2021, 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(11, (int) ' ', 0);
        java.lang.String str7 = nextDate3.run(0, 2021, 0);
        java.lang.String str11 = nextDate3.run(9, 30, 0);
        java.lang.String str15 = nextDate3.run(1, (int) (short) 100, 10);
        java.lang.String str19 = nextDate3.run(29, (int) (short) -1, 1);
        java.lang.String str23 = nextDate3.run((int) (byte) -1, 10, 4);
        java.lang.String str27 = nextDate3.run(31, 6, (int) (byte) -1);
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
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(6, 0, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (short) 100, 0, (int) (short) 100);
        java.lang.String str11 = nextDate3.run(5, 0, 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', 2);
        java.lang.String str7 = nextDate3.run(3, (int) (short) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(11, (int) ' ', 0);
        java.lang.String str7 = nextDate3.run(0, 2021, 0);
        java.lang.String str11 = nextDate3.run(9, 30, 0);
        java.lang.String str15 = nextDate3.run(11, 2000, (int) (short) 100);
        java.lang.String str19 = nextDate3.run((int) '#', 31, 16);
        java.lang.String str23 = nextDate3.run(1800, 0, (int) (short) -1);
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
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 2004, 2020);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(11, 10, 5);
        java.lang.String str7 = nextDate3.run(1800, (int) (byte) 1, 0);
        java.lang.String str11 = nextDate3.run(2000, (int) ' ', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 31, 10);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(31, 13, 2020);
        java.lang.String str7 = nextDate3.run(4, 2000, 9);
        java.lang.String str11 = nextDate3.run(4, (int) (short) 10, 10);
        java.lang.String str15 = nextDate3.run((int) (byte) -1, 5, 2021);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2, 7, 7);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 2004, (int) '#');
        java.lang.String str7 = nextDate3.run(31, (int) (short) 1, 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 10, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((-1), 2000, 10);
        java.lang.String str11 = nextDate3.run(10, 10, 7);
        java.lang.String str15 = nextDate3.run(0, (int) (short) 100, (int) (short) 10);
        java.lang.String str19 = nextDate3.run(100, 2020, (int) (byte) 1);
        java.lang.String str23 = nextDate3.run(0, (-1), 4);
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
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(5, 2021, 0);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(16, 100, 4);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 1, (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (short) 100, 10, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run(1800, 2020, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(3, 13, 0);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(2004, (int) (short) 0, 4);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 9, (int) (short) 0);
        java.lang.String str7 = nextDate3.run(7, 2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(31, (-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
}

