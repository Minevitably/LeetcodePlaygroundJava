package org.example;

import java.util.HashMap;

class Solution {
    private int str2int(String str) {
        int v = 0;
        for (char c: str.toCharArray()) {
            v |= (1 << (int)(c - 'a'));
        }
        return v;
    }
    public int similarPairs(String[] words) {
        var cnt = new HashMap<Integer, Integer>();
        
        int ans = 0;
        for (String word: words) {
            int k = str2int(word);
            cnt.put(k, cnt.getOrDefault(k, 0) + 1);
        }
        for (var e: cnt.entrySet()) {
            ans += e.getValue() * (e.getValue() - 1) / 2;
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