package oop.view;

import oop.controller.AccountController;

import java.util.Scanner;

public class AccountView {

    public static void main(Scanner input) {

        AccountController accountCtrl = new AccountController();

        while (true) {
            System.out.println("=============================================================== Bank Program Menu ========================================================================");
            System.out.println(" | 0 - Return Home | 1 - Create account | 2 - Deposit | 3 - Withdraw | 4 - Check your balance | 5 - Account Cancellation | 6 - Load Account | ");

            String menuSelect = input.next();

            switch (menuSelect) {
                case "0":
                    System.out.println(" === Exit banking program. === ");
                    System.out.println();
                    return;
                case "1":
                    System.out.println(" === Create account === ");
                    String createMsg = accountCtrl.createAccount(input);
                    System.out.println(createMsg);
                    System.out.println();
                    break;
                case "2":
                    System.out.println(" === Deposit to your account === ");
                    String depositMsg = accountCtrl.deposit(input);
                    System.out.println(depositMsg);
                    System.out.println();
                    break;
                case "3":
                    System.out.println(" === Withdraw from your account === ");
                    String withdrawMsg = accountCtrl.withdraw(input);
                    System.out.println(withdrawMsg);
                    System.out.println();
                    break;
                case "4":
                    System.out.println(" === Check your balance === ");
                    accountCtrl.getBalance(input);
                    break;
                case "5":
                    System.out.println(" === Cancle your account === ");
                    accountCtrl.cancelAccount(input);
                    break;
                case "6":
                    System.out.println(" === Load your transanction details === ");
                    accountCtrl.getAccounts(input);
                    break;
            }
        }
    }
}
