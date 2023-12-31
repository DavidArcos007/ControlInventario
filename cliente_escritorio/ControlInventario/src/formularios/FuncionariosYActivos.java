package formularios;
import dao.ActivoDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelos.Funcionario;
import dao.FuncionarioDAO;
import javax.swing.JOptionPane;
import modelos.Activo;
/**
 *
 * @author Usuario
 */
public class FuncionariosYActivos extends javax.swing.JFrame {

    public String idFuncionario;

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    
    
    /**
     * Creates new form FuncionariosYActivos
     */
    public FuncionariosYActivos() {
        initComponents();
        cargarTablaFuncionarios();
        this.setTitle("Funcionarios y activos");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        jtblFuncionarios.getTableHeader().setReorderingAllowed(false);
        jtblFuncionarios.getTableHeader().setResizingAllowed(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void cargarTablaFuncionarios() {
        DefaultTableModel modeloTabla = new DefaultTableModel();

        //Encabezado de la tabla
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("CantidadActivos");
        
        jtblFuncionarios.setModel(modeloTabla);
        FuncionarioDAO fun = new FuncionarioDAO();
        List<Funcionario> funcionarios = fun.listarFuncionarios();
        Object[] obj = new Object[4];
        for(int i = 0; i < funcionarios.size() ;i++){
            obj[0] = funcionarios.get(i).getId();
            obj[1] = funcionarios.get(i).getNombre();
            obj[2] = funcionarios.get(i).getApellido();
            obj[3] = funcionarios.get(i).getNumeroActivos();
            modeloTabla.addRow(obj);
        }
        
        //Insertar como Array
        
            /*for(int i = 0; i< arrayFuncionarios.length ;i++){
            obj[0] = ((Funcionario)arrayFuncionarios[i]).getId().toString();
            obj[1] = ((Funcionario)arrayFuncionarios[i]).getNombre().toString();
            obj[2] = ((Funcionario)arrayFuncionarios[i]).getApellido().toString();
            obj[3] = ((Funcionario)arrayFuncionarios[i]).getNumeroActivos();
            modeloTabla.addRow(obj);
            }   */
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblFuncionarios = new javax.swing.JTable();
        jbtnNuevo = new javax.swing.JButton();
        jbtnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(208, 223, 213));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Funcionarios y Activos");

        jtblFuncionarios.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jtblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblFuncionarios.setAlignmentX(1.0F);
        jtblFuncionarios.setAlignmentY(1.0F);
        jtblFuncionarios.setEditingColumn(0);
        jtblFuncionarios.setEditingRow(0);
        jtblFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblFuncionarios);

        jbtnNuevo.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jbtnNuevo.setText("Nuevo Proceso");
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });

        jbtnCerrarSesion.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jbtnCerrarSesion.setText("Cerrar Sesión");
        jbtnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtnCerrarSesion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnNuevo))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        // TODO add your handling code here:
        CreacionProcesosValidacion nuevo = new CreacionProcesosValidacion();
        this.dispose();
        nuevo.setVisible(true);
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jbtnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCerrarSesionActionPerformed
        // TODO add your handling code here:
        Login nuevo = new Login();
        this.dispose();
        nuevo.setVisible(true);
    }//GEN-LAST:event_jbtnCerrarSesionActionPerformed

    private void jtblFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblFuncionariosMouseClicked
        // TODO add your handling code here:
        int fila = this.jtblFuncionarios.rowAtPoint(evt.getPoint());
        idFuncionario = this.jtblFuncionarios.getValueAt(fila, 0).toString();
        int numActivos = Integer.valueOf(this.jtblFuncionarios.getValueAt(fila,3).toString());
        if (numActivos > 0) {
            String nombreFuncionario = this.jtblFuncionarios.getValueAt(fila, 1).toString() + " " +
                this.jtblFuncionarios.getValueAt(fila, 2).toString();
             Activos ventana = new Activos(this ,true, idFuncionario, nombreFuncionario);
            ventana.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "El funcionario no dispone de activos" ,"Mensaje", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jtblFuncionariosMouseClicked

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
            java.util.logging.Logger.getLogger(FuncionariosYActivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionariosYActivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionariosYActivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionariosYActivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionariosYActivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnCerrarSesion;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JTable jtblFuncionarios;
    // End of variables declaration//GEN-END:variables
}
