package org.example;

class Solution {
    public String capitalizeTitle(String title) {
        String[] tokens = title.split(" ");

        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = tokens[i].toLowerCase();
            if (tokens[i].length() > 2) {
                tokens[i] = String.valueOf(tokens[i].charAt(0)).toUpperCase() + 
                            tokens[i].substring(1);
            }
        }

        return String.join(" ", tokens);
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