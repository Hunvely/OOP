package oop.model;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString


public class AccountDto {

    private Long id;
    private String accountNumber; // 계좌번호
    private String accountHolder; // 계좌 소유주
    private double balance; // 잔액
    private LocalDate transationDate; // 시간 저장

}
