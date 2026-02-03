package org.example;


class Solution {
    public String reorderSpaces(String text) {
        StringBuilder ans = new StringBuilder();
        String[] words = text.trim().split("[ ]+");
        int n = text.length();
        int spaceCount = 0;
        int wordCount = words.length;
        int remainder = 0;
        int spaces = 0;

        for (int i = 0; i < n; i++)
        {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        if (wordCount > 1) {
            remainder = spaceCount % (wordCount - 1);
            spaces = spaceCount / (wordCount - 1);
        } else {
            remainder = spaceCount;
        }

        for (int i = 0; i < wordCount; i++)
        {
            ans.append(words[i]);
            if (i != wordCount - 1) {
                ans.append(String.valueOf(' ').repeat(spaces));
            }
        }
        ans.append(String.valueOf(' ').repeat(remainder));
        

        return ans.toString();
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