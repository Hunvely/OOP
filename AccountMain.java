package oop;

import oop.view.AccountView;

import java.util.Scanner;

public class AccountMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Hello. Welcome to the banking program.");
            System.out.println("If you want to run the program, press 1, or if you want to quit, press 0.");
            System.out.print("[Please input number] : ");

            switch (input.next()) {
                case "1":
                    System.out.println("Start banking program. \nPlease wait for a moment.");
                    System.out.println();
                    AccountView.main(input);
                    break;
                case "0":
                    System.out.println("Closing the banking program. Thank you for using our service. :)");
                    return;
            }
        }
    }
}
