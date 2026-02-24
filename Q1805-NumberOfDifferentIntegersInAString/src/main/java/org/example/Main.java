package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int secondHighest(String s) {
        Set<Integer> numSet = new HashSet<>();
        for (char ch: s.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                numSet.add((int)(ch - '0'));
            }
        }
        List<Integer> numList = new ArrayList<>(numSet);
        int n = numList.size();
        numList.sort(null);

        if (n >= 2) {
            return numList.get(n - 2);
        }

        return -1;
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