/*
 * MainForm.java
 *
 * 
 */

package tcClient;
//import JavaLib.LoadForm;
import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.*;
import tc_Pack.*;

public class MainF extends javax.swing.JFrame {
    ClientDB clientDB;
    String externalEditor;
    CodeOb co;
   /* public static void main(String args[])
    {
        ClientDB clientDB1=new ClientDB();
    MainForm mn=new MainForm(clientDB1);
    mn.setVisible(true);
    
    }*/
    public MainF(ClientDB clientDB) {
        initComponents();
        setVisible(true);
        Dimension sd  = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(sd.width / 2 - this.getWidth()/ 2, sd.height / 2 - this.getHeight()/ 2);
        
        this.clientDB = clientDB;
        jLabelMain.setText("CENTRALISED COMPILER - Welcome " + clientDB.allClients.get(clientDB.currentClient-1).userAlias);
        externalEditor = "C:\\Program Files\\Xinox Software\\JCreatorV5LE\\JCreator.exe";
        
        externalEditor = "C:\\Program Files\\Notepad++\\notepad++.exe";
        loadExternalEditor();
        
    }
    
    public void loadExternalEditor() {
        String editor = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("EDITOR.PATH"));
            String temp;
            while( (temp=br.readLine()) != null) {
                editor += temp;
            }
            br.close();
        }catch(Exception e) {
            System.out.println("Exception Reading File: " + e);
        }
        externalEditor = editor;
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">                          
    private void initComponents() {
        buttonGroup1 = new javax.swing.ButtonGroup();
       // new LoadForm();

        jPanel1 = new javax.swing.JPanel();
        jLabelMain = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextCode = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jTextMainClass = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jRadioJava = new javax.swing.JRadioButton();
        jRadioC = new javax.swing.JRadioButton();
        jLabelStatus = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextServer = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CLIENT _MAIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(255, 255, 255)));
        jLabelMain.setFont(new java.awt.Font("Arial", 1, 14));
        jLabelMain.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMain.setText("CENTRALISED COMPILER - ");
        jLabelMain.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton3.setText("FETCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton5.setText("UPLOAD");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton6.setText("COMPILE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(102, 102, 102));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton7.setText("EXECUTE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(102, 102, 102));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton13.setText("COPY FROM");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(102, 102, 102));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton8.setText("SAVE TO");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jButton3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton7)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jButton13)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton8)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(new java.awt.Component[] {jButton13, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton3)
                    .add(jButton4)
                    .add(jButton5)
                    .add(jButton6)
                    .add(jButton7)
                    .add(jButton13)
                    .add(jButton8))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextCode.setColumns(20);
        jTextCode.setRows(5);
        jScrollPane1.setViewportView(jTextCode);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MAIN:");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextMainClass.setText("MainClass");

        jButton9.setBackground(new java.awt.Color(51, 51, 51));
        jButton9.setText("SAVE");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(51, 51, 51));
        jButton12.setText("LOAD");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jRadioJava.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(jRadioJava);
        jRadioJava.setForeground(new java.awt.Color(204, 204, 204));
        jRadioJava.setSelected(true);
        jRadioJava.setText("Java");
        jRadioJava.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioJava.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jRadioC.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(jRadioC);
        jRadioC.setForeground(new java.awt.Color(204, 204, 204));
        jRadioC.setText("C/C++");
        jRadioC.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioC.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabelStatus.setFont(new java.awt.Font("Arial", 1, 12));
        jLabelStatus.setForeground(new java.awt.Color(0, 255, 0));
        jLabelStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelStatus.setText("STATUS");
        jLabelStatus.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SERVER NAME:");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextServer.setText("MUKUL-PC");

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelStatus, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel5Layout.createSequentialGroup()
                        .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTextMainClass, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 193, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton9)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton12)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTextServer, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jRadioJava)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jRadioC)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jRadioJava)
                    .add(jRadioC)
                    .add(jLabel2)
                    .add(jTextMainClass, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton12)
                    .add(jButton9)
                    .add(jLabel3)
                    .add(jTextServer, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabelStatus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton1.setText("LOG OFF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton2.setText("FETCH TASK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(51, 51, 51));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton10.setText("EXT. EDITOR");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(51, 51, 51));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton11.setText("SET EDITOR");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabelMain, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 114, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 114, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 310, Short.MAX_VALUE)
                        .add(jButton11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 114, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabelMain, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1)
                    .add(jButton2)
                    .add(jButton10)
                    .add(jButton11)))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
    }// </editor-fold>                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
// TODO add your handling code here:
        prepareCodeOb();
        if(jRadioJava.isSelected()) {
            co.toDo = 4; // execute java
            setStatus("Java Execution Session Called");
            if(!transact()) { // if server down
                return;
            }
            if(co.toDo == 401) { // ok
                new TaskBox(this,"PROGRAM OUTPUT",co.returnString).setVisible(true);
            }else {
                new TaskBox(this,"ERROR EXECUTING CODE",co.returnString).setVisible(true);
            }
        }
        else {
            co.toDo = 14; // execute c
            setStatus("C Execution Session Called");
            if(!transact()) { // if server down
                return;
            }
            if(co.toDo == 1401) { // ok
                new TaskBox(this,"PROGRAM OUTPUT",co.returnString).setVisible(true);
            }else {
                new TaskBox(this,"ERROR EXECUTING CODE",co.returnString).setVisible(true);
            }
        }
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
// TODO add your handling code here:
        prepareCodeOb();
        if(jRadioJava.isSelected()) {
            co.toDo = 3; // compile java
            setStatus("Java Compilation Session Called");
            if(!transact()) { // if server down
                return;
            }
            if(co.toDo == 301) { // ok
                new TaskBox(this,"COMPILER OUTPUT",co.returnString).setVisible(true);
            }else {
                new TaskBox(this,"ERROR COMPILING CODE",co.returnString).setVisible(true);
            }
        }
        else {
            co.toDo = 13; // compile c
            setStatus("C Compilation Session Called");
            if(!transact()) { // if server down
                return;
            }
            if(co.toDo == 1301) { // ok
                new TaskBox(this,"COMPILER OUTPUT",co.returnString).setVisible(true);
            }else {
                new TaskBox(this,"ERROR COMPILING CODE",co.returnString).setVisible(true);
            }
        }
    }                                        

    public void setStatus(String str) {
        Calendar c = Calendar.getInstance();
        String refreshTime = c.get(c.HOUR) + ":" + c.get(c.MINUTE) + ":" + c.get(c.SECOND) + " >> ";
        jLabelStatus.setText(refreshTime + str);
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
// TODO add your handling code here:
        prepareCodeOb();
        
        if(jRadioJava.isSelected()) {
            co.toDo = 2; // fetch java
            if(!transact()) { // if server down
                return;
            }
            if(co.toDo == 201) { // ok
                jTextCode.setText(co.code);
                setStatus("Code For [" + co.mainClass + "] Downloaded.");
            }else {
                new TaskBox(this,"ERROR FETCHING CODE.",co.returnString).setVisible(true);
            }
        }
        else {
            co.toDo = 12; // fetch c
            if(!transact()) { // if server down
                return;
            }
            if(co.toDo == 1201) { // ok
                jTextCode.setText(co.code);
                setStatus("Code For [" + co.mainClass + "] Downloaded.");
            }else {
                new TaskBox(this,"ERROR FETCHING CODE.",co.returnString).setVisible(true);
            }
        }
        
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
// TODO add your handling code here:
        prepareCodeOb();
        if(jRadioJava.isSelected()) {
            co.toDo = 1; // upload java
            if(!transact()) { // if server down
                return;
            }
            if(co.toDo == 101) { // ok
                jTextCode.setText(co.code);
                setStatus("Code For [" + co.mainClass + "] Uploaded.");
            }else {
                new TaskBox(this,"ERROR FETCHING CODE.",co.returnString).setVisible(true);
            }
        }
        else {
            co.toDo = 11; // fetch c
            if(!transact()) { // if server down
                return;
            }
            if(co.toDo == 1101) { // ok
                jTextCode.setText(co.code);
                setStatus("Code For [" + co.mainClass + "] Uploaded.");
            }else {
                new TaskBox(this,"ERROR FETCHING CODE.",co.returnString).setVisible(true);
            }
        }
    }                                        

    public void prepareCodeOb() {
        co = new CodeOb();
        co.clientNo = clientDB.currentClient;
        co.code = jTextCode.getText();
        co.mainClass = jTextMainClass.getText();
    }
    
    public boolean transact() {
        
        
        try{
            String urlstr = "http://" + jTextServer.getText() + ":8084/servlets-examples/servlet/TCMain";
            URL url = new URL(urlstr);
            URLConnection connection = url.openConnection();

            connection.setDoOutput(true);
            connection.setDoInput(true);

            // don't use a cached version of URL connection
            connection.setUseCaches(false);
            connection.setDefaultUseCaches(false);
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            
            // write object to servlet
            ObjectOutputStream out = new ObjectOutputStream(connection.getOutputStream());
            out.writeObject(co);
            out.close();
            
            // read object from servlet
            ObjectInputStream in = new ObjectInputStream(connection.getInputStream());
            co = (CodeOb)in.readObject();
            in.close();
            
            return true;
        }catch(Exception e) {
            new MessageBox(this,"Error Transacting With Server!").setVisible(true);
            System.out.println("Exception: " + e);
            return false;
        }
        
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
// TODO add your handling code here:
        jTextCode.setText("");
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
// TODO add your handling code here:
        String code, fname;
        FileDialog fd = new FileDialog(this,"SELECT FILE TO SAVE TO",FileDialog.SAVE);
        fd.setVisible(true);
        if(fd.getFile()==null) {
            return;
        }
        
        code = jTextCode.getText();
        fname = fd.getDirectory() + fd.getFile();
        
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fname));
            out.write(code);
            out.close();
        }catch(Exception e) {
            System.out.println("Error Writing File. " + e);
        }
    }                                        

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
// TODO add your handling code here:
        String code, fname;
        FileDialog fd = new FileDialog(this,"SELECT FILE TO COPY FROM",FileDialog.LOAD);
        fd.setVisible(true);
        if(fd.getFile()==null) {
            return;
        }
        
        fname = fd.getDirectory() + fd.getFile();
        code = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader(fname));
            String temp;
            while((temp = in.readLine())!=null) {
                code += temp + "\n";
            }
            in.close();
            jTextCode.setText(code);
        }catch(Exception e) {
            System.out.println("Error Reading File. " + e);
        }        
    }                                         

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
// TODO add your handling code here:
        String code, fname;
        fname = "C:\\TopCoder\\Temp\\" + jTextMainClass.getText() + ".java";
        code = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader(fname));
            String temp;
            while((temp = in.readLine())!=null) {
                code += temp + "\n";
            }
            in.close();
            jTextCode.setText(code);
        }catch(Exception e) {
            System.out.println("Error Reading File. " + e);
        }
    }                                         

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
// TODO add your handling code here:
        String code, fname;
        code = jTextCode.getText();
        fname = "C:\\TopCoder\\Temp\\" + jTextMainClass.getText() + ".java";
        
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fname));
            out.write(code);
            out.close();
        }catch(Exception e) {
            System.out.println("Error Writing File. " + e);
        }
        
    }                                        

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
// TODO add your handling code here:
        FileDialog fd = new FileDialog(this,"SELECT EXTERNAL EDITOR",FileDialog.LOAD);
        fd.setVisible(true);
        if(fd.getFile()==null ) {
            return;
        }
        
        externalEditor = fd.getDirectory() + fd.getFile();
        
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("EDITOR.PATH"));
            bw.write(externalEditor);
            bw.close();
        }catch(Exception e) {
            System.out.println("Exception Saving Editor: " + e);
        }
        
    }                                         

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
// TODO add your handling code here:
        String code, fname;
        code = jTextCode.getText();
        fname = "C:\\TopCoder\\Temp\\" + jTextMainClass.getText() + ".java";
        
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fname));
            out.write(code);
            out.close();
            
            new ProcessBuilder(externalEditor,fname).start();
        }catch(Exception e) {
            System.out.println("Error Writing File. " + e);
        }
    }                                         

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
// TODO add your handling code here:
        TaskBox tb = new TaskBox(this," TASK DESCRIPTION ",clientDB.allClients.get(clientDB.currentClient-1).task);
        tb.setVisible(true);
    }                                        
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
// TODO add your handling code here:
        setVisible(false);
        new Login().setVisible(true);
    }                                        

    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelMain;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioC;
    private javax.swing.JRadioButton jRadioJava;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextCode;
    private javax.swing.JTextField jTextMainClass;
    private javax.swing.JTextField jTextServer;
    // End of variables declaration                   
    }