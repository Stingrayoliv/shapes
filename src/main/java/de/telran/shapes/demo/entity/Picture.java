package de.telran.shapes.demo.entity;

import java.util.List;

public class Picture extends Shape {
    private List<Shape> shapeList;

    public Picture(char symbol, List<Shape> shapeList) {
        super(symbol);
        this.shapeList = shapeList;
    }

    @Override
    public void draw() {
        drawLineWithConstantLength(20);

        System.out.print("\n");
        for (Shape shape : shapeList) {
            shape.draw();
        }

        drawLineWithConstantLength(20);
    }

    public void drawLineWithConstantLength(int length) {
        System.out.print("\n");

        StringBuilder stringBuilder = new StringBuilder();
        while (length > 0) {
            stringBuilder.append(String.valueOf(symbol));
            length--;
        }
        System.out.println(stringBuilder);
    }
}
