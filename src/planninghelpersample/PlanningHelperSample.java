/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package planninghelpersample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author STUDENT
 */
public class PlanningHelperSample {

    /**
     *24/03/2023

        MEMBERS: Student Number: 2021368  / Name: Franklin Arruda
         Student Number: 2021278  / Name: Gustavo Lambert		

---------------------
I D E A / Only
---------------------
APPLICATION NAME =  (Planning Helper)

definition snjsndjbakadnd dndsbhs

(User interface)
what would you like to buy?
FERRARI

how much is the FERRARI you wish to buy?
******

--------------------------------------------------

User Option = PLEASE SELECT AN OPTION
-------------------------------------------------

1) When would you like to have your FERRARI? (please type 
in number of months) 

LENGHT = number of months = 25 (results = 15200,00 monthly)

------------------------------------------------------------------------------------------

or / if you are not sure due to your income status. Please state your fornightly / weeky=ly / monhtly income pay?

2) How much are you willing to pay for your FERRARI monthly?
answer: ***** = 2500.00

what is your income?
****** = 4.500,00

FERRARI worth value / answer = LENGHT = number of months 

BREAKDOWN (results)

************* bulshits....
**************


     */
    
    static final String userOption = "You can either choose to select the lenght of your goals "
            + "or how much you are willing to invest.\n"
            + "Please select the following option \n"
            +"1) When would you like to have it by \n"
            +"2) How much are you willing to pay monthly?";
    
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader kb =new  BufferedReader(new InputStreamReader(System.in));
        
        
        //USER INTERFACE
        System.out.println("What would you like to buy?");
        String userItem = kb.readLine();
        
        System.out.println("How much is the " + userItem + " you wish to buy?");
        int itemValue = Integer.parseInt(kb.readLine());
        
        ////  DISPLAY MENU
        System.out.println(PlanningHelperSample.userOption);
        
        int userOption = Integer.parseInt(kb.readLine());
             
        switch(userOption){
        
            case 1:
                System.out.println("When you like to have your " + userItem + "? ( please type \n" +
                            "in number of months) ");
                // MONTHS
                int lenght = Integer.parseInt(kb.readLine());
                
                //SALARY
                System.out.println("Please enter your monthly SALARY ");
                int userSlary = Integer.parseInt(kb.readLine());
                    
                // Finding the monthly value (MONTHS DIVIDED by SALARY) 
                int monthlyValue = itemValue/lenght;
                System.out.println("YOUr" + userItem + " will monthly cost you " + (monthlyValue));
                
                // Salary = 3.000,00 monthly (Salary x months = amount of what the user can pay)
                // Finding the amount of what the user can have it within their current situation
                int userStatus = userSlary * lenght;
                
                // finding the remaining balance between the amount of what the user can pay against the item value
                int remainingBalnce = itemValue - userStatus;
                
                // finding the number of months 
                int userLenght_total = remainingBalnce / userSlary;
                
                // IF TOTAL months is less than the current month....
                
                System.out.println("Total months lenght " + userLenght_total);
                break;
                
                
         case 2:
                System.out.println("How much are you willing to pay for your FERRARI monthly? ");
                int wage = Integer.parseInt(kb.readLine());

                int results1 = itemValue/wage;

                System.out.println("YOUr" + userItem + " is achieveable within " + (results1) + " months time"  );
        
        
        }
        
        
        // USER options
        System.out.println("When you like to have your " + userItem + "? ( please type \n" +
                            "in number of months) ");
        int lenght = Integer.parseInt(kb.readLine());
        
        int results = itemValue/lenght;
        
        System.out.println("YOUr" + userItem + " is achieveable within " + (results) + " months time"  );
        
        System.out.println("dkndd");
     
        
        System.out.println("");
    }
    
}
