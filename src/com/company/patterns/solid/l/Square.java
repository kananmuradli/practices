package com.company.patterns.solid.l;

public class Square implements Shape{

    private final int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public int getArea() {
        return width * width;
    }
}
