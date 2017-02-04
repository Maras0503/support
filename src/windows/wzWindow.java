/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import db.DbQueries;
import entities.ContractorEntity;
import entities.DocEntity;
import entities.DocProductEntity;
import java.awt.Color;
import static java.lang.Math.round;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import tableTemplates.ProductOnDocumentTableTemplate;
import static utilities.Other.getScreenWidth;

/**
 *
 * @author Marek
 */
public class wzWindow extends javax.swing.JFrame {
    DbQueries db = new DbQueries();
    List<DocProductEntity> productToShow = new ArrayList<>();
    public wzListWindow parentFrame;
    public int selectedDocument;
    DocEntity doc = db.getDocument(selectedDocument);
    ContractorEntity contractor = db.getContractor(doc.getDocContractorId());
    public wzWindow(int docId){
        initComponents();
        selectedDocument = docId;
        doc = db.getDocument(docId);
        if("SPRZĘT WYDANY".equals(doc.getDocStatus()) || "SPRZĘT PRZYJĘTY".equals(doc.getDocStatus())){
            addBtt.hide();
            delBtt.hide();
            editBtt.hide();
        }
        contractor = db.getContractor(doc.getDocContractorId());
        idLab.setText(String.valueOf(contractor.getId()));
        nameLab.setText(contractor.getName());
        nipLab.setText(contractor.getNip());
        codeLab.setText(contractor.getPostalCode());
        cityLab.setText(contractor.getCity());
        streetLab.setText(contractor.getStreet());
        phoneLab.setText(contractor.getPhone());
        emailLab.setText(contractor.getEmail());
        getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        this.setExtendedState( this.getExtendedState()|JFrame.MAXIMIZED_BOTH);
        productToShow = db.getDocProducts(docId);
        drawProductTable(productToShow);
        productTable.changeSelection(0, 0, false, false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        nettoLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bruttoLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        idLab = new javax.swing.JLabel();
        nameLab = new javax.swing.JLabel();
        nipLab = new javax.swing.JLabel();
        codeLab = new javax.swing.JLabel();
        cityLab = new javax.swing.JLabel();
        streetLab = new javax.swing.JLabel();
        phoneLab = new javax.swing.JLabel();
        emailLab = new javax.swing.JLabel();
        addBtt = new javax.swing.JButton();
        delBtt = new javax.swing.JButton();
        editBtt = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAZWA", "NR SERYJNY", "KOSZT", "PROBLEM", "NAPRAWY", "MIEJSCE NAPRAWY"
            }
        ));
        jScrollPane1.setViewportView(productTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Netto:");

        nettoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Brutto:");

        bruttoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("NAZWA:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("NIP:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("KOD POCZTOWY:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("MIASTO:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("ULICA:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("TELEFON:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("EMAIL:");

        idLab.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        idLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        nameLab.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        nameLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        nipLab.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        nipLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        codeLab.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        codeLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        cityLab.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cityLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        streetLab.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        streetLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        phoneLab.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        phoneLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        emailLab.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        emailLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nipLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(codeLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cityLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(streetLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phoneLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailLab, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(nameLab, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(nipLab, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(codeLab, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cityLab, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(streetLab, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(phoneLab, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(emailLab, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        addBtt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addBtt.setText("Dodaj sprzęt");
        addBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBttActionPerformed(evt);
            }
        });

        delBtt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        delBtt.setText("Usuń zaznaczony");
        delBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBttActionPerformed(evt);
            }
        });

        editBtt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        editBtt.setText("Edytuj zaznaczony");
        editBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBttActionPerformed(evt);
            }
        });

        jMenu2.setText("Okno");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Zamknij");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nettoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bruttoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(editBtt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delBtt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addBtt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addBtt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editBtt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delBtt, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nettoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bruttoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        parentFrame.enable();
        this.dispose();
        parentFrame.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void addBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBttActionPerformed
        addProductToDoc addProd = new addProductToDoc();
        addProd.parentFrame = this;
        this.disable();
        addProd.show();
    }//GEN-LAST:event_addBttActionPerformed

    private void delBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBttActionPerformed
        confirmDeleteProductFromDocument delPos = new confirmDeleteProductFromDocument();
        delPos.parentFrame = this;
        this.disable();
        delPos.show();
    }//GEN-LAST:event_delBttActionPerformed

    private void editBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBttActionPerformed
        editPos edit = new editPos();
        edit.priceBox.setText(productTable.getValueAt(productTable.getSelectedRow(), 3).toString());
        edit.problemText.setText(productTable.getValueAt(productTable.getSelectedRow(), 4).toString());
        edit.repairText.setText(productTable.getValueAt(productTable.getSelectedRow(), 5).toString());
        edit.parentFrame = this;
        this.disable();
        edit.show();
    }//GEN-LAST:event_editBttActionPerformed
    float snetto;
    public void drawProductTable(List<DocProductEntity> prodList){
        ProductOnDocumentTableTemplate dtm = new ProductOnDocumentTableTemplate();
        productTable.setModel(dtm);
        
        //INITIALIZE RIGHT RENDERER
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);        
        //INITIALIZE CENTER RENDERER
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER); 


        productTable.setSize(getScreenWidth()-27, 300);
        productTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        int prodTableWidth = productTable.getWidth();
        
        productTable.getColumnModel().getColumn(0).setPreferredWidth((int)round(prodTableWidth*0.05));
        productTable.getColumnModel().getColumn(1).setPreferredWidth((int)round(prodTableWidth*0.10));
        productTable.getColumnModel().getColumn(2).setPreferredWidth((int)round(prodTableWidth*0.10));
        productTable.getColumnModel().getColumn(3).setPreferredWidth((int)round(prodTableWidth*0.10));
        productTable.getColumnModel().getColumn(4).setPreferredWidth((int)round(prodTableWidth*0.25));
        productTable.getColumnModel().getColumn(5).setPreferredWidth((int)round(prodTableWidth*0.25));
        productTable.getColumnModel().getColumn(6).setPreferredWidth((int)round(prodTableWidth*0.15));
        //CHANGE COLUMN ALIGMENT
        productTable.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        productTable.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        productTable.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);


        
        
        DecimalFormat dc = new DecimalFormat("0.00");
        dtm.setRowCount(prodList.size());    
        for(int i = 0; i < prodList.size(); i++){
                productTable.getModel().setValueAt(prodList.get(i).getId(), i, 0);
                productTable.getModel().setValueAt(prodList.get(i).getName(), i, 1);
                productTable.getModel().setValueAt(prodList.get(i).getSerial(), i, 2);
                productTable.getModel().setValueAt(prodList.get(i).getPrice(), i, 3);
                snetto += prodList.get(i).getPrice();
                productTable.getModel().setValueAt(prodList.get(i).getProblem(), i, 4);
                productTable.getModel().setValueAt(prodList.get(i).getRepair(), i, 5);
                productTable.getModel().setValueAt(prodList.get(i).getPlace(), i, 6);
        }  
        nettoLabel.setText(String.valueOf(dc.format(snetto)));
        bruttoLabel.setText(String.valueOf(dc.format(snetto+snetto*0.23)));
        snetto = 0;
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
            java.util.logging.Logger.getLogger(wzWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wzWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wzWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wzWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wzWindow(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtt;
    private javax.swing.JLabel bruttoLabel;
    private javax.swing.JLabel cityLab;
    private javax.swing.JLabel codeLab;
    private javax.swing.JButton delBtt;
    private javax.swing.JButton editBtt;
    private javax.swing.JLabel emailLab;
    private javax.swing.JLabel idLab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLab;
    private javax.swing.JLabel nettoLabel;
    private javax.swing.JLabel nipLab;
    private javax.swing.JLabel phoneLab;
    public javax.swing.JTable productTable;
    private javax.swing.JLabel streetLab;
    // End of variables declaration//GEN-END:variables
}
