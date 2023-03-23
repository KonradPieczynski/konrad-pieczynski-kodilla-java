package com.kodilla.patterns.factory.tasks;

import java.util.Objects;

public class PaintingTask implements Task {
    String taskName;
    String color;
    String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        whatToPaint = "";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return Objects.equals(whatToPaint, "");
    }
}
