package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Pair {
    public int k;
    public int v;
    public Pair(int k, int v) {
        this.k = k;
        this.v = v;
    }
}

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        List<Pair> pairs = new ArrayList<>();
        int[] ans = new int[k];
        Arrays.fill(ans, 0);
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            pairs.add(new Pair(i, nums[i]));
        }
        // sort of values
        pairs.sort((a, b) -> Integer.compare(b.v, a.v));

        // sort the first k elements of keys
        List<Pair> kPairs = pairs.subList(0, k);
        kPairs.sort((a, b) -> Integer.compare(a.k, b.k));

        for (int i = 0; i < k; i++) {
            ans[i] = kPairs.get(i).v;
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