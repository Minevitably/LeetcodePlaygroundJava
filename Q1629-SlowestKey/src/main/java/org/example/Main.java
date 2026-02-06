package org.example;

import java.util.Arrays;

class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char ans = '\0';
        int n = keysPressed.length();
        int[] durations = new int[n];
        Arrays.fill(durations, 0);
        int maxDuration = 0;

        int prev = 0;
        for (int i = 0; i < n; i++)
        {
            durations[i] = releaseTimes[i] - prev;
            prev = releaseTimes[i];
            maxDuration = Math.max(maxDuration, durations[i]);
        }

        for (int i = 0; i < n; i++)
        {
            if (durations[i] == maxDuration) {
                if (ans < keysPressed.charAt(i)) {
                    ans = keysPressed.charAt(i);
                }
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