package org.example;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String reformatNumber(String number) {
        number = number.replace(" ", "").replace("-", "");

        int n = number.length();
        List<String> blocks = new ArrayList<>();
        // the last of us.
        int m = n;
        int i = 0;

        while (m > 4) {
            blocks.add(number.substring(i, i + 3));
            i += 3;
            m -= 3;
        }

        if (m == 2) {
            blocks.add(number.substring(i, i + 2));
        } else if (m == 3) {
            blocks.add(number.substring(i, i + 3));
        } else if (m == 4) {
            blocks.add(number.substring(i, i + 2));
            i += 2;
            blocks.add(number.substring(i, i +2));
        }

        return String.join("-", blocks);
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