package org.example;


class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double tax = 0.0f;
        int n = brackets.length;
        int prevUpper = 0;

        for (int i = 0; i < n; i++) {
            int upperi = brackets[i][0];
            int percenti = brackets[i][1];

            if (income > upperi) {
                // normal
                tax += (double)(upperi - prevUpper) * percenti / 100;
            } else {
                // last
                tax += (double)(income - prevUpper) * percenti / 100;
                break;
            }

            prevUpper = upperi;
        }

        return tax;
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