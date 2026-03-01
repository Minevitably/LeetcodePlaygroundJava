package org.example;

import java.util.Map;
import java.util.TreeMap;

class Solution {
    public int maximumPopulation(int[][] logs) {
        Map<Integer, Integer> m = new TreeMap<>();
        int maxPopulation = 0;
        int year = 1950;

        for (int y = 1950; y < 2050; y++) {
            for (var log: logs) {
                if (y >= log[0] && y < log[1]) {
                    m.put(y, m.getOrDefault(y, 0) + 1);
                }
            }
        }

        for (var entry: m.entrySet()) {
            if (entry.getValue() > maxPopulation) {
                year = entry.getKey();
                maxPopulation = entry.getValue();
            }
        }

        return year;
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