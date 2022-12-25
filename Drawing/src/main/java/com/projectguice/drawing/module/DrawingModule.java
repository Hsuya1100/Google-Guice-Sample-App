package com.projectguice.drawing.module;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.projectguice.drawing.annotations.ColorValue;
import com.projectguice.drawing.requests.SquareRequest;
import com.projectguice.drawing.services.DrawSquare;
import com.projectguice.drawing.services.models.DrawShape;

public class DrawingModule extends AbstractModule{

    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawSquare.class).in(Singleton.class);
        bind(String.class)
                .annotatedWith(ColorValue.class)
                .toInstance("BLUE");
        bind(Integer.class)
                .annotatedWith(ColorValue.class)
                .toInstance(15);
        bind(SquareRequest.class).in(Singleton.class);
    }
}
