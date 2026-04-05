package org.example;


class Solution {
    public int convertTime(String current, String correct) {
        int currentVal = Integer.valueOf(current.substring(0, 2)) * 60 + 
                         Integer.valueOf(current.substring(3));
        int correctVal = Integer.valueOf(correct.substring(0, 2)) * 60 + 
                         Integer.valueOf(correct.substring(3));
        int delta = correctVal - currentVal;
        int count = 0;

        count += delta / 60;
        delta %= 60;
        count += delta / 15;
        delta %= 15;
        count += delta / 5;
        delta %= 5;
        count += delta;

        return count;
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