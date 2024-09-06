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

    @Override
    public String toString() {
        return " Count{" +
                " instanceCount= " + instanceCount +
                " totalCount= " + Count.totalCount +

                '}';
    }
}
