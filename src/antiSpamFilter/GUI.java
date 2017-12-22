/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antiSpamFilter;

import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableModel;

/**
 *
 * @author Humaira
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        
        setLocationRelativeTo(null);
        setResizable(false);

        rules_path.setText(System.getProperty("user.dir")+"\\AntiSpamConfigurationForProfessionalMailbox\\rules.cf");
        rulesList.getTableHeader().setReorderingAllowed(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonGroup = new javax.swing.ButtonGroup();
        rules = new javax.swing.JLabel();
        ham = new javax.swing.JLabel();
        spam = new javax.swing.JLabel();
        rulesButton = new javax.swing.JButton();
        hamButton = new javax.swing.JButton();
        spamButton = new javax.swing.JButton();
        rules_path = new javax.swing.JTextField();
        ham_path = new javax.swing.JTextField();
        spam_path = new javax.swing.JTextField();
        autoButton = new javax.swing.JRadioButton();
        manualButton = new javax.swing.JRadioButton();
        start = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        rulesList = new javax.swing.JTable();
        fp = new javax.swing.JLabel();
        fn = new javax.swing.JLabel();
        nFP = new javax.swing.JLabel();
        nFN = new javax.swing.JLabel();
        randomValues = new javax.swing.JButton();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rules.setText("rules.cf");

        ham.setText("ham.log");

        spam.setText("spam.log");

        rulesButton.setText("...");
        rulesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rulesButtonActionPerformed(evt);
            }
        });

        hamButton.setText("...");
        hamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hamButtonActionPerformed(evt);
            }
        });

        spamButton.setText("...");
        spamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spamButtonActionPerformed(evt);
            }
        });

        rules_path.setEditable(false);
        rules_path.setText("jTextField1");

        ham_path.setEditable(false);
        ham_path.setText("jTextField2");

        spam_path.setEditable(false);
        spam_path.setText("jTextField3");

        ButtonGroup.add(autoButton);
        autoButton.setText("Automatic");

        ButtonGroup.add(manualButton);
        manualButton.setText("Manual");

        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        rulesList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rules", "Weight"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(rulesList);

        fp.setText("FP");

        fn.setText("FN");

        nFP.setText("0");

        nFN.setText("0");

        randomValues.setText("Generate Values");
        randomValues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomValuesActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ham)
                                    .addComponent(spam))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ham_path)
                                    .addComponent(spam_path)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rules)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rules_path)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rulesButton)
                            .addComponent(hamButton)
                            .addComponent(spamButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(autoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manualButton)
                        .addGap(18, 18, 18)
                        .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 327, Short.MAX_VALUE)
                        .addComponent(randomValues)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(save)
                        .addGap(18, 18, 18)
                        .addComponent(fp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nFP)
                        .addGap(50, 50, 50)
                        .addComponent(fn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nFN)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rules)
                    .addComponent(rulesButton)
                    .addComponent(rules_path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ham)
                    .addComponent(hamButton)
                    .addComponent(ham_path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spam)
                    .addComponent(spamButton)
                    .addComponent(spam_path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(start)
                    .addComponent(manualButton)
                    .addComponent(autoButton)
                    .addComponent(fp)
                    .addComponent(nFP)
                    .addComponent(fn)
                    .addComponent(nFN)
                    .addComponent(randomValues)
                    .addComponent(save))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hamButtonActionPerformed
        JFileChooser path_chooser = new JFileChooser(System.getProperty("user.dir"));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("LOG Files", "log");
        path_chooser.setFileFilter(filter);
        path_chooser.setDialogTitle("Choose Rules File");
        int returnVal = path_chooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            ham_path.setText(path_chooser.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_hamButtonActionPerformed

    private void spamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spamButtonActionPerformed
        JFileChooser path_chooser = new JFileChooser(System.getProperty("user.dir"));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("LOG Files", "log");
        path_chooser.setFileFilter(filter);
        path_chooser.setDialogTitle("Choose Rules File");
        int returnVal = path_chooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            spam_path.setText(path_chooser.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_spamButtonActionPerformed

    private void rulesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rulesButtonActionPerformed
        JFileChooser path_chooser = new JFileChooser(System.getProperty("user.dir"));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("CF Files", "cf");
        path_chooser.setFileFilter(filter);
        path_chooser.setDialogTitle("Choose Rules File");
        int returnVal = path_chooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            rules_path.setText(path_chooser.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_rulesButtonActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startActionPerformed

    private void randomValuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomValuesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_randomValuesActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    /**
     * @param args the command line arguments
     */
    public void setLookGUI() {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ButtonGroup;
    private javax.swing.JRadioButton autoButton;
    private javax.swing.JLabel fn;
    private javax.swing.JLabel fp;
    private javax.swing.JLabel ham;
    private javax.swing.JButton hamButton;
    private javax.swing.JTextField ham_path;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton manualButton;
    private javax.swing.JLabel nFN;
    private javax.swing.JLabel nFP;
    private javax.swing.JButton randomValues;
    private javax.swing.JLabel rules;
    private javax.swing.JButton rulesButton;
    private javax.swing.JTable rulesList;
    private javax.swing.JTextField rules_path;
    private javax.swing.JButton save;
    private javax.swing.JLabel spam;
    private javax.swing.JButton spamButton;
    private javax.swing.JTextField spam_path;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
    
    
    public String getSpam_Path () {
    	return spam_path.getText();
    }
    
    public String getHam_Path () {
    	return ham_path.getText();
    }
    
    public String getRules_Path () {
    	return rules_path.getText();
    }

	public void setRulesList(ArrayList<Rule> rules) {
		String rules_matrix [][] = new String [rules.size()][2];
        for(int i=0; i<rules.size(); i++) {
        	rules_matrix [i][0] = rules.get(i).getName();
        	rules_matrix [i][1] = String.valueOf(rules.get(i).getWeight());
        }
        rulesList.setModel(new javax.swing.table.DefaultTableModel(rules_matrix,new String [] {"Rules", "Weight"}));
	}
	
	public ArrayList<Rule> getRulesList(){
		ArrayList<Rule> rules = new ArrayList<>();
		TableModel rulesListModel = rulesList.getModel();
		
		for(int i=0; i<rulesListModel.getRowCount(); i++){
            String rule = (String)rulesListModel.getValueAt(i,0);
            double weight = Double.parseDouble((String)rulesListModel.getValueAt(i,1));
            rules.add(new Rule(rule,weight));
		}
		
		return rules;
	}
	
    public void setFP(int i){
    	nFP.setText(i+"");
    }

    public void setFN(int i){
        nFN.setText(i+"");
    }
    
}
