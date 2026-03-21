package org.example;

import java.util.HashSet;
import java.util.Set;

class Solution
{
    public int countVowelSubstrings(String word)
    {
        int vow = 0;
        int n = word.length();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < n-4; i++)
        {
            set.clear();
            for(int j = i; j < n; j++)
            {
                char ch = word.charAt(j);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    set.add(ch);
                    if(set.size() == 5)
                        vow++;
                }
                else
                    break;
            }
        }
        return vow;
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