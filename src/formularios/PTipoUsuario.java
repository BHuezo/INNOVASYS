/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formularios;

import javax.swing.UIManager;

/**
 *
 * @author steven
 */
public class PTipoUsuario extends javax.swing.JPanel {

    /** Creates new form PTipoUsuario */
    public PTipoUsuario() {
        try {
                     UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		}
		catch (Exception e) {
		}
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(680, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Gestion de Tipos de Usuario");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("CODIGO TIPO");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 90, 260, 210));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Agregar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jButton1.setContentAreaFilled(false);
        jButton1.setPreferredSize(new java.awt.Dimension(71, 30));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));

        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Modificar");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jButton2.setContentAreaFilled(false);
        jButton2.setPreferredSize(new java.awt.Dimension(75, 30));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Buscar:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jTextField8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 140, 30));

        jRadioButton1.setText("Nombre");
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        jRadioButton2.setText("Codigo");
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));

        jButton6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 204, 204));
        jButton6.setText("Generar Reporte");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jButton6.setContentAreaFilled(false);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimizar.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, -1));

        jTextField9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 49, 80, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Privilegios:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Nombre Tipo:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 140, -1));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccione los privilegios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox1.setText("Cambiar Datos Empresa");
        jPanel3.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox2.setText("Gestionar Devoluciones");
        jPanel3.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        jCheckBox3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox3.setText("Construir Equipo");
        jPanel3.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jCheckBox4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox4.setText("Ver productos");
        jPanel3.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jCheckBox5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox5.setText("Solicitar Ayuda");
        jPanel3.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jCheckBox6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox6.setText("Ver ordenes en Cola");
        jPanel3.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jCheckBox7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox7.setText("Gestionar Caja Virtual");
        jPanel3.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jCheckBox8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox8.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox8.setText("Ver ventas");
        jPanel3.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jCheckBox9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox9.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox9.setText("Chat Center");
        jPanel3.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jCheckBox10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox10.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox10.setText("Ver inventario");
        jPanel3.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jCheckBox11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox11.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox11.setText("Gestionar Ventas");
        jPanel3.add(jCheckBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jCheckBox12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox12.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox12.setText("Gestionar Bitacoras");
        jPanel3.add(jCheckBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jCheckBox13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox13.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox13.setText("Gestionar Clientes");
        jPanel3.add(jCheckBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        jCheckBox14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox14.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox14.setText("Gestionar Empleados");
        jPanel3.add(jCheckBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        jCheckBox15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox15.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox15.setText("Gestionar Productos");
        jPanel3.add(jCheckBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jCheckBox16.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox16.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox16.setText("Gestionar Inventario");
        jPanel3.add(jCheckBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        jCheckBox17.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox17.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox17.setText("Gestionar Proveedores");
        jPanel3.add(jCheckBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 370, 310));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        this.hide();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        // TODO add your handling code here:
         jButton6.setContentAreaFilled(true);
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        // TODO add your handling code here:
         jButton6.setContentAreaFilled(false);
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
         jButton1.setContentAreaFilled(true);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
         jButton1.setContentAreaFilled(false);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
         jButton2.setContentAreaFilled(true);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
         jButton2.setContentAreaFilled(false);
    }//GEN-LAST:event_jButton2MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
