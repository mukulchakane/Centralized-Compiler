
package tcServer;
import JavaLib.LoadForm;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*; 
import java.util.*;
import java.io.*;
import javax.swing.event.*;
import tc_Pack.*;

public class View_Code extends javax.swing.JFrame {
    MainForm parent;
    String currentCodeFile;
    
    public View_Code(MainForm parent) {
        initComponents();
        this.parent = parent;
        setVisible(true);
        Dimension sd  = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(sd.width / 2 - this.getWidth()/ 2, sd.height / 2 - this.getHeight()/ 2);      
        
        jComboClient.removeAllItems();
        for(int i=0;i<parent.clientDB.allClients.size();i++) {
            jComboClient.addItem(parent.clientDB.allClients.get(i).clientNo + " - " + parent.clientDB.allClients.get(i).userAlias);
        }
        
        currentCodeFile = "";
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">                          
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboClient = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextCode = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jComboCodes = new javax.swing.JComboBox();
        jLabelStatus = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //new LoadForm();
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setText("CENTRALISED COMPILER  - VIEW CLIENT CODE");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("SELECT CLIENT #");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jComboClient.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboClient.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboClientItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("SELECT MAIN ");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextCode.setColumns(20);
        jTextCode.setFont(new java.awt.Font("Courier", 0, 12));
        jTextCode.setRows(5);
        jScrollPane1.setViewportView(jTextCode);

        jButton2.setText("F E T C H    C O D E ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboCodes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelStatus.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelStatus.setForeground(new java.awt.Color(204, 0, 0));
        jLabelStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStatus.setText("STATUS");
        jLabelStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jButton3.setText("R E F R E S H    C L I E N T    C O D E");

        jButton4.setText("D E L E T E    C O D E");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("U P D A T E    C O D E");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setText("B A C K");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setText("P R I N T");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                    .add(jLabelStatus, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jComboCodes, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jComboClient, 0, 212, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jButton3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                            .add(jButton2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 146, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 146, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 27, Short.MAX_VALUE)
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 177, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(new java.awt.Component[] {jButton4, jButton5}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jComboClient, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jComboCodes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabelStatus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1)
                    .add(jButton4)
                    .add(jButton5)
                    .add(jButton6))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(new java.awt.Component[] {jComboClient, jLabel2, jLabel3}, org.jdesktop.layout.GroupLayout.VERTICAL);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
// TODO add your handling code here:
        PrintUtilities.printComponent(jTextCode,400,700,false);        
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
// TODO add your handling code here:
        if(currentCodeFile.equals("")) {
            setStatus("NO FILE LOADED.");
            return;
        }
        
        try {
            String code = jTextCode.getText();
            BufferedWriter bw = new BufferedWriter(new FileWriter(currentCodeFile));
            bw.write(code);
            bw.close();
            setStatus("CODE UPDATED");
        }catch(Exception e) {
            new TaskBox(this,"ERROR UPDATING CLIENT CODE","Exception: " + e).setVisible(true);
        }
        
    }                                        

    public void setStatus(String str) {
        jLabelStatus.setText(str);
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
// TODO add your handling code here:
        if(currentCodeFile.equals("")) {
            setStatus("NO FILE LOADED.");
            return;
        }
        
        try {
            new File(currentCodeFile).delete();
            setStatus("CLIENT CODE DELETED");
            currentCodeFile = "";
            jTextCode.setText("");
            refreshClientEntries();
        }catch(Exception e) {
            new TaskBox(this,"ERROR DELETING CLIENT CODE","Exception: " + e).setVisible(true);
        }
    }                                        

    private void jComboClientItemStateChanged(java.awt.event.ItemEvent evt) {                                              
// TODO add your handling code here:
        refreshClientEntries();
    }                                             

    public void refreshClientEntries() {
        int index = jComboClient.getSelectedIndex();
        if(index == -1) { return; }
        String fname = "C:\\TopCoder\\CodeDB\\CLIENT" + (index+1);
        File files[] = new File(fname).listFiles();
        jComboCodes.removeAllItems();
        for(int i=0;i<files.length;i++) {
            if(files[i].getName().endsWith(".java") || files[i].getName().endsWith(".c") || files[i].getName().endsWith(".cpp")) {
                jComboCodes.addItem(files[i].getName());
            }
        }
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
// TODO add your handling code here:
        int index = jComboCodes.getSelectedIndex();
        if(index==-1) {
            jTextCode.setText("");
            jLabelStatus.setText("No Code File Available!");
            currentCodeFile = "";
            return;
        }
        
        currentCodeFile = "C:\\TopCoder\\CodeDB\\CLIENT" + (jComboClient.getSelectedIndex()+1) + "\\" + (String)jComboCodes.getSelectedItem();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(currentCodeFile));
            String code = "", temp;
            while((temp=br.readLine())!=null) {
                code += temp + "\n";
            }
            br.close();
            jTextCode.setText(code);
            jLabelStatus.setText("CODE FILE: '" + (String)jComboCodes.getSelectedItem() + "' LOADED");
        }catch(Exception e) {
            jTextCode.setText("");
            jLabelStatus.setText("ERROR FETCHING CODE.");
            new TaskBox(this,"Error Fetching Code","Exception: " + e).setVisible(true);
            currentCodeFile = "";
        }
        
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
// TODO add your handling code here:
        setVisible(false);
        new MainForm().setVisible(true);
        
    }                                        
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboClient;
    private javax.swing.JComboBox jComboCodes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextCode;
    // End of variables declaration                   
    
}
