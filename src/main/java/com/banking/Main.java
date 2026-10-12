
package com.banking;

import com.banking.model.BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount account =
                new BankAccount(100001, "Rahul", 5000);

        account.deposit(1000);
        account.withdraw(500);

        System.out.println("Account Holder: "
                + account.getAccountHolderName());

        System.out.println("Final Balance: "
                + account.getBalance());
    }
}
