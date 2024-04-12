package via.doc1.ex8.model;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void ctorTest()
    {
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        Task testTask = new Task(taskId, taskName, taskDesc);
        assertTrue(testTask.getId().equals(taskId));
        assertTrue(testTask.getName().equals(taskName));
        assertTrue(testTask.getDescription().equals(taskDesc));
    }
    @Test
    public void equalsTest()
    {
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        Task testTask = new Task(taskId, taskName, taskDesc);
        Task testTask2 = new Task(taskId, taskName, taskDesc);
        assertTrue(testTask.equals(testTask2));
    }
    @Test
    public void setIdTest()
    {
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        Task testTask = new Task(taskId, taskName, taskDesc);
        String newId = "Task2";
        testTask.setId(newId);
        assertTrue(testTask.getId().equals(newId));
    }
}
