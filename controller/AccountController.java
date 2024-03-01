package oop.controller;

import oop.builder.AccountBuilder;
import oop.model.AccountDto;
import oop.service.AccountService;
import oop.serviceimpl.AccountServiceImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class AccountController {

    AccountService accountService;

    public AccountController() {
        this.accountService = AccountServiceImpl.getInstance();
    }

    public String createAccount(Scanner input) {
        System.out.println("Please input [sequence] [account] [accountHolder] [balance] you wish to register");
        System.out.print("[Input] : ");
        return accountService.createAccount(new AccountBuilder()
                .id(input.nextLong())
                .accountNum(input.next())
                .accountHold(input.next())
                .accountBalance(input.nextDouble())
                .date(LocalDate.now())
                .build());

    }

    public String deposit(Scanner input) {
        System.out.println("Input the amount you wish to deposit.");
        System.out.print("[Input Account Number] [Input Deposit Amount] : ");
        return accountService.deposit(new AccountBuilder()
                .accountNum(input.next())
                .accountBalance(input.nextDouble())
                .date(LocalDate.now())
                .build());
    }

    public String withdraw(Scanner input) {
        System.out.println("Input the amount you wish to withdraw.");
        System.out.print("[Input Account Number] [Input Withdraw Amount] : ");
        return accountService.withdraw(new AccountBuilder()
                .accountNum(input.next())
                .accountBalance(input.nextDouble())
                .date(LocalDate.now())
                .build());
    }

    public String getBalance(Scanner input) {
        return accountService.getBalance(input.next());
    }

    public String cancelAccount(Scanner input) {
        System.out.print("Input the account number you wish to cancel.");
        System.out.print("[Input] : ");
        return accountService.cancelAccount(input.next());

    }

    public List<AccountDto> getAccounts(Scanner input) {
        return accountService.getAccounts();
    }
}
