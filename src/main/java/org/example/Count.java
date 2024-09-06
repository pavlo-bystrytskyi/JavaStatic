package org.example;

public class Count {
    private static int totalCount = 0;
    private int instanceCount = 0;

    public static void incrementTotalCount() {
        Count.totalCount++;
    }

    public void incrementInstanceCount() {
        this.instanceCount++;
    }


}
