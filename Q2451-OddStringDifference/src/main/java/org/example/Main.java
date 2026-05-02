package org.example;

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    private String difference(String word) {
        int n = word.length();
        var ans = new StringBuilder();

        for (int i = 1; i < n; i++) {
            ans.append(String.valueOf((int)(word.charAt(i) - word.charAt(i - 1))));
            ans.append(',');
        }

        return ans.toString();
    }

    public String oddString(String[] words) {
        var cnt = new HashMap<String, Integer>();
        var candidates = new ArrayList<String>();

        for (String word: words) {
            String d = difference(word);
            cnt.put(d, cnt.getOrDefault(d, 0) + 1);
            if (cnt.get(d) == 1) {
                candidates.add(word);
            }
        }
        for (String s: candidates) {
            if (cnt.get(difference(s)) == 1) {
                return s;
            }
        }

        return "";
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