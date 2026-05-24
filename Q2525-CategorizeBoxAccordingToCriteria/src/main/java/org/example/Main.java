package org.example;

class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean isBulky = false;
        boolean isHeavy = false;

        long v = (long)(length) * width * height;
        if (length >= 10000 || width >= 10000 || height >= 10000 || v >= 1000000000L) {
            isBulky = true;
        }
        if (mass >= 100) {
            isHeavy = true;
        }

        if (isBulky && isHeavy) {
            return "Both";
        }
        if (!(isBulky || isHeavy)) {
            return "Neither";
        }
        if (isBulky) {
            return "Bulky";
        }
        return "Heavy";
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