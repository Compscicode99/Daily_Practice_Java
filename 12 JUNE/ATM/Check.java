import java.util.Scanner;

class Check{
    static{
        System.out.println("Welcome to Qspider's ATM.");
    }
    public static void main(String[] args){
        // Bank ref = new Bank();
        // System.out.println(ref.getbankBalace());  wht rt if sop why ret
        UserIn();
    }

    public static void UserIn(){
        Bank ref = new Bank();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your pin . ");
        int Pin = sc.nextInt();
        double Balance = ref.getbankBalace(Pin);
        if(Balance == -1){
            System.out.println( " Your Pin is Incorrect.");//return  n first opertaion n then pin
        }
        else{
             System.out.println( "Welcome to ATM ");
             System.out.println( "Enter number for Below Operations ");
             System.out.println( "1-Check Balance \n2-Withdraw Money \n3-Deposite Money \n4-Change Pin ");
             System.out.println("Please enter number according to operations . ");
             int Option = sc.nextInt();
             if(Option == 1){
                System.out.println( "Your Bank Balance is : "+Balance);
             }
             else if(Option == 2){
                 System.out.println("Please enter amount to withdraw . ");
                 double amount = sc.nextDouble();
                 
                  if(amount >= 15000){
                     System.out.println("Maximum amount of withraw can be 15000 . ");
                 }
                 else if(amount <= Balance){
                 ref.Withdraw(amount);
                //   System.out.println("Withdrawn successfully !!!! /n Your balance is now :  "+Balance);   all test cases
                 }
                 else{
                     System.out.println("Your withdraw amount is greater than your balance amount . ");
                 }
             }
             else if(Option == 3){
                System.out.println("Please enter amount to deposit . ");
                 double amount = sc.nextDouble();
                 
                  if(amount >= 15000){
                     System.out.println("Maximum amount of deposit can be 15000 . ");
                 }
                 else if(amount <= Balance){
                 ref.Deposite(amount);
                 }
                 else{
                     System.out.println("Your Deposit amount is invalid . ");
                 }
             }

             else if(Option == 4){
                System.out.println("Are you confirm for changing the pin . Tyes ['Y' for yess OR || 'N' for no ] ");
                char Des = sc.next().charAt(0);
                if(Des == 'Y'|| Des == 'y'){
                System.out.println("Enter the new pin . ");//set only 4 char pin
                int temp = sc.nextInt();
                System.out.println("Confirm your pin Again ");//do while
                int PinNew = sc.nextInt();
                if(temp != PinNew){
                    System.out.println("Confirm  pin is Incorrect ");
                }
                else if(temp == PinNew){
                ref.setPin(PinNew);
                }
                }
                else if (Des == 'N' || Des == 'n'){
                    System.out.println("Change pin option Aborted  . ");
                }
                else {
                    System.out.println("Invalid Input. ");
                }
             }


        }
        
    }
}
