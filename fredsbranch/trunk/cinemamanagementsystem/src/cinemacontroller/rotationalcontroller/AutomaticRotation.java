/*
 * AutomaticRotation.java
 *
 * Created on 30 mars 2009, 01:46
 */

package cinemacontroller.rotationalcontroller;

import java.awt.Color;

import javax.swing.JProgressBar;

import cinemacontroller.gui.MainWindow;
import cinemacontroller.gui.timetablecontrol.TimetableController;
import cinemacontroller.gui.timetablecontrol.TimetableGenerating;


/**
 *
 * @author  Fr�d�ric
 */
public class AutomaticRotation extends javax.swing.JFrame {

	private static final long serialVersionUID = 0L;
	private int index = 0;
	/** Creates new form AutomaticRotation */
    public AutomaticRotation(int index) {
    	this.index = index;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        rotation();
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
        jLabel10 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Automatic Rotation - Multiplex Manager");
        
        setIconImage(getToolkit().getImage(getClass().getResource("/cinemacontroller/gui/icons/timetable.png")));

        jPanel2.setBackground(new java.awt.Color(24, 24, 24));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        
        jLabel1.setText("Automatic Rotation");

        jScrollPane3.setBorder(null);

        jTextPane_date_description.setBackground(new java.awt.Color(24, 24, 24));
        jTextPane_date_description.setEditable(false);
        jTextPane_date_description.setForeground(new java.awt.Color(255, 255, 255));
        
       	jTextPane_date_description.setText("The automatic rotation is running. Please wait.");

        jScrollPane3.setViewportView(jTextPane_date_description);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        jLabel10.setText("Automatic Rotation is running...");

        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(35, 35, 35)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>

    
    public void rotation(){
		try {
			Thread thread;
			if(index == 0){
				   thread = new Thread(new AutomaticRotationCurrentPeriod(this));
			       thread.start();    
			}
			else{
				if(index == 1){
					thread = new Thread(new AutomaticRotationNextPeriod(this));
				    thread.start();
				}
			}

		}
		catch (Exception ex) {
		        ex.printStackTrace();
		}
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane_date_description;
    // End of variables declaration
    
    public JProgressBar getJProgressBar(){
    	return jProgressBar1;
    }

}
