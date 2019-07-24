package discount;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maan Alaulaqi (201610814@aau.ac.ae)
 */
public class BillCalculate {
        private UsersCat user;
        private double bill; 
        
    public BillCalculate(){
        
    }    
    public double BillCalculate(UsersCat user, double bill){
        this.user = user;
        this.bill = bill;
        System.out.println("***********");
        System.out.println("Total bill: \n" + bill);
        System.out.println("User category " + user.getCat() + " discount: \n" +(Math.round(catDisc()*100.0)/100.0));
        System.out.println("Discount for every $100 : \n" + (Math.round(hundredCheck()*100.0)/100.0));
        System.out.println("Total bill after discounts: \n" + totalPay());
        System.out.println("***********");
            return totalPay();
    }
    
    private double catDisc(){
        switch(user.getCat()){
            case 0:
                return 0.00;
            case 1: 
                return (bill/100)*30;
            case 2:
                return (bill/100)*10;
            case 3: 
                return (bill/100)*5;
            default: 
                return 0.00;
        }
    }
    public double hundredCheck(){
        double fiverDisc = (Math.floor(bill/100)) * 5; // $5 discount for every $100 spent
        return fiverDisc;
    }
    public double totalPay(){
        return bill - (Math.round(catDisc()*100.0)/100.0) - (Math.round(hundredCheck()*100.0)/100.0);
    }
}
