package org.example;


class Solution {
    private int getDay(String date) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = Integer.valueOf(date.substring(0, 2));
        int day = Integer.valueOf(date.substring(3, 5));
        int count = 0;

        for (int i = 0; i < month - 1; i++) {
            count += days[i];
        }
        count += day;

        return count;
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int arriveAliceDay = getDay(arriveAlice);
        int leaveAliceDay = getDay(leaveAlice);
        int arriveBobDay = getDay(arriveBob);
        int leaveBobDay = getDay(leaveBob);
        int start = Math.max(arriveAliceDay, arriveBobDay);
        int end = Math.min(leaveAliceDay, leaveBobDay);

        if (end < start) {
            return 0;
        }
        return end - start + 1;
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