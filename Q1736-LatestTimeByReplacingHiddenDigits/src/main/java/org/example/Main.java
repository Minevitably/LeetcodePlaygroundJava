package org.example;


class Solution {
    public String maximumTime(String time) {
        char[] timeChar = time.toCharArray();
        char h0 = timeChar[0];
        char h1 = timeChar[1];
        char m0 = timeChar[3];
        char m1 = timeChar[4];

        if (h0 == '?' && h1 == '?') {
            h0 = '2';
            h1 = '3';
        } else {
            if (h0 == '?') {
                h0 = h1 > '3' ?  '1' : '2';
            }
            if (h1 == '?') {
                h1 = h0 > '1' ? '3' : '9';
            }
        }

        if (m0 == '?' && m1 == '?') {
            m0 = '5';
            m1 = '9';
        } else {
            if (m0 == '?') {
                m0 = '5';
            }
            if (m1 == '?') {
                m1 = '9';
            }
        }

        timeChar[0] = h0;
        timeChar[1] = h1;
        timeChar[3] = m0;
        timeChar[4] = m1;

        return new String(timeChar);
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