package bankingapplication;
import java.util.Scanner;
public class BankingApplication{

    private static String CustomerName;
    private static double SavingsBalance;
    private static double CheckingBalance;
    private static void UI(){

        System.out.println ("Menu \n1. Enter the customer's name: \n2. Retrieve customer's name: \n3. Add money to savings account: " +			// UI for the menu
                "\n4. Withdraw money from savings account: \n5. Get current savings balance account: \n6. Add money to checking account: " +
                "7. Withdraw money from checking account: \n8. Get current checking balance account: \n9. Exit");
    }

    public static void main(String[] args){
        Scanner function = new Scanner(System.in);

        int choice = 0;

        while (choice !=9){
            UI();

            choice = function.nextInt();

            switch(choice)
            {
                case 1:
                    enterCustomerName();
                    break;

                case 2:
                    getCustomerName();
                    break;

                case 3:
                    addMoneyToSavings();
                    break;

                case 4:
                    subtractMoneyFromSavings();
                    break;

                case 5:
                    getSavingsBalance();
                    break;

                case 6:
                    addMoneyToChecking();
                    break;

                case 7:
                    subtractMoneyFromSavings();
                    break;

                case 8:
                    getCheckingBalance();
                break;

                case 9:
                    System.out.println("Exit");

            }


        }
    }

    private static void enterCustomerName() //Store the customer’s name.
    {
        Scanner function = new Scanner(System.in);
        System.out.print ("Enter customer name: ");
        CustomerName = function.nextLine();
    }

    private static void getCustomerName() //Get the customer’s name.
    {
        System.out.println ("Customer name: " + CustomerName);
    }

    private static void addMoneyToSavings() //Add money to customer’s savings account.
    {
        Scanner function = new Scanner(System.in);
        double amount = function.nextDouble();

        System.out.print ("Enter amount you want to deposit: ");
        SavingsBalance += amount;
    }

    private static void subtractMoneyFromSavings() //Withdraw money from customer’s savings account. Both positive and negative values should be inputed if needed.
    {
        Scanner function = new Scanner(System.in);
        double amount = function.nextDouble();

        System.out.print ("Enter customer name: ");
        SavingsBalance -= amount;
    }

    private static void getSavingsBalance() //Get the savings balance.
    {
        System.out.print ("Savings Balance: " + SavingsBalance);
    }

    private static void addMoneyToChecking() //Add money to customer’s checking account
    {
        Scanner function = new Scanner(System.in);
        double amount = function.nextDouble();

        System.out.print ("Enter amount you want to deposit: ");
        CheckingBalance += amount;
    }

    private static void subtractMoneyFromChecking() //Withdraw money from customer’s checking account. Both positive and negative values should be inputed if needed.
    {
        Scanner function = new Scanner(System.in);
        double amount = function.nextDouble();

        System.out.print ("Enter customer name: ");
        CheckingBalance -= amount;
    }

    private static void getCheckingBalance() //Get the checking balance.
    {
        System.out.print ("Checking Balance: " + CheckingBalance);
    }

}