package clientv4;

import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * @author James
 * 08/04/2019
 * A Client-Server application that allows the storage, retrieval, display and manipulation of data
 * using a SQL database. Zoo Register.
 */

/*
*This class house all 4 event button methods for the admins to either add an animal
*or species, or delete an animal or species. This class is only accessible to users
*who have admin usernames or passwords.
*/
public class adminScreen extends javax.swing.JFrame {

    /**
     * Creates new form adminScreen
     */
    cliConn connection = new cliConn();
    
    public adminScreen() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnAniAdd = new javax.swing.JButton();
        lblAnimalName = new javax.swing.JLabel();
        lblAnimalDescription = new javax.swing.JLabel();
        lblSpeciesID = new javax.swing.JLabel();
        txtfAddAniName = new javax.swing.JTextField();
        txtfAddAniDesc = new javax.swing.JTextField();
        txtfAddAniSpecID = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnSpecAdd = new javax.swing.JButton();
        lblSpeciesName = new javax.swing.JLabel();
        lblSpeciesID1 = new javax.swing.JLabel();
        txtfAddSpecName = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnSpeciDelete = new javax.swing.JButton();
        lblDelSpecName = new javax.swing.JLabel();
        txtfSpecToDel = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnAniDelete = new javax.swing.JButton();
        lblDelAniName = new javax.swing.JLabel();
        txtfAniToDel = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(149, 205, 133));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(78, 197, 255));
        jLabel1.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(78, 197, 255));
        jLabel1.setText("The Animal Table");

        jSeparator1.setForeground(new java.awt.Color(78, 197, 255));

        btnAniAdd.setBackground(new java.awt.Color(149, 205, 133));
        btnAniAdd.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        btnAniAdd.setForeground(new java.awt.Color(168, 136, 108));
        btnAniAdd.setText("Add");
        btnAniAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAniAddActionPerformed(evt);
            }
        });

        lblAnimalName.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        lblAnimalName.setForeground(new java.awt.Color(168, 136, 108));
        lblAnimalName.setText("Name");

        lblAnimalDescription.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        lblAnimalDescription.setForeground(new java.awt.Color(168, 136, 108));
        lblAnimalDescription.setText("Description");

        lblSpeciesID.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        lblSpeciesID.setForeground(new java.awt.Color(168, 136, 108));
        lblSpeciesID.setText("Species ID");

        txtfAddAniName.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N

        txtfAddAniDesc.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N

        txtfAddAniSpecID.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btnAniAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAnimalName)
                            .addComponent(lblAnimalDescription)
                            .addComponent(lblSpeciesID))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfAddAniName, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfAddAniDesc)
                            .addComponent(txtfAddAniSpecID))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnimalName)
                    .addComponent(txtfAddAniName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfAddAniDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnimalDescription))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpeciesID)
                    .addComponent(txtfAddAniSpecID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnAniAdd)
                .addContainerGap())
        );

        lblAnimalName.getAccessibleContext().setAccessibleDescription("");
        lblSpeciesID.getAccessibleContext().setAccessibleDescription("");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(78, 197, 255));
        jLabel2.setText("The Species Table");

        jSeparator2.setForeground(new java.awt.Color(78, 197, 255));

        btnSpecAdd.setBackground(new java.awt.Color(149, 205, 133));
        btnSpecAdd.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        btnSpecAdd.setForeground(new java.awt.Color(168, 136, 108));
        btnSpecAdd.setText("Add");
        btnSpecAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpecAddActionPerformed(evt);
            }
        });

        lblSpeciesName.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        lblSpeciesName.setForeground(new java.awt.Color(168, 136, 108));
        lblSpeciesName.setText("Species' Name:");

        lblSpeciesID1.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        lblSpeciesID1.setForeground(new java.awt.Color(168, 136, 108));
        lblSpeciesID1.setText("Species' ID:");

        txtfAddSpecName.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSpeciesName)
                            .addComponent(lblSpeciesID1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfAddSpecName, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(jTextField5)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSpecAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpeciesName)
                    .addComponent(txtfAddSpecName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpeciesID1)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSpecAdd)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Insert Data", jPanel2);

        jPanel3.setBackground(new java.awt.Color(149, 205, 133));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(78, 197, 255));
        jLabel3.setText("The Species Table");

        jSeparator3.setForeground(new java.awt.Color(78, 197, 255));

        btnSpeciDelete.setBackground(new java.awt.Color(149, 205, 133));
        btnSpeciDelete.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        btnSpeciDelete.setForeground(new java.awt.Color(168, 136, 108));
        btnSpeciDelete.setText("Delete");
        btnSpeciDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeciDeleteActionPerformed(evt);
            }
        });

        lblDelSpecName.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        lblDelSpecName.setForeground(new java.awt.Color(168, 136, 108));
        lblDelSpecName.setText("Species' Name:");

        txtfSpecToDel.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        txtfSpecToDel.setForeground(new java.awt.Color(78, 197, 255));
        txtfSpecToDel.setBorder(null);
        txtfSpecToDel.setCaretColor(new java.awt.Color(78, 197, 255));
        txtfSpecToDel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jSeparator6.setForeground(new java.awt.Color(78, 197, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSpeciDelete)
                                    .addComponent(lblDelSpecName))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtfSpecToDel)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDelSpecName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSpeciDelete)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtfSpecToDel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        btnSpeciDelete.getAccessibleContext().setAccessibleName("DEelete");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(78, 197, 255));
        jLabel4.setText("The Animal Table");

        jSeparator4.setForeground(new java.awt.Color(78, 197, 255));

        btnAniDelete.setBackground(new java.awt.Color(149, 205, 133));
        btnAniDelete.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        btnAniDelete.setForeground(new java.awt.Color(168, 136, 108));
        btnAniDelete.setText("Delete");
        btnAniDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAniDeleteActionPerformed(evt);
            }
        });

        lblDelAniName.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        lblDelAniName.setForeground(new java.awt.Color(168, 136, 108));
        lblDelAniName.setText("Animal's Name:");

        txtfAniToDel.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        txtfAniToDel.setForeground(new java.awt.Color(78, 197, 255));
        txtfAniToDel.setBorder(null);
        txtfAniToDel.setCaretColor(new java.awt.Color(78, 197, 255));
        txtfAniToDel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jSeparator5.setForeground(new java.awt.Color(78, 197, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addComponent(jLabel4)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDelAniName, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAniDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfAniToDel, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addComponent(jSeparator5))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDelAniName)
                    .addComponent(txtfAniToDel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(btnAniDelete)
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(304, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Delete Data", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addContainerGap())
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

    /*
    *The below method is an Event method that runs to take an input from the user, 
    *ensure that there is an input, run it against a mathces method via the Pattern
    *class, and once all is true it then executes the corresponding method in CliConn, 
    *in this case it's the method that deletes the animal that is entered by the
    *user.
    */
    private void btnAniDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAniDeleteActionPerformed
        cliConn deleteAnimal = new cliConn();
        deleteAnimal.connectTheServer();
        String animal  = txtfAniToDel.getText();
        String result;
        
        if(animal.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the name of the animal you wish to delete.");
        } else {
            boolean matches = Pattern.matches("^[a-zA-Z]+\\s*[a-zA-Z]$", animal);
            if(matches) {
               result = deleteAnimal.deleteAnimal(animal);
               if (result.equals("true")) {
                   JOptionPane.showMessageDialog(null, "The animal relating to the name you searched has been deleted.");
               } else {
                   JOptionPane.showMessageDialog(null,"Unfortunately the system did not pick up any animal by that name.");
               }
            }
        }
    }//GEN-LAST:event_btnAniDeleteActionPerformed

    /*
    *The below method is an Event method that runs to take an input from the user, 
    *ensure that there is an input, run it against a mathces method via the Pattern
    *class, and once all is true it then executes the corresponding method in CliConn, 
    *in this case it's the method that deletes the species that is entered by the
    *user.
    */
    private void btnSpeciDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeciDeleteActionPerformed
        cliConn deleteSpecies = new cliConn();
        deleteSpecies.connectTheServer();
        String species = txtfSpecToDel.getText();
        String result;
        
        if(species.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the name of the species you wish to delete");
        } else {
            boolean matches = Pattern.matches("[A-Z][a-z]+\\s[A-Z][a-z]+\\s*", species);
            if (matches) {
                result = deleteSpecies.deleteSpecies(species);
                if (result.equals("true")) {
                    JOptionPane.showMessageDialog(null, "The species you entered has been located and deleted.");
                } else {
                    JOptionPane.showMessageDialog(null, "Unforunately the species you entered could not be located on the server.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "The species Name you have entered does match the field criteria.");
            }
        }
    }//GEN-LAST:event_btnSpeciDeleteActionPerformed

    /*
    *The below method is an Event method that runs to take input from the user, 
    *ensure that there is an input, run it against 3 mathces method via the Pattern
    *class, and once all is true it then executes the corresponding method in CliConn, 
    *in this case it's the method that adds an animals details that is entered by the
    *user into the animal table in the database.
    */
    private void btnAniAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAniAddActionPerformed
        cliConn addAnimal = new cliConn();
        addAnimal.connectTheServer();
        String animalName = txtfAddAniName.getText();
        String animalDesc = txtfAddAniDesc.getText();
        String speciesID = txtfAddAniSpecID.getText();
        String result;
        
        if(animalName.equals("") || animalDesc.equals("") || speciesID.equals("")) {
            JOptionPane.showMessageDialog(null, "Please ensure all fields contain information regarding the animal you wish to add to the database.");
        } else {
            boolean matchesName = Pattern.matches("[A-Z][a-z]+\\s*", animalName);
            boolean matchesDesc = Pattern.matches("[^0-9][a-zA-Z]+\\s*[^0-9][a-zA-Z]$", animalDesc);
            boolean matchesSpecID = Pattern.matches("[0-9].{1,3}", speciesID);
            if (matchesName && matchesDesc && matchesSpecID) {
                result = addAnimal.addAnimal(animalName, animalDesc, speciesID);
                if (result.equals("true")) {
                    JOptionPane.showMessageDialog(null, "Congrats, you have entered that animal into the database.");
                } else {
                    JOptionPane.showMessageDialog(null, "Unfortunately there was an error in backend while trying to add that animal.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "One or more fields contain data that does not match the criteria");
            }
        }
    }//GEN-LAST:event_btnAniAddActionPerformed

    /*
    *The below method is an Event method that runs to take an input from the user, 
    *ensure that there is an input, run it against a mathces method via the Pattern
    *class, and once all is true it then executes the corresponding method in CliConn, 
    *in this case it's the method that adds a species entered by the user into
    *the species table in the database.
    */
    private void btnSpecAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpecAddActionPerformed
        cliConn addSpecies = new cliConn();
        addSpecies.connectTheServer();
        String speciesName = txtfAddSpecName.getText();
        String result;
        
        if(speciesName.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the name of the species you wish to delete.");
        } else {
            boolean matchesSpec = Pattern.matches("[A-Z][a-z]+\\s[A-Z][a-z]+\\s*", speciesName);
            if (matchesSpec) {
                result = addSpecies.addSpecies(speciesName);
                if (result.equals(true)) {
                    JOptionPane.showMessageDialog(null, "Congrats, you added the species to the database.");
                } else {
                    JOptionPane.showMessageDialog(null, "Unfortunately that species could not be added to the database due to backend failure.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please ensure that what you enter matches the input criteria.");
            }
        }
    }//GEN-LAST:event_btnSpecAddActionPerformed

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
            java.util.logging.Logger.getLogger(adminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAniAdd;
    private javax.swing.JButton btnAniDelete;
    private javax.swing.JButton btnSpecAdd;
    private javax.swing.JButton btnSpeciDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblAnimalDescription;
    private javax.swing.JLabel lblAnimalName;
    private javax.swing.JLabel lblDelAniName;
    private javax.swing.JLabel lblDelSpecName;
    private javax.swing.JLabel lblSpeciesID;
    private javax.swing.JLabel lblSpeciesID1;
    private javax.swing.JLabel lblSpeciesName;
    private javax.swing.JTextField txtfAddAniDesc;
    private javax.swing.JTextField txtfAddAniName;
    private javax.swing.JTextField txtfAddAniSpecID;
    private javax.swing.JTextField txtfAddSpecName;
    public javax.swing.JTextField txtfAniToDel;
    public javax.swing.JTextField txtfSpecToDel;
    // End of variables declaration//GEN-END:variables
}
