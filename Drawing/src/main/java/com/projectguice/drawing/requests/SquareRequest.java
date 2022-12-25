package com.projectguice.drawing.requests;

import com.google.inject.Inject;
import com.projectguice.drawing.services.models.DrawShape;

public class SquareRequest {
    DrawShape d;
    @Inject
    public SquareRequest(DrawShape d) {
        this.d = d;
    }
    public void makeRequest() {
        this.d.draw();
    }
    public DrawShape getDraw() {
        return this.d;
    }
}
