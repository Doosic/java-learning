package oop1.ex;

public class Rectangle {
    int width;
    int height;

    int calculateArea() {
        return this.width * this.height;
    }

    int calculatePerimeter() {
        return 2* (this.width + this.height);
    }

    boolean isSquare(){
        return this.width == this.height;
    }
}