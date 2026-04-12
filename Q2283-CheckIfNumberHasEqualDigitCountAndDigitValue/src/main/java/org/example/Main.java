package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        int n = words.length;
        String[] sortedWords = new String[n];
        List<String> ans = new ArrayList<>();
        Set<Integer> indices = new HashSet<>();

        for (int i = 0; i < n; i++) {
          char[] charArray = words[i].toCharArray();
          Arrays.sort(charArray);
          sortedWords[i] = new String(charArray);
        }
        for (int i = 1; i < n; i++) {
            if (sortedWords[i].equals(sortedWords[i - 1])) {
                indices.add(i);
            }
        }
        for (int i = 0; i < n; i++) {
            if (!indices.contains(i)) {
                ans.add(words[i]);
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