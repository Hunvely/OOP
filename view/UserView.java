package oop.view;

import oop.controller.UserController;

import java.util.Scanner;

public class UserView {

    public static void main(Scanner input) {

        UserController userCtrl = new UserController();

        while (true) {
            System.out.println("[메뉴] | 0 - 종료\n" +
                    " 1 - 회원가입\n" +
                    " 2 - 로그인\n" +
                    " 3 - 마이페이지\n" +
                    " 4 - 비밀번호 변경 \n" +
                    " 5 - 회원탈퇴\n" +
                    " 6 - 회원목록\n" +
                    " 7 - 이름검색\n" +
                    " 8 - 직업검색\n" +
                    " 9 - 회원 수");

            switch (input.next()) {
                case "1":
                    System.out.println(" === 회원가입을 진행합니다. === ");
                    String joinMsg = userCtrl.join(input);
                    System.out.println(" === 회원가입 결과 === ");
                    System.out.println(joinMsg);
                    System.out.println();
                    break;
                case "2":
                    System.out.println(" === 로그인을 진행합니다. === ");
                    String loginMsg = userCtrl.login(input);
                    System.out.println(" === 로그인 결과 === ");
                    System.out.println(loginMsg);
                    System.out.println();
                    break;
                case "3":
                    System.out.println("=== 마이페이지로 이동합니다. === ");
                    userCtrl.myPage(input);
                    break;
                case "4":
                    System.out.println(" === 비밀번호 변경을 진행합니다. === ");
                    userCtrl.passwordUpdate(input);
                    break;
                case "5":
                    System.out.println(" === 회원 탈퇴를 진행합니다. === ");
                    userCtrl.deleteUser(input);
                    break;
                case "6":
                    System.out.println(" === 회원 목록을 조회합니다. === ");
                    userCtrl.userList(input);
                    break;
                case "7":
                    System.out.println(" === 회원 이름을 검색합니다. === ");
                    userCtrl.findUserByName(input);
                    break;
                case "8":
                    System.out.println(" === 회원 직업을 검색합니다. === ");
                    userCtrl.findUserByJob(input);
                    break;
                case "9":
                    System.out.println(" === 회원 수를 조회합니다. === ");
                    String userCount = userCtrl.countUser();
                    System.out.println(userCount);
                    break;
            }
        }
    }
}