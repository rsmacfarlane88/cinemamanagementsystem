/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CreateScreening.java
 *
 * Created on 10-Feb-2009, 21:18:17
 */

package cinemacontroller.gui;


/**
 *
 * @author Scott
 */
public class CreateScreening extends javax.swing.JFrame {

    private MainWindow window;


    /** Creates new form CreateScreening */
    public CreateScreening(MainWindow window) {
        initComponents();
        this.window = window;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_side_splash = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane_date_description = new javax.swing.JTextPane();
        jButton_create_screening = new javax.swing.JButton();
        jButton_cancel = new javax.swing.JButton();
        jLabel_film = new javax.swing.JLabel();
        jComboBox_film = new javax.swing.JComboBox();
        jLabel_screen = new javax.swing.JLabel();
        jComboBox_screen = new javax.swing.JComboBox();
        jLabel_date = new javax.swing.JLabel();
        date_day = new javax.swing.JTextField();
        date_seperator_1 = new javax.swing.JLabel();
        date_month = new javax.swing.JComboBox();
        date_year = new javax.swing.JTextField();
        date_seperator_2 = new javax.swing.JLabel();
        jLabel_time = new javax.swing.JLabel();
        time_hour = new javax.swing.JComboBox();
        time_seperator = new javax.swing.JLabel();
        time_min = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Screening - Multiplex Manager");
        setAlwaysOnTop(true);
        setIconImage(getToolkit().getImage(getClass().getResource("/cinemacontroller/gui/icons/application_add.png")));
        setResizable(false);

        jPanel_side_splash.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create New Screening");

        jScrollPane3.setBorder(null);

        jTextPane_date_description.setBackground(new java.awt.Color(24, 24, 24));
        jTextPane_date_description.setEditable(false);
        jTextPane_date_description.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane_date_description.setText("You can create a new screening by selecting a film and a screen as well as the relevant dates and settings.");
        jScrollPane3.setViewportView(jTextPane_date_description);

        javax.swing.GroupLayout jPanel_side_splashLayout = new javax.swing.GroupLayout(jPanel_side_splash);
        jPanel_side_splash.setLayout(jPanel_side_splashLayout);
        jPanel_side_splashLayout.setHorizontalGroup(
            jPanel_side_splashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_side_splashLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_side_splashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_side_splashLayout.setVerticalGroup(
            jPanel_side_splashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_side_splashLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jButton_create_screening.setText("Create Sceening");
        jButton_create_screening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_create_screeningActionPerformed(evt);
            }
        });

        jButton_cancel.setText("Cancel");
        jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelActionPerformed(evt);
            }
        });

        jLabel_film.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel_film.setText("Film");

        jComboBox_film.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "James Bond 007 (PG)" }));

        jLabel_screen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel_screen.setText("Screen");

        jComboBox_screen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Screen 1 (500 seater) - Reccommended", "Screen 2 (500 seater) ", "Screen 3 (500 seater)", "Screen 4 (500 seater)", "Screen 5 (500 seater)", "Screen 6 (500 seater)", "Screen 7 (500 seater)" }));

        jLabel_date.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel_date.setText("Date");

        date_day.setText("12");

        date_seperator_1.setText("/");

        date_month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July" }));

        date_year.setText("2009");

        date_seperator_2.setText("/");

        jLabel_time.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel_time.setText("Start Time");

        time_hour.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        time_seperator.setText(":");

        time_min.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addComponent(jButton_cancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_create_screening)
                .addContainerGap())
            .addComponent(jPanel_side_splash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_date, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addComponent(jLabel_film, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addComponent(jLabel_screen, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addComponent(jLabel_time, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(time_hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(time_seperator)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(time_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(date_day, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date_seperator_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date_seperator_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE))
                    .addComponent(jComboBox_film, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_screen, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_side_splash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_film)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_film, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_screen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_screen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_date)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_seperator_1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_seperator_2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel_time)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time_hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_create_screening)
                    .addComponent(jButton_cancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_create_screeningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_create_screeningActionPerformed
        int hours = Integer.parseInt(this.time_hour.getSelectedItem().toString());
        int mins = Integer.parseInt(this.time_min.getSelectedItem().toString());

       // this.window.addTimetableItem(this.jComboBox_film.getSelectedItem().toString(), new Point(3,this.window.calculateStartingColumn(hours, mins)), 4, Color.green, Color.black);
       // this.window.refreshTimetable();
        this.window.setEnabled(true);
        this.dispose();
}//GEN-LAST:event_jButton_create_screeningActionPerformed

    private void jButton_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelActionPerformed
        this.window.setEnabled(true);
        this.dispose();
}//GEN-LAST:event_jButton_cancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField date_day;
    private javax.swing.JComboBox date_month;
    private javax.swing.JLabel date_seperator_1;
    private javax.swing.JLabel date_seperator_2;
    private javax.swing.JTextField date_year;
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JButton jButton_create_screening;
    private javax.swing.JComboBox jComboBox_film;
    private javax.swing.JComboBox jComboBox_screen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_date;
    private javax.swing.JLabel jLabel_film;
    private javax.swing.JLabel jLabel_screen;
    private javax.swing.JLabel jLabel_time;
    private javax.swing.JPanel jPanel_side_splash;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane_date_description;
    private javax.swing.JComboBox time_hour;
    private javax.swing.JComboBox time_min;
    private javax.swing.JLabel time_seperator;
    // End of variables declaration//GEN-END:variables

}
