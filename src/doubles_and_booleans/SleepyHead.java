package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
        
        int WeekdayChoiceNum = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        
        if (WeekdayChoiceNum == 0) {
        	isWeekday = true;
        } else {
        	isWeekday = false;
        }
        System.out.println(WeekdayChoiceNum);
        
        int VacationChoiceNum = JOptionPane.showConfirmDialog(null, "Are you on vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);

        if (VacationChoiceNum == 0) {
        	isVacation = true;
        } else {
        	isVacation = false;
        }
        
        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
        
        if (isWeekday == false || isVacation == true) {
        	System.out.println("Sleep in?");
        } else if (isWeekday == true || isVacation == false) {
        	System.out.println("Get up lazybones!");
        }
    }
}
