package org.itstep.qa.polechudo.runner;

import org.itstep.qa.polechudo.lesson.baraban;

public class runnerbaraban {
    public static void main(String[] args){
        int[] temp = {11, 4444, 23, 4555};
        baraban drum = new baraban(temp);
        drum.printValues();
        System.out.println("Вращайте барабан");
        System.out.println("Сектор " + drum.runBaraban()
                + " на барабане");
        System.out.println("Сектор " + drum.runBaraban()
                + " на барабане");
        System.out.println("Сектор " + drum.runBaraban()
                + " на барабане");
    }

}
