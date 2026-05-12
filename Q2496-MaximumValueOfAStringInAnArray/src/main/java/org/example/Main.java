package org.example;


class Solution {
    private int str2int(String str) {
        for (char ch: str.toCharArray()) {
            if (ch < '0' || ch > '9') {
                return str.length();
            }
        }
        return Integer.valueOf(str);
    }
    public int maximumValue(String[] strs) {
        int maxVal = str2int(strs[0]);

        for (String str: strs) {
            maxVal = Math.max(maxVal, str2int(str));
        }

        return maxVal;
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