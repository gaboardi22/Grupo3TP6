package Vistas;

import Entidades.Categoria;
import Entidades.Producto;
import static Vistas.Menu.listaProductos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Grupo3
 */
public class GestionProducto extends javax.swing.JInternalFrame {

    private final DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public GestionProducto() {
        initComponents();
        cargarCombo();
        cargarCombo2();
        armarCabecedra();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProducto = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jTPrecio = new javax.swing.JTextField();
        jComboBoxCateg = new javax.swing.JComboBox<>();
        jSpinnerStock = new javax.swing.JSpinner();
        jButtonBuscar = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        jLabel1.setText("GESTION  DE PRODUCTOS");

        jLabel2.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel2.setText("Filtro Por Categoria");

        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });

        jTableProducto.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProducto);

        jLabel3.setText("Codigo");

        jLabel4.setText("Descripcion");

        jLabel5.setText("Precio");

        jLabel6.setText("Rubro");

        jLabel7.setText("Stock");

        jButtonBuscar.setText("Buscar Por Codigo");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonCerrar.setText("Cerrar");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSpinnerStock, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 457, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                            .addComponent(jTNombre)
                            .addComponent(jTPrecio)
                            .addComponent(jComboBoxCateg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBoxCateg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jSpinnerStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/page_paper_file_document_remove_delete_icon_228133.png"))); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/page_paper_file_document_bookmark_icon_228140.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/page_paper_file_document_add_insert_icon_228135.png"))); // NOI18N
        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1485477118-rotation-right_78579.png"))); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jButtonActualizar)
                                .addGap(43, 43, 43)
                                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonGuardar)
                            .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed
        modelo.setRowCount(0);
        Categoria categoriaSeleccionada = (Categoria) jComboBoxCategoria.getSelectedItem();
        for (Producto producto : listaProductos) {
            if (producto.getCategoria().equals(categoriaSeleccionada)) {
                modelo.addRow(new Object[]{
                    producto.getCodigo(),
                    producto.getNombre(),
                    producto.getPrecio(),
                    producto.getCategoria(),
                    producto.getStock()
                });
            }
        }
    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        int filaSeleccionada = jTableProducto.getSelectedRow();
        Producto productoNuevo = null;
        if (filaSeleccionada != -1) {
            int codigo = Integer.parseInt(jTCodigo.getText());
            String nombre = jTNombre.getText();
            double precio = Double.parseDouble(jTPrecio.getText());
            Categoria categoria = (Categoria) jComboBoxCategoria.getSelectedItem();
            int stock = (int) (jSpinnerStock.getValue());

            for (Producto prod : listaProductos) {
                if (prod.getCodigo() == codigo) {
                    productoNuevo = prod;
                    break;
                }
            }
            if (productoNuevo != null) {
                productoNuevo.setNombre(nombre);
                productoNuevo.setPrecio(precio);
                productoNuevo.setCategoria(categoria);
                productoNuevo.setStock(stock);
                cargarTabla();
            }
        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        jTCodigo.setText("");
        jTNombre.setText("");
        jTPrecio.setText("");
        jComboBoxCateg.setSelectedIndex(-1);
        jSpinnerStock.setValue(0);
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        modelo.setNumRows(0);
        try{
        int codigoBuscado =  Integer.parseInt(jTCodigo.getText());
         Producto productoBuscar = null;
        for (Producto producto : listaProductos) {
            if(producto.getCodigo() == codigoBuscado){
                productoBuscar = producto;
                break;
            }
        }
         if (productoBuscar != null) {   
            Object[] fila = {
                productoBuscar.getCodigo(),
                productoBuscar.getNombre(),
                productoBuscar.getPrecio(),
                productoBuscar.getCategoria(),
                productoBuscar.getStock()
            };
            modelo.addRow(fila);
        }else{
             JOptionPane.showMessageDialog(this, "Producto no encontrado");
         }
            } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Debe ingresar un numero en el campo codigo");
    } 
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
       try {
        if (jTCodigo.getText().trim().isEmpty() || jTNombre.getText().trim().isEmpty() || jTPrecio.getText().trim().isEmpty()) {
            throw new IllegalArgumentException("Debe llenar todos los campos!.");
        } 
            int codigo = Integer.parseInt(jTCodigo.getText());
            String nombre = jTNombre.getText();
            int precio = Integer.parseInt(jTPrecio.getText());
            int stock = (int) jSpinnerStock.getValue();
            Categoria categoria = (Categoria) jComboBoxCateg.getSelectedItem();
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿los datos ingresados son correcto?");
            if (confirmacion == JOptionPane.YES_OPTION) {
                Producto producto = new Producto(codigo, nombre, categoria, precio, stock);
                listaProductos.add(producto);
                cargarTabla();
            } else {
                JOptionPane.showMessageDialog(this, "Porfavor vuelva a cargar los datos");
                jTCodigo.setText("");
                jTNombre.setText("");
                jTPrecio.setText("");
                jComboBoxCateg.setSelectedIndex(-1);
                jSpinnerStock.setValue(0);
            }
        } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El código y el precio deben ser números.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
     }
    }//GEN-LAST:event_jButtonGuardarActionPerformed


    
    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        int filaSeleccionada = jTableProducto.getSelectedRow();
        if (filaSeleccionada != -1) {
            int codigoProducto = (int) modelo.getValueAt(filaSeleccionada, 0);
            Producto productoAEliminar = null;
            for (Producto producto : listaProductos) {
                if (producto.getCodigo() == codigoProducto) {
                    productoAEliminar = producto;
                    break;
                }     
            }
            if (productoAEliminar != null) {
                    listaProductos.remove(productoAEliminar);
                    cargarTabla();
                }
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jComboBoxCategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategActionPerformed
        
    }//GEN-LAST:event_jComboBoxCategActionPerformed

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
       dispose();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jTableProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductoMouseClicked
       int filaSeleccionada = jTableProducto.getSelectedRow();
        if (filaSeleccionada != -1) {
            int codigo = (int) modelo.getValueAt(filaSeleccionada, 0);
            String nombre = (String) modelo.getValueAt(filaSeleccionada, 1);
            double precio = (double) modelo.getValueAt(filaSeleccionada, 2);
            Categoria categoria = (Categoria) modelo.getValueAt(filaSeleccionada, 3);
            int stock = (int) modelo.getValueAt(filaSeleccionada, 4);

            jTCodigo.setText(codigo + "");
            jTNombre.setText(nombre);
            jTPrecio.setText(precio + "");
            jComboBoxCateg.setSelectedItem(categoria);
            jSpinnerStock.setValue(stock);
    }
    }//GEN-LAST:event_jTableProductoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JComboBox<Categoria> jComboBoxCateg;
    private javax.swing.JComboBox<Categoria> jComboBoxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerStock;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JTable jTableProducto;
    // End of variables declaration//GEN-END:variables
private void cargarCombo() {
        for (Categoria cat : Categoria.values()) {
            jComboBoxCategoria.addItem(cat);
        }
    }

    private void armarCabecedra() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Categoria");
        modelo.addColumn("Stock");
        jTableProducto.setModel(modelo);
    }

    private void cargarTabla() {
        modelo.setRowCount(0);
        for (Producto producto : listaProductos) {
            Object[] fila = {
                producto.getCodigo(),
                producto.getNombre(),
                producto.getPrecio(),
                producto.getCategoria(),
                producto.getStock()
            };
            modelo.addRow(fila);
        }
    }

    private void cargarCombo2() {
        for (Categoria cat : Categoria.values()) {
            jComboBoxCateg.addItem(cat);
        }
    }

}
