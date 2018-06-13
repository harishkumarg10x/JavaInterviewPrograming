package com.hans.problemsolving.optional.parameters;

import java.io.Serializable;

/**
 * Created by GBS03795 on 09-05-2018.
 */
public class BankAccount implements Serializable {

    private String name;
    private String accountNumber;
    private String email;
    private String newsLetter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNewsLetter() {
        return newsLetter;
    }

    public void setNewsLetter(String newsLetter) {
        this.newsLetter = newsLetter;
    }

    private BankAccount(BankAccountBuilder bankAccountBuilder) {
        this.name = bankAccountBuilder.name;
        this.accountNumber = bankAccountBuilder.accountNumber;
        this.email = bankAccountBuilder.email;
        this.newsLetter = bankAccountBuilder.newsLetter;
    }

    public static class BankAccountBuilder {
        private String name;
        private String accountNumber;
        private String email;
        private String newsLetter;

        public BankAccountBuilder(String name, String accountNumber) {
            this.name = name;
            this.accountNumber = accountNumber;
        }

        public BankAccountBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public BankAccountBuilder withNewsLetter(String newsLetter) {
            this.newsLetter = newsLetter;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }
}
