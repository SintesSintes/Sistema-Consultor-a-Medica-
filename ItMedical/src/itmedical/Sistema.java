package itmedical;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.Timer;
import BD.CitasDAO;
import BD.Conexion;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;




public class Sistema extends javax.swing.JFrame {
    public Sistema() {
        initComponents(); 
        refrescarTablas();
        tabMedical.setUI(null);
        tabMedical.setTabLayoutPolicy(tabMedical.SCROLL_TAB_LAYOUT);
        
        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(
    new String[]{
        "Todos",
        "Hora",
        "Paciente",
        "DNI",
        "Estudio",
        "Obra Social",
        "Recepcionado por"
    }
));

        
        // Inicializa TODOS los componentes (botones, paneles, tablas)
        this.setLocationRelativeTo(null); // centra la ventana
        this.setSize(1010, 640); // tamaño de la ventana
        this.setVisible(true);  // muestra la ventana
    }
    
    public static void main(String[] args) {
        new Sistema();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnKine = new javax.swing.JPanel();
        labelKine = new javax.swing.JLabel();
        btnTrauma = new javax.swing.JPanel();
        labelTrauma = new javax.swing.JLabel();
        btnReso = new javax.swing.JPanel();
        labelReso = new javax.swing.JLabel();
        btnEco = new javax.swing.JPanel();
        labelEco = new javax.swing.JLabel();
        btnRepo = new javax.swing.JPanel();
        labelRepo = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        tabMedical = new javax.swing.JTabbedPane();
        panelKine = new javax.swing.JPanel();
        btnCitasKine = new javax.swing.JPanel();
        labelCitasKine = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollBar1 = new javax.swing.JScrollBar();
        panelReso = new javax.swing.JPanel();
        btnCitasReso = new javax.swing.JPanel();
        labelCitasReso = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollBar2 = new javax.swing.JScrollBar();
        panelEco = new javax.swing.JPanel();
        btnCitasEco = new javax.swing.JPanel();
        labelCitasEco = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollBar3 = new javax.swing.JScrollBar();
        panelTrauma = new javax.swing.JPanel();
        btnCitasTrauma = new javax.swing.JPanel();
        labelCitasTrauma = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollBar4 = new javax.swing.JScrollBar();
        panelRepo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboFiltro = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        tableReportes = new javax.swing.JScrollPane();
        tblReportes = new javax.swing.JTable();
        jScrollBar5 = new javax.swing.JScrollBar();
        btnBuscar = new javax.swing.JPanel();
        labelCitasReso1 = new javax.swing.JLabel();
        btnExportar = new javax.swing.JPanel();
        labelCitasReso2 = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JPanel();
        labelCitasReso3 = new javax.swing.JLabel();
        btnexit = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setForeground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto SemiCondensed", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ITMEDICAL");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("--------------------");

        btnKine.setBackground(new java.awt.Color(0, 157, 217));
        btnKine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKineMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnKineMouseExited(evt);
            }
        });

        labelKine.setBackground(new java.awt.Color(255, 255, 255));
        labelKine.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 0, 14)); // NOI18N
        labelKine.setForeground(new java.awt.Color(255, 255, 255));
        labelKine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelKine.setText("KINESEOLOGÍA");
        labelKine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnKineLayout = new javax.swing.GroupLayout(btnKine);
        btnKine.setLayout(btnKineLayout);
        btnKineLayout.setHorizontalGroup(
            btnKineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnKineLayout.createSequentialGroup()
                .addComponent(labelKine, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnKineLayout.setVerticalGroup(
            btnKineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelKine, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        btnTrauma.setBackground(new java.awt.Color(0, 157, 217));
        btnTrauma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTraumaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTraumaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTraumaMouseExited(evt);
            }
        });

        labelTrauma.setBackground(new java.awt.Color(255, 255, 255));
        labelTrauma.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 0, 14)); // NOI18N
        labelTrauma.setForeground(new java.awt.Color(255, 255, 255));
        labelTrauma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTrauma.setText("TRAUMATOLOGÍA");
        labelTrauma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnTraumaLayout = new javax.swing.GroupLayout(btnTrauma);
        btnTrauma.setLayout(btnTraumaLayout);
        btnTraumaLayout.setHorizontalGroup(
            btnTraumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTrauma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnTraumaLayout.setVerticalGroup(
            btnTraumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTrauma, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        btnReso.setBackground(new java.awt.Color(0, 157, 217));
        btnReso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnResoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnResoMouseExited(evt);
            }
        });

        labelReso.setBackground(new java.awt.Color(255, 255, 255));
        labelReso.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 0, 14)); // NOI18N
        labelReso.setForeground(new java.awt.Color(255, 255, 255));
        labelReso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelReso.setText("RESONANCIA");
        labelReso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnResoLayout = new javax.swing.GroupLayout(btnReso);
        btnReso.setLayout(btnResoLayout);
        btnResoLayout.setHorizontalGroup(
            btnResoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnResoLayout.createSequentialGroup()
                .addComponent(labelReso, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnResoLayout.setVerticalGroup(
            btnResoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelReso, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        btnEco.setBackground(new java.awt.Color(0, 157, 217));
        btnEco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEcoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEcoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEcoMouseExited(evt);
            }
        });

        labelEco.setBackground(new java.awt.Color(255, 255, 255));
        labelEco.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 0, 14)); // NOI18N
        labelEco.setForeground(new java.awt.Color(255, 255, 255));
        labelEco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEco.setText("ECOGRAFÍA");
        labelEco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnEcoLayout = new javax.swing.GroupLayout(btnEco);
        btnEco.setLayout(btnEcoLayout);
        btnEcoLayout.setHorizontalGroup(
            btnEcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEcoLayout.createSequentialGroup()
                .addComponent(labelEco, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnEcoLayout.setVerticalGroup(
            btnEcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelEco, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        btnRepo.setBackground(new java.awt.Color(0, 157, 217));
        btnRepo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRepoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRepoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRepoMouseExited(evt);
            }
        });

        labelRepo.setBackground(new java.awt.Color(255, 255, 255));
        labelRepo.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 0, 14)); // NOI18N
        labelRepo.setForeground(new java.awt.Color(255, 255, 255));
        labelRepo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRepo.setText("REPORTES");
        labelRepo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnRepoLayout = new javax.swing.GroupLayout(btnRepo);
        btnRepo.setLayout(btnRepoLayout);
        btnRepoLayout.setHorizontalGroup(
            btnRepoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRepoLayout.createSequentialGroup()
                .addComponent(labelRepo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnRepoLayout.setVerticalGroup(
            btnRepoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelRepo, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTrauma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRepo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTrauma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRepo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(349, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        jLayeredPane2.setForeground(new java.awt.Color(255, 255, 255));
        jLayeredPane2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLayeredPane2MouseDragged(evt);
            }
        });
        jLayeredPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLayeredPane2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLayeredPane1.add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 50));

        btnCitasKine.setBackground(new java.awt.Color(0, 157, 217));
        btnCitasKine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCitasKineMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCitasKineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCitasKineMouseExited(evt);
            }
        });

        labelCitasKine.setBackground(new java.awt.Color(255, 255, 255));
        labelCitasKine.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 0, 14)); // NOI18N
        labelCitasKine.setForeground(new java.awt.Color(255, 255, 255));
        labelCitasKine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCitasKine.setText("Nueva Cita");
        labelCitasKine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnCitasKineLayout = new javax.swing.GroupLayout(btnCitasKine);
        btnCitasKine.setLayout(btnCitasKineLayout);
        btnCitasKineLayout.setHorizontalGroup(
            btnCitasKineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCitasKineLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCitasKine, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnCitasKineLayout.setVerticalGroup(
            btnCitasKineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCitasKine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Hora", "Paciente", "dni", "Estudios Por Realizar", "Obra Social", "Importe", "Contacto", "Observaciones", "dado por", "Recepcionado por"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout panelKineLayout = new javax.swing.GroupLayout(panelKine);
        panelKine.setLayout(panelKineLayout);
        panelKineLayout.setHorizontalGroup(
            panelKineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKineLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelKineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCitasKine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelKineLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        panelKineLayout.setVerticalGroup(
            panelKineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCitasKine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelKineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(242, Short.MAX_VALUE))
        );

        tabMedical.addTab("tab1", panelKine);

        btnCitasReso.setBackground(new java.awt.Color(0, 157, 217));
        btnCitasReso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCitasResoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCitasResoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCitasResoMouseExited(evt);
            }
        });

        labelCitasReso.setBackground(new java.awt.Color(255, 255, 255));
        labelCitasReso.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 0, 14)); // NOI18N
        labelCitasReso.setForeground(new java.awt.Color(255, 255, 255));
        labelCitasReso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCitasReso.setText("Nueva Cita");
        labelCitasReso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnCitasResoLayout = new javax.swing.GroupLayout(btnCitasReso);
        btnCitasReso.setLayout(btnCitasResoLayout);
        btnCitasResoLayout.setHorizontalGroup(
            btnCitasResoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCitasResoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCitasReso, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnCitasResoLayout.setVerticalGroup(
            btnCitasResoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCitasReso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Hora", "Paciente", "dni", "Estudios Por Realizar", "Obra Social", "Importe", "Contacto", "Observaciones", "dado por", "Recepcionado por"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout panelResoLayout = new javax.swing.GroupLayout(panelReso);
        panelReso.setLayout(panelResoLayout);
        panelResoLayout.setHorizontalGroup(
            panelResoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCitasReso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelResoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        panelResoLayout.setVerticalGroup(
            panelResoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCitasReso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelResoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                .addGap(242, 242, 242))
        );

        tabMedical.addTab("tab2", panelReso);

        btnCitasEco.setBackground(new java.awt.Color(0, 157, 217));
        btnCitasEco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCitasEcoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCitasEcoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCitasEcoMouseExited(evt);
            }
        });

        labelCitasEco.setBackground(new java.awt.Color(255, 255, 255));
        labelCitasEco.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 0, 14)); // NOI18N
        labelCitasEco.setForeground(new java.awt.Color(255, 255, 255));
        labelCitasEco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCitasEco.setText("Nueva Cita");
        labelCitasEco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnCitasEcoLayout = new javax.swing.GroupLayout(btnCitasEco);
        btnCitasEco.setLayout(btnCitasEcoLayout);
        btnCitasEcoLayout.setHorizontalGroup(
            btnCitasEcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCitasEcoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCitasEco, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnCitasEcoLayout.setVerticalGroup(
            btnCitasEcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCitasEco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Hora", "Paciente", "dni", "Estudios Por Realizar", "Obra Social", "Importe", "Contacto", "Observaciones", "dado por", "Recepcionado por"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout panelEcoLayout = new javax.swing.GroupLayout(panelEco);
        panelEco.setLayout(panelEcoLayout);
        panelEcoLayout.setHorizontalGroup(
            panelEcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEcoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCitasEco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelEcoLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        panelEcoLayout.setVerticalGroup(
            panelEcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEcoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCitasEco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelEcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                .addGap(242, 242, 242))
        );

        tabMedical.addTab("tab3", panelEco);

        btnCitasTrauma.setBackground(new java.awt.Color(0, 157, 217));
        btnCitasTrauma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCitasTraumaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCitasTraumaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCitasTraumaMouseExited(evt);
            }
        });

        labelCitasTrauma.setBackground(new java.awt.Color(255, 255, 255));
        labelCitasTrauma.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 0, 14)); // NOI18N
        labelCitasTrauma.setForeground(new java.awt.Color(255, 255, 255));
        labelCitasTrauma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCitasTrauma.setText("Nueva Cita");
        labelCitasTrauma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnCitasTraumaLayout = new javax.swing.GroupLayout(btnCitasTrauma);
        btnCitasTrauma.setLayout(btnCitasTraumaLayout);
        btnCitasTraumaLayout.setHorizontalGroup(
            btnCitasTraumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCitasTraumaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCitasTrauma, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnCitasTraumaLayout.setVerticalGroup(
            btnCitasTraumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCitasTrauma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Hora", "Paciente", "dni", "Estudios Por Realizar", "Obra Social", "Importe", "Contacto", "Observaciones", "dado por", "Recepcionado por"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout panelTraumaLayout = new javax.swing.GroupLayout(panelTrauma);
        panelTrauma.setLayout(panelTraumaLayout);
        panelTraumaLayout.setHorizontalGroup(
            panelTraumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTraumaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTraumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCitasTrauma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelTraumaLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        panelTraumaLayout.setVerticalGroup(
            panelTraumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTraumaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCitasTrauma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelTraumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollBar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                .addGap(242, 242, 242))
        );

        tabMedical.addTab("tab4", panelTrauma);

        jLabel4.setFont(new java.awt.Font("Roboto SemiCondensed", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("REPORTES");

        jLabel5.setFont(new java.awt.Font("Roboto SemiCondensed", 0, 14)); // NOI18N
        jLabel5.setText("Filtrar por:");

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Roboto SemiCondensed", 0, 14)); // NOI18N
        jLabel6.setText("Valor:");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        tblReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Hora", "Paciente", "dni", "Estudios Por Realizar", "Obra Social", "Importe", "Contacto", "Observaciones", "dado por", "Recepcionado por"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableReportes.setViewportView(tblReportes);

        btnBuscar.setBackground(new java.awt.Color(0, 157, 217));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });

        labelCitasReso1.setBackground(new java.awt.Color(255, 255, 255));
        labelCitasReso1.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 0, 14)); // NOI18N
        labelCitasReso1.setForeground(new java.awt.Color(255, 255, 255));
        labelCitasReso1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCitasReso1.setText("Buscar");
        labelCitasReso1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(labelCitasReso1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCitasReso1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        btnExportar.setBackground(new java.awt.Color(153, 0, 0));
        btnExportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExportarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExportarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExportarMouseExited(evt);
            }
        });

        labelCitasReso2.setBackground(new java.awt.Color(255, 255, 255));
        labelCitasReso2.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 0, 14)); // NOI18N
        labelCitasReso2.setForeground(new java.awt.Color(255, 255, 255));
        labelCitasReso2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCitasReso2.setText("Exportar");
        labelCitasReso2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCitasReso2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCitasReso2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnExportarLayout = new javax.swing.GroupLayout(btnExportar);
        btnExportar.setLayout(btnExportarLayout);
        btnExportarLayout.setHorizontalGroup(
            btnExportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCitasReso2, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );
        btnExportarLayout.setVerticalGroup(
            btnExportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCitasReso2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        btnReiniciar.setBackground(new java.awt.Color(102, 102, 102));
        btnReiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReiniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReiniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReiniciarMouseExited(evt);
            }
        });

        labelCitasReso3.setBackground(new java.awt.Color(255, 255, 255));
        labelCitasReso3.setFont(new java.awt.Font("Roboto SemiCondensed SemiBold", 0, 14)); // NOI18N
        labelCitasReso3.setForeground(new java.awt.Color(255, 255, 255));
        labelCitasReso3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCitasReso3.setText("Reiniciar");
        labelCitasReso3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnReiniciarLayout = new javax.swing.GroupLayout(btnReiniciar);
        btnReiniciar.setLayout(btnReiniciarLayout);
        btnReiniciarLayout.setHorizontalGroup(
            btnReiniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCitasReso3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );
        btnReiniciarLayout.setVerticalGroup(
            btnReiniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCitasReso3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelRepoLayout = new javax.swing.GroupLayout(panelRepo);
        panelRepo.setLayout(panelRepoLayout);
        panelRepoLayout.setHorizontalGroup(
            panelRepoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRepoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelRepoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRepoLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRepoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))))
            .addGroup(panelRepoLayout.createSequentialGroup()
                .addGroup(panelRepoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRepoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelRepoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(tableReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollBar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRepoLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRepoLayout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 117, Short.MAX_VALUE))
            .addGroup(panelRepoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRepoLayout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(602, Short.MAX_VALUE)))
        );
        panelRepoLayout.setVerticalGroup(
            panelRepoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRepoLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRepoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(panelRepoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollBar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tableReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(panelRepoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRepoLayout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(428, 428, 428)))
        );

        tabMedical.addTab("tab5", panelRepo);

        jLayeredPane1.add(tabMedical, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 790, 590));

        btnexit.setBackground(new java.awt.Color(204, 204, 204));
        btnexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnexitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnexitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnexitMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto SemiCondensed", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");

        javax.swing.GroupLayout btnexitLayout = new javax.swing.GroupLayout(btnexit);
        btnexit.setLayout(btnexitLayout);
        btnexitLayout.setHorizontalGroup(
            btnexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnexitLayout.setVerticalGroup(
            btnexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnexitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Este método carga los datos de la tabla de Kinesiología
private void cargarTablaKine() {
    DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
    modelo.setRowCount(0);
    CitasDAO dao = new CitasDAO();
    try {
        ResultSet rs = dao.listarCitasPorEspecialidad("KINE");
        while (rs.next()) {
            modelo.addRow(new Object[] {
                rs.getString("hora"),
                rs.getString("paciente"),
                rs.getString("dni"),
                rs.getString("estudio"),
                rs.getString("obra_social"),
                rs.getString("importe"),
                rs.getString("contacto"),
                rs.getString("observaciones"),
                rs.getString("dado_por"),
                rs.getString("recepcionado_por")
            });
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al cargar tabla Kine: " + e.getMessage());
    }
}
public void refrescarTablas() {
    cargarTablaKine();
    cargarTablaReso();
    cargarTablaEco();
    cargarTablaTrauma();
}

private void cargarTablaReso() {
    DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
    modelo.setRowCount(0);
    CitasDAO dao = new CitasDAO();
    try {
        ResultSet rs = dao.listarCitasPorEspecialidad("RESO");
        while (rs.next()) {
            modelo.addRow(new Object[] {
                rs.getString("hora"),
                rs.getString("paciente"),
                rs.getString("dni"),
                rs.getString("estudio"),
                rs.getString("obra_social"),
                rs.getString("importe"),
                rs.getString("contacto"),
                rs.getString("observaciones"),
                rs.getString("dado_por"),
                rs.getString("recepcionado_por")
            });
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al cargar tabla Kine: " + e.getMessage());
    }
}

public void exportarReportesPDF() {

    JFileChooser chooser = new JFileChooser();
    chooser.setSelectedFile(new java.io.File("reporte_citas.pdf"));

    if (chooser.showSaveDialog(this) != JFileChooser.APPROVE_OPTION) {
        return;
    }

    try {
        Document doc = new Document();
        PdfWriter.getInstance(doc, new FileOutputStream(chooser.getSelectedFile()));
        doc.open();

        doc.add(new Paragraph("REPORTE DE CITAS"));
        doc.add(new Paragraph(" "));
        
        PdfPTable tabla = new PdfPTable(10); // tus 10 columnas

        String[] headers = {
            "Hora", "Paciente", "DNI", "Estudio", "Obra Social",
            "Importe", "Contacto", "Observaciones", "Dado por", "Recepcionado por"
        };

        for (String h : headers) {
            tabla.addCell(h);
        }

        DefaultTableModel modelo = (DefaultTableModel) tblReportes.getModel();

        for (int i = 0; i < modelo.getRowCount(); i++) {
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                tabla.addCell(modelo.getValueAt(i, j).toString());
            }
        }

        doc.add(tabla);
        doc.close();

        JOptionPane.showMessageDialog(this, "PDF exportado correctamente");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al exportar PDF");
        e.printStackTrace();
    }
}


private void cargarTablaEco() {
    DefaultTableModel modelo = (DefaultTableModel) jTable3.getModel();
    modelo.setRowCount(0);
    CitasDAO dao = new CitasDAO();
    try {
        ResultSet rs = dao.listarCitasPorEspecialidad("ECO");
        while (rs.next()) {
            modelo.addRow(new Object[] {
                rs.getString("hora"),
                rs.getString("paciente"),
                rs.getString("dni"),
                rs.getString("estudio"),
                rs.getString("obra_social"),
                rs.getString("importe"),
                rs.getString("contacto"),
                rs.getString("observaciones"),
                rs.getString("dado_por"),
                rs.getString("recepcionado_por")
            });
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al cargar tabla Kine: " + e.getMessage());
    }
}
private String obtenerColumnaBD(String seleccion) {
    switch (seleccion) {
        case "Hora": return "hora";
        case "Paciente": return "paciente";
        case "DNI": return "dni";
        case "Estudio": return "estudio";
        case "Obra Social": return "obra_social";
        case "Recepcionado por": return "recepcionado_por";
        default: return "Todos";
    }
}

public void cargarReportes(String columna, String valor) {

    DefaultTableModel modelo = (DefaultTableModel) tblReportes.getModel();
    modelo.setRowCount(0);

    String sql = "SELECT * FROM citas";

    if (!columna.equals("Todos")) {
        sql += " WHERE " + columna + " LIKE ?";
    }

    try {
        Conexion con = new Conexion();
        Connection cn = con.getConnection();
        PreparedStatement ps = cn.prepareStatement(sql);

        if (!columna.equals("Todos")) {
            ps.setString(1, "%" + valor + "%");
        }

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            modelo.addRow(new Object[]{
                rs.getString("hora"),
                rs.getString("paciente"),
                rs.getString("dni"),
                rs.getString("estudio"),
                rs.getString("obra_social"),
                rs.getString("importe"),
                rs.getString("contacto"),
                rs.getString("observaciones"),
                rs.getString("dado_por"),
                rs.getString("recepcionado_por")
            });
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al cargar reportes");
        e.printStackTrace();
    }
}



private void cargarTablaTrauma() {
    DefaultTableModel modelo = (DefaultTableModel) jTable4.getModel();
    modelo.setRowCount(0);
    CitasDAO dao = new CitasDAO();
    try {
        ResultSet rs = dao.listarCitasPorEspecialidad("TRAUMA");
        while (rs.next()) {
            modelo.addRow(new Object[] {
                rs.getString("hora"),
                rs.getString("paciente"),
                rs.getString("dni"),
                rs.getString("estudio"),
                rs.getString("obra_social"),
                rs.getString("importe"),
                rs.getString("contacto"),
                rs.getString("observaciones"),
                rs.getString("dado_por"),
                rs.getString("recepcionado_por")
            });
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al cargar tabla Kine: " + e.getMessage());
    }
}
    

    
    private void jLayeredPane2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane2MousePressed
        int xMouse = evt.getX();
        int yMouse = evt.getY();
    }//GEN-LAST:event_jLayeredPane2MousePressed

    private void jLayeredPane2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        int xMouse = 0;
        int yMouse = 0;
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jLayeredPane2MouseDragged

    private void btnexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexitMouseExited
        btnexit.setBackground(new Color (204,204,204));
    }//GEN-LAST:event_btnexitMouseExited

    private void btnexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnexitMouseClicked

    private void btnexitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexitMouseEntered
    }//GEN-LAST:event_btnexitMouseEntered

    private void btnKineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKineMouseEntered
        btnKine.setBackground(new Color (0,127,237));
    }//GEN-LAST:event_btnKineMouseEntered

    private void btnResoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResoMouseEntered
        btnReso.setBackground(new Color (0,127,237));
    }//GEN-LAST:event_btnResoMouseEntered

    private void btnTraumaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTraumaMouseEntered
        btnTrauma.setBackground(new Color (0,127,237));
    }//GEN-LAST:event_btnTraumaMouseEntered

    private void btnEcoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEcoMouseEntered
        btnEco.setBackground(new Color (0,127,237));
    }//GEN-LAST:event_btnEcoMouseEntered

    private void btnKineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKineMouseExited
        btnKine.setBackground(new Color (0,157,217));
    }//GEN-LAST:event_btnKineMouseExited

    private void btnTraumaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTraumaMouseExited
        btnTrauma.setBackground(new Color (0,157,217));
    }//GEN-LAST:event_btnTraumaMouseExited

    private void btnResoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResoMouseExited
        btnReso.setBackground(new Color (0,157,217));    }//GEN-LAST:event_btnResoMouseExited

    private void btnEcoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEcoMouseExited
        btnEco.setBackground(new Color (0,157,217));
    }//GEN-LAST:event_btnEcoMouseExited

    private void btnKineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKineMouseClicked
       tabMedical.setSelectedIndex(0);
    }//GEN-LAST:event_btnKineMouseClicked

    private void btnResoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResoMouseClicked
        tabMedical.setSelectedIndex(1);

    }//GEN-LAST:event_btnResoMouseClicked

    private void btnEcoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEcoMouseClicked
        tabMedical.setSelectedIndex(2);

    }//GEN-LAST:event_btnEcoMouseClicked

    private void btnTraumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTraumaMouseClicked
        tabMedical.setSelectedIndex(3);

    }//GEN-LAST:event_btnTraumaMouseClicked

    private void btnRepoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepoMouseClicked
        tabMedical.setSelectedIndex(4);

    }//GEN-LAST:event_btnRepoMouseClicked

    private void btnRepoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepoMouseEntered
        btnRepo.setBackground(new Color (0,127,237));
    }//GEN-LAST:event_btnRepoMouseEntered

    private void btnRepoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepoMouseExited
        btnRepo.setBackground(new Color (0,157,217));
    }//GEN-LAST:event_btnRepoMouseExited

    private void btnCitasKineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitasKineMouseClicked
        NuevaCitaDialog dialog = new NuevaCitaDialog(this, true, "KINE");
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
        
        cargarTablaKine();

    }//GEN-LAST:event_btnCitasKineMouseClicked

    private void btnCitasKineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitasKineMouseEntered
        btnCitasKine.setBackground(new Color (0,127,237));
    }//GEN-LAST:event_btnCitasKineMouseEntered

    private void btnCitasKineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitasKineMouseExited
        btnCitasKine.setBackground(new Color (0,157,217));
    }//GEN-LAST:event_btnCitasKineMouseExited

    private void btnCitasResoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitasResoMouseClicked
               NuevaCitaDialog dialog = new NuevaCitaDialog(this, true, "RESO");
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
        cargarTablaReso();
    }//GEN-LAST:event_btnCitasResoMouseClicked

    private void btnCitasResoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitasResoMouseEntered
       btnCitasReso.setBackground(new Color (0,127,237));
    }//GEN-LAST:event_btnCitasResoMouseEntered

    private void btnCitasResoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitasResoMouseExited
       btnCitasReso.setBackground(new Color (0,157,217));
    }//GEN-LAST:event_btnCitasResoMouseExited

    private void btnCitasEcoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitasEcoMouseClicked
        NuevaCitaDialog dialog = new NuevaCitaDialog(this, true,"ECO");
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
        cargarTablaEco();

    }//GEN-LAST:event_btnCitasEcoMouseClicked

    private void btnCitasEcoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitasEcoMouseEntered
        btnCitasEco.setBackground(new Color (0,127,237));
    }//GEN-LAST:event_btnCitasEcoMouseEntered

    private void btnCitasEcoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitasEcoMouseExited
        btnCitasEco.setBackground(new Color (0,157,217));
    }//GEN-LAST:event_btnCitasEcoMouseExited

    private void btnCitasTraumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitasTraumaMouseClicked
        NuevaCitaDialog dialog = new NuevaCitaDialog(this, true,"TRAUMA");
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
        cargarTablaTrauma();

    }//GEN-LAST:event_btnCitasTraumaMouseClicked

    private void btnCitasTraumaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitasTraumaMouseEntered
        btnCitasTrauma.setBackground(new Color (0,127,237));
    }//GEN-LAST:event_btnCitasTraumaMouseEntered

    private void btnCitasTraumaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitasTraumaMouseExited
        btnCitasTrauma.setBackground(new Color (0,157,217));
    }//GEN-LAST:event_btnCitasTraumaMouseExited

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
          
    String filtroSeleccionado = comboFiltro.getSelectedItem().toString();
    String valor = txtBuscar.getText().trim();
    String columna = obtenerColumnaBD(filtroSeleccionado);
    cargarReportes(columna, valor);

    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnExportarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportarMouseClicked

    private void btnExportarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportarMouseEntered

    private void btnExportarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportarMouseExited

    private void btnReiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReiniciarMouseClicked
     
    txtBuscar.setText("");
    comboFiltro.setSelectedIndex(0);
    cargarReportes("Todos", "");


    }//GEN-LAST:event_btnReiniciarMouseClicked

    private void btnReiniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReiniciarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReiniciarMouseEntered

    private void btnReiniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReiniciarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReiniciarMouseExited

    private void labelCitasReso2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCitasReso2MouseClicked
         exportarReportesPDF();
    }//GEN-LAST:event_labelCitasReso2MouseClicked

      
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnCitasEco;
    private javax.swing.JPanel btnCitasKine;
    private javax.swing.JPanel btnCitasReso;
    private javax.swing.JPanel btnCitasTrauma;
    private javax.swing.JPanel btnEco;
    private javax.swing.JPanel btnExportar;
    private javax.swing.JPanel btnKine;
    private javax.swing.JPanel btnReiniciar;
    private javax.swing.JPanel btnRepo;
    private javax.swing.JPanel btnReso;
    private javax.swing.JPanel btnTrauma;
    private javax.swing.JPanel btnexit;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JScrollBar jScrollBar3;
    private javax.swing.JScrollBar jScrollBar4;
    private javax.swing.JScrollBar jScrollBar5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel labelCitasEco;
    private javax.swing.JLabel labelCitasKine;
    private javax.swing.JLabel labelCitasReso;
    private javax.swing.JLabel labelCitasReso1;
    private javax.swing.JLabel labelCitasReso2;
    private javax.swing.JLabel labelCitasReso3;
    private javax.swing.JLabel labelCitasTrauma;
    private javax.swing.JLabel labelEco;
    private javax.swing.JLabel labelKine;
    private javax.swing.JLabel labelRepo;
    private javax.swing.JLabel labelReso;
    private javax.swing.JLabel labelTrauma;
    private javax.swing.JPanel panelEco;
    private javax.swing.JPanel panelKine;
    private javax.swing.JPanel panelRepo;
    private javax.swing.JPanel panelReso;
    private javax.swing.JPanel panelTrauma;
    private javax.swing.JTabbedPane tabMedical;
    private javax.swing.JScrollPane tableReportes;
    private javax.swing.JTable tblReportes;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
