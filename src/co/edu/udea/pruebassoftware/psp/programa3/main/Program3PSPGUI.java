package co.edu.udea.pruebassoftware.psp.programa3.main;

import co.edu.udea.pruebassoftware.psp.programa3.controller.Program3PSPController;
import co.edu.udea.pruebassoftware.psp.programa3.linkedlist.LinkedList;
import static co.edu.udea.pruebassoftware.psp.programa3.util.constants.Constants.FILE_EXTENSION;
import co.edu.udea.pruebassoftware.psp.programa3.util.enums.MessageEnums;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

public class Program3PSPGUI extends javax.swing.JFrame {

    private static final JFileChooser FILE_CHOOSER;
    private File selectedFile;
    private final Program3PSPController guiController;
    private static final ImageIcon ERROR_IMAGE
            = new ImageIcon(Program3PSPGUI.class
                    .getResource("/co/edu/udea/pruebassoftware/psp/programa3/gui/"
                            + "images/ic_dialog_error.png"));
    private static final ImageIcon WARNING_IMAGE
            = new ImageIcon(Program3PSPGUI.class
                    .getResource("/co/edu/udea/pruebassoftware/psp/programa3/gui/"
                            + "images/ic_dialog_warning.png"));

    static {
        FILE_CHOOSER = new JFileChooser();

        FILE_CHOOSER.setFileFilter(new FileFilter() {
            @Override()
            public boolean accept(File pathname) {
                return (pathname.getAbsolutePath().endsWith(FILE_EXTENSION));
            }

            @Override()
            public String getDescription() {
                return ("Archivo de texto plano (*" + FILE_EXTENSION + ")");
            }
        });
        FILE_CHOOSER.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FILE_CHOOSER.setDialogTitle("Seleccionar archivo a procesar...");
    }

    public Program3PSPGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.guiController = new Program3PSPController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectFile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        b0Label = new javax.swing.JLabel();
        b1Label = new javax.swing.JLabel();
        b0TextField = new javax.swing.JTextField();
        b1TextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rxyTextField = new javax.swing.JTextField();
        r2TextField = new javax.swing.JTextField();
        rxyLabel = new javax.swing.JLabel();
        r2Label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ykTextField = new javax.swing.JTextField();
        ykLabel = new javax.swing.JLabel();
        xkTextField = new javax.swing.JTextField();
        xkLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selectFile.setText("Seleccionar");
        selectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFileActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setText("Seleccione el archivo a procesar");

        b0Label.setFont(new java.awt.Font("Tahoma", 1, 12));
        b0Label.setText("B0");

        b1Label.setFont(new java.awt.Font("Tahoma", 1, 12));
        b1Label.setText("B1");

        b0TextField.setEditable(false);
        b0TextField.setFont(new java.awt.Font("Tahoma", 0, 12));

        b1TextField.setEditable(false);
        b1TextField.setFont(new java.awt.Font("Tahoma", 0, 12));

        jLabel2.setText("Parámetros de Regresión");

        jLabel3.setText("Parámetros de Correlación");

        rxyTextField.setEditable(false);
        rxyTextField.setFont(new java.awt.Font("Tahoma", 0, 12));

        r2TextField.setEditable(false);
        r2TextField.setFont(new java.awt.Font("Tahoma", 0, 12));

        rxyLabel.setFont(new java.awt.Font("Tahoma", 1, 12));
        rxyLabel.setText("r(x,y)");

        r2Label.setFont(new java.awt.Font("Tahoma", 1, 12));
        r2Label.setText("r*r");

        jLabel4.setText("Estimación");

        ykTextField.setEditable(false);
        ykTextField.setFont(new java.awt.Font("Tahoma", 0, 12));

        ykLabel.setFont(new java.awt.Font("Tahoma", 1, 12));
        ykLabel.setText("Yk");

        xkTextField.setFont(new java.awt.Font("Tahoma", 0, 12));

        xkLabel.setFont(new java.awt.Font("Tahoma", 1, 12));
        xkLabel.setText("Xk");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(xkTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(xkLabel))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(b0TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(b1Label)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(b1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(rxyLabel)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addComponent(r2Label)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(r2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addGap(27, 27, 27)
                                                                    .addComponent(jLabel4)))))
                                                    .addComponent(ykLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(57, 57, 57)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(rxyTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(ykTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addComponent(b0Label))
                                            .addGap(0, 0, Short.MAX_VALUE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(selectFile)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xkLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(xkTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(selectFile)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b0Label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b0TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b1Label)
                    .addComponent(b1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rxyLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rxyTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(r2Label)
                    .addComponent(r2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ykLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ykTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        pack();
    }
	// </editor-fold>//GEN-END:initComponents

    // GEN-FIRST:event_selectFileActionPerformed
    private void selectFileActionPerformed(java.awt.event.ActionEvent evt) {
        this.clean();
        FILE_CHOOSER.showOpenDialog(this);

        this.selectedFile = FILE_CHOOSER.getSelectedFile();
        boolean correct = this.guiController.checkFile(selectedFile);
        double xk;
        try {
            xk = Double.parseDouble(this.xkTextField.getText().trim());
        } catch (NumberFormatException ex) {
            this.showMessage(MessageEnums.INVALID_XK, true);

            return;
        }

        if (!correct) {
            if (this.selectedFile == null) {
                this.showMessage(MessageEnums.FILE_NOT_SELECTED, false);
            } else {
                this.showMessage(MessageEnums.EXTENSION_NOT_VALID, true);
            }
        } else {
            LinkedList linkedList;
            try {
                linkedList = this.guiController.readFile(selectedFile);
                if (linkedList != null && linkedList.getFirstNode() != null) {
                    this.guiController.calculateValues(linkedList, xk);
                    this.b0TextField.setText(String.valueOf(guiController.
                            getB0()));
                    this.b1TextField.setText(String.valueOf(guiController.
                            getB1()));
                    this.rxyTextField.setText(String.valueOf(guiController.
                            getRxy()));
                    this.r2TextField.setText(String.valueOf(guiController.
                            getR2()));
                    this.ykTextField.setText(String.valueOf(guiController.
                            getYk()));
                } else {
                    this.showMessage(MessageEnums.ERROR_READING_NUMBERS, true);
                }
            } catch (IOException ex) {
                showMessage(MessageEnums.INTERNAL_ERROR, true);
            }
        }
    }

    private void clean() {
        FILE_CHOOSER.setSelectedFile(null);
        this.b0TextField.setText("");
        this.b1TextField.setText("");
        this.rxyTextField.setText("");
        this.r2TextField.setText("");
        this.ykTextField.setText("");
    }

    private void showMessage(MessageEnums message, boolean isError) {
        if (isError) {
            JOptionPane.showMessageDialog(this, message.getMessage(),
                    message.getTitle(),
                    JOptionPane.ERROR_MESSAGE, ERROR_IMAGE);
        } else {
            JOptionPane.showMessageDialog(this, message.getMessage(),
                    message.getTitle(),
                    JOptionPane.ERROR_MESSAGE, WARNING_IMAGE);
        }
    }
    // GEN-LAST:event_selectFileActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Program3PSPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Program3PSPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Program3PSPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Program3PSPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Program3PSPGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b0Label;
    private javax.swing.JTextField b0TextField;
    private javax.swing.JLabel b1Label;
    private javax.swing.JTextField b1TextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel r2Label;
    private javax.swing.JTextField r2TextField;
    private javax.swing.JLabel rxyLabel;
    private javax.swing.JTextField rxyTextField;
    private javax.swing.JButton selectFile;
    private javax.swing.JLabel xkLabel;
    private javax.swing.JTextField xkTextField;
    private javax.swing.JLabel ykLabel;
    private javax.swing.JTextField ykTextField;
    // End of variables declaration//GEN-END:variables
}
