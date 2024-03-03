package oop.service;

import oop.model.AccountDto;

import java.util.List;
import java.util.Scanner;

public interface AccountService {

    public String createAccount(AccountDto account);

    public String deposit(AccountDto account);

    public String withdraw(AccountDto account);

    String getBalance(String accountNumber);

    String cancelAccount(String accountNumber);

    public List<AccountDto> getAccounts(String accountNumber);
}
