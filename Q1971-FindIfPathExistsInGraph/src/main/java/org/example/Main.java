package org.example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> m = new HashMap<>();
        for (var e: edges) {
            if (!m.containsKey(e[0])) {
                m.put(e[0], new ArrayList<>());
            }
            if (!m.containsKey(e[1])) {
                m.put(e[1], new ArrayList<>());
            }
            m.get(e[0]).add(e[1]);
            m.get(e[1]).add(e[0]);
        }

        Deque<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);
        queue.offer(source);
        visited[source] = true;

        while (!queue.isEmpty()) {
            int k = queue.poll();
            if (k == destination) {
                return true;
            }

            for (var x: m.getOrDefault(k, new ArrayList<>())) {
                if (!visited[x]) {
                    queue.offer(x);
                    visited[x] = true;
                }
            }
        }

        return false;
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