package org.example;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private int getBoxNumber(int ballNumber) {
        int sum = 0;

        while (ballNumber > 0) {
            sum += ballNumber % 10;
            ballNumber /= 10;
        }

        return sum;
    }

    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> boxCount = new HashMap<>();
        int maxCount = 0;

        for (int i = lowLimit; i <= highLimit; i++) {
            int boxNumber = getBoxNumber(i);
            boxCount.put(boxNumber, boxCount.getOrDefault(boxNumber, 0) + 1);
            maxCount = Math.max(maxCount, boxCount.get(boxNumber));
        }

        return maxCount;
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}