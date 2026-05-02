package org.example;


class Solution {
    public int countTime(String time) {
        var h = time.substring(0, 2).toCharArray();
        var m = time.substring(3, 5).toCharArray();
        int hCount = 1;
        int m0Count = 1;
        int m1Count = 1;

        if (h[0] == '?' && h[1] == '?') {
            hCount = 24;
        }
        if (h[0] == '?' && h[1] != '?') {
            if (h[1] > '3') {
                hCount = 2;
            } else {
                hCount = 3;
            }
        }
        if (h[0] != '?' && h[1] == '?') {
            if (h[0] == '2') {
                hCount = 4;
            } else {
                hCount = 10;
            }

        }
        if (h[0] != '?' && h[1] != '?') {
            hCount = 1;
        }

        if (m[0] == '?') {
            m0Count = 6;
        }
        if (m[1] == '?') {
            m1Count = 10;
        }

        return hCount * m0Count * m1Count;
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