package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        var heightNameMap = new TreeMap<Integer, String>();
        int n = names.length;

        for (int i = 0; i < n; i++) {
            heightNameMap.put(heights[i], names[i]);
        }
        // do not use `List.of()` .
        var ans = new ArrayList<>(heightNameMap.values());
        Collections.reverse(ans);

        return ans.toArray(new String[0]);
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