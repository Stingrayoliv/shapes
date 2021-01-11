package de.telran.shapes.demo;

import de.telran.shapes.demo.entity.Line;
import de.telran.shapes.demo.entity.Picture;
import de.telran.shapes.demo.entity.Rectangle;
import de.telran.shapes.demo.entity.Shape;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShapeFlow implements ApplicationRunner {
    final Picture picture;

    public ShapeFlow(Picture picture) {
        this.picture = picture;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        picture.draw();
    }
}
