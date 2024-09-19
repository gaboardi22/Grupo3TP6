
package Vistas;

import Entidades.Producto;
import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatVuesionIJTheme;
import java.util.TreeSet;

/**
 *
 * @author Grupo 3
 */
public class Menu extends javax.swing.JFrame {
     public static TreeSet<Producto> listaProductos = new TreeSet<>();
   
    public Menu() {
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

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuGestionProducto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuPorNombre = new javax.swing.JMenuItem();
        jMenuPorPrecio = new javax.swing.JMenuItem();
        jMenuPorRubro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu1.setText("Administracion");

        jMenuGestionProducto.setText("Gestion Producto");
        jMenuGestionProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGestionProductoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuGestionProducto);

        jMenuBar.add(jMenu1);

        jMenu2.setText("Consultas");

        jMenuPorNombre.setText("Por Nombre");
        jMenuPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPorNombreActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuPorNombre);

        jMenuPorPrecio.setText("Por Precio");
        jMenuPorPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPorPrecioActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuPorPrecio);

        jMenuPorRubro.setText("Por Rubro");
        jMenuPorRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPorRubroActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuPorRubro);

        jMenuBar.add(jMenu2);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPorNombreActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        BusquedaPorNombre bpn = new BusquedaPorNombre();
        bpn.setVisible(true);
        escritorio.add(bpn);
        escritorio.moveToFront(bpn);
    }//GEN-LAST:event_jMenuPorNombreActionPerformed

    private void jMenuPorPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPorPrecioActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        BusquedaPorPrecio bpp = new BusquedaPorPrecio();
        bpp.setVisible(true);
        escritorio.add(bpp);
        escritorio.moveToFront(bpp);
    }//GEN-LAST:event_jMenuPorPrecioActionPerformed

    private void jMenuGestionProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGestionProductoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        GestionProducto gestProd = new GestionProducto();
        gestProd.setVisible(true);
        escritorio.add(gestProd);
        escritorio.moveToFront(gestProd);
    }//GEN-LAST:event_jMenuGestionProductoActionPerformed

    private void jMenuPorRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPorRubroActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        BusquedaPorRubro bpr = new BusquedaPorRubro();
        bpr.setVisible(true);
        escritorio.add(bpr);
        escritorio.moveToFront(bpr);
    }//GEN-LAST:event_jMenuPorRubroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    FlatVuesionIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
    });
        FlatDarkFlatIJTheme.setup();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuGestionProducto;
    private javax.swing.JMenuItem jMenuPorNombre;
    private javax.swing.JMenuItem jMenuPorPrecio;
    private javax.swing.JMenuItem jMenuPorRubro;
    // End of variables declaration//GEN-END:variables
}
