package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        Map<Integer, Integer> cnt = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for (int v: nums1) {
            set1.add(v);
        }
        for (int v: nums2) {
            set2.add(v);
        }
        for (int v: nums3) {
            set3.add(v);
        }

        for (int v: set1) {
            cnt.put(v, cnt.getOrDefault(v, 0) + 1);
        }
        for (int v: set2) {
            cnt.put(v, cnt.getOrDefault(v, 0) + 1);

        }
        for (int v: set3) {
            cnt.put(v, cnt.getOrDefault(v, 0) + 1);
        }
        for (var entry: cnt.entrySet()) {
            if (entry.getValue() >= 2) {
                ans.add(entry.getKey());
            }
        }

        return ans;
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