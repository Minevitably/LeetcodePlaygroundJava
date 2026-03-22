package org.example;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> cnt1 = new HashMap<>();
        Map<String, Integer> cnt2 = new HashMap<>();
        int count = 0;

        for (String word: words1) {
            cnt1.put(word, cnt1.getOrDefault(word, 0) + 1);
        }
        for (String word: words2) {
            cnt2.put(word, cnt2.getOrDefault(word, 0) + 1);
        }
        for (var entry: cnt1.entrySet()) {
            if (entry.getValue() == 1 && cnt2.getOrDefault(entry.getKey(), 0) == 1) {
                count++;
            }
        }

        return count;
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