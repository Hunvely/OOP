package oop.serviceimpl;

import oop.model.UserDto;
import oop.service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserServiceImpl implements UserService {

    private static UserService instance = new UserServiceImpl();

    public static UserService getInstance() {
        return instance;
    }

    Map<String, UserDto> users;

    public UserServiceImpl() {
        this.users = new HashMap<>();
    }

    @Override
    public String join(UserDto user) {
        users.put(user.getUsername(), user);
        return (user.getUsername() + "님 회원 가입을 축하합니다.");
    }

    @Override
    public String login(UserDto user) {

        UserDto userrr = users.get(user.getUsername());
        if (userrr == null) {
            return "사용자가 존재하지 않습니다.";
        }
        else if (userrr.getPassword().equals(user.getPassword())) {
            return userrr.getUsername() + "님 로그인 되었습니다.";
        } else {
            return userrr.getUsername() + "님 비밀번호가 틀렸습니다.";
        }

    }

    @Override
    public UserDto myPage(Scanner input) {
        return null;
    }

    @Override
    public String passwordUpdate(Scanner input) {
        return null;
    }

    @Override
    public String deleteUser(Scanner input) {
        return null;
    }

    @Override
    public Map<String, UserDto> userList(Scanner input) {
        return null;
    }

    @Override
    public List<UserDto> findUserByName(Scanner input) {
        return null;
    }

    @Override
    public List<UserDto> findUserByJob(Scanner input) {
        return null;
    }

    @Override
    public String countUser() {
        return "회원 수: " + users.size() + " ";
    }
}
