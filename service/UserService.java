package oop.service;

import oop.model.UserDto;

import java.util.List;
import java.util.Map;
import java.util.Scanner;


public interface UserService {

    String join(UserDto user);

    String login(UserDto user);

    UserDto myPage(String username);

    String passwordUpdate(Scanner input);

    String deleteUser(Scanner input);

    Map<String, UserDto> userList();

    List<UserDto> findUserByName(Scanner input);

    List<UserDto> findUserByJob(Scanner input);

    String countUser();
}
