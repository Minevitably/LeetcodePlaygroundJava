package org.example;

import java.util.*;

class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        var ret = new ArrayList<List<Integer>>();
        var retMap = new TreeMap<Integer, Integer>();

        for (var vec: items1) {
            int k = vec[0];
            int v = vec[1];
            retMap.put(k, v);
        }
        for (var vec: items2) {
            int k = vec[0];
            int v = vec[1];
            retMap.put(k, retMap.getOrDefault(k, 0) + v);
        }
        for (var entry: retMap.entrySet()) {
            var arr = new Integer[2];
            arr[0] = entry.getKey();
            arr[1] = entry.getValue();
            ret.add(Arrays.asList(arr));
        }

        return ret;
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