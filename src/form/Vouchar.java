/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import com.jtattoo.plaf.aero.AeroLookAndFeel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.UIManager;


public class Vouchar extends javax.swing.JFrame {

    /**
     * Creates new form Vouchar
     */
    public Vouchar() {
        initComponents();
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
        jTextArea1 = new javax.swing.JTextArea();
        tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        date = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pur_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pur_vat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pur_svat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sup_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sup_vat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sup_svat = new javax.swing.JTextField();
        pur_val_text = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pur_val = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        sus_vat_text = new javax.swing.JTextField();
        sus_vat = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        day = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        month = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        print = new javax.swing.JButton();
        priview = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        view = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        add_name = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        add_svat = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        add_vat = new javax.swing.JTextField();
        add_supplier = new javax.swing.JButton();
        msg = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        date.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel1.setText("Date");

        jLabel2.setText("Name of  the purchaser");

        pur_name.setText("CBL Exports (Pvt.) Ltd.");

        jLabel3.setText("Purchasers VAT No.");

        pur_vat.setText("114731056-7000");
        pur_vat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pur_vatActionPerformed(evt);
            }
        });

        jLabel4.setText("Purchasers SVAT No.");

        pur_svat.setText("000920");

        jLabel5.setText("To");

        sup_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sup_nameActionPerformed(evt);
            }
        });

        jLabel6.setText("(Name of the supplier)");

        jLabel7.setText("Supplier's VAT No.");

        jLabel8.setText("Supplier's SVAT No.");

        sup_svat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sup_svatActionPerformed(evt);
            }
        });

        pur_val_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pur_val_textActionPerformed(evt);
            }
        });

        jLabel9.setText("Value of purchases");

        pur_val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pur_valActionPerformed(evt);
            }
        });

        jLabel10.setText("Rs.");

        sus_vat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sus_vatActionPerformed(evt);
            }
        });

        jLabel11.setText("Rs.");

        jLabel12.setText("Suspended VAT in LKR");

        jLabel13.setText("This is in settlement of suspended VAT payble by us on Purchases for which invoice numbers given in the annexure (Supplimentary form)");

        jLabel15.setText("for the calendar month ending ");

        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });

        jLabel16.setText("day of");

        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });

        jLabel14.setText("20");

        print.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        priview.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        priview.setText("Priview");
        priview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priviewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sus_vat, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(pur_val))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pur_val_text)
                            .addComponent(sus_vat_text)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel9)))
                                        .addGap(40, 40, 40))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pur_name)
                                    .addComponent(pur_vat)
                                    .addComponent(pur_svat)
                                    .addComponent(sup_vat)
                                    .addComponent(sup_name)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(priview, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 23, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(60, 60, 60)
                                .addComponent(sup_svat)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pur_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pur_vat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pur_svat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(sup_svat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sup_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sup_vat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pur_val_text, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(pur_val, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sus_vat_text, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sus_vat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(print, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );

        tab.addTab("Voucher", jPanel1);

        view.setColumns(20);
        view.setRows(5);
        jScrollPane2.setViewportView(view);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );

        tab.addTab("View data", jPanel2);

        jLabel17.setText("Name");

        add_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_nameActionPerformed(evt);
            }
        });

        jLabel18.setText("SVAT No.");

        add_svat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_svatActionPerformed(evt);
            }
        });

        jLabel19.setText("VAT No.");

        add_vat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_vatActionPerformed(evt);
            }
        });

        add_supplier.setText("Add Supplier");
        add_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_supplierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(add_supplier)
                .addGap(59, 59, 59))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add_name, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                    .addComponent(add_svat)
                    .addComponent(add_vat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(add_svat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(add_vat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(add_supplier))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        tab.addTab("Add Supplier", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pur_val_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pur_val_textActionPerformed
        
        
    }//GEN-LAST:event_pur_val_textActionPerformed

    private void sup_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sup_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sup_nameActionPerformed

    private void pur_vatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pur_vatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pur_vatActionPerformed

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthActionPerformed

    public static String padRight(String s, int n) {
    return String.format("%1$-" + n + "s", s);  
    }
    
    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        String pur = EnglishNumberToWords.convert(Integer.parseInt(pur_val.getText()))+" Rupees only.";
        String pus = EnglishNumberToWords.convert(Integer.parseInt(sus_vat.getText()))+" Rupees only.";
        
        String padded_pur=padRight(pur,100);
        String padded_pus=padRight(pus,100);
        
        String t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
        t1="\t\t\t\t\t\t\t"+date.getText()+"\n\n";
        t2="\t    "+pur_name.getText()+"\n\n";
        t3="\t    "+pur_vat.getText()+"\n\n";
        t4="\t    "+pur_svat.getText()+"\n\n";
        t5="\t    "+sup_name.getText()+"\n\n\n";
        t6="\t    "+sup_vat.getText()+"\n\n";
        t7="\t    "+sup_svat.getText()+"\n\n";
        t8="\t    "+padded_pur+"\t"+pur_val.getText()+"\n\n\n";
        t9="\t    "+padded_pus+"\t"+sus_vat.getText()+"\n";
        t10="\t    "+day.getText()+"\t"+month.getText()+"\t"+year.getText();
        String s1 =t1+t2+t3+t4+t5+t6+t7+t8+t9+t10;
        view.setText(s1);
        try{
            view.print();
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_printActionPerformed


    
    private void priviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priviewActionPerformed
        
        
        
        String pur = EnglishNumberToWords.convert(Integer.parseInt(pur_val.getText()))+" Rupees only.";
        String pus = EnglishNumberToWords.convert(Integer.parseInt(sus_vat.getText()))+" Rupees only.";
        
        String padded_pur=padRight(pur,100);
        String padded_pus=padRight(pus,100);
        
        String t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
        t1="\t\t\t\t\t\t\t"+date.getText()+"\n\n";
        t2="\t    "+pur_name.getText()+"\n\n";
        t3="\t    "+pur_vat.getText()+"\n\n";
        t4="\t    "+pur_svat.getText()+"\n\n";
        t5="\t    "+sup_name.getText()+"\n\n\n";
        t6="\t    "+sup_vat.getText()+"\n\n";
        t7="\t    "+sup_svat.getText()+"\n\n";
        t8="\t    "+padded_pur+"\t"+pur_val.getText()+"\n\n\n";
        t9="\t    "+padded_pus+"\t"+sus_vat.getText()+"\n";
        t10="\t    "+day.getText()+"\t"+month.getText()+"\t"+year.getText();
        String s2 =t1+t2+t3+t4+t5+t6+t7+t8+t9+t10;
        view.setText(s2);
        tab.setSelectedIndex(1);
        
    }//GEN-LAST:event_priviewActionPerformed

    private void pur_valActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pur_valActionPerformed
        String pur = EnglishNumberToWords.convert(Integer.parseInt(pur_val.getText()));
        pur_val_text.setText(pur+" Rupees only.");
    }//GEN-LAST:event_pur_valActionPerformed

    private void sus_vatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sus_vatActionPerformed
         String sus = EnglishNumberToWords.convert(Integer.parseInt(sus_vat.getText()));
        sus_vat_text.setText(sus+" Rupees only.");
    }//GEN-LAST:event_sus_vatActionPerformed

    private void sup_svatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sup_svatActionPerformed
        // TODO add your handling code here:
        Supplier s1=new Supplier();
        s1.search_user(sup_svat.getText());
        sup_name.setText(s1.name);
        sup_vat.setText(s1.vat_no);
    }//GEN-LAST:event_sup_svatActionPerformed
    
    private void add_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_nameActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_add_nameActionPerformed
   
    private void add_vatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_vatActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_add_vatActionPerformed

    private void add_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_supplierActionPerformed
        // TODO add your handling code here:
    String url = "jdbc:mysql://localhost/cbl";
    String username = "root";
    String password = "";   
    Connection con = null;
    Statement stmt;
    ResultSet rs = null;
    
    String s_name;
    s_name=add_name.getText();
    String vat_no;
    vat_no=add_vat.getText();
    String svat_no;
    svat_no=add_svat.getText();
    

    String query="INSERT INTO supplier (name,svat_no,vat_no) VALUES ("
            +"'"+s_name+"','" +svat_no+ "','" +vat_no+ "')";
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            stmt = con.createStatement();
            if(!(s_name.isEmpty()) && !(svat_no.isEmpty()) && !(vat_no.isEmpty())){
                int executeUpdate = stmt.executeUpdate(query);
                msg.setText("Sucsessfully added a Supplier");
            }else{
                msg.setText("Supplier name, Svat no. , vat No. Cannot be empty!");
            }
        }catch (Exception e){
            System.out.println("Add supplier ===> " + e);
            
        }finally{
            try {
               
                  
                
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                
            }
        }
    }//GEN-LAST:event_add_supplierActionPerformed
    
    private void add_svatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_svatActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_add_svatActionPerformed

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
            java.util.logging.Logger.getLogger(Vouchar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vouchar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vouchar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vouchar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    UIManager.setLookAndFeel(new AeroLookAndFeel());
                }catch(Exception e){}
                new Vouchar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add_name;
    private javax.swing.JButton add_supplier;
    private javax.swing.JTextField add_svat;
    private javax.swing.JTextField add_vat;
    private javax.swing.JTextField date;
    private javax.swing.JTextField day;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField month;
    private javax.swing.JLabel msg;
    private javax.swing.JButton print;
    private javax.swing.JButton priview;
    private javax.swing.JTextField pur_name;
    private javax.swing.JTextField pur_svat;
    private javax.swing.JTextField pur_val;
    private javax.swing.JTextField pur_val_text;
    private javax.swing.JTextField pur_vat;
    private javax.swing.JTextField sup_name;
    private javax.swing.JTextField sup_svat;
    private javax.swing.JTextField sup_vat;
    private javax.swing.JTextField sus_vat;
    private javax.swing.JTextField sus_vat_text;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTextArea view;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
