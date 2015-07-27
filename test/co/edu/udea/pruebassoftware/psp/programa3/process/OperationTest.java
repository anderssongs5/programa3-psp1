package co.edu.udea.pruebassoftware.psp.programa3.process;

import co.edu.udea.pruebassoftware.psp.programa3.linkedlist.LinkedList;
import static java.lang.Double.NaN;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class OperationTest {

    @Test()
    public void sumTest1() {
        Operation operation = new Operation(new LinkedList());
        double sum[] = operation.sum();

        assertTrue(Double.compare(NaN, sum[0]) == 0 && Double.compare(NaN,
                sum[1]) == 0);
    }

    @Test()
    public void sumTest2() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(5.6, 0);
        Operation operation = new Operation(linkedList);
        double sum[] = operation.sum();

        assertTrue(sum[0] == 5.6 && sum[1] == 0);
    }

    @Test()
    public void sumTest3() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(5.6, 3);
        linkedList.link(58.6, 52);
        linkedList.link(55, -51);
        linkedList.link(95, 53.2);
        Operation operation = new Operation(linkedList);
        double sum[] = operation.sum();

        assertTrue(sum[0] == 214.2 && sum[1] == 57.2);
    }

    @Test()
    public void sumTest4() {
        Operation operation = new Operation(null);
        double sum[] = operation.sum();

        assertTrue(Double.compare(NaN, sum[0]) == 0 && Double.compare(NaN,
                sum[1]) == 0);
    }

    @Test()
    public void meanTest1() {
        Operation operation = new Operation(null);
        double[] mean = operation.mean();

        assertTrue(Double.compare(NaN, mean[0]) == 0 && Double.compare(NaN,
                mean[1]) == 0);
    }

    @Test()
    public void meanTest2() {
        Operation operation = new Operation(new LinkedList());
        double[] mean = operation.mean();

        assertTrue(Double.compare(NaN, mean[0]) == 0 && Double.compare(NaN,
                mean[1]) == 0);
    }

    @Test()
    public void meanTest3() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(5.6, -3.2);
        Operation operation = new Operation(linkedList);
        double[] mean = operation.mean();

        assertTrue(mean[0] == 5.6 && mean[1] == -3.2);
    }

    @Test()
    public void meanTest4() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(5, 1.34);
        linkedList.link(1.2, -53.2);
        Operation operation = new Operation(linkedList);
        double[] mean = operation.mean();

        assertTrue(mean[0] == 3.1 && mean[1] == -25.93);
    }

    @Test()
    public void meanTest5() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(5, 0.24);
        linkedList.link(1, 789.2);
        linkedList.link(3, 95.5);
        linkedList.link(90, 532.1);
        linkedList.link(-83, -1241);
        linkedList.link(-37, -21);
        linkedList.link(51, 224);
        Operation operation = new Operation(linkedList);
        double[] mean = operation.mean();

        assertTrue(mean[0] == 4.285714 && mean[1] == 54.148571);
    }

    @Test()
    public void sumMultiplyXYTest1() {
        Operation operation = new Operation(new LinkedList());
        double xy = operation.sumMultiplyXY();

        assertTrue(Double.compare(NaN, xy) == 0);
    }

    @Test()
    public void sumMultiplyXYTest2() {
        Operation operation = new Operation(null);
        double xy = operation.sumMultiplyXY();

        assertTrue(Double.compare(NaN, xy) == 0);
    }

    @Test()
    public void sumMultiplyXYTest3() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(5, 1.34);
        linkedList.link(1.2, -53.2);
        Operation operation = new Operation(linkedList);
        double xy = operation.sumMultiplyXY();

        assertTrue(xy == -57.14);
    }

    @Test()
    public void sumMultiplyXYTest4() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(5, 0.24);
        linkedList.link(1, 789.2);
        linkedList.link(3, 95.5);
        linkedList.link(90, 532.1);
        linkedList.link(-83, -1241);
        linkedList.link(-37, -21);
        linkedList.link(51, 224);
        Operation operation = new Operation(linkedList);
        double xy = operation.sumMultiplyXY();

        assertTrue(xy == 164169.9);
    }

    @Test()
    public void sumPowTest1() {
        Operation operation = new Operation(new LinkedList());
        double sp[] = operation.sumPow();

        assertTrue(Double.compare(NaN, sp[0]) == 0 && Double.compare(NaN, sp[1])
                == 0);
    }

    @Test()
    public void sumPowTest2() {
        Operation operation = new Operation(null);
        double sp[] = operation.sumPow();

        assertTrue(Double.compare(NaN, sp[0]) == 0 && Double.compare(NaN, sp[1])
                == 0);
    }

    @Test()
    public void sumPowTest3() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(5, 1.34);
        linkedList.link(1.2, -53.2);
        Operation operation = new Operation(linkedList);
        double[] sp = operation.sumPow();

        assertTrue(sp[0] == 26.44 && sp[1] == 2832.0356);
    }

    @Test()
    public void sumPowTest4() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(5, 0.24);
        linkedList.link(1, 789.2);
        linkedList.link(3, 95.5);
        Operation operation = new Operation(linkedList);
        double[] sp = operation.sumPow();

        assertTrue(sp[0] == 35 && sp[1] == 631956.9476);
    }

    @Test()
    public void calculateCorrelationParametersTest1() {
        Operation operation = new Operation(new LinkedList());
        double cp[] = operation.calculateCorrelationParameters();

        assertTrue(Double.compare(NaN, cp[0]) == 0 && Double.compare(NaN,
                cp[1]) == 0);
    }

    @Test()
    public void calculateCorrelationParametersTest2() {
        Operation operation = new Operation(null);
        double cp[] = operation.calculateCorrelationParameters();

        assertTrue(Double.compare(NaN, cp[0]) == 0 && Double.compare(NaN,
                cp[1]) == 0);
    }

    @Test()
    public void calculateCorrelationParametersTest3() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(5, 1.34);
        linkedList.link(1.2, -53.2);
        Operation operation = new Operation(linkedList);
        double[] cp = operation.calculateCorrelationParameters();

        assertTrue(cp[0] == 1 && cp[1] == 1);
    }

    @Test()
    public void calculateRegressionParametersTest1() {
        Operation operation = new Operation(new LinkedList());
        double rp[] = operation.calculateRegressionParameters();

        assertTrue(Double.compare(NaN, rp[0]) == 0 && Double.compare(NaN,
                rp[1]) == 0);
    }

    @Test()
    public void calculateRegressionParametersTest2() {
        Operation operation = new Operation(null);
        double rp[] = operation.calculateRegressionParameters();

        assertTrue(Double.compare(NaN, rp[0]) == 0 && Double.compare(NaN,
                rp[1]) == 0);
    }

    @Test()
    public void calculateRegressionParametersTest3() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(5, 1.34);
        linkedList.link(1.2, -53.2);
        Operation operation = new Operation(linkedList);
        double[] rp = operation.calculateRegressionParameters();

        assertTrue(rp[0] == -70.423158 && rp[1] == 14.352632);
    }

    @Test()
    public void calculateYkTest1() {
        double xk = 35.2;
        Operation operation = new Operation(new LinkedList(), xk);
        double yk = operation.calculateYk();

        assertTrue(Double.compare(NaN, yk) == 0);
    }

    @Test()
    public void calculateYkTest2() {
        double xk = 35.2;
        Operation operation = new Operation(null, xk);
        double yk = operation.calculateYk();

        assertTrue(Double.compare(NaN, yk) == 0);
    }

    @Test()
    public void calculateYkTest3() {
        double xk = 35.2;
        LinkedList linkedList = new LinkedList();
        linkedList.link(5, 1.34);
        linkedList.link(1.2, -53.2);
        Operation operation = new Operation(linkedList, xk);
        double yk = operation.calculateYk();

        assertTrue(yk == 434.789488);
    }
}
