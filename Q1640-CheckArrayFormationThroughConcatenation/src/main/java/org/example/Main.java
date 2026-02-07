package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

record Pair(int key, int val) {
}

class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        List<Pair> cnt = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for (int num: nums) {
            m.put(num, m.getOrDefault(num, 0) + 1);
        }

        for (var entry: m.entrySet()) {
            cnt.add(new Pair(entry.getKey(), entry.getValue()));
        }

        cnt.sort((a, b) -> {
            if (a.val() == b.val()) {
                return Integer.compare(b.key(), a.key());
            }
            return Integer.compare(a.val(), b.val());
        });

        for (var pair: cnt) {
            for (int i = 0; i < pair.val(); i++)
            {
                ans.add(pair.key());
            }
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
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