/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import java.awt.Frame;
import javax.swing.JFrame;


//PDF test
    import java.io.FileNotFoundException;
    import java.io.FileOutputStream;

    import com.itextpdf.text.Document;
    import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;

import com.itextpdf.text.Image;
    import com.itextpdf.text.Paragraph;

import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
    import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilities.StampPageXofY;
import utilities.Footer;
/**
 *
 * @author Marek
 */
public class MainWindow extends javax.swing.JFrame {
    /**
     * Creates new form NewJFrame
     */
    int login = LoginPage.conn.userAns.getId();
    public MainWindow() {
        initComponents();
        this.setExtendedState( this.getExtendedState()|JFrame.MAXIMIZED_BOTH );
        zalogowany.setText("Zalogowany: "+LoginPage.conn.userAns.getFname()+" "+LoginPage.conn.userAns.getLname());
        if(LoginPage.conn.userAns.getType()==1){
            adminMenu.show();
        }
        else{
            adminMenu.hide();
        }        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        zalogowany = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        documents = new javax.swing.JMenu();
        newWZ = new javax.swing.JMenuItem();
        products = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        adminMenu = new javax.swing.JMenu();
        addUser = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 640));
        setUndecorated(true);
        setResizable(false);

        zalogowany.setForeground(new java.awt.Color(0, 204, 51));

        jButton1.setText("Test PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu4.setText("Okno");

        jMenuItem3.setText("Minimalizuj");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        logout.setText("Zamknij");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenu4.add(logout);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Użytkownik");

        jMenuItem6.setText("Zmień hasło");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem5.setText("Wyloguj");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Magazyn");

        documents.setText("Dokumenty");

        newWZ.setText("Zlecenia serwisowe (ZS)");
        newWZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newWZActionPerformed(evt);
            }
        });
        documents.add(newWZ);

        jMenu3.add(documents);

        products.setText("Towary");

        jMenuItem1.setText("Lista");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        products.add(jMenuItem1);

        jMenuItem4.setText("Dodaj produkt");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        products.add(jMenuItem4);

        jMenu3.add(products);

        jMenuBar1.add(jMenu3);

        adminMenu.setText("Administrator");

        addUser.setText("Dodaj użytkownika");
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });
        adminMenu.add(addUser);

        jMenuBar1.add(adminMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(790, Short.MAX_VALUE)
                .addComponent(zalogowany)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 478, Short.MAX_VALUE)
                .addComponent(zalogowany)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        closeAccept clAc = new closeAccept();
        clAc.parentFrame = this;
        this.disable();
        clAc.show();
    }//GEN-LAST:event_logoutActionPerformed

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        addUser adUs = new addUser();
        adUs.parentFrame = this;
        this.disable();
        adUs.show();
    }//GEN-LAST:event_addUserActionPerformed

    private void newWZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newWZActionPerformed
        wzListWindow wzL = new wzListWindow();
        wzL.parentFrame = this;
        this.disable();
        wzL.show();
    }//GEN-LAST:event_newWZActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        productsWindow prodWind = new productsWindow();
        prodWind.parentFrame = this;
        this.disable();
        prodWind.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        addProduct addProd = new addProduct();
        addProd.parentFrameMainWidnow = this;
        addProd.parentFrameId = 2;
        addProd.show();
        this.disable();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        LoginPage.conn.logout();
        LoginPage logPage = new LoginPage();
        logPage.show();
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ChangePassword chPass = new ChangePassword();
        chPass.isParentMainWindow = 1;
        chPass.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    StampPageXofY numeration = new StampPageXofY();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Document document = new Document();
      Footer ft = new Footer();
      try
      {  
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("test.pdf"));
        document.open();
        Paragraph pr = new Paragraph();

        ft.parentFrame = this;
        writer.setPageEvent(ft);
        
        
        pr.setAlignment(Element.ALIGN_CENTER);
        pr.add("Dane firmy:");
        pr.add(Chunk.NEWLINE);
        pr.add("NAZWA FIRMY");
        pr.add(Chunk.NEWLINE);
        pr.add("ul. TESTOWA 1");
        pr.add(Chunk.NEWLINE);
        pr.add("00-554 ZADUPIE");
        
        document.add(pr);
        
        
        //PUT IMAGE FROM DRIVE
        java.awt.Image awtImage =
        Toolkit.getDefaultToolkit().createImage("C:/GIT/support/logo.jpg");
        Image img = com.itextpdf.text.Image.getInstance(awtImage, null);
        img.setAbsolutePosition(0f,0f);
        document.add(new Paragraph());
        document.add(img);
        
        //ADD TABLE
        
        PdfPTable table = new PdfPTable(3); // 3 columns.
        table.setWidthPercentage(50); //Width 100%
        table.setSpacingBefore(10f); //Space before table
        table.setSpacingAfter(10f); //Space after table
 
        //Set Column widths
        float[] columnWidths = {1f, 1f, 1f};
        table.setWidths(columnWidths);
        for (int i=0;i<10;i++){
        PdfPCell cell1 = new PdfPCell(new Paragraph("Cell 1"));
        cell1.setBorderColor(BaseColor.BLUE);
        cell1.setPaddingLeft(10);
        cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
 
        PdfPCell cell2 = new PdfPCell(new Paragraph("Cell 2"));
        cell2.setBorderColor(BaseColor.GREEN);
        cell2.setPaddingLeft(10);
        cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
 
        PdfPCell cell3 = new PdfPCell(new Paragraph("Cell 3"));
        cell3.setBorderColor(BaseColor.RED);
        cell3.setPaddingLeft(10);
        cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell3.setVerticalAlignment(Element.ALIGN_MIDDLE);

 
        table.addCell(cell1);
        table.addCell(cell2);
        table.addCell(cell3);
        } 
        document.add(table);
        
        //CLOSING DOCUMENT
        document.close(); 
        writer.close();
        
        } catch (DocumentException e)
        {
            e.printStackTrace();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            numeration.manipulatePdf("test.pdf", "test1.pdf");
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        //OPEN READY DOCUMENT
        try {
            Desktop.getDesktop().open(new File("C:/GIT/support/test1.pdf"));
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void onClose(){
        closeAccept clAc = new closeAccept();
        clAc.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addUser;
    private javax.swing.JMenu adminMenu;
    private javax.swing.JMenu documents;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenuItem newWZ;
    private javax.swing.JMenu products;
    private javax.swing.JLabel zalogowany;
    // End of variables declaration//GEN-END:variables
}
