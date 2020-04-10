package com.aart.mortgage;

public class Range {
    private int[] range;

    public Range(int[] range) {
        this.range = range;
    }

    public int getMin() {
        return range[0];
    }

    public int getMax() {
        return range[range.length-1];
    }
}
