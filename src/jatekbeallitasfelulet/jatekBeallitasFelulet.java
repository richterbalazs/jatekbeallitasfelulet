package jatekbeallitasfelulet;

import javax.swing.JOptionPane;

public class jatekBeallitasFelulet extends javax.swing.JFrame {
    
    int egerErzekenyseg = -1;
    double erzekenysegSzorzo;


    public jatekBeallitasFelulet() {
        initComponents();
        
        egerErzekenyseg = 800;
        erzekenysegSzorzo = 1;
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        chb2560x1440 = new javax.swing.JCheckBox();
        chb1920x1080 = new javax.swing.JCheckBox();
        chb1280x720 = new javax.swing.JCheckBox();
        chb1440x1080 = new javax.swing.JCheckBox();
        btnFrissites = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaOsszesito = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        lblSensErtek = new javax.swing.JLabel();
        rdbNoveles = new javax.swing.JRadioButton();
        rdbCsokkentes = new javax.swing.JRadioButton();
        lblErzekenyseg = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        chb219 = new javax.swing.JCheckBox();
        chb43 = new javax.swing.JCheckBox();
        chb169 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        cbxGrafika = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Játékbeállítás");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Felbontás", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        buttonGroup1.add(chb2560x1440);
        chb2560x1440.setText("2560x1440");

        buttonGroup1.add(chb1920x1080);
        chb1920x1080.setText("1920x1080");

        buttonGroup1.add(chb1280x720);
        chb1280x720.setText("1280x720");

        buttonGroup1.add(chb1440x1080);
        chb1440x1080.setText("1440x1080");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chb2560x1440)
                    .addComponent(chb1920x1080)
                    .addComponent(chb1440x1080)
                    .addComponent(chb1280x720))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chb2560x1440)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chb1920x1080)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chb1440x1080)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chb1280x720)
                .addContainerGap())
        );

        btnFrissites.setText("Beállítások frissítése");
        btnFrissites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrissitesActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Változtatott beállítások", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        txaOsszesito.setColumns(20);
        txaOsszesito.setRows(5);
        jScrollPane1.setViewportView(txaOsszesito);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Egér érzékenysége", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        lblSensErtek.setText("800");

        buttonGroup2.add(rdbNoveles);
        rdbNoveles.setSelected(true);
        rdbNoveles.setText("Érzékenység duplázása");
        rdbNoveles.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdbNovelesItemStateChanged(evt);
            }
        });

        buttonGroup2.add(rdbCsokkentes);
        rdbCsokkentes.setText("Érzékenység felezése");
        rdbCsokkentes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdbCsokkentesItemStateChanged(evt);
            }
        });

        lblErzekenyseg.setText("Egér érzékenysége: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbNoveles)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblErzekenyseg)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSensErtek))
                        .addComponent(rdbCsokkentes)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbNoveles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbCsokkentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblErzekenyseg)
                    .addComponent(lblSensErtek))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Képarány", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        buttonGroup3.add(chb219);
        chb219.setText("21:9");

        buttonGroup3.add(chb43);
        chb43.setText("4:3");

        buttonGroup3.add(chb169);
        chb169.setText("16:9");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chb219)
                    .addComponent(chb169)
                    .addComponent(chb43))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chb219)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chb169)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chb43)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Textúra minősége", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        cbxGrafika.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alacsony", "Közepes", "Magas", "Ultra" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(cbxGrafika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxGrafika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\twisty\\Desktop\\folders\\School\\Vizprog\\jatekbeallitasfelulet\\src\\kep\\hatter.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFrissites)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFrissites)
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbCsokkentesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdbCsokkentesItemStateChanged
        lblSensErtek.setText("400");
    }//GEN-LAST:event_rdbCsokkentesItemStateChanged

    private void btnFrissitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrissitesActionPerformed
        JOptionPane.showMessageDialog(rootPane, "A beállítások sikeresen frissültek!");
        
        String sep = System.lineSeparator();//windows: CRLF --> "\r\n"
        
        String grafika = (String)cbxGrafika.getSelectedItem();
        String kimenet = "A választott grafika: " + grafika;
        
        String atmero;//meretCm félrevezető --> csak a számot tartalmazza, mértékegységet nem
        if(rdbNoveles.isSelected()){
            atmero = rdbNoveles.getText();
        }else{
            atmero = rdbCsokkentes.getText();
        }
        kimenet += sep; 
        kimenet += "Egér érzékenysége: " + atmero;
        kimenet += sep; 
        
        kimenet += "Felbontás változtatása : " + sep;
        
        if(chb2560x1440.isSelected()){
            kimenet += " - 2560x1440" + sep;
        }
        
        if(chb1280x720.isSelected()){
            kimenet += " - 1280x720" + sep;
        }
        
        if(chb1440x1080.isSelected()){
            kimenet += " - 1440x1080" + sep;
        }
        
        if(chb1920x1080.isSelected()){
            kimenet += " - 1920x1080" + sep;
        }
        
        kimenet += "Képarány változtatása: " + sep;
        
        if(chb43.isSelected()){
            kimenet += " - 4:3" + sep;
        }
        
        if(chb219.isSelected()){
            kimenet += " - 21:9" + sep;
        }
        
        if(chb169.isSelected()){
            kimenet += " - 16:9" + sep;
        }
        
        txaOsszesito.setText(kimenet);
    }//GEN-LAST:event_btnFrissitesActionPerformed

    private void rdbNovelesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdbNovelesItemStateChanged
        lblSensErtek.setText("1600");
    }//GEN-LAST:event_rdbNovelesItemStateChanged

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new jatekBeallitasFelulet().setVisible(true);
        });
    }
    
     private void szamitasEsKiiras() {
         
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFrissites;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cbxGrafika;
    private javax.swing.JCheckBox chb1280x720;
    private javax.swing.JCheckBox chb1440x1080;
    private javax.swing.JCheckBox chb169;
    private javax.swing.JCheckBox chb1920x1080;
    private javax.swing.JCheckBox chb219;
    private javax.swing.JCheckBox chb2560x1440;
    private javax.swing.JCheckBox chb43;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblErzekenyseg;
    private javax.swing.JLabel lblSensErtek;
    private javax.swing.JRadioButton rdbCsokkentes;
    private javax.swing.JRadioButton rdbNoveles;
    private javax.swing.JTextArea txaOsszesito;
    // End of variables declaration//GEN-END:variables
}