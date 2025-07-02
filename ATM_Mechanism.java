package pack_CODSOFT;

import java.util.Scanner;

public class ATM_Mechanism {
    int dep, with, currentBal = 10000, bal1, bal2;

    Scanner sc = new Scanner(System.in);

    public void deposit() {
        System.out.println("Enter amount to deposit : ");
        dep = sc.nextInt();

        if (dep < 0)
        {
            System.out.println("Invalid amount entered!!");
            System.out.println("TRY AGAIN!!");
            deposit();
        }
        else
        {
            bal1 = dep + currentBal;
            System.out.println("=====Deposit Successful=====");
            System.out.println("Your balance after deposit is Rs." +bal1);
        }
    }

         public void withdrawal () {
             System.out.println("Enter amount to withdraw : ");
             with = sc.nextInt();

             if (with > currentBal)
             {
                 System.out.println("Insufficient balance!!");
                 System.out.println("TRY AGAIN!!");
                 withdrawal();
             }
             else
             {
                 bal2 = currentBal - with;
                 System.out.println("=====Withdrawal Successful=====");
                 System.out.println("Your balance after withdrawal is Rs." + bal2);
             }
         }

        public void checkBalance ()
        {
                System.out.println("Your balance is Rs." + currentBal);
        }

    }

