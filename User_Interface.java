package pack_CODSOFT;

import java.util.Scanner;

public class User_Interface
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=======Welcome to the ATM=======");
        System.out.println("Enter your choice : \n1.DEPOSIT\n2.WITHDRAWAL\n3.CHECK BALANCE\n4.EXIT");
        int ch = sc.nextInt();

        ATM_Mechanism obj = new ATM_Mechanism();

        switch (ch)
        {
            case 1:
                obj.deposit();
                break;
            case 2:
                obj.withdrawal();
                break;
            case 3:
                obj.checkBalance();
                break;
            case 4:
                System.out.println("=======THANK YOU=======");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
