package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Test;
import java.util.*;

public class TodoListTest {
    @Test
	public void testTodoList_fail() throws Exception {
        List<String> task = new ArrayList<>();
        task.add("Java");
        task.add("Maven");
        task.add("Spring");
        
        List<String> taskDone = new ArrayList<>();
        taskDone.add(task.get(1));
        task.remove(1);
        
        System.out.println("\nTugas yang ada = " + task);
        System.out.println("\nTugas yang selesai = " + taskDone);
	}
}
