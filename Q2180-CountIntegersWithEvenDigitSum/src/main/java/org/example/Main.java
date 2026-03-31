package org.example;

class Solution {
    public int countEven(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            String s = String.valueOf(i);
            int sum = 0;
            for (char ch: s.toCharArray()) {
                sum += (int)(ch - '0');
            }
            if (sum % 2 == 0) {
                count++;
            }
        }

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