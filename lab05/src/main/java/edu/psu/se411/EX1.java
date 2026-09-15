package edu.psu.se411;

import edu.psu.se411.exceptions.InvalidAgeException;

public class EX1 {

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is invalid: " + age + ". Must be 18 or older.");
        }
        System.out.println("Age valid message.");
    }

    public static void main(String[] args) {
        try {
            validateAge(15); 
            validateAge(20);                 
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}