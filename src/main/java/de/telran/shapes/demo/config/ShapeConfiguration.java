package de.telran.shapes.demo.config;

import de.telran.shapes.demo.entity.Line;
import de.telran.shapes.demo.entity.Picture;
import de.telran.shapes.demo.entity.Rectangle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.Arrays;

@Configuration
public class ShapeConfiguration {
    @Bean
    @Order(1)
    public Line line() {
        return new Line('*', 15);
    }

    @Bean
    @Order(2)
    public Rectangle rectangle() {
        return new Rectangle('@', 3, 5);
    }

    @Bean
    @Order(3)
    public Picture picture(Line line, Rectangle rectangle) {
        return new Picture('-',  Arrays.asList(line, rectangle));
    }
}
