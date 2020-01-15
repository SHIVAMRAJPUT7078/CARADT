package adt;

public interface ATM {
    double depsit(double amount);

    double withdraw(double amount);

    void showBalance();

    boolean verifyPin(int atmPIN);
}
