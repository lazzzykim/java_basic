package access.b;

import access.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        bankAccount.withDraw(3000);
        System.out.println("balance = " + bankAccount.getBalance());
    }
}
