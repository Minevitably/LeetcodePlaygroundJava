package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

class Pair {
    public int key;
    public int val;
    public Pair(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Deque<Pair> q = new ArrayDeque<>();
        int n = tickets.length;
        int seconds = 0;

        for (int i = 0; i < n; i++) {
            q.offer(new Pair(i, tickets[i]));
        }

        while (!q.isEmpty()) {
            Pair item = q.poll();
            seconds++;
            if (item.key == k && item.val == 1) {
                break;
            }
            if (item.val != 1) {
                q.offer(new Pair(item.key, item.val - 1));
            }
        }

        return seconds;
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