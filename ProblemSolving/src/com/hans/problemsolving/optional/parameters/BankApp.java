package com.hans.problemsolving.optional.parameters;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by GBS03795 on 09-05-2018.
 */
public class BankApp {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount.BankAccountBuilder("Hans India", "88377999777")
                .withEmail("support@hanin.in").build();
        System.out.println("Bank Payee Name :: " + bankAccount.getName());
        System.out.println("Date : " + new Date());
        System.out.println("LocalDateTime Java8 : " + LocalDateTime.now());
    }
}
