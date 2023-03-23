package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String ShoppingTask = "ShoppingTask";
    public static final String PaintingTask = "PaintingTask";
    public static final String DrivingTask = "DrivingTask";

    public final Task makeTask(final String taskClass){
        return switch (taskClass){
            case ShoppingTask -> new ShoppingTask("Grocery","Apple", 10);
            case PaintingTask -> new PaintingTask("Wall","Red","North wall");
            case DrivingTask -> new DrivingTask("Shop","Shop","Bicycle");
            default ->  null;
        };
    }
}
