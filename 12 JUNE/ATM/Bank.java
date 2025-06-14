class Bank{
    // static private double bankBalance = 56142.54;
    private double bankBalance = 56142.54;
    private int Pin = 5642;

    // public static 
    public double getbankBalace(int Pin){//int cannot be converted to String
        if(this.Pin == Pin){
        //  System.out.println( "Your Bank Balance is : "+ bankBalance);
         return bankBalance;
        }
        else{
            return -1;
        }
    }
//withdraw method
    public void Withdraw(double amount){
        this.bankBalance -= amount;
        System.out.println("Withdrawn successfully !!!! \nYour balance is now :  "+bankBalance);
    }

    public void Deposite(double amount){
        this.bankBalance += amount;
        System.out.printf("Deposited successfully !!!! \nYour balance is now : %.2f ",bankBalance);
    }

    public void setPin(int Pin){
        this.Pin = Pin;
         System.out.println("You Successfully SET NEW PIN!!!! . ");
         System.out.println("Your new PIN is  "+ Pin);
        }


}
