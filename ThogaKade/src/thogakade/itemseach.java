/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thogakade;

/**
 *
 * @author PRAMODI
 */
public class itemseach extends javax.swing.JFrame {

    /**
     * Creates new form itemseach
     */
    public itemseach() {
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

        jPanel1 = new javax.swing.JPanel();
        txtUnitPrice = new javax.swing.JTextField();
        txtSQL = new javax.swing.JTextField();
        txtCode = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        txtAny = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemTbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUnitPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUnitPriceKeyPressed(evt);
            }
        });
        jPanel1.add(txtUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 170, 30));

        txtSQL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSQLMouseClicked(evt);
            }
        });
        txtSQL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSQLKeyPressed(evt);
            }
        });
        jPanel1.add(txtSQL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 420, 30));

        txtCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodeKeyPressed(evt);
            }
        });
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, 30));

        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });
        txtDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescriptionKeyPressed(evt);
            }
        });
        jPanel1.add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 170, 30));

        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQtyKeyPressed(evt);
            }
        });
        jPanel1.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 170, 30));

        txtAny.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAnyKeyPressed(evt);
            }
        });
        jPanel1.add(txtAny, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 370, 30));

        itemTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Description", "Qty", "UnitPrice"
            }
        ));
        itemTbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemTblKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(itemTbl);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 440, 300));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Any Item SQL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Code/Description/Qty/UnitPrice");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Code");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Description");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Qty(100-1000)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("UnitPrice(10-100)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Advanced Item Search");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 290, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUnitPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnitPriceKeyPressed
        String txtQtyRange = txtUnitPrice.getText();
        if (evt.getKeyCode() == 10) {
            String[] split = txtQtyRange.split("-");
            String fString = split[0].trim();
            String sString = split[1].trim();
            double from = Double.parseDouble(fString);
            double to = Double.parseDouble(sString);

            try {
                ArrayList<ItemDTO> anyItems = ItemFormController.searchFromPriceRange(from, to);
                DefaultTableModel dtm = (DefaultTableModel) itemTbl.getModel();
                dtm.setRowCount(0);
                for (ItemDTO anyItem : anyItems) {
                    Object[] row = {anyItem.getCode(), anyItem.getDescription(), anyItem.getQty(), anyItem.getUnitPrice()};
                    dtm.addRow(row);
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ItemAdvanceSerch.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ItemAdvanceSerch.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtUnitPriceKeyPressed

    private void txtSQLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSQLMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSQLMouseClicked

    private void txtSQLKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSQLKeyPressed
        if (evt.getKeyCode() == 10) {
            try {
                String sql = txtSQL.getText();
                ArrayList<ItemDTO> executeQuery = ItemFormController.executeQuery(sql);
                if (!executeQuery.isEmpty()) {
                    DefaultTableModel dtm = (DefaultTableModel) itemTbl.getModel();
                    dtm.setRowCount(0);
                    for (ItemDTO anyItem : executeQuery) {
                        Object[] row = {anyItem.getCode(), anyItem.getDescription(), anyItem.getQty(), anyItem.getUnitPrice()};
                        dtm.addRow(row);
                    }
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ItemAdvanceSerch.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ItemAdvanceSerch.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtSQLKeyPressed

    private void txtCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeKeyPressed
        String any = txtCode.getText();
        try {
            ArrayList<ItemDTO> anyItems = ItemFormController.searchFromCode(any);
            DefaultTableModel dtm = (DefaultTableModel) itemTbl.getModel();
            dtm.setRowCount(0);
            for (ItemDTO anyItem : anyItems) {
                Object[] row = {anyItem.getCode(), anyItem.getDescription(), anyItem.getQty(), anyItem.getUnitPrice()};
                dtm.addRow(row);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemAdvanceSerch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemAdvanceSerch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtCodeKeyPressed

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionActionPerformed

    private void txtDescriptionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionKeyPressed
        String any = txtDescription.getText();
        try {
            ArrayList<ItemDTO> anyItems = ItemFormController.searchFromDescription(any);
            DefaultTableModel dtm = (DefaultTableModel) itemTbl.getModel();
            dtm.setRowCount(0);
            for (ItemDTO anyItem : anyItems) {
                Object[] row = {anyItem.getCode(), anyItem.getDescription(), anyItem.getQty(), anyItem.getUnitPrice()};
                dtm.addRow(row);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemAdvanceSerch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemAdvanceSerch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtDescriptionKeyPressed

    private void txtQtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyPressed
        String txtQtyRange = txtQty.getText();
        if (evt.getKeyCode() == 10) {
            String[] split = txtQtyRange.split("-");
            String fString = split[0].trim();
            String sString = split[1].trim();
            int from = Integer.parseInt(fString);
            int to = Integer.parseInt(sString);

            try {
                ArrayList<ItemDTO> anyItems = ItemFormController.searchFromQtyRange(from, to);
                DefaultTableModel dtm = (DefaultTableModel) itemTbl.getModel();
                dtm.setRowCount(0);
                for (ItemDTO anyItem : anyItems) {
                    Object[] row = {anyItem.getCode(), anyItem.getDescription(), anyItem.getQty(), anyItem.getUnitPrice()};
                    dtm.addRow(row);
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ItemAdvanceSerch.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ItemAdvanceSerch.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtQtyKeyPressed

    private void txtAnyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnyKeyPressed
        String any = txtAny.getText();
        try {
            ArrayList<ItemDTO> anyItems = ItemFormController.getAnyItems(any);
            DefaultTableModel dtm = (DefaultTableModel) itemTbl.getModel();
            dtm.setRowCount(0);
            for (ItemDTO anyItem : anyItems) {
                Object[] row = {anyItem.getCode(), anyItem.getDescription(), anyItem.getQty(), anyItem.getUnitPrice()};
                dtm.addRow(row);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemAdvanceSerch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemAdvanceSerch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtAnyKeyPressed

    private void itemTblKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemTblKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTblKeyPressed

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
            java.util.logging.Logger.getLogger(itemseach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(itemseach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(itemseach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(itemseach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new itemseach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable itemTbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtAny;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtSQL;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables
}
