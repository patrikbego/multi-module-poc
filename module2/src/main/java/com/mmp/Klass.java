package com.mmp;

/**
 * Created by patrik007 on 22/01/2017.
 */
public class Klass {

    public void printConfirmation() {
        System.out.println("Module 2 import");
        KlassModule1 klass = new KlassModule1();
        klass.printConfirmation();
    }
}
