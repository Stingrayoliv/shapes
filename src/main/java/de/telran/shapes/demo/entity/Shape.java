package de.telran.shapes.demo.entity;


public abstract class Shape {
    protected char symbol;

    public Shape(char symbol) {
        this.symbol = symbol;
    }

    public abstract void draw();
}
