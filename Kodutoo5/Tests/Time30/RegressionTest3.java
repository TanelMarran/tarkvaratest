import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 1, 1);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) '#', (-1));
        java.lang.String str7 = nextDate3.run((int) (short) 10, 10, 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) ' ', (int) '4');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 100, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) '#', 0, (int) (short) 1);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) '4', 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) 'a', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (short) -1, 10);
        java.lang.String str11 = nextDate3.run(10, 0, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) '4', (int) (short) -1);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 0, (int) ' ');
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 1, 1);
        java.lang.String str7 = nextDate3.run((-1), (int) (byte) 100, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (-1), (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) (byte) 0, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) (byte) 100, (int) (short) 100);
        java.lang.String str15 = nextDate3.run((int) 'a', (int) ' ', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 10, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((-1), 1, 10);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 10, 100);
        java.lang.String str15 = nextDate3.run(0, 0, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (short) 10, 10);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 0, (int) '4');
        java.lang.String str7 = nextDate3.run((-1), (int) (byte) -1, 1);
        java.lang.String str11 = nextDate3.run(1, 0, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) -1, 0);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 10, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) '#', (int) 'a', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 10, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) '#', 0, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(1, (int) (short) 0, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) 'a', (int) ' ');
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) '4', (int) 'a');
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 0, 10);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 0, (int) ' ');
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (short) 100, (int) '#');
        java.lang.String str11 = nextDate3.run(0, 10, (int) 'a');
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) '#', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "invalid Input Date" + "'", str15.equals("invalid Input Date"));
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run((int) (byte) 1, (int) ' ', (int) (short) 100);
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
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (-1), (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (byte) -1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 1, 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, 0, 100);
        java.lang.String str11 = nextDate3.run((-1), (int) (short) 0, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid Input Date" + "'", str11.equals("invalid Input Date"));
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) 1, 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) ' ', (int) (byte) 0);
        java.lang.String str11 = nextDate3.run(0, 1, (int) (short) 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 100, (int) ' ', (int) (short) 0);
        java.lang.String str19 = nextDate3.run((int) (short) 1, (int) (byte) 10, 0);
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
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 1, (int) 'a');
        java.lang.String str7 = nextDate3.run(10, (int) (byte) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(0, (int) (short) 100, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) '#', (int) (short) 100);
        java.lang.String str15 = nextDate3.run((int) (short) 1, (int) (byte) 0, (int) (byte) 1);
        java.lang.String str19 = nextDate3.run(100, 1, (int) (byte) 0);
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
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 0, (int) (short) -1);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, 100, (int) (short) 1);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run((int) ' ', (int) 'a', (int) '4');
        java.lang.String str23 = nextDate3.run(100, (int) (short) 100, (int) (byte) -1);
        java.lang.String str27 = nextDate3.run((int) (short) -1, 10, (int) 'a');
        java.lang.String str31 = nextDate3.run((int) (byte) 100, 1, 0);
        java.lang.String str35 = nextDate3.run(100, (int) '4', (int) (byte) 10);
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
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run((int) ' ', (int) 'a', (int) '4');
        java.lang.String str23 = nextDate3.run((int) '4', (int) (short) 1, (int) ' ');
        java.lang.String str27 = nextDate3.run((int) (byte) 10, 100, (int) (short) 0);
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
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 0, 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (byte) 1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "invalid Input Date" + "'", str7.equals("invalid Input Date"));
    }
}

