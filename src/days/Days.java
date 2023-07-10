/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

import java.util.Scanner;

/**This class takes String input from user 
 * and calls method  to print the 
 * name of the day.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the week day names. 
 *
 * @author sivagamasrinivasan
 */
public class Days {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,SATURDAY,SUNDAY
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
    Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number (1-7):");
        int code = in.nextInt();
        
        if (code >= 1 && code <= 7) {
            Day day = getDay(code);
            System.out.println(day.name());
        } else {
            System.out.println("Invalid day number");
        }
    }

    private static Day getDay(int code) {
        switch (code) {
            case 1:
                return Day.MONDAY;
            case 2:
                return Day.TUESDAY;
            case 3:
                return Day.WEDNESDAY;
            case 4:
                return Day.THURSDAY;
            case 5:
                return Day.FRIDAY;
            case 6:
                return Day.SATURDAY;
            case 7:
                return Day.SUNDAY;
            default:
                return null;
        }
    }
}