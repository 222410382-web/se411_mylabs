package edu.psu.se411;

import edu.psu.se411.wallet.WalletAccount;
import edu.psu.se411.exceptions.InsufficientFundsException;

public class EX2 {

    public static void main(String[] args) {
        WalletAccount wallet = new WalletAccount(100.0);

        System.out.println("Initial Balance: " + wallet.getBalance());

        try {
        	
        	wallet.withdraw(150.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
             
        	wallet.withdraw(50.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Final Balance: " + wallet.getBalance());
    }
}