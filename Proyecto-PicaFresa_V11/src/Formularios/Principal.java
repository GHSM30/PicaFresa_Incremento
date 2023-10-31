
package Formularios;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        Proveedor = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Devoluciones = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Corte = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Almacen = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Productos = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        lGJButtonDesignBasic1 = new components.LGJButtonDesignBasic();
        lGJButtonDesignBasic2 = new components.LGJButtonDesignBasic();
        lGJButtonDesignBasic3 = new components.LGJButtonDesignBasic();
        lGJButtonDesignBasic4 = new components.LGJButtonDesignBasic();
        lGJButtonDesignBasic5 = new components.LGJButtonDesignBasic();
        lGJButtonDesignBasic7 = new components.LGJButtonDesignBasic();
        Ventas1 = new javax.swing.JLabel();
        lGJButtonDesignBasic6 = new components.LGJButtonDesignBasic();
        TXTID = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Inicio de sesion como");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, -1, 20));

        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 172, 16));

        Proveedor.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        Proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/proveedor.png"))); // NOI18N
        Proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProveedorMouseClicked(evt);
            }
        });
        jPanel1.add(Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 70, 70));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Proveedor");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, 20));

        Devoluciones.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        Devoluciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reemplazo.png"))); // NOI18N
        Devoluciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DevolucionesMouseClicked(evt);
            }
        });
        jPanel1.add(Devoluciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 70, 70));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Devoluciones");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 100, 20));

        Corte.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        Corte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/caja-registradora.png"))); // NOI18N
        Corte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CorteMouseClicked(evt);
            }
        });
        jPanel1.add(Corte, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 70, 70));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Corte");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 50, 20));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Venta");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 60, 20));

        Almacen.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        Almacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/almacen.png"))); // NOI18N
        Almacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlmacenMouseClicked(evt);
            }
        });
        jPanel1.add(Almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 70, 70));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Almacen");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 70, 20));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 790, 20));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        Productos.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Candy.png"))); // NOI18N
        Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductosMouseClicked(evt);
            }
        });
        jPanel1.add(Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 70, 70));

        lblProducto.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblProducto.setForeground(new java.awt.Color(255, 255, 255));
        lblProducto.setText("Producto");
        jPanel1.add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 60, 20));

        lGJButtonDesignBasic1.setText("Dulceria \"El Trebol\"");
        lGJButtonDesignBasic1.setLGGradientColorOne(new java.awt.Color(0, 153, 255));
        lGJButtonDesignBasic1.setLGGradientColorTwo(new java.awt.Color(0, 51, 255));
        jPanel1.add(lGJButtonDesignBasic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 540, -1));

        lGJButtonDesignBasic2.setLGGradientColorOne(new java.awt.Color(51, 204, 255));
        lGJButtonDesignBasic2.setLGGradientColorTwo(new java.awt.Color(102, 153, 255));
        lGJButtonDesignBasic2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lGJButtonDesignBasic2MouseClicked(evt);
            }
        });
        jPanel1.add(lGJButtonDesignBasic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 150, 150));

        lGJButtonDesignBasic3.setLGGradientColorOne(new java.awt.Color(0, 102, 153));
        lGJButtonDesignBasic3.setLGGradientColorTwo(new java.awt.Color(0, 0, 204));
        lGJButtonDesignBasic3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lGJButtonDesignBasic3MouseClicked(evt);
            }
        });
        jPanel1.add(lGJButtonDesignBasic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 150, 150));

        lGJButtonDesignBasic4.setLGGradientColorOne(new java.awt.Color(0, 102, 153));
        lGJButtonDesignBasic4.setLGGradientColorTwo(new java.awt.Color(0, 0, 255));
        lGJButtonDesignBasic4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lGJButtonDesignBasic4MouseClicked(evt);
            }
        });
        jPanel1.add(lGJButtonDesignBasic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 150, 150));

        lGJButtonDesignBasic5.setLGGradientColorOne(new java.awt.Color(0, 153, 255));
        lGJButtonDesignBasic5.setLGGradientColorTwo(new java.awt.Color(0, 102, 255));
        lGJButtonDesignBasic5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lGJButtonDesignBasic5MouseClicked(evt);
            }
        });
        jPanel1.add(lGJButtonDesignBasic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 150, 150));

        lGJButtonDesignBasic7.setLGGradientColorOne(new java.awt.Color(51, 204, 255));
        lGJButtonDesignBasic7.setLGGradientColorTwo(new java.awt.Color(51, 153, 255));
        lGJButtonDesignBasic7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lGJButtonDesignBasic7MouseClicked(evt);
            }
        });
        lGJButtonDesignBasic7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lGJButtonDesignBasic7KeyPressed(evt);
            }
        });
        jPanel1.add(lGJButtonDesignBasic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 150, 150));

        Ventas1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        Ventas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/administracion-del-dinero.png"))); // NOI18N
        Ventas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ventas1MouseClicked(evt);
            }
        });
        jPanel1.add(Ventas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 70, 70));

        lGJButtonDesignBasic6.setLGGradientColorOne(new java.awt.Color(0, 153, 255));
        lGJButtonDesignBasic6.setLGGradientColorTwo(new java.awt.Color(0, 102, 204));
        lGJButtonDesignBasic6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lGJButtonDesignBasic6MouseClicked(evt);
            }
        });
        jPanel1.add(lGJButtonDesignBasic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 150, 150));

        TXTID.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(TXTID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 172, 16));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        jMenu1.setText("Cerrar Sesion");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Exit");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProveedorMouseClicked
        Gestionar_Proveedor v = new Gestionar_Proveedor();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProveedorMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        Login v = new Login();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void DevolucionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DevolucionesMouseClicked
        Gestionar_Devoluciones v = new Gestionar_Devoluciones();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DevolucionesMouseClicked

    private void CorteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorteMouseClicked
        Gestionar_Corte v = new Gestionar_Corte();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CorteMouseClicked

    private void AlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlmacenMouseClicked
        Gestionar_Almacen v = new Gestionar_Almacen();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AlmacenMouseClicked

    private void ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosMouseClicked
        Gestionar_Producto v = new Gestionar_Producto();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProductosMouseClicked

    private void lGJButtonDesignBasic5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lGJButtonDesignBasic5MouseClicked
        Gestionar_Corte v = new Gestionar_Corte();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lGJButtonDesignBasic5MouseClicked

    private void lGJButtonDesignBasic7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lGJButtonDesignBasic7KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lGJButtonDesignBasic7KeyPressed

    private void lGJButtonDesignBasic7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lGJButtonDesignBasic7MouseClicked
        Gestionar_Proveedor v = new Gestionar_Proveedor();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lGJButtonDesignBasic7MouseClicked

    private void lGJButtonDesignBasic3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lGJButtonDesignBasic3MouseClicked
        Gestionar_Producto v = new Gestionar_Producto();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lGJButtonDesignBasic3MouseClicked

    private void lGJButtonDesignBasic6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lGJButtonDesignBasic6MouseClicked
        Gestionar_Venta v = new Gestionar_Venta();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lGJButtonDesignBasic6MouseClicked

    private void Ventas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ventas1MouseClicked
        Gestionar_Venta v = new Gestionar_Venta();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Ventas1MouseClicked

    private void lGJButtonDesignBasic2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lGJButtonDesignBasic2MouseClicked
        Gestionar_Devoluciones v = new Gestionar_Devoluciones();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lGJButtonDesignBasic2MouseClicked

    private void lGJButtonDesignBasic4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lGJButtonDesignBasic4MouseClicked
        Gestionar_Almacen v = new Gestionar_Almacen();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lGJButtonDesignBasic4MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Almacen;
    private javax.swing.JLabel Corte;
    private javax.swing.JLabel Devoluciones;
    private javax.swing.JLabel Productos;
    private javax.swing.JLabel Proveedor;
    public javax.swing.JLabel TXTID;
    private javax.swing.JLabel Ventas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private components.LGJButtonDesignBasic lGJButtonDesignBasic1;
    private components.LGJButtonDesignBasic lGJButtonDesignBasic2;
    private components.LGJButtonDesignBasic lGJButtonDesignBasic3;
    private components.LGJButtonDesignBasic lGJButtonDesignBasic4;
    private components.LGJButtonDesignBasic lGJButtonDesignBasic5;
    private components.LGJButtonDesignBasic lGJButtonDesignBasic6;
    private components.LGJButtonDesignBasic lGJButtonDesignBasic7;
    public javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblProducto;
    // End of variables declaration//GEN-END:variables
}
