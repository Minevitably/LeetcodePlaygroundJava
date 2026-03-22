package org.example;


class Solution {
    public int maxDistance(int[] colors) {
        int lr = -1;
        int rl = -1;
        int n = colors.length;
        int pivot = colors[0];

        for (int i = n - 1; i >= 0; i--) {
            if (colors[i] != pivot) {
                lr = i;
                break;
            }
        }

        // maybe no need to update pivot = colors[n - 1]
        for (int i = 0; i < n; i++) {
            if (colors[i] != pivot) {
                rl = n - 1 - i;
                break;
            }
        }

        return Math.max(lr, rl);
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