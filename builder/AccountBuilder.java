package oop.builder;

import oop.model.AccountDto;

import java.time.LocalDate;
import java.util.Scanner;

public class AccountBuilder {

    private Long id;
    private String accountNumber; // 계좌번호
    private String accountHolder; // 계좌 소유주
    private double balance; // 잔액
    private LocalDate transationDate; // 시간 저장

    public AccountBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public AccountBuilder accountNum(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public AccountBuilder accountHold(String accountHolder) {
        this.accountHolder = accountHolder;
        return this;
    }

    public AccountBuilder accountBalance(double balance) {
        this.balance = balance;
        return this;
    }

    public AccountBuilder date(LocalDate transationDate) {
        this.transationDate = transationDate;
        return this;
    }

    public AccountDto build() {
        return new AccountDto(id, accountNumber, accountHolder, balance, transationDate);
    }
}
