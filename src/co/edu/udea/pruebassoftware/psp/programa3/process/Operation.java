package co.edu.udea.pruebassoftware.psp.programa3.process;

import co.edu.udea.pruebassoftware.psp.programa3.linkedlist.LinkedList;
import co.edu.udea.pruebassoftware.psp.programa3.linkedlist.Node;
import static java.lang.Double.NaN;
import java.text.DecimalFormat;

/**
 * Clase donde se realizarán las diferentes operaciones matemásticas a partir de
 * los valores almacenados en una lista ligada.
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @since JDK 1.8
 * @version 1.0
 */
public class Operation {

    private double xk;
    private final LinkedList linkedList;
    private final DecimalFormat decimalFormat;

    public static String DECIMAL_FORMAT = "#.######";

    public Operation(LinkedList linkedList) {
        this.linkedList = linkedList;
        this.decimalFormat = new DecimalFormat(DECIMAL_FORMAT);
    }

    public Operation(LinkedList linkedList, double xk) {
        this.linkedList = linkedList;
        this.xk = xk;
        this.decimalFormat = new DecimalFormat(DECIMAL_FORMAT);
    }

    public double[] sum() {
        double[] sum = {NaN, NaN};
        if (linkedList != null && linkedList.getFirstNode() != null) {
            double xSum = 0.0;
            double ySum = 0.0;

            Node node = linkedList.getFirstNode();
            while (node != null) {
                xSum += node.getX();
                ySum += node.getY();
                node = node.getNext();
            }

            sum[0] = xSum;
            sum[1] = ySum;
        }

        return sum;
    }

    public double[] mean() {
        double[] mean = {NaN, NaN};
        if (linkedList != null && linkedList.getFirstNode() != null) {
            double amount = linkedList.getAmount();
            double[] sum = this.sum();

            double xMean = sum[0] / amount;
            double yMean = sum[1] / amount;

            mean[0] = Double.parseDouble(this.decimalFormat.format(xMean).
                    replace(",", "."));
            mean[1] = Double.parseDouble(this.decimalFormat.format(yMean).
                    replace(",", "."));
        }

        return mean;
    }

    public double sumMultiplyXY() {
        double xy = NaN;
        if (this.linkedList != null && this.linkedList.getFirstNode() != null) {
            Node n = this.linkedList.getFirstNode();
            xy = 0.0;
            while (n != null) {
                xy += (n.getX() * n.getY());

                n = n.getNext();
            }

            return Double.parseDouble(this.decimalFormat.format(xy).
                    replace(",", "."));
        }

        return xy;
    }

    public double[] sumPow() {
        double[] sp = {NaN, NaN};

        if (this.linkedList != null && this.linkedList.getFirstNode() != null) {
            double x2 = 0.0;
            double y2 = 0.0;
            Node n = this.linkedList.getFirstNode();
            while (n != null) {
                x2 += Math.pow(n.getX(), 2.0);
                y2 += Math.pow(n.getY(), 2.0);

                n = n.getNext();
            }

            sp[0] = Double.parseDouble(this.decimalFormat.format(x2).
                    replace(",", "."));
            sp[1] = Double.parseDouble(this.decimalFormat.format(y2).
                    replace(",", "."));
        }

        return sp;
    }

    public double[] calculateCorrelationParameters() {
        double[] cp = {NaN, NaN};

        if (this.linkedList != null && this.linkedList.getFirstNode() != null) {
            int n = this.linkedList.getAmount();
            double xy = this.sumMultiplyXY();
            double[] s = this.sum();
            double x = s[0];
            double y = s[1];
            double[] p = this.sumPow();
            double x2 = p[0];
            double y2 = p[1];
            double dividend = (n * xy) - (x * y);
            double divisor = Math.sqrt((n * x2 - Math.pow(x, 2.0)) * (n * y2
                    - Math.pow(y, 2.0)));
            double rxy = dividend / divisor;
            double r2 = rxy * rxy;

            cp[0] = Double.parseDouble(this.decimalFormat.format(rxy).
                    replace(",", "."));
            cp[1] = Double.parseDouble(this.decimalFormat.format(r2).
                    replace(",", "."));
        }

        return cp;
    }

    public double[] calculateRegressionParameters() {
        double[] rp = {NaN, NaN};

        if (this.linkedList != null && this.linkedList.getFirstNode() != null) {
            int n = linkedList.getAmount();
            double[] m = mean();
            double xMean = m[0];
            double yMean = m[1];
            double[] sp = this.sumPow();
            double x2 = sp[0];
            double xy = sumMultiplyXY();
            double b1 = (xy - (n * xMean * yMean)) / (x2 - (n * Math.pow(xMean,
                    2.0)));
            double b0 = yMean - b1 * xMean;

            rp[0] = Double.parseDouble(this.decimalFormat.format(b0).
                    replace(",", "."));
            rp[1] = Double.parseDouble(this.decimalFormat.format(b1).
                    replace(",", "."));
        }

        return rp;
    }

    public double calculateYk() {
        double yk = NaN;
        if (this.linkedList != null && this.linkedList.getFirstNode() != null) {
            double[] rp = calculateRegressionParameters();
            double b0 = rp[0];
            double b1 = rp[1];
            yk = b0 + b1 * this.xk;

            yk = Double.parseDouble(this.decimalFormat.format(yk).
                    replace(",", "."));
        }

        return yk;
    }
}
