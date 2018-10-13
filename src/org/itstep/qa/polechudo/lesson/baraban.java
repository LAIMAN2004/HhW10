package org.itstep.qa.polechudo.lesson;

import java.util.Arrays;
import java.util.Random;

public class baraban {
    int[] arrayValues;

    public baraban(int[] arrayValues) {
        this.arrayValues = arrayValues;
    }

    public void printValues(){
        System.out.println("Содержащиеся значения: "
                + Arrays.toString(arrayValues));
    }

    public int runBaraban(){
        Random random = new Random();
        return arrayValues[random.nextInt(arrayValues.length-1)];
    }

   }
