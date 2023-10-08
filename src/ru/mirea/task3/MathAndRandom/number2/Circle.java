package ru.mirea.task3.MathAndRandom.number2;

public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
