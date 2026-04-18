
import java.util.Scanner;

public class ATM_final 
{   
  static int count=0,count2;
  static double balance=0.00,WithdrowAmount,DepositAmount,second,second2,Wsecond,Wsecond2;
         static String history="";  
  static  void welcome()
   { 
        System.out.println("..............................");   
        System.out.println("      WELCOME TO THE ATM      ");
        System.out.println("..............................");
       

   }
          static final String PIN ="9211";
  static void Security()
    {
         Scanner scanner=new Scanner(System.in);

        System.out.println("ENTER YOUR PIN... ");
        String ENTERPIN=scanner.nextLine();
        if(ENTERPIN.equals(PIN))
        {
            System.out.println("PIN IS CORRECT... ");
        }
        else
        {
          System.out.println("INVALID PIN !  PLEASE TRY AGAIN  ");
           ENTERPIN=scanner.nextLine();
          if(ENTERPIN.equals(PIN))
          {
              System.out.println("PIN IS CORRECT ");
          }
          else
          {
            System.out.println("INVALID PIN !  PLEASE TRY AGAIN  ");
             System.out.println("!  YOUR LAST ATTEMPT  ! ");
             ENTERPIN=scanner.nextLine();
          if(ENTERPIN.equals(PIN))
          {
              System.out.println("PIN IS CORRECT... ");
          }
          else                  
         { 
           System.out.println("----------------------------------");
           System.out.println(" INVALID PIN  TRY AFTER 24 HOURS  ");
           System.out.println("----------------------------------");
          System.exit(0);

          
          }
        }
          }
        }
      
        
  static void menu()
        {
           Scanner scanner=new Scanner(System.in);

          System.out.println("   !... ATM MENU ...!  ");
          System.out.println("---------------------");
          System.out.println("1. Check Balance        :");
          System.out.println("2. Deposit              :");
          System.out.println("3. Withdrow             :");
          System.out.println("4. Transection History  :");
          System.out.println("5. Exit                 :");
          System.out.println("                         "); 
          System.out.println(" ENTER YOUR CHOICE (1-5):");
          
          try
          {
          int choice= scanner.nextInt();
           
    switch(choice)
          {
            case 1:
            BalanceCheck();               break;
           
            case 2: // count++;
            Deposit(scanner);             break;

            case 3:  // count2++;
            Withdrow(scanner);            break;

            case 4:
            TransactionHistory(scanner);  break;

            case 5: 
            System.out.println("................................");
            System.out.println(" @@  THANK YOU FOR USING ATM   @@"); 
            System.out.println("--------------------------------");
            
            System.exit(0);        break;
            
            default : System.out.println(" INVALID CHOICE"); 
                      break;               
          }
          }
          catch(Exception e)
          {
            scanner.nextLine();
            System.out.println("------------------------------------");
            System.out.println("   ERROR: Please enter valid choice   ");
            System.out.println("   Valid choices are 1 to 5 only     ");
            System.out.println("------------------------------------");
          }
        }
      

           static void BalanceCheck()
           {
              System.out.println("\n YOUR CURRENT BALANCE IS  : = " + balance+"  Rs.");

            } 
  static void Deposit(Scanner scanner)
            { 
              try
              {
              System.out.println(" ENTER AMOUNT TO DEPOSIT    : Rs.");
              System.out.println("Minimum Deposit Amount 100 & Maximum Amount 2 Lakh ");
                DepositAmount=scanner.nextDouble();
                 
                 if(DepositAmount>=100 && DepositAmount<=2_00_000) 
                 { 
                 count3++;
                     balance += DepositAmount;
                     history = history+"TRANSACTION  ("+count3+")    : Rs.  "+""+DepositAmount+"   Credited"+"\n";
                      
               System.out.println("@ " + DepositAmount +" Rs" + "  DEPOSIT SUCCESSFULLY  @     ");        
                 }
                 else
                {
               System.out.println("------------------------------------");
               System.out.println("   Sorry Invalid Amount Try Again   ");
               System.out.println("   Amount should be 100 to 200000   ");
               System.out.println("------------------------------------");
                }
              }
              catch(Exception e)
              {
                 scanner.nextLine();
                 System.out.println("------------------------------------");
                 System.out.println("   ERROR: Please enter valid number   ");
                 System.out.println("   Amount should be 100 to 200000   ");
                 System.out.println("------------------------------------");
              }
            }
            static int count3=0;
            
  static void Withdrow(Scanner scanner)
              { 
               try
               {
               System.out.println(" YOU ARE AVAILABLE BALANCE: = "+balance+" Rs.");
               System.out.println(" ENTER AMOUNT TO Withdrow  : Rs.");
                WithdrowAmount=scanner.nextDouble();

               if(WithdrowAmount>0 && WithdrowAmount>=100 && WithdrowAmount<=balance ) 
               {count3++;
                  balance -= WithdrowAmount;
                  history = history+"TRANSACTION  ("+count3+")    : Rs.  "+""+WithdrowAmount+"   Debited \n";
                System.out.println(" @   " + WithdrowAmount + " Rs.  WITHDROW SUCCESSFUL  @   ");
               
          
                System.out.println(" YOUR CURRENT AVAILABLE BALANCE : = "+balance+" Rs. ");
               }
               else if(WithdrowAmount<=0)
               {
                 System.out.println("------------------------------------");
                 System.out.println(" Invalid Amount - Cannot be Zero or Negative");
                 System.out.println(" MINIMUM WITHDRAWAL: 100 Rs.");
                 System.out.println("------------------------------------");
               }
              else if(WithdrowAmount>balance)
              {
                System.out.println("------------------------------------"); 
                System.out.println(" Insufficient Balance!");
                System.out.println(" Available Balance: "+balance+" Rs.");
                System.out.println("------------------------------------");
              }
              else
              {
                System.out.println("------------------------------------"); 
                System.out.println(" Please enter amount >= 100 Rs."); 
                System.out.println("------------------------------------");
              }
               }
               catch(java.util.InputMismatchException e)
               {
                 scanner.nextLine();
                 System.out.println("------------------------------------");
                 System.out.println("   ERROR: Please enter valid number   ");
                 System.out.println("   MINIMUM WITHDRAWAL: 100 Rs.");
                 System.out.println("------------------------------------");
               }
              }
            
static void TransactionHistory(Scanner scanner)
              { System.out.println(history);
              }
                     public static void main(String[] args) {
            
            welcome();
            Security();
            while(true)
           {
            System.out.println();
            menu();
           
           }
            
            
                     

            }
          
    }


    

