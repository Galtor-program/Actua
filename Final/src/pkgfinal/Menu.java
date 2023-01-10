
package pkgfinal;




import com.toedter.calendar.JCalendar;
import conexionSQL.conexionSQL;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;



public class Menu extends javax.swing.JFrame {
    
    conexionSQL cc =  new conexionSQL();
    Connection con =cc.conexion();
   
    String ruta_archivo = "";
    String ruta_archivo2 = "";
    int id = -1;
    
    

   
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarDatos();
        
        /*tpdf.visualizar_PdfVO(tabla);
        activa_boton(false, false, false);
        txtname.setEnabled(false);*/
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ref_emp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ref_gco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ref_pro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ref_ori = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ref_cli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ref_des = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ref_dl = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ref_us = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ref_clp = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        alma = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ref_eta = new com.toedter.calendar.JDateChooser();
        ref_fer = new com.toedter.calendar.JDateChooser();
        modreal = new javax.swing.JButton();
        modeta = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cbtc = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cbestado = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cbtrans = new javax.swing.JComboBox<>();
        cbsm = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        nuevo = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        modificar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        eliminar = new javax.swing.JButton();
        busqueda = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        btnseleccionar = new javax.swing.JButton();
        modpdf1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        ref_doc = new javax.swing.JTextField();
        ddt = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        modpdf2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ACTUALIZADOR GCO");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Nombre Empresa");

        jLabel2.setText("Referencia GCO");

        jLabel4.setText("Proveedor");

        jLabel5.setText("Origen");

        jLabel3.setText("Referencia Cliente");

        jLabel6.setText("Destino");

        jLabel9.setText("Demorrage");

        ref_dl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref_dlActionPerformed(evt);
            }
        });

        jLabel10.setText("Valor US");

        jLabel11.setText("Valor CLP");

        jLabel21.setText("Almacen");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel21))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alma, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ref_clp, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ref_dl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ref_ori, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addComponent(ref_gco, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ref_pro, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ref_emp, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ref_des)
                        .addComponent(ref_cli))
                    .addComponent(ref_us, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(ref_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ref_gco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(ref_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ref_ori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ref_des, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ref_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ref_dl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ref_us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ref_clp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setText("ETA");

        jLabel8.setText("Fecha real");

        modreal.setText("Modificar Fecha Real ");
        modreal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modrealActionPerformed(evt);
            }
        });

        modeta.setText("Modificar ETA");
        modeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ref_eta, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(ref_fer, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(modreal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(modeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(ref_eta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(ref_fer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modreal))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(modeta)
                    .addContainerGap(79, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel15.setText("TIPO CARGA");

        cbtc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "FCL (FULL CONTAINER LOAD)", "LCL (LESS CONTAINER LOAD)" }));

        jLabel13.setText("ESTADO");

        cbestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EN PREPARACION", "EN DESPACHO", "EN TRANSITO", "RETRASO", "ENTREGADO" }));

        jLabel14.setText("TRANSPORTE");

        cbtrans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MARITIMO", "AEREO" }));

        cbsm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "OK" }));

        jLabel20.setText("SIDEMAR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbtrans, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbsm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbtc, javax.swing.GroupLayout.Alignment.TRAILING, 0, 1, Short.MAX_VALUE)
                            .addComponent(cbestado, 0, 153, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(cbestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbtrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbtc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbsm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(28, 28, 28))
        );

        jPanel5.setBackground(new java.awt.Color(51, 204, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Controles Simples"));

        nuevo.setText("NUEVO");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardar)
                    .addComponent(nuevo))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(nuevo)
                .addGap(18, 18, 18)
                .addComponent(guardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificador de datos"));

        modificar.setText("MODIFICAR");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modificar)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modificar)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Atención eliminador"));

        eliminar.setText("ELIMINAR");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eliminar)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });
        busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busquedaKeyReleased(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel16.setText("BUSCADOR");

        jLabel17.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel17.setText("Parámetros de busqueda: ");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setText("N° Factura");

        btnseleccionar.setText("SUBIR FACTURA");
        btnseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseleccionarActionPerformed(evt);
            }
        });

        modpdf1.setText("MODIFICAR FACTURA");
        modpdf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modpdf1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modpdf1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnseleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(33, 33, 33))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnseleccionar)
                .addGap(18, 18, 18)
                .addComponent(modpdf1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ddt.setText("Subir Documento de Transporte");
        ddt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddtActionPerformed(evt);
            }
        });

        jLabel18.setText("Documento de Transporte");

        modpdf2.setText("MODIFICAR DOCUMENTO");
        modpdf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modpdf2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ddt, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ref_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(modpdf2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(ref_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ddt)
                .addGap(18, 18, 18)
                .addComponent(modpdf2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Refencia GCO\nRefencia Cliente\nEstado\nN° de factura\nN° de documento");
        jScrollPane2.setViewportView(jTextArea1);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/logo gco3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(23, 23, 23)
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(312, 312, 312))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        ingreso();
        limpiarcajas();
        mostrarDatos();
        
    }//GEN-LAST:event_guardarActionPerformed
public void mostrarDatos(){
    
    String [] titulos ={"ID","EMPRESA","REF GCO","REF CLIENTE","PROVEEDOR","ORIGEN","DESTINO","ETA","FECHA REAL","DEMORRAGE","VALORUS","VALORCLP","ESTADO","TRANSPORTE","TIPO CARGA","N° FACTURA","N°DOCUMENTO","ALMACEN","SIDEMAR"};
    String [] registros= new String[19];
    
    DefaultTableModel modelo= new DefaultTableModel(null,titulos);
    
    String SQL="SELECT * FROM tracking";
    
    try{
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(SQL);
        
        while (rs.next()){
                registros[0] = rs.getString("id");
                registros[1] = rs.getString("cod");
                registros[2] = rs.getString("gcoref");
                registros[3] = rs.getString("cliref");
                registros[4] = rs.getString("Prov");
                registros[5] = rs.getString("Ori");
                registros[6] = rs.getString("Dest");
                registros[7] = rs.getString("ETA");
                registros[8] = rs.getString("freal");
                registros [9] = rs.getString("dl");
                registros[10] = rs.getString("VfacUS");
                registros[11] = rs.getString("VfacCLP");
                registros[12] = rs.getString("estado");
                registros[13] = rs.getString("trans");
                registros [14] = rs.getString("tc");
                registros [15] = rs.getString("nombrePDF");
                registros [16] = rs.getString ("numdoc");
                registros [17] = rs.getString ("almacen");
                registros [18] = rs.getString ("sidemar"); 
                  
                
                modelo.addRow(registros);
        }
        tabla.setModel(modelo);
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error al mostrar Datos" +e.getMessage());
        
    }
}
    
public void buscarDatos(String valor){
    
    String [] titulos ={"ID","EMPRESA","REF GCO","REF CLIENTE","PROVEEDOR","ORIGEN","DESTINO","ETA","FECHA REAL","DEMORRAGE","VALORUS","VALORCLP","ESTADO","TRANSPORTE","TIPO CARGA","N° FACTURA", "N° DOCUMENTO","ALMACEN","SIDEMAR"};
    String [] registros= new String[19];
    
    DefaultTableModel modelo= new DefaultTableModel(null,titulos);
    
    String SQL="SELECT * FROM tracking where cod like '%"+valor+"%'or gcoref like '%"+valor+"%' or nombrePDF like '%"+valor+"%' or numdoc like '%"+valor+"%' ";
    
    try{
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(SQL);
        
        while (rs.next()){
                registros[0] = rs.getString("id");
                registros[1] = rs.getString("cod");
                registros[2] = rs.getString("gcoref");
                registros[3] = rs.getString("cliref");
                registros[4] = rs.getString("Prov");
                registros[5] = rs.getString("Ori");
                registros[6] = rs.getString("Dest");
                registros[7] = rs.getString("ETA");
                registros[8] = rs.getString("freal");
                registros [9] = rs.getString("dl");
                registros[10] = rs.getString("VfacUS");
                registros[11] = rs.getString("VfacCLP");
                registros[12] = rs.getString("estado");
                registros[13] = rs.getString("trans");
                registros [14] = rs.getString("tc");
                registros [15] = rs.getString("nombrePDF");
                registros [16] = rs.getString ("numdoc");
                registros [17] = rs.getString ("almacen");
                registros [18] = rs.getString ("sidemar");
                
                
                modelo.addRow(registros);
        }
        tabla.setModel(modelo);
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error al mostrar Datos" +e.getMessage());
        
    }
}



    
    
    private void btnseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseleccionarActionPerformed
        seleccionar_pdf();
    }//GEN-LAST:event_btnseleccionarActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        limpiarcajas();
    }//GEN-LAST:event_nuevoActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int filaSeleccionada=tabla.rowAtPoint(evt.getPoint());
        ref_emp.setText((String) tabla.getValueAt(filaSeleccionada,1));
        ref_gco.setText((String) tabla.getValueAt(filaSeleccionada,2));
        ref_cli.setText((String) tabla.getValueAt(filaSeleccionada,3));
        ref_pro.setText((String) tabla.getValueAt(filaSeleccionada,4));
        ref_ori.setText((String) tabla.getValueAt(filaSeleccionada,5));
        ref_des.setText((String) tabla.getValueAt(filaSeleccionada,6));
        //ref_eta.setText((String) tabla.getValueAt(filaSeleccionada,7));
        //ref_fer.setText((String) tabla.getValueAt(filaSeleccionada,8));
        ref_dl.setText((String) tabla.getValueAt(filaSeleccionada,9));
        ref_us.setText((String) tabla.getValueAt(filaSeleccionada,10));
        ref_clp.setText((String) tabla.getValueAt(filaSeleccionada,11));
        cbestado.setSelectedItem(tabla.getValueAt(filaSeleccionada, 12));
        cbtrans.setSelectedItem(tabla.getValueAt(filaSeleccionada, 13));
        cbtc.setSelectedItem(tabla.getValueAt(filaSeleccionada, 14));
        txtname.setText((String) tabla.getValueAt(filaSeleccionada,15));
        ref_doc.setText((String) tabla.getValueAt(filaSeleccionada,16));
        alma.setText ((String) tabla.getValueAt(filaSeleccionada,17));
        cbsm.setSelectedItem(tabla.getValueAt(filaSeleccionada,18));
    }//GEN-LAST:event_tablaMouseClicked

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        modificar();
        limpiarcajas();
        mostrarDatos();
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
            eliminar();
            limpiarcajas();
            mostrarDatos();
    }//GEN-LAST:event_eliminarActionPerformed

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        
    }//GEN-LAST:event_busquedaActionPerformed

    private void busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaKeyReleased
        buscarDatos(busqueda.getText().toUpperCase());
    }//GEN-LAST:event_busquedaKeyReleased

    private void ref_dlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ref_dlActionPerformed
       
        // TODO add your handling code here:
    }//GEN-LAST:event_ref_dlActionPerformed

    private void ddtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddtActionPerformed
        seleccionar_pdf2();
    }//GEN-LAST:event_ddtActionPerformed

    private void modetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modetaActionPerformed
        mod_eta();
        limpiarcajas();
        mostrarDatos();
        // TODO add your handling code here:
    }//GEN-LAST:event_modetaActionPerformed

    private void modrealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modrealActionPerformed
        mod_freal();
        limpiarcajas();
        mostrarDatos();
        // TODO add your handling code here:
    }//GEN-LAST:event_modrealActionPerformed

    private void modpdf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modpdf1ActionPerformed
        mod_pdf1();
        limpiarcajas();
        mostrarDatos();
        // TODO add your handling code here:
    }//GEN-LAST:event_modpdf1ActionPerformed

    private void modpdf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modpdf2ActionPerformed
        mod_pdf2();
        limpiarcajas();
        mostrarDatos();
        // TODO add your handling code here:
    }//GEN-LAST:event_modpdf2ActionPerformed

    public void limpiarcajas(){
        ref_gco.setText("");
        ref_cli.setText("");
        ref_pro.setText("");
        ref_ori.setText("");
        ref_des.setText("");
        //ref_eta.setText("");
        //ref_fer.setText("");
        ref_dl.setText("");
        ref_us.setText("");
        ref_clp.setText("");
        ref_emp.setText("");
        ref_doc.setText("");
        txtname.setText("");
        
        // se declaran a null los items de las contentbox
        cbestado.setSelectedItem(null);
        cbtrans.setSelectedItem(null);
        cbtc.setSelectedItem(null);
        cbsm.setSelectedItem(null);
        
               
                
                
                
}
    
    
     public void keyTyped(KeyEvent e) 

    {
    if (ref_dl.getText().length()== 2) 

         e.consume(); 
    } 
    
    
    
    
    
    public void ingreso(){
        try{
            String SQL="insert into tracking(gcoref, cliref, Prov, Ori, Dest, Eta, freal, dl, VfacUS, VfacCLP, cod, nombrePDF,estado,trans,tc,Upfac,docum,numdoc,almacen,sidemar) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(SQL);
            
            pst.setString(1,ref_gco.getText().toUpperCase());
            pst.setString(2,ref_cli.getText().toUpperCase());
            pst.setString(3, ref_pro.getText().toUpperCase());
            pst.setString(4, ref_ori.getText().toUpperCase());
            pst.setString(5, ref_des.getText().toUpperCase());
            pst.setString(6, ((JTextField)ref_eta.getDateEditor().getUiComponent()).getText());
            pst.setString(7, ((JTextField)ref_fer.getDateEditor().getUiComponent()).getText());
            pst.setString(8, ref_dl.getText().toUpperCase());
            pst.setString(9, ref_us.getText().toUpperCase());
            pst.setString(10, ref_clp.getText().toUpperCase());
            pst.setString(11,ref_emp.getText().toUpperCase());
            pst.setString(12,txtname.getText().toUpperCase());
            pst.setString(18,alma.getText().toUpperCase()); 
            
            
            int seleccion=cbestado.getSelectedIndex();
            pst.setString(13, cbestado.getItemAt(seleccion));
            
            int seleccion2=cbtrans.getSelectedIndex();
            pst.setString(14, cbtrans.getItemAt(seleccion2));
            
            int seleccion3=cbtc.getSelectedIndex();
            pst.setString(15,cbtc.getItemAt(seleccion3));
            
            int seleccion4=cbsm.getSelectedIndex();
            pst.setString(20,cbsm.getItemAt(seleccion4));
            
                            
            InputStream image = new FileInputStream(new File(ruta_archivo));
            pst.setBlob(16,image);
                      
            InputStream image2 = new FileInputStream(new File(ruta_archivo2));
            pst.setBlob(17,image2);
            
            pst.setString(18,ref_doc.getText().toUpperCase());
            
            pst.execute();
            JOptionPane.showMessageDialog(null,"Registro Existoso");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"registro erroneo" +e.getMessage());
            
        }
    }
    
    
    public void modificar(){
        try{
            String SQL="update tracking set gcoref=?, cliref=?, Prov=?, Ori=?, Dest=?,  dl=?, VfacUS=?, VfacCLP=?, cod=?, nombrePDF=?,estado=?,trans=?,tc=?,almacen=?,sidemar=? where id=?";
            int filaSeleccionada=tabla.getSelectedRow();
            String dao=(String)tabla.getValueAt(filaSeleccionada,0);
            PreparedStatement pst=con.prepareStatement(SQL);
            
            pst.setString(1,ref_gco.getText().toUpperCase());
            pst.setString(2,ref_cli.getText().toUpperCase());
            pst.setString(3, ref_pro.getText().toUpperCase());
            pst.setString(4, ref_ori.getText().toUpperCase());
            pst.setString(5, ref_des.getText().toUpperCase());
            //pst.setString(6, ((JTextField)ref_eta.getDateEditor().getUiComponent()).getText());
            //pst.setString(7, ((JTextField)ref_fer.getDateEditor().getUiComponent()).getText());
            pst.setString(6, ref_dl.getText().toUpperCase());
            pst.setString(7, ref_us.getText().toUpperCase());
            pst.setString(8, ref_clp.getText().toUpperCase());
            pst.setString(9,ref_emp.getText().toUpperCase());
            pst.setString(10,txtname.getText().toUpperCase());
            pst.setString(14,alma.getText().toUpperCase());
            
            int seleccion=cbestado.getSelectedIndex();
            pst.setString(11, cbestado.getItemAt(seleccion));
            
            int seleccion2=cbtrans.getSelectedIndex();
            pst.setString(12, cbtrans.getItemAt(seleccion2));
            
            int seleccion3=cbtc.getSelectedIndex();
            pst.setString(13,cbtc.getItemAt(seleccion3));
            
            int seleccion4=cbsm.getSelectedIndex();
            pst.setString(15,cbsm.getItemAt(seleccion4));
            
            pst.setString(16, dao);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Modificación Exitosa");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"registro erroneo" +e.getMessage());
            
        }
    }
    
    public void mod_pdf1(){
        try{
        int filaSeleccionada=tabla.getSelectedRow();
        String SQL="update tracking set Upfac =?,nombrePDF=? where id=?";
        String dao=(String)tabla.getValueAt(filaSeleccionada,0);
        PreparedStatement pst=con.prepareStatement(SQL);
            InputStream image = new FileInputStream(new File(ruta_archivo));
            pst.setBlob(1,image);
            pst.setString(2,txtname.getText().toUpperCase());
            pst.setString(3, dao);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Modificación Exitosa");
        
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"registro erroneo" +e.getMessage());
        }
    }
    
    
    
    
    
    
    public void mod_pdf2(){
        try{
        int filaSeleccionada=tabla.getSelectedRow();
        String SQL="update tracking set docum =?, numdoc=? where id=?";
        String dao=(String)tabla.getValueAt(filaSeleccionada,0);
        PreparedStatement pst=con.prepareStatement(SQL);
            InputStream image2 = new FileInputStream(new File(ruta_archivo2));
            pst.setBlob(1,image2);
            pst.setString(2,ref_doc.getText().toUpperCase());
            pst.setString(3, dao);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Modificación Exitosa");
        
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"registro erroneo" +e.getMessage());
        }
    }
    
    
    
    
    
    
    
    
    public void mod_eta(){
        try{
        int filaSeleccionada=tabla.getSelectedRow();
        String SQL="update tracking set Eta =? where id=?";
        String dao=(String)tabla.getValueAt(filaSeleccionada,0);
        PreparedStatement pst=con.prepareStatement(SQL);
        pst.setString(1, ((JTextField)ref_eta.getDateEditor().getUiComponent()).getText());
            pst.setString(2, dao);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Modificación Exitosa");
        
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"registro erroneo" +e.getMessage());
        }
    }
    
    public void mod_freal(){
        try{
        int filaSeleccionada=tabla.getSelectedRow();
        String SQL="update tracking set freal =? where id=?";
        String dao=(String)tabla.getValueAt(filaSeleccionada,0);
        PreparedStatement pst=con.prepareStatement(SQL);
        pst.setString(1, ((JTextField)ref_fer.getDateEditor().getUiComponent()).getText());
            pst.setString(2, dao);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Modificación Exitosa");
        
        }catch (Exception e){
            
        }
    }
    
    
    public void eliminar(){
        int filaSeleccionada=tabla.getSelectedRow();
        
        try{
            String SQL="delete from tracking where id="+tabla.getValueAt(filaSeleccionada,0);
            Statement st=con.createStatement();
            int n=st.executeUpdate(SQL);
            if (n>=0){
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
        
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al Eliminar" +e.getMessage());
        }
    }
    
    
    
    
    //selector de pdf
    public void seleccionar_pdf() {
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fi = new FileNameExtensionFilter("pdf", "pdf");
        j.setFileFilter(fi);
        int se = j.showOpenDialog(this);
        if (se == 0) {
            this.btnseleccionar.setText("" + j.getSelectedFile().getName());
            ruta_archivo = j.getSelectedFile().getAbsolutePath();

        } else {
        }
    }
    
     public void seleccionar_pdf2() {
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fi2 = new FileNameExtensionFilter("pdf", "pdf");
        j.setFileFilter(fi2);
        int se = j.showOpenDialog(this);
        if (se == 0) {
            this.ddt.setText("" + j.getSelectedFile().getName());
            ruta_archivo2 = j.getSelectedFile().getAbsolutePath();

        } else {
        }
    }
    
    
    //activa boton
    public void activa_boton(boolean a, boolean b, boolean c) {
        guardar.setEnabled(a);
        //btnmodificar.setEnabled(b);
        //btneliminar.setEnabled(c);
        //txtname.setText("");
        //btnseleccionar.setText("Seleccionar...");
    }
    
    
                         
    
    
    
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alma;
    private javax.swing.JButton btnseleccionar;
    private javax.swing.JTextField busqueda;
    private javax.swing.JComboBox<String> cbestado;
    private javax.swing.JComboBox<String> cbsm;
    private javax.swing.JComboBox<String> cbtc;
    private javax.swing.JComboBox<String> cbtrans;
    private javax.swing.JButton ddt;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton modeta;
    private javax.swing.JButton modificar;
    private javax.swing.JButton modpdf1;
    private javax.swing.JButton modpdf2;
    private javax.swing.JButton modreal;
    private javax.swing.JButton nuevo;
    private javax.swing.JTextField ref_cli;
    private javax.swing.JTextField ref_clp;
    private javax.swing.JTextField ref_des;
    private javax.swing.JTextField ref_dl;
    private javax.swing.JTextField ref_doc;
    private javax.swing.JTextField ref_emp;
    private com.toedter.calendar.JDateChooser ref_eta;
    private com.toedter.calendar.JDateChooser ref_fer;
    private javax.swing.JTextField ref_gco;
    private javax.swing.JTextField ref_ori;
    private javax.swing.JTextField ref_pro;
    private javax.swing.JTextField ref_us;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
