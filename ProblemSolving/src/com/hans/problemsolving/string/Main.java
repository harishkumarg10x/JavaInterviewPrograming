package com.hans.problemsolving.string;

/**
 * Created by GBS03795 on 6/8/2018.
 */
public class Main {
    public static void main(String[] args) {

        SampleClass sampleClass = new SampleClass("RamkiRR");
        System.out.println("In Main before calling method: "+sampleClass+" value: "+sampleClass.getVal());
        method(sampleClass);
        System.out.println("In Main after calling method: "+sampleClass+" value: "+sampleClass.getVal());
    }

    private static void method(SampleClass sampleClass) {
        System.out.println("Before: "+sampleClass+" value: "+sampleClass.getVal());
        sampleClass.setVal("Anandh");
        System.out.println("After setting value original param: "+sampleClass+" value: "+sampleClass.getVal());
        sampleClass = new SampleClass("Ramki");
        System.out.println("After: "+sampleClass+" value: "+sampleClass.getVal());

    }
}
