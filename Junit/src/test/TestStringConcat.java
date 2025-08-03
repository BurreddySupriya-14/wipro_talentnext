package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import task.DailyTasks;

public class TestStringConcat {

    @Test
    public void testDoStringConcat() {
        DailyTasks tasks = new DailyTasks();
        String result = tasks.doStringConcat("Hello", "World");
        assertEquals("Hello World", result);
    }
}