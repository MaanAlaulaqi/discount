package discount;


import java.time.LocalDate;
import java.time.Period;

/**
 * UserCat = User Categories. 
 * This will be the class where users are made and put into categories. 
 * Categories will initially be as follows: 
 * 0 - Normal user (0%)
 * 1 - Employee (30%)
 * 2 - Affiliate (10%)
 * 3 - 2 years old (5%)
 * Keeping in mind that the user may only use one discount, the bigger discount will opted for
 */

/**
 *
 * @author Maan Alaulaqi 
 */
public class UsersCat {
    private String fName;
    private String lName;
    private int idNum; 
    private int cat;
    private LocalDate regDate; //The date the user was registered. (yyyy-MM-dd)
    
    public UsersCat(){
        fName = "";
        lName = "";
        cat = 0; //initially 0 
        regDate = LocalDate.now(); //If another date -> LocalDate.of(yyyy-MM-dd)
        
    }
    public UsersCat(String fName, String lName, int cat, LocalDate regDate){
        this.fName = fName;
        this.lName = lName;
        this.cat = cat;
        this.regDate = regDate; //LocalDate.parse(regDate);  //Would be somehting like "1990-3-29"
        
        if(this.cat == 0) { // User for 2+ years? 
            Period diff = Period.between(regDate, LocalDate.now());
            if(diff.getYears() >= 2) 
                this.cat = 3;
        }
    }
    public int getCat(){
        return cat;
    }

  
}
