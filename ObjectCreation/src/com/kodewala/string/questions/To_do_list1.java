package com.kodewala.string.questions;
import java.util.ArrayList;

public class To_do_list1 {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        ArrayList<String> ans = new ArrayList<>();

        // Add tasks
        for (int i = 1; i <= n; i++) {
            ans.add(args[i]);
        }

        System.out.println("Original List : " + ans);

        // Delete task
        int deleteIndex = Integer.parseInt(args[n + 1]);
        ans.remove(deleteIndex);

        System.out.println("After Delete  : " + ans);

        // Update task
        int updateIndex = Integer.parseInt(args[n + 2]);
        String newTask = args[n + 3];

        ans.set(updateIndex, newTask);

        System.out.println("After Update  : " + ans);
    }
}

//5 Buy_milk Buy_biscuit okk done donedone 2 1 Study