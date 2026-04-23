package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int mostFrequentEven(int[] nums) {
        var cnt = new HashMap<Integer, Integer>();
        int maxCount = 0;
        var ans = new ArrayList<Integer>();

        for (int num: nums) {
            if (num % 2 == 0) {
                cnt.put(num, cnt.getOrDefault(num, 0) + 1);
                maxCount = Math.max(maxCount, cnt.get(num));
            }
        }
        for (var entry: cnt.entrySet()) {
            if (entry.getValue() == maxCount) {
                ans.add(entry.getKey());
            }
        }

        if (ans.isEmpty()) {
            return -1;
        }

        return Collections.min(ans);
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