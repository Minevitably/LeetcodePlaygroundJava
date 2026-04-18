package org.example;

import java.util.Arrays;

class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] cnt = new int[101];
        Arrays.fill(cnt, 0);
        int[] answer = new int[2];
        Arrays.fill(answer, 0);

        for (int num: nums) {
            cnt[num]++;
        }

        for (int c: cnt) {
            answer[0] += c / 2;
            if (c % 2 == 1) {
                answer[1]++;
            }
        }

        return answer;
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