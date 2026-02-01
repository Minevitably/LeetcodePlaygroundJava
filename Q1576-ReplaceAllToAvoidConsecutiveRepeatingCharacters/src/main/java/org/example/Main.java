package org.example;


class Solution {
    public String modifyString(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);

        char left = '?';
        char right = '?';
        for (int i = 0; i < n; i++)
        {
            if (i + 1 < n) {
                right = sb.charAt(i + 1);
            }
            if (sb.charAt(i) == '?') {
                for (int j = 0; j < 26; j++)
                {
                    char ch = (char)('a' + j);
                    if (ch != left && ch != right) {
                        sb.setCharAt(i, ch);
                        break;
                    }
                }
                
            }
            left = sb.charAt(i);

        }

        return sb.toString();
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