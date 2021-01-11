package de.telran.shapes.demo.entity;

public class Rectangle extends Shape {
    private int width;
    private int length;


    public Rectangle(char symbol, int width, int length) {
        super(symbol);
        this.width = width;
        this.length = length;
    }


    @Override
    public void draw() {
        System.out.print("\n");

        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= length; j++) {
                if (i == 1 || j == 1 || i == width || j == length) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
