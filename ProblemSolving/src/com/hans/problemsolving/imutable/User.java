package com.hans.problemsolving.imutable;

import java.util.Date;

/**
 * Created by GBS03795 on 5/30/2018.
 */
public final class User {

    private String name;
    private Date date;

    public User(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return (Date) date.clone();
    }
}
