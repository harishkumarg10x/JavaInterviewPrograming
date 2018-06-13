package com.hans.problemsolving.imutable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by GBS03795 on 5/30/2018.
 */
public class UserMain {

    public static void main(String[] args) {
        User user = new User("Hans", new Date());
        System.out.println("Date before modification : " + user.getDate());
        String str = user.getName();
        str = "Vans";
        user.getName().concat("Bans");
        System.out.println(user.getName());
        user.getDate().setTime(1123237475787L);
        System.out.println("Date : " + user.getDate());
        List<Integer> intList = new ArrayList<>();
    }
}
