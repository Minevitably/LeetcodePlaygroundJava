package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> q = new ArrayDeque<>();
        Deque<Integer> s = new ArrayDeque<>();
        int n = sandwiches.length;
        int sum = 0;
        for (int v: students) {
            q.offer(v);
            sum += v;
        }

        for (int i = 0; i < n; i++) {
            s.push(sandwiches[n - i - 1]);
        }

        while (!q.isEmpty() && !((sum == q.size() || sum == 0) && s.peek() != q.peek())) {
            if (s.peek() == q.peek()) {
                sum -= s.peek();
                s.pop();
                q.poll();
            } else {
                q.offer(q.peek());
                q.poll();
            }
        }
        
        return q.size();
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        (new Solution()).countStudents(new int[]{1, 1, 0, 0}, new int[]{0, 1, 0, 1});

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}