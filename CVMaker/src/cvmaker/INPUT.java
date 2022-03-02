package cvmaker;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class INPUT extends javax.swing.JFrame {

    static detail d;
    javax.swing.JFileChooser f;
    public INPUT() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        about = new javax.swing.JFrame();
        jPanel13 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        help = new javax.swing.JFrame();
        jPanel14 = new javax.swing.JPanel();
        lhelp = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        next1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tenth1 = new javax.swing.JTextField();
        tenth0 = new javax.swing.JTextField();
        tenth2 = new javax.swing.JTextField();
        tenth3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        twelve0 = new javax.swing.JTextField();
        twelve1 = new javax.swing.JTextField();
        twelve2 = new javax.swing.JTextField();
        twelve3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        graduate0 = new javax.swing.JTextField();
        graduate1 = new javax.swing.JTextField();
        graduate2 = new javax.swing.JTextField();
        graduate3 = new javax.swing.JTextField();
        next2 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        course0 = new javax.swing.JTextField();
        detail0 = new javax.swing.JTextField();
        course1 = new javax.swing.JTextField();
        detail1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        experience = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        next3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        academic = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        extra = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        next4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        project = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        skill = new javax.swing.JTextArea();
        next5 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        hobbies = new javax.swing.JTextArea();
        next6 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        about.setTitle("About");
        about.setBackground(new java.awt.Color(255, 255, 255));
        about.setLocation(new java.awt.Point(200, 120));
        about.setResizable(false);
        about.setSize(new java.awt.Dimension(519, 330));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setPreferredSize(new java.awt.Dimension(519, 300));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("<html><font face=\"Lucida Bright\" size=5>This is a <b>Professional CV Generating software</b>.<br>Just enter your qualification details and<br> a professional resume will be generated automatically<br> in <b>PDF</b> format.<br><br>Developed by :<br><ul type=\"disk\"><li><i>Sushank Pathak<li><i>Subhdeep Kushwaha</ul></font>");
        jLabel17.setToolTipText("");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout aboutLayout = new javax.swing.GroupLayout(about.getContentPane());
        about.getContentPane().setLayout(aboutLayout);
        aboutLayout.setHorizontalGroup(
            aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        aboutLayout.setVerticalGroup(
            aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );

        help.setTitle("Help");
        help.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        help.setLocation(new java.awt.Point(500, 250));
        help.setResizable(false);
        help.setSize(new java.awt.Dimension(400, 200));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        lhelp.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lhelp, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lhelp, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout helpLayout = new javax.swing.GroupLayout(help.getContentPane());
        help.getContentPane().setLayout(helpLayout);
        helpLayout.setHorizontalGroup(
            helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        helpLayout.setVerticalGroup(
            helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CV Generator");
        setLocation(new java.awt.Point(200, 70));
        setResizable(false);

        jLayeredPane1.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(959, 517));
        jPanel1.setMinimumSize(new java.awt.Dimension(959, 517));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(959, 517));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel1.setText("Full Name :");

        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel2.setText("Date of Birth :");

        dob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dobKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel3.setText("Contact number :");

        contact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel4.setText("Email Id :");

        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel5.setText("Address :");

        address.setColumns(20);
        address.setRows(5);
        address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addressKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(address);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cvmaker/Project Background 1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        next1.setText("SUBMIT");
        next1.setEnabled(false);
        next1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                next1MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("CV Maker v1.0 (Beta)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(97, 97, 97)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(next1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(231, 231, 231))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(325, 325, 325))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(28, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(next1)
                .addGap(102, 102, 102))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Personal Information", jPanel1);

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel6.setText("Class 10th :");

        tenth1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tenth1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tenth1KeyTyped(evt);
            }
        });

        tenth0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tenth0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tenth0KeyTyped(evt);
            }
        });

        tenth2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tenth2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tenth2KeyTyped(evt);
            }
        });

        tenth3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tenth3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tenth3KeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Institute Name");

        jLabel8.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Passing Board/");

        jLabel9.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Grade/Percentage");

        jLabel10.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Passing Year");

        jLabel11.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel11.setText("Class 12th :");

        twelve0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        twelve0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                twelve0KeyTyped(evt);
            }
        });

        twelve1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        twelve1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                twelve1KeyTyped(evt);
            }
        });

        twelve2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        twelve2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                twelve2KeyTyped(evt);
            }
        });

        twelve3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        twelve3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                twelve3KeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel12.setText("Graduation :");

        graduate0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        graduate0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                graduate0KeyTyped(evt);
            }
        });

        graduate1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        graduate1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                graduate1KeyTyped(evt);
            }
        });

        graduate2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        graduate2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                graduate2KeyTyped(evt);
            }
        });

        graduate3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        graduate3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                graduate3KeyTyped(evt);
            }
        });

        next2.setText("SUBMIT");
        next2.setEnabled(false);
        next2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                next2MouseClicked(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("University");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cvmaker/Project Background 1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(next2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(graduate0, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tenth0, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twelve0, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tenth1)
                                    .addComponent(twelve1)
                                    .addComponent(graduate1)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(graduate2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(twelve2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tenth2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tenth3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(twelve3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(graduate3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(187, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tenth3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenth2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenth0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twelve3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twelve2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twelve1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twelve0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(graduate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(graduate3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(graduate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(graduate0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(52, 52, 52)
                .addComponent(next2)
                .addGap(98, 98, 98))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Educational Information", jPanel2);

        jLabel13.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel13.setText("Professional Qualification :");

        jLabel14.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel14.setText("Professional Experience :");

        jLabel15.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel15.setText("Course");

        jLabel16.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel16.setText("Details");

        course0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        course0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                course0KeyTyped(evt);
            }
        });

        detail0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        detail0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                detail0KeyTyped(evt);
            }
        });

        course1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        course1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                course1KeyTyped(evt);
            }
        });

        detail1.setToolTipText("format : Institute,grade/CGPA,year of passing");
        detail1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        detail1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                detail1KeyTyped(evt);
            }
        });

        experience.setColumns(20);
        experience.setRows(5);
        experience.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(experience);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cvmaker/Project Background 1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        next3.setText("Submit");
        next3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                next3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(15, 15, 15))
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(601, 601, 601))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(next3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(course1)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(course0))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(detail1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(detail0, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(214, 214, 214))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detail0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(next3)
                .addGap(118, 118, 118))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Professional Information", jPanel3);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cvmaker/Project Background 1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel19.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel19.setText("Academic Achievements(if any) :");

        academic.setColumns(20);
        academic.setRows(5);
        academic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane3.setViewportView(academic);

        jLabel20.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel20.setText("Extra curricular Achievements(if any) :");

        extra.setColumns(20);
        extra.setRows(5);
        extra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane4.setViewportView(extra);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Tip:all achievements should be in point format separated by new lines");

        next4.setText("Submit");
        next4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                next4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 251, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(next4))
                .addGap(215, 215, 215))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel19))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel20))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel21)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(next4)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Achievements", jPanel4);

        jLabel22.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel22.setText("Projects(if any) :");

        project.setColumns(20);
        project.setRows(5);
        project.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane5.setViewportView(project);

        jLabel23.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel23.setText("Skill Set :");

        skill.setColumns(20);
        skill.setRows(5);
        skill.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        skill.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                skillKeyTyped(evt);
            }
        });
        jScrollPane6.setViewportView(skill);

        next5.setText("Submit");
        next5.setEnabled(false);
        next5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                next5MouseClicked(evt);
            }
        });
        next5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next5ActionPerformed(evt);
            }
        });

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cvmaker/Project Background 1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 71, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(next5)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                            .addComponent(jScrollPane6))
                        .addGap(217, 217, 217))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(next5)
                .addGap(96, 96, 96))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Projects and skill set", jPanel5);

        jLabel24.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel24.setText("Hobbies and Interests :");

        hobbies.setColumns(20);
        hobbies.setRows(5);
        hobbies.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hobbiesKeyTyped(evt);
            }
        });
        jScrollPane7.setViewportView(hobbies);

        next6.setText("Submit");
        next6.setEnabled(false);
        next6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                next6MouseClicked(evt);
            }
        });

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cvmaker/Project Background 1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(next6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(216, 216, 216))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(next6)
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Hobbies/Interests", jPanel7);

        jTabbedPane1.setEnabledAt(1,false);
        jTabbedPane1.setEnabledAt(2,false);
        jTabbedPane1.setEnabledAt(3,false);
        jTabbedPane1.setEnabledAt(4,false);
        jTabbedPane1.setEnabledAt(5,false);

        jLayeredPane1.add(jTabbedPane1, java.awt.BorderLayout.PAGE_START);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cvmaker/rsz_about.jpg"))); // NOI18N
        jMenu1.setText("About");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cvmaker/rsz_1help.png"))); // NOI18N
        jMenu2.setText("Help");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        this.check_personal();
    }//GEN-LAST:event_nameKeyTyped

    private void dobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dobKeyTyped
        this.check_personal();
    }//GEN-LAST:event_dobKeyTyped

    private void addressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressKeyTyped
        this.check_personal();
    }//GEN-LAST:event_addressKeyTyped

    private void next1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next1MouseClicked
        
        if(next1.isEnabled()==true){          
        d.adddetail(name.getText(),dob.getText(),contact.getText(),email.getText(),address.getText());
        jTabbedPane1.setEnabledAt(1,true);
        jTabbedPane1.setSelectedIndex(1);
        }
    }//GEN-LAST:event_next1MouseClicked
    
    private void tenth0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tenth0KeyTyped
        checkeducation();
    }//GEN-LAST:event_tenth0KeyTyped

    private void tenth1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tenth1KeyTyped
       checkeducation();
    }//GEN-LAST:event_tenth1KeyTyped

    private void tenth2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tenth2KeyTyped
       checkeducation();
    }//GEN-LAST:event_tenth2KeyTyped

    private void twelve0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_twelve0KeyTyped
        checkeducation();
    }//GEN-LAST:event_twelve0KeyTyped

    private void twelve1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_twelve1KeyTyped
        checkeducation();
    }//GEN-LAST:event_twelve1KeyTyped

    private void twelve2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_twelve2KeyTyped
        checkeducation();
    }//GEN-LAST:event_twelve2KeyTyped

    private void graduate0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_graduate0KeyTyped
       checkeducation();
    }//GEN-LAST:event_graduate0KeyTyped

    private void graduate1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_graduate1KeyTyped
        checkeducation();
    }//GEN-LAST:event_graduate1KeyTyped

    private void graduate2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_graduate2KeyTyped
        checkeducation();
    }//GEN-LAST:event_graduate2KeyTyped

    private void next2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next2MouseClicked
        if(next2.isEnabled()==true){
        d.adddetail(tenth0.getText(),tenth1.getText(),tenth2.getText(),tenth3.getText(),twelve0.getText(),twelve1.getText(),twelve2.getText(),twelve3.getText(),graduate0.getText(),graduate1.getText(),graduate2.getText(),graduate3.getText());
        jTabbedPane1.setEnabledAt(2,true);
        jTabbedPane1.setSelectedIndex(2);}
    }//GEN-LAST:event_next2MouseClicked

    private void next3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next3MouseClicked
        if(next3.isEnabled()==true){
        d.adddetail(1,course0.getText(),detail0.getText(),course1.getText(),detail1.getText(),experience.getText());
        jTabbedPane1.setEnabledAt(3,true);
        jTabbedPane1.setSelectedIndex(3);
        }
    }//GEN-LAST:event_next3MouseClicked

    private void next5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next5MouseClicked
        if(next5.isEnabled()==true){
        d.adddetail(project.getText(),skill.getText());
        jTabbedPane1.setEnabledAt(5,true);
        jTabbedPane1.setSelectedIndex(5);
        }
    }//GEN-LAST:event_next5MouseClicked

    private void skillKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_skillKeyTyped
        checkproj();
    }//GEN-LAST:event_skillKeyTyped

    private void next4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next4MouseClicked
        if(next4.isEnabled()==true){
        d.adddetail(1,academic.getText(),extra.getText());
        jTabbedPane1.setEnabledAt(4,true);
        jTabbedPane1.setSelectedIndex(4);}
    }//GEN-LAST:event_next4MouseClicked

    private void next6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next6MouseClicked
        if(next6.isEnabled() ==true){
        d.adddetail(hobbies.getText());
        f=new javax.swing.JFileChooser();
        f.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        f.showSaveDialog(null);
        File path=f.getSelectedFile();
        String p=path+"";
        if(!p.equals("null"))
        {
            this.setVisible(false);
            print pr=new print(d,p);
        }
        }
    }//GEN-LAST:event_next6MouseClicked

    private void tenth3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tenth3KeyTyped
        checkeducation();
    }//GEN-LAST:event_tenth3KeyTyped

    private void twelve3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_twelve3KeyTyped
        checkeducation();
    }//GEN-LAST:event_twelve3KeyTyped

    private void graduate3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_graduate3KeyTyped
        checkeducation();
    }//GEN-LAST:event_graduate3KeyTyped

    private void contactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactKeyTyped
        this.check_personal();
    }//GEN-LAST:event_contactKeyTyped

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        about.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        String help1="";
        if(jTabbedPane1.getSelectedIndex()==0){
            help1="<html><body valign=\"top\"><font face=\"Lucida Bright\" size=3>Submit button will be enabled only after <b>all</b> fields are filled.<br>Formats are:<br>DOB - dd/mm/yyyy<br>Email - xyz@abc.*";
        }
        else if(jTabbedPane1.getSelectedIndex()==1){
            help1="<html><body valign=\"top\"><font face=\"Lucida Bright\" size=3>All the fields are necessary.<br>Formats are:<br>Passing year - yyyy<br>Percentage is out of 100.<br>Grade is scaled to 10 points.";
        }
        else if(jTabbedPane1.getSelectedIndex()==2){
            help1="<html><body valign=\"top\"><font face=\"Lucida Bright\" size=3>Profesional Qualification and Experience are both optional.<br>For Professional Quaification, If the course name is provided then the associated details of that course should also be provided.<br>Professional Experiences should be seperated by new line.";
        }
        else if(jTabbedPane1.getSelectedIndex()==3){
            help1="<html><body valign=\"top\"><font face=\"Lucida Bright\" size=3>Academic achievements and Extra curricular achievements are both optional.<br>For both the fields,the achievements should be entered seperated by new line.";
        }
        else if(jTabbedPane1.getSelectedIndex()==4){
            help1="<html><body valign=\"top\"><font face=\"Lucida Bright\" size=3>Projects are optional.<br> Skill Set is necessary.<br>All the skills and projects should be in new line.";
        }
        else if(jTabbedPane1.getSelectedIndex()==5){
            help1="<html><body valign=\"top\"><font face=\"Lucida Bright\" size=3>Finally enter your Hobbies/Interests and you are all set to generate your CV";
        }
        lhelp.setText(help1);
        help.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void course0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_course0KeyTyped
        next6check();
    }//GEN-LAST:event_course0KeyTyped

    private void detail0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_detail0KeyTyped
        next6check();
    }//GEN-LAST:event_detail0KeyTyped
    void next6check()
    {
        if(!detail0.getText().equals("")&&!course0.getText().equals("")&&!detail1.getText().equals("")&&!course1.getText().equals(""))
        {
            next3.setEnabled(true);
        }
        else if(!detail0.getText().equals("")&&!course0.getText().equals("")&&detail1.getText().equals("")&&course1.getText().equals(""))
        {
            next3.setEnabled(true);
        }
        else if(detail0.getText().equals("")&&course0.getText().equals("")&&!detail1.getText().equals("")&&!course1.getText().equals(""))
        {
            next3.setEnabled(true);
        }
        else if(detail0.getText().equals("")&&course0.getText().equals("")&&detail1.getText().equals("")&&course1.getText().equals(""))
        {
            next3.setEnabled(true);
        }
        else
            next3.setEnabled(false);
    }
    private void course1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_course1KeyTyped
        next6check();
    }//GEN-LAST:event_course1KeyTyped

    private void detail1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_detail1KeyTyped
        next6check();
    }//GEN-LAST:event_detail1KeyTyped

    private void hobbiesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hobbiesKeyTyped
        if(!hobbies.getText().equals(""))
        {
            next6.setEnabled(true);
            return;
        }
        next6.setEnabled(false);
    }//GEN-LAST:event_hobbiesKeyTyped

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped
        check_personal();
    }//GEN-LAST:event_emailKeyTyped

    private void next5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_next5ActionPerformed
    void checkprof()
    {
        if(!(course0.getText().equals(""))){
            if(!(course1.getText().equals(""))){
                if(!(detail0.getText().equals(""))){
                    if(!(detail1.getText().equals(""))){
                        if(!(experience.getText().equals("")))
                        {
                            next3.setEnabled(true);
                            return;
                        }}}}}
        next3.setEnabled(false);
    }
    void checkproj()
    {
        if(!(skill.getText().equals("")))
        {
            next5.setEnabled(true);
            return;
        }
        next5.setEnabled(false);
    }
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(INPUT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INPUT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INPUT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INPUT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                d=new detail();
                new INPUT().setVisible(true);
            }
        });
    }
    public void checkeducation()
    {
        if(!tenth0.getText().equals("")){
            if(!tenth1.getText().equals("")){
                if(!tenth2.getText().equals("")){
                    if(!tenth3.getText().equals("")){
                        if(!twelve0.getText().equals("")){
                            if(!twelve1.getText().equals("")){
                                if(!twelve2.getText().equals("")){
                                        if(!twelve3.getText().equals("")){
                                            if(!graduate0.getText().equals("")){
                                                if(!graduate1.getText().equals("")){
                                                    if(!graduate2.getText().equals("")){
                                                        if(!graduate3.getText().equals(""))
                                                        {
                                                            Pattern p1 = Pattern.compile("[0-9]+");
                                                            Matcher m1 = p1.matcher(twelve3.getText());
                                                            Matcher m2 = p1.matcher(tenth3.getText());
                                                            Matcher m3 = p1.matcher(graduate3.getText());
                                                            if(m1.matches() && m2.matches() && m3.matches()){
                                                            next2.setEnabled(true);  
                                                            return;
                                                            }
                                                            
                                                            
                                                        }}}}}}}}}}}}
        next2.setEnabled(false);
    }
    public void check_personal()
    {
        if(!name.getText().equals(""))
        {
            
            if(!dob.getText().equals(""))
            {
                
                if(!contact.getText().equals(""))
                {
                    
                    if(!email.getText().equals(""))
                    {
                        
                        if(!address.getText().equals(""))
                        {
                            Pattern p1 = Pattern.compile("[0-9/]+");
                            Pattern p2 = Pattern.compile("[0-9]+");
                            Matcher m1,m2;
                            m1 = p1.matcher(dob.getText());
                            m2 = p2.matcher(contact.getText());
                            if(m1.matches()){
                                if(m2.matches()){
                            next1.setEnabled(true);
                            return;
                                }
                            }
                        }
                    }
                }
            }
        }
        next1.setEnabled(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame about;
    private javax.swing.JTextArea academic;
    private javax.swing.JTextArea address;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField course0;
    private javax.swing.JTextField course1;
    private javax.swing.JTextField detail0;
    private javax.swing.JTextField detail1;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextArea experience;
    private javax.swing.JTextArea extra;
    private javax.swing.JTextField graduate0;
    private javax.swing.JTextField graduate1;
    private javax.swing.JTextField graduate2;
    private javax.swing.JTextField graduate3;
    private javax.swing.JFrame help;
    private javax.swing.JTextArea hobbies;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lhelp;
    private javax.swing.JTextField name;
    private javax.swing.JButton next1;
    private javax.swing.JButton next2;
    private javax.swing.JButton next3;
    private javax.swing.JButton next4;
    private javax.swing.JButton next5;
    private javax.swing.JButton next6;
    private javax.swing.JTextArea project;
    private javax.swing.JTextArea skill;
    private javax.swing.JTextField tenth0;
    private javax.swing.JTextField tenth1;
    private javax.swing.JTextField tenth2;
    private javax.swing.JTextField tenth3;
    private javax.swing.JTextField twelve0;
    private javax.swing.JTextField twelve1;
    private javax.swing.JTextField twelve2;
    private javax.swing.JTextField twelve3;
    // End of variables declaration//GEN-END:variables
}
