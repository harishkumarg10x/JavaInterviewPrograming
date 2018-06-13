package com.hans.problemsolving.serialization;

import com.hans.problemsolving.optional.parameters.BankAccount;

import java.math.BigDecimal;

/**
 * Created by GBS03795 on 11-05-2018.
 */
public class SerializationApp {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount.BankAccountBuilder("Harish", "002992992").build();
        BigDecimal amount = new BigDecimal("882.92");
        String sAmount = "-882.92";
        BigDecimal sBig = new BigDecimal(sAmount);
        System.out.println("Amount :: " + amount);
        System.out.println("SBig : " + sBig);
        System.out.println(amount.add(sBig).equals(new BigDecimal("0.00")));
    }
}
