package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class OrderedStream {
    private String[] s;
    int next;

    public OrderedStream(int n) {
        s = new String[n];
        Arrays.fill(s, null);
        next = 0;
    }
    
    public List<String> insert(int idKey, String value) {
        s[idKey - 1] = value;
        int n = s.length;
        List<String> ans = new ArrayList<>();
        while(next < n && s[next] != null) {
            ans.add(s[next]);
            next++;
        }
        return ans;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */

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