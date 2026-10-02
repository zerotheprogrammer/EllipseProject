package edu.westga.cs5311.ellipse.view.part3;

/**
 * Runs the interactive Ellipse application.
 *
 * @author Asia Webb
 * @version 9/18/2026
 */
public class EllipseDriver {

    /**
     * Runs the Ellipse application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        EllipseView view = new EllipseView();

        view.inputEllipseValues();
        view.initializeEllipse();
        view.demoEllipse();
    }
}