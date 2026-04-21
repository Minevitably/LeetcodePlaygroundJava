package org.example;


class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int sumEnergy = 0;
        int sumExp = initialExperience;
        int hours = 0;
        

        for (int e: energy) {
            sumEnergy += e;
        }
        hours += Math.max(0, sumEnergy + 1 - initialEnergy);

        for (int e: experience) {
            if (sumExp > e) {
                sumExp += e;
            } else {
                hours += e - sumExp + 1;
                sumExp = 2 * e + 1;
            }
        }

        return hours;
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