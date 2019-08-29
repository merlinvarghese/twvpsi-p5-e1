package com.tw.vapasi;

// Models a shape with 4 sides joining at right angle with each other
class Rectangle {
    private double length;
    private double width;

    private Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    private Rectangle(double side) {
        this(side, side);
    }

    //static methods to create square and rectangle, using factory method design pattern
    static Rectangle createSquare(double side) {
        return new Rectangle(side);
    }

    static Rectangle createRectangle(double length, double width) {
        return new Rectangle(length, width);
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }
}
