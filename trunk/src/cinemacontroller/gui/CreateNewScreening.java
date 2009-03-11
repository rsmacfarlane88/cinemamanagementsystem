/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CreateScreening2.java
 *
 * Created on 12-Feb-2009, 00:18:45
 */

package cinemacontroller.gui;

import cinemacontroller.filmcontroller.Film;
import cinemacontroller.gui.timetablecontrol.TimetableColor;
import cinemacontroller.screensystem.Screen;
import cinemacontroller.screensystem.Screening;
import databasecontroller.MySQLController;
import java.awt.Color;
import java.sql.SQLException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Scott
 */
public class CreateNewScreening extends javax.swing.JFrame {

    private MainWindow main_window;

    /** Creates new form CreateScreening2 */
    public CreateNewScreening(MainWindow main_window) {
        this.main_window = main_window;
        initComponents();
        
        // Center align the login window
        this.setLocationRelativeTo(null);
        
        for(Film current_film : main_window.core_controller.film_manager.getFilms()){
            this.film_combo.addItem(current_film);
        }


        for(Screen current_screen : main_window.core_controller.screen_manager.getScreens()){
            this.screen_combo.addItem(current_screen);
        }

 
    }

  

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane_date_description = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        film_combo = new javax.swing.JComboBox();
        screen_combo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        time_hour = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        time_min = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        date_day = new javax.swing.JComboBox();
        date_month = new javax.swing.JComboBox();
        date_year = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setTitle("Create New Screening - Multiplex Manager");
        setIconImage(getToolkit().getImage(getClass().getResource("/cinemacontroller/gui/icons/application_add.png")));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(24, 24, 24));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create New Screening");

        jScrollPane3.setBorder(null);

        jTextPane_date_description.setBackground(new java.awt.Color(24, 24, 24));
        jTextPane_date_description.setEditable(false);
        jTextPane_date_description.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane_date_description.setText("You can create a new screening by selecting a film and a screen as well as the relevant dates and settings.");
        jScrollPane3.setViewportView(jTextPane_date_description);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setText("Film");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setText("Screen");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setText("Time");

        time_hour.setModel(new javax.swing.SpinnerNumberModel(9, 9, 23, 1));

        jLabel6.setText(":");

        time_min.setModel(new javax.swing.SpinnerNumberModel(1, 1, 59, 1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setText("Date");

        date_day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        date_month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        date_year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2008", "2009", "2010" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
            .addComponent(film_combo, 0, 433, Short.MAX_VALUE)
            .addComponent(screen_combo, 0, 433, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(time_hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(time_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(date_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date_month, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date_year, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(film_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(screen_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time_hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(time_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jButton1.setText("Create Screening");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        // Get the selected film and screen
        Film selected_film = (Film)this.film_combo.getSelectedItem();
        Screen selected_screen = (Screen)this.screen_combo.getSelectedItem();

        // Check to see if the screen is free for the selected new screening
        if(this.main_window.core_controller.screen_manager.checkScreenFree(selected_screen, this.getSelectedDate(), this.getSelectedTime(), this.getEndTimeFromSelectedTime(selected_film)) && this.getEndTimeFromSelectedTime(selected_film).before(this.main_window.core_controller.cinema_closing_time)){

            // Create a new screening
            Screening new_screening = new Screening(selected_film, this.getSelectedDate(), this.getSelectedTime());

            // Add the new screening to the screen manager
            main_window.core_controller.screen_manager.getScreen(selected_screen.getIDNumber()).addScreening(new_screening);

            // Updates the main window with the new screening information
            this.main_window.refreshTimetable();
            this.main_window.updateSummaryPanel();

            // Close the current window
            this.dispose();


            MySQLController connection;
            try {

                int uniqueid = Screen.generateID();

                Date daterr = this.getSelectedTime().getTime();
                Date daterr2 = this.getSelectedDate().getTime();

                Format mysqltime = new SimpleDateFormat("kk:mm:ss");
                Format mysqldate = new SimpleDateFormat("yyyy-M-dd");

                connection = new MySQLController();
                connection.putData("INSERT INTO `main_screening_list` ( film_id, screen_id, start_time, start_date) VALUES('"+selected_film.getID()+"','"+selected_screen.getIDNumber()+"','"+ mysqltime.format(daterr)+"', '"+mysqldate.format(daterr2)+"')");
                                
            } catch (SQLException ex) {
               System.out.println(ex);
            }
            

        }else{
            // Show a warning dialog because the screen is booked at requested times
            JOptionPane.showMessageDialog(null, "Sorry but the screen is already running a screening at the selected times.\nPlease select an alternative screen or time.", "Screen Unavailable", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        main_window.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Returns the selected data from the date picker.
     *
     * @return
     */
    public GregorianCalendar getSelectedDate(){
        int day = Integer.parseInt(this.date_day.getSelectedItem().toString());
        int month = Integer.parseInt(this.date_month.getSelectedItem().toString());
        int year = Integer.parseInt(this.date_year.getSelectedItem().toString());

        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(0);
        
        date.set(Calendar.DAY_OF_MONTH, day);
        date.set(Calendar.MONTH, month);
        date.set(Calendar.YEAR, year);

        return date;
    }

    /**
     * Returns the selected time from the time picker
     *
     * @return
     */
    public GregorianCalendar getSelectedTime(){
         int start_hour = Integer.parseInt(this.time_hour.getValue().toString());
         int start_min = Integer.parseInt(this.time_min.getValue().toString());

        GregorianCalendar time = new GregorianCalendar();
        time.setTimeInMillis(0);

        time.set(Calendar.HOUR_OF_DAY, start_hour);
        time.set(Calendar.MINUTE, start_min);
        
         return time;
    }

    /**
     * Calculates the end time for a film based on selected start time and film length.
     * 
     * @param selected_film
     * @return
     */
    public GregorianCalendar getEndTimeFromSelectedTime(Film selected_film){

        GregorianCalendar returncalendar = new GregorianCalendar();
        returncalendar.setTimeInMillis(0);

        returncalendar.set(Calendar.HOUR_OF_DAY, this.getSelectedTime().get(Calendar.HOUR_OF_DAY));
        returncalendar.set(Calendar.MINUTE, this.getSelectedTime().get(Calendar.MINUTE));

        returncalendar.add(Calendar.HOUR_OF_DAY, selected_film.getLength().get(Calendar.HOUR_OF_DAY));
        returncalendar.add(Calendar.MINUTE, selected_film.getLength().get(Calendar.MINUTE));

        return returncalendar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox date_day;
    private javax.swing.JComboBox date_month;
    private javax.swing.JComboBox date_year;
    private javax.swing.JComboBox film_combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane_date_description;
    private javax.swing.JComboBox screen_combo;
    private javax.swing.JSpinner time_hour;
    private javax.swing.JSpinner time_min;
    // End of variables declaration//GEN-END:variables

}
