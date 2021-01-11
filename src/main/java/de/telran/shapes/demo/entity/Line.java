package de.telran.shapes.demo.entity;

public class Line extends Shape {
    private int length;

    public Line(char symbol, int length) {
        super(symbol);
        this.length = length;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        while (length > 0) {
            stringBuilder.append(String.valueOf(symbol));
            length--;
        }
        System.out.println(stringBuilder);
    }
}
