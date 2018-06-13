package com.hans.problemsolving.optional.parameters;

/**
 * Created by GBS03795 on 09-05-2018.
 */
public class MultiVitamin {

    private static int CALCIUM_AMT_DEF = 0;
    private static int CALCIUM_AMT_WOMEN = 20;
    private static int IRON_AMT_MEN =  20;
    private static int IRON_AMT_DEF = 0;

    private String name;
    private int vitaminA;
    private int vitaminC;
    private int calicium;
    private int iron;

    private MultiVitamin(String name, int vitaminA, int vitaminC, int calicium, int iron) {
        this.name = name;
        this.vitaminA = vitaminA;
        this.vitaminC = vitaminC;
        this.calicium = calicium;
        this.iron = iron;
    }

    public static MultiVitamin forMen(String name) {
        return new MultiVitamin(name, 5000, 60, CALCIUM_AMT_DEF, IRON_AMT_MEN);
    }

    public static MultiVitamin forWomen(String name) {
        return new MultiVitamin(name, 5000, 60, CALCIUM_AMT_WOMEN, IRON_AMT_MEN);
    }
}
