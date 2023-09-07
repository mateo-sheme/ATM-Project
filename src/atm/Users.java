/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;


/**
 *
 * @author mateo
 */
class Users {
    private int accountNo;
    private String name;
    private double balance;
    private int card,pin;
    
    public Users(int accountNo, String name, double balance, int card, int pin)
    
    {
        this.accountNo=accountNo;
        this.name=name;
        this.balance=balance;
        this.card=card;
        this.pin=pin;
        
    }
    
    
    public int getaccountNo(){
        return accountNo;
    }
    
    public String getname(){
        return name;
    }
     public double getbalance(){
        return balance;
    }
      public int getcard(){
        return card;
    }
     
    public int getpin(){
        return pin;
    }

   
}
