package org.example;


class Solution {
    public int numSpecial(int[][] mat) {
        int ans = 0;
        int m = mat.length;
        int n = mat[0].length;

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                boolean flag = true;
                if (mat[i][j] == 0) {
                    flag = false;
                }
                // check row
                for (int r = 0; r < m && flag; r++)
                {
                    if (r != i && mat[r][j] == 1) {
                        flag = false;
                        break;
                    }
                }
                // check col
                for (int c = 0; c < n && flag; c++)
                {
                    if (c != j && mat[i][c] == 1) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    ans++;
                }
            }
            
        }
        

        return ans;
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