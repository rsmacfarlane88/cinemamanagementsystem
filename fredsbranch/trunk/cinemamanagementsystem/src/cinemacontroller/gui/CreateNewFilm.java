/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CreateNewFilm.java
 *
 * Created on 28-Feb-2009, 00:06:34
 */

package cinemacontroller.gui;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import databasecontroller.MySqlController;
import usefulmethods.TextLimiter;

/**
 *
 * @author Fr�d�ric
 */
public class CreateNewFilm extends javax.swing.JFrame {


	private static final long serialVersionUID = -1073180861731418885L;
    
    /** Creates new form CreateNewFilm */
    public CreateNewFilm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane_date_description = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create New Film - Multiplex Manager");
        setIconImage(getToolkit().getImage(getClass().getResource("/cinemacontroller/gui/icons/dvd_add.png")));

        jPanel2.setBackground(new java.awt.Color(24, 24, 24));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create New Film");

        jScrollPane3.setBorder(null);

        jTextPane_date_description.setBackground(new java.awt.Color(24, 24, 24));
        jTextPane_date_description.setEditable(false);
        jTextPane_date_description.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane_date_description.setText("You can create a new film instance by filling in the boxes to the right.");
        jScrollPane3.setViewportView(jTextPane_date_description);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(352, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel9.setText("Length");

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Add Film");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("The availability date defines the date at which the screen can be assigned to a screening.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setText("Film Title");

        jTextField1.setDocument(new TextLimiter(100));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel8.setText("Expected Audience");

        MySqlController connection;
        ResultSet result;

        modelComboBox1 = new DefaultComboBoxModel();
		
        jComboBox1 = new javax.swing.JComboBox(modelComboBox1);
        
        try {
			connection = MySqlController.getInstance();
			result= connection.getData("SELECT NAME FROM EXPECTED_AUDIENCES ORDER BY NAME");
			jComboBox1.addItem("");
			while (result.next()) {
				jComboBox1.addItem(result.getString(1));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel10.setText("Type");

		modelComboBox2 = new DefaultComboBoxModel();
		
        jComboBox2 = new javax.swing.JComboBox(modelComboBox2);
        
		try {
			connection = MySqlController.getInstance();
			result= connection.getData("SELECT NAME FROM TYPES ORDER BY NAME");
			jComboBox2.addItem("");
			while (result.next()) {
				jComboBox2.addItem(result.getString(1));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel11.setText("BBFC Rating");
        
		modelComboBox3 = new DefaultComboBoxModel();
		
        jComboBox3 = new javax.swing.JComboBox(modelComboBox3);
        
		try {
			connection = MySqlController.getInstance();
			result= connection.getData("SELECT NAME FROM BBFC_RATING ORDER BY NAME");
			jComboBox3.addItem("");
			while (result.next()) {
				jComboBox3.addItem(result.getString(1));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		modelComboBox4 = new DefaultComboBoxModel();

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel12.setText("Distributor");

		
        jComboBox4 = new javax.swing.JComboBox(modelComboBox4);
        
		try {
			connection = MySqlController.getInstance();
			result= connection.getData("SELECT NAME FROM DISTRIBUTORS ORDER BY NAME");
			jComboBox4.addItem("");
			while (result.next()) {
				jComboBox4.addItem(result.getString(1));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel13.setText("Synopsis");

        jTextArea1.setDocument(new TextLimiter(1500));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 11));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel14.setText("Availability Date");

        jTextField2.setDocument(new TextLimiter(2));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField6.setDocument(new TextLimiter(2));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.setDocument(new TextLimiter(4));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton3.setText("New");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("New");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("New");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField4.setDocument(new TextLimiter(1));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("hours");

        jTextField5.setDocument(new TextLimiter(2));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel4.setText("mins");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>
    
    public boolean correctFormatDate(){
    	
		if( (!this.jTextField2.getText().isEmpty() && !this.jTextField6.getText().isEmpty() && !this.jTextField7.getText().isEmpty())
				&& (this.jTextField2.getText().length() == 2 && this.jTextField6.getText().length() == 2 && this.jTextField7.getText().length() == 4) ){

			if(this.jTextField2.getText().matches("[0-9]*") && this.jTextField6.getText().matches("[0-9]*") && this.jTextField7.getText().matches("[0-9]*")){

				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
    }
    
    public boolean correctFormatLength(){
    	
		if( (!this.jTextField4.getText().isEmpty() && !this.jTextField5.getText().isEmpty())
				&& (this.jTextField4.getText().length() == 1 && this.jTextField5.getText().length() == 2) ){

			if(this.jTextField4.getText().matches("[0-9]*") && this.jTextField5.getText().matches("[0-9]*")){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
    }

private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
// TODO add your handling code here:
}                                           

private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
// TODO add your handling code here:
}                                           

private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {                                            
// TODO add your handling code here:
}   

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
	
	//if there is a name
    if(!this.jTextField1.getText().isEmpty()){
    	
    	//if the selection is not the first item of the combobox (because it is empty)
    	if(this.jComboBox1.getSelectedItem() != this.jComboBox1.getItemAt(0)){
    		
    		if(this.jComboBox2.getSelectedItem() != this.jComboBox2.getItemAt(0)){
    			
    			if(this.jComboBox3.getSelectedItem() != this.jComboBox3.getItemAt(0)){
    				
    				if(this.jComboBox4.getSelectedItem() != this.jComboBox4.getItemAt(0)){
    					
    					if(!this.jTextArea1.getText().isEmpty()){
    						
    						if(correctFormatDate()){
    							
        						if(correctFormatLength()){
        							
        					        boolean exist = false;
        				        	
        				    		try {
        				    			MySqlController connection = MySqlController.getInstance();

        				    			//test if the film doesn't already exist
        				    			ResultSet r = connection.getData("SELECT NAME FROM MOVIES WHERE NAME='"+jTextField1.getText().toLowerCase().trim()+"'");

        				    			while(r.next()){
        				    				if(r.getString(1).toLowerCase().equals(jTextField1.getText().toLowerCase().trim())){
        				    					exist = true;
        				    					JOptionPane.showMessageDialog(null, "This name already exists.", "Invalid Name", JOptionPane.WARNING_MESSAGE);
        				    					jTextField1.setText("");
        				    					break;
        				    				}
        				    			}

        				    			
        				    			//if the film doesn't exist, we add it into the database
        				    			if(!exist){
        				        			r = connection.getData("SHOW TABLE STATUS LIKE 'MOVIES'");
        				        			
        				        			while(r.next()){
        				            			connection.putData("INSERT INTO MOVIES VALUES ('"+r.getString("Auto_increment")+"',(SELECT ID_TYPE FROM TYPES WHERE NAME='"+jComboBox2.getSelectedItem()+"'),'"+this.jTextField1.getText()+"',(SELECT ID_BBFC FROM BBFC_RATING WHERE NAME='"+jComboBox3.getSelectedItem()+"'),(SELECT ID_DISTRIBUTOR FROM DISTRIBUTORS WHERE NAME='"+jComboBox4.getSelectedItem()+"'),(SELECT ID_EXPECTED_AUDIENCE FROM EXPECTED_AUDIENCES WHERE NAME='"+jComboBox1.getSelectedItem()+"'),'"+this.jTextArea1.getText()+"','0','"+jTextField7.getText()+"-"+jTextField6.getText()+"-"+jTextField2.getText()+"','"+jTextField4.getText()+":"+jTextField5.getText()+"')");
        				            			JOptionPane.showMessageDialog(null, "Data added successfully.", "Film", JOptionPane.INFORMATION_MESSAGE);

        				        			}
        				        			
            				    			jTextField1.setText("");
    				            			jComboBox1.setSelectedIndex(0);
    				            			jComboBox2.setSelectedIndex(0);
    				            			jComboBox3.setSelectedIndex(0);
    				            			jComboBox4.setSelectedIndex(0);
    				            			jTextArea1.setText("");
    				            			jTextField2.setText("");
    				            			jTextField6.setText("");
    				            			jTextField7.setText("");
    				            			jTextField4.setText("");
    				            			jTextField5.setText("");
        				    			}

        				    		} catch (SQLException e) {
        				    			e.printStackTrace();
        				    		}

        						}
        						else{
            				    	JOptionPane.showMessageDialog(null, "Please enter a correct length", "Invalid Length", JOptionPane.WARNING_MESSAGE);
            				    }
    							
    						}
    						else{
        				    	JOptionPane.showMessageDialog(null, "Please enter a correct date", "Invalid Date Format", JOptionPane.WARNING_MESSAGE);
        				    }

    					}
    					else{
    				    	JOptionPane.showMessageDialog(null, "Please enter a synopsis for the film", "Invalid Synopsis", JOptionPane.WARNING_MESSAGE);
    				    }
    					
    				}
    				else{
            	    	JOptionPane.showMessageDialog(null, "Please choose a distributor", "Invalid Distributor", JOptionPane.WARNING_MESSAGE);
            	    }
    			}
    			else{
        	    	JOptionPane.showMessageDialog(null, "Please choose a BBFC rating", "Invalid BBFC Rating", JOptionPane.WARNING_MESSAGE);
        	    }
    		}
    	    else{
    	    	JOptionPane.showMessageDialog(null, "Please choose a type", "Invalid Type", JOptionPane.WARNING_MESSAGE);
    	    }
    	}
        else{
        	JOptionPane.showMessageDialog(null, "Please choose an expected audience", "Invalid Expected Audience", JOptionPane.WARNING_MESSAGE);
        }
    }
    else{
    	JOptionPane.showMessageDialog(null, "Please enter a title for the film", "Invalid Name", JOptionPane.WARNING_MESSAGE);
    }

}

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	this.dispose();
}

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	
	new CreateNewExpectedAudience();
}                                        

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         

	new CreateNewType();
}                                        

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) { 
	
	new CreateNewDistributor();

}                                        

private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {                                            

}                                           


    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.DefaultComboBoxModel modelComboBox1;
    private javax.swing.DefaultComboBoxModel modelComboBox2;
    private javax.swing.DefaultComboBoxModel modelComboBox3;
    private javax.swing.DefaultComboBoxModel modelComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextPane jTextPane_date_description;
    // End of variables declaration

}
