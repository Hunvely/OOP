package oop;

import oop.view.UserView;

import java.util.Scanner;

public class UserMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("회원 관리 메뉴");

        while ((true)) {
            System.out.println("시작하려면 1을 누르시고 종료하려면 0을 누르세요.");
            String select = input.next();

            switch (select) {
                case "0":
                    return;
                case "1":
                    System.out.println("회원 관리 메뉴로 이동합니다.");
                    UserView.main(input);
                    break;
            }
        }
    }
}
