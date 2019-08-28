package com.tw.vapasi;

// Models a shape with 4 sides joining at right angle with each other
class Rectangle {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area(){
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }
}
