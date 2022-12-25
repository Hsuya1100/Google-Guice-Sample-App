package org.projectguice.drawing.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.projectguice.drawing.module.DrawingModule;
import com.projectguice.drawing.requests.SquareRequest;
import com.projectguice.drawing.services.DrawSquare;
import com.projectguice.drawing.services.models.DrawShape;

public class GuiceDemo {


    private static final String SQUARE_REQ = "Square";
    private static void sendRequest(String squareRequest) {
        if(squareRequest.equals(SQUARE_REQ)) {
            Injector injector = Guice.createInjector(new DrawingModule());
            SquareRequest req = injector.getInstance(SquareRequest.class);
            SquareRequest req2 = injector.getInstance(SquareRequest.class);
            req.makeRequest();
            req2.makeRequest();
            System.out.println(req.getDraw());
            System.out.println(req2.getDraw());
            System.out.println(req2);
            System.out.println(req);

        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        sendRequest(SQUARE_REQ);
    }
}