package oop.serviceimpl;

import oop.model.AccountDto;
import oop.service.AccountService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountServiceImpl implements AccountService {

    private static AccountService instance = new AccountServiceImpl();
    List<AccountDto> accounts;

    public static AccountService getInstance() {
        return instance;
    }

    private AccountServiceImpl() {
        this.accounts = new ArrayList<>();
    }

    @Override
    public String createAccount(AccountDto account) {
        accounts.add(account);
        return account.getAccountHolder() + "'s Account creation completed.";
    }

    @Override
    public String deposit(AccountDto account) {
        for (AccountDto acc : accounts) {
            if (acc.getAccountNumber().equals(account.getAccountNumber())) {
                double depositAmount = account.getBalance();
                double currentBalance = acc.getBalance();
                double updateBalance = depositAmount + currentBalance;
                acc.setBalance(updateBalance);
                acc.setTransationDate(LocalDate.now());
                return acc.getAccountHolder() + "'s deposit is completed";
            }
        }
        return "Deposit failed. The account doesn't exist.";
    }

    @Override
    public String withdraw(AccountDto account) {
        for (AccountDto acc : accounts) {
            if (acc.getAccountNumber().equals(account.getAccountNumber())) {
                double withdrawAmount = account.getBalance();
                double currentBalance = acc.getBalance();
                double updateBalance = withdrawAmount - currentBalance;
                acc.setBalance(updateBalance);
                acc.setTransationDate(LocalDate.now());
                return acc.getAccountHolder() + "'s withdrawal is completed";
            }
        }
        return "Withdrawal failed. The account doesn't exist.";
    }

    @Override
    public String getBalance(String accountNumber) {

        return null;
    }

    @Override
    public String cancelAccount(String accountNumber) {
        return null;
    }

    @Override
    public List<AccountDto> getAccounts() {
        return null;
    }
}
