/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import db.DbQueries;
import entities.ContractorEntity;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Timestamp;
import java.util.List;
import javax.swing.BorderFactory;
import tableTemplates.ChoiceContractorsTableTemplate;
import static utilities.TimeFunctions.*;

/**
 *
 * @author Marek
 */
public class ContractorChoice extends javax.swing.JFrame {
    DbQueries wz = new DbQueries();
    public List<ContractorEntity> contractorsList;
    wzListWindow parentFrameWzWindow;
    int selM;
    int selY;
    int days;
    addProduct parentFrameAddProduct;
    int parentFrameId;
    /**
     * Creates new form ContractorChoice
     */
    public ContractorChoice() {
        getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        initComponents();
        hourCombo.setSelectedIndex(7);
        minuteCombo.setSelectedIndex(6);
        for(int i=0; i<10; i++){
            yearCombo.addItem(""+(nowYear()+i));
        }
        monthCombo.setSelectedIndex(nowMonth()-1);
        selM = nowMonth();
        days = howManyDays(selM, nowYear());
        for(int i = 1; i<=days ;i++){
            if(i<=9){
                        dayCombo.addItem("0"+(i));
                    } else {
                        dayCombo.addItem(""+(i));
                    }
        }
        dayCombo.setSelectedIndex(nowDay()-1);
        monthCombo.addActionListener (new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                dayCombo.removeAllItems();
                selM = monthCombo.getSelectedIndex()+1;
                selY = Integer.valueOf(yearCombo.getSelectedItem().toString());
                days = howManyDays(selM, selY);
                for(int i = 1; i<=days ;i++){
                    if(i<=9){
                        dayCombo.addItem("0"+(i));
                    } else {
                        dayCombo.addItem(""+(i));
                    }
                }
            }
        });
        yearCombo.addActionListener (new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                dayCombo.removeAllItems();
                selM = monthCombo.getSelectedIndex()+1;
                selY = selY = Integer.valueOf(yearCombo.getSelectedItem().toString());
                days = howManyDays(selM, selY);
                for(int i = 1; i<=days ;i++){
                    if(i<=9){
                        dayCombo.addItem("0"+(i));
                    } else {
                        dayCombo.addItem(""+(i));
                    }
                }
            }
        });


    }
    Long selDead(){
        String data = "";
        data+=yearCombo.getSelectedItem().toString();
        data+="-";
        data+=monthNumber(monthCombo.getSelectedItem().toString());
        data+="-";
        data+=dayCombo.getSelectedItem().toString();
        data+=" ";
        data+=hourCombo.getSelectedItem().toString();
        data+=":";
        data+=minuteCombo.getSelectedItem().toString();
        data+=":";
        data+="00";
        System.out.println(data+" "+timestampToLong(Timestamp.valueOf(data)));
        Long selectedDeadline = timestampToLong(Timestamp.valueOf(data));
        return selectedDeadline;
    }
     /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nipBox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameBox = new javax.swing.JTextField();
        findContractor = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ContractorTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sesinBox = new javax.swing.JTextField();
        optiBox = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        minuteCombo = new javax.swing.JComboBox<>();
        hourCombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dayCombo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        monthCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        yearCombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        closeWindow = new javax.swing.JMenuItem();

        setFocusCycleRoot(false);
        setUndecorated(true);

        jLabel1.setText("NIP:");

        jLabel2.setText("Nazwa:");

        findContractor.setText("SZUKAJ");
        findContractor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findContractorActionPerformed(evt);
            }
        });

        jButton2.setText("WYBIERZ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ContractorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAZWA", "MIASTO", "KOD POCZTOWY", "ULICA", "NIP"
            }
        ));
        jScrollPane1.setViewportView(ContractorTable);

        jButton3.setText("DODAJ KLIENTA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Sesin:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Opti:");

        sesinBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        optiBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Wyszikaj klienta");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        minuteCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55" }));

        hourCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel9.setText("Minuta");

        jLabel8.setText("Godzina");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Przwidywany termin odbioru.");

        jLabel7.setText("Dzień");

        monthCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec", "Lipiec", "Sierpień", "Wrzesień", "Październik", "Listopad", "Grudzień" }));

        jLabel6.setText("Miesiąc");

        jLabel5.setText("Rok");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(yearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(monthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(dayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(hourCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(minuteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minuteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu2.setText("Okno");

        closeWindow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        closeWindow.setText("Zamknij");
        closeWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeWindowActionPerformed(evt);
            }
        });
        jMenu2.add(closeWindow);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sesinBox)
                            .addComponent(optiBox, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                    .addComponent(findContractor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameBox)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nipBox, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(sesinBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(optiBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nipBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(nameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(findContractor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeWindowActionPerformed
        if(parentFrameId == 1){
            parentFrameWzWindow.enable();
        }
        if(parentFrameId == 2){
            parentFrameAddProduct.enable();
        }
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_closeWindowActionPerformed

    private void findContractorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findContractorActionPerformed
        if (parentFrameId == 1){
            contractorsList=wz.findContracor(nameBox.getText(), nipBox.getText());
            drawTable(contractorsList);
        }
        if (parentFrameId == 2){
            contractorsList=wz.findContracor(nameBox.getText(), nipBox.getText());
            drawTable(contractorsList);            
        }
    }//GEN-LAST:event_findContractorActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(parentFrameId == 1){
            
            if(!"".equals(optiBox.getText()) && !"".equals(sesinBox.getText())){
                parentFrameWzWindow.addDocument(Integer.valueOf(ContractorTable.getValueAt(ContractorTable.getSelectedRow(),0).toString()), Integer.valueOf(sesinBox.getText()), Integer.valueOf(optiBox.getText()), selDead());
            }
            if("".equals(optiBox.getText()) && !"".equals(sesinBox.getText())){
                parentFrameWzWindow.addDocument(Integer.valueOf(ContractorTable.getValueAt(ContractorTable.getSelectedRow(),0).toString()), Integer.valueOf(sesinBox.getText()), selDead());    
            }
            if("".equals(optiBox.getText()) && "".equals(sesinBox.getText())){
                parentFrameWzWindow.addDocument(Integer.valueOf(ContractorTable.getValueAt(ContractorTable.getSelectedRow(),0).toString()), selDead());
            }
            if(!"".equals(optiBox.getText()) && "".equals(sesinBox.getText())){
                parentFrameWzWindow.addDocumentOpti(Integer.valueOf(ContractorTable.getValueAt(ContractorTable.getSelectedRow(),0).toString()), Integer.valueOf(optiBox.getText()), selDead());
            }
            
            parentFrameWzWindow.toShow = parentFrameWzWindow.wz.getWZDocs();
            parentFrameWzWindow.drawTable(parentFrameWzWindow.toShow);
            parentFrameWzWindow.WZTable.changeSelection(1, 1, false, false);
            parentFrameWzWindow.WZTable.changeSelection(0, 0, false, false);
            parentFrameWzWindow.enable();   
            this.hide();
        }
        if(parentFrameId == 2){
            parentFrameAddProduct.selectedContractorId = (int) ContractorTable.getValueAt(ContractorTable.getSelectedRow(),0);
            parentFrameAddProduct.selectedContractorName = ContractorTable.getValueAt(ContractorTable.getSelectedRow(),1).toString();
            parentFrameAddProduct.enable(); 
            this.hide();    
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        addContractor addCon = new addContractor();
        addCon.parentFrame = this;
        this.disable();
        addCon.show();
    }//GEN-LAST:event_jButton3ActionPerformed
    public void drawTable(List<ContractorEntity> contractorsList){
        ContractorTable.getCellSelectionEnabled();
        ChoiceContractorsTableTemplate dtm = new ChoiceContractorsTableTemplate();
        dtm.setRowCount(0);
        ContractorTable.setModel(dtm);
        dtm.setRowCount(contractorsList.size());    
        for(int i = 0; i < contractorsList.size(); i++){
              ContractorTable.getModel().setValueAt(contractorsList.get(i).getId(), i, 0);
              ContractorTable.getModel().setValueAt(contractorsList.get(i).getName() ,i, 1);
              ContractorTable.getModel().setValueAt(contractorsList.get(i).getCity(), i, 2);
              ContractorTable.getModel().setValueAt(contractorsList.get(i).getPostalCode(), i, 3);
              ContractorTable.getModel().setValueAt(contractorsList.get(i).getStreet(), i, 4);
              ContractorTable.getModel().setValueAt(contractorsList.get(i).getNip(), i, 5);
        }  
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
            java.util.logging.Logger.getLogger(ContractorChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContractorChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContractorChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContractorChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContractorChoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ContractorTable;
    private javax.swing.JMenuItem closeWindow;
    private javax.swing.JComboBox<String> dayCombo;
    private javax.swing.JButton findContractor;
    private javax.swing.JComboBox<String> hourCombo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> minuteCombo;
    private javax.swing.JComboBox<String> monthCombo;
    public javax.swing.JTextField nameBox;
    private javax.swing.JTextField nipBox;
    private javax.swing.JTextField optiBox;
    private javax.swing.JTextField sesinBox;
    private javax.swing.JComboBox<String> yearCombo;
    // End of variables declaration//GEN-END:variables
}
