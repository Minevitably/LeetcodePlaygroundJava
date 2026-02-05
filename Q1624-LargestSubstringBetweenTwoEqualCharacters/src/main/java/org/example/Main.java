package org.example;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxLength = -1;
        int n = s.length();
        Map<Character, Integer> charMinIndex = new HashMap<>();
        Map<Character, Integer> charMaxIndex = new HashMap<>();
    

        for (int i = 0; i < n; i++)
        {
            if (!charMinIndex.containsKey(s.charAt(i))) {
                charMinIndex.put(s.charAt(i), i);
            }
            if (!charMaxIndex.containsKey(s.charAt(i))) {
                charMaxIndex.put(s.charAt(i), i);
            }

            charMinIndex.put(s.charAt(i), Math.min(charMinIndex.get(s.charAt(i)), i));
            charMaxIndex.put(s.charAt(i), Math.max(charMaxIndex.get(s.charAt(i)), i));

        }

        for (Map.Entry<Character, Integer> entry: charMinIndex.entrySet()) {
            maxLength = Math.max(maxLength, charMaxIndex.get(entry.getKey()) - entry.getValue() - 1);
        }

        return maxLength;
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