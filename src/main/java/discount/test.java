/**
 * A main test class 
 */
package discount;

import java.time.LocalDate;

/**
 *
 * @author Maan Alaulaqi (201610814@aau.ac.ae)
 */
public class test {
    public static void main(String[] args){
        //imaginary bill total
        double bill = 532.12;
        
        
        //User associated with bill? 
        UsersCat user1 = new UsersCat();
        UsersCat user2 = new UsersCat("Maan", "Alaulaqi", 0, LocalDate.of(2017,7,24));
        
        BillCalculate BC1 = new BillCalculate();
        BC1.BillCalculate(user1, bill);
        System.out.println();
        Double NetPayable = BC1.BillCalculate(user2, bill);
        System.out.println("Net Payble ammount of user 2 is " + NetPayable);
    }
    
}

