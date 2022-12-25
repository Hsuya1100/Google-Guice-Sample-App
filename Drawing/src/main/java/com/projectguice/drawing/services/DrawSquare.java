package com.projectguice.drawing.services;

import com.google.inject.Inject;
import com.projectguice.drawing.annotations.ColorValue;
import com.projectguice.drawing.services.models.DrawShape;

public class DrawSquare implements DrawShape {
    String color;
    Integer edge;
    @Inject
    public DrawSquare(@ColorValue String color,@ColorValue Integer edge) {
        this.color = color;
        this.edge = edge;
    }
    @Override
    public void draw() {
        System.out.println("DrawSquare");
        System.out.println("Specs: color=" + this.color + "  Edge=" + this.edge);
    }
}
