package co.edu.udea.pruebassoftware.psp.programa3.controller;

import co.edu.udea.pruebassoftware.psp.programa3.linkedlist.LinkedList;
import co.edu.udea.pruebassoftware.psp.programa3.process.Operation;
import co.edu.udea.pruebassoftware.psp.programa3.util.constants.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Clase que hará las veces de controlador de la interfaz gráfica de la
 * aplicación.
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @since JDK 1.8
 * @version 1.0
 */
public class Program3PSPController {

    private Operation operation = null;
    private double b0;
    private double b1;
    private double rxy;
    private double r2;
    private double yk;

    public Program3PSPController() {
        super();
    }

    public void calculateValues(LinkedList linkedList, double xk) {
        this.operation = new Operation(linkedList, xk);
        double[] rp = this.operation.calculateRegressionParameters();
        this.b0 = rp[0];
        this.b1 = rp[1];
        double[] cp = this.operation.calculateCorrelationParameters();
        this.rxy = cp[0];
        this.r2 = cp[1];
        this.yk = this.operation.calculateYk();
    }

    public boolean checkFile(File selectedFile) {
        if ((selectedFile == null) || !(selectedFile.canRead())
                || !(selectedFile.isFile())) {

            return false;
        }

        return selectedFile.getName().endsWith(Constants.FILE_EXTENSION);
    }

    public LinkedList readFile(File file) throws IOException {
        LinkedList linkedList = new LinkedList();
        if (file.exists()) {
            List<StringBuilder> lines = this.readLines(file);

            for (StringBuilder sb : lines) {
                String line = sb.toString();
                StringTokenizer stringTokenizer = new StringTokenizer(line, ",");
                try {
                    String xString = stringTokenizer.nextToken().trim();
                    String yString = stringTokenizer.nextToken().trim();
                    if (xString != null && !xString.equals("") && yString != null
                            && !yString.equals("")) {
                        double x = Double.parseDouble(xString);
                        double y = Double.parseDouble(yString);
                        linkedList.link(x, y);
                    }
                } catch (Exception ex) {

                    return null;
                }
            }
        }

        return linkedList;
    }

    public List<StringBuilder> readLines(File selectedFile)
            throws FileNotFoundException, IOException {
        System.out.println(selectedFile.getAbsolutePath());
        List<StringBuilder> lines = new ArrayList<>();

        if (selectedFile.exists()) {
            FileReader fileReader = new FileReader(selectedFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String stringTemp = bufferedReader.readLine();
            StringBuilder temp;

            while (stringTemp != null) {
                temp = new StringBuilder(stringTemp.trim());

                if (temp.length() == 0) {
                    stringTemp = bufferedReader.readLine();
                    continue;
                }

                lines.add(temp);
                stringTemp = bufferedReader.readLine();
            }
        }

        return (lines);
    }

    public double getB0() {
        return b0;
    }

    public double getB1() {
        return b1;
    }

    public double getRxy() {
        return rxy;
    }

    public double getR2() {
        return r2;
    }

    public double getYk() {
        return yk;
    }
}
