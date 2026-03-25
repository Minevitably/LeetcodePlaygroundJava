package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int countPoints(String rings) {
        int n = rings.length();
        List<Set<Character>> rods = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            rods.add(new HashSet<>());
        }
        int count = 0;

        for (int i = 0; i < n; i += 2) {
            int rodIndex = (int)(rings.charAt(i + 1) - '0');
            rods.get(rodIndex).add(rings.charAt(i));
        }
        for (var rod: rods) {
            if (rod.size() == 3) {
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