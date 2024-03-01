package oop.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class UserDto {

    private String username;
    private String password;
    private String rePassword;
    private String name;
    private String phoneNumber;
    private String adress;
    private String job;

}
