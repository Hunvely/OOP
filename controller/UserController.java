package oop.controller;

import oop.builder.UserBuilder;
import oop.model.UserDto;
import oop.service.UserService;
import oop.serviceimpl.UserServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserController {

    UserService user;

    public UserController() {
        this.user = UserServiceImpl.getInstance();
    }

    public String join(Scanner input) {
        System.out.println("아이디 | 비밀번호 | 비밀번호 확인 | 이름 | 전화번호 | 주소 | 직업 순으로 입력하세요.");
        return user.join(new UserBuilder()
                .username(input.next())
                .userPassword(input.next())
                .userRePassword(input.next())
                .userName(input.next())
                .userPhoneNumber(input.next())
                .userAdress(input.next())
                .usreJob(input.next())
                .build());
    }

    public String login(Scanner input) {
        System.out.println("아이디 | 비밀번호 를 입력하세요.");
        String msg = user.login(new UserBuilder()
                .username(input.next())
                .userPassword(input.next())
                .build());
        return msg;
    }

    public UserDto myPage(Scanner input) {
        System.out.println("검색할 회원의 ID를 입력하세요.");
        return user.myPage(input.next());
    }

    public String passwordUpdate(Scanner input) {
        return user.passwordUpdate(input);
    }

    public String deleteUser(Scanner input) {
        return user.deleteUser(input);
    }

    public Map<String, UserDto> userList() {
       return user.userList();
    }

    public List<UserDto> findUserByName(Scanner input) {
        return null;
    }

    public List<UserDto> findUserByJob(Scanner input) {
        return null;
    }

    public String countUser() {

        return user.countUser();
    }


}
