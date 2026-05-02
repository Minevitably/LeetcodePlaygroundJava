package org.example;


class Solution {
    private int timestamp(String time) {
        return Integer.valueOf(time.substring(0, 2)) * 60 + 
               Integer.valueOf(time.substring(3, 5));
    }
    public boolean haveConflict(String[] event1, String[] event2) {
        int s1 = timestamp(event1[0]);
        int e1 = timestamp(event1[1]);
        int s2 = timestamp(event2[0]);
        int e2 = timestamp(event2[1]);

        if (s1 <= s2 && s2 <= e1) {
            return true;
        }
        if (s2 <= s1 && s1 <= e2) {
            return true;
        }
        return false;
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