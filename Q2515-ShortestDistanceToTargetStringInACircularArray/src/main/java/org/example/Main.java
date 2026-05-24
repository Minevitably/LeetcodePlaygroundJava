package org.example;

class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;

        if (words[startIndex].equals(target)) {
            return 0;
        }
        int l = -1;
        int r = -1;
        // right
        int i = (startIndex + 1) % n;
        while (i != startIndex && !words[i].equals(target)) {
            i = (i + 1) % n;
        }
        if (words[i].equals(target)) {
            r = i > startIndex ? i - startIndex : n - (startIndex - i);
        }
        // left
        i = (startIndex - 1 + n) % n;
        while (i != startIndex && !words[i].equals(target)) {
            i = (i - 1 + n) % n;
        }
        if (words[i].equals(target)) {
            l = i < startIndex ? startIndex - i : n - (i - startIndex);
        }

        if (l == -1 || r == -1) {
            return Math.max(l , r);
        }
        return Math.min(l, r);
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