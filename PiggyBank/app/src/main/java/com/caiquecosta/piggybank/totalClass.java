package com.caiquecosta.piggybank;

import java.text.NumberFormat;

/**
 * Created by caiquecosta on 9/18/17.
 */

public class totalClass {
    static NumberFormat formatter = NumberFormat.getCurrencyInstance();
    public static Double total = 0.0;

    public static void addPenny(){
        total += 0.01;
    }

    public static void subtractPenny(){
        total -= 0.01;
    }

    public static void addNickel(){
        total += 0.05;
    }

    public static void subtractNickel(){
        total -= 0.05;
    }

    public static void addDime(){
        total += 0.10;
    }

    public static void subtractDime(){
        total -= 0.10;
    }

    public static void addQuarter(){
        total += 0.25;
    }

    public static void subtractQuarter(){
        total -= 0.25;
    }

    public static void addDollar(){
        total += 1.00;
    }

    public static void subttractDollar(){
        total -= 1.00;
    }

    public static String getTotal(){
        return "Savings: " + formatter.format(total).toString();
    }
}
