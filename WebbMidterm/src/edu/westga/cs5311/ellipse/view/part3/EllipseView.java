package edu.westga.cs5311.ellipse.view.part3;

import java.awt.geom.Point2D;
import java.util.Scanner;

import edu.westga.cs5311.ellipse.model.Ellipse;

/**
 * Provides the user interface for creating and displaying an Ellipse.
 *
 * @author Asia Webb
 * @version 9/20/2026
 */
public class EllipseView {

    private Ellipse ellipse;
    private double xCoordinate;
    private double yCoordinate;
    private double majorRadius;
    private double minorRadius;

    /**
     * Creates an EllipseView with default values.
     */
    public EllipseView() {
        this.ellipse = null;
        this.xCoordinate = 0.0;
        this.yCoordinate = 0.0;
        this.majorRadius = 0.0;
        this.minorRadius = 0.0;
    }

    /**
     * Gets the values needed to create an Ellipse from the user.
     */
    public void inputEllipseValues() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the x-coordinate of the center point: ");
        this.xCoordinate = input.nextDouble();

        System.out.print("Enter the y-coordinate of the center point: ");
        this.yCoordinate = input.nextDouble();

        System.out.print("Enter the major radius: ");
        this.majorRadius = input.nextDouble();

        System.out.print("Enter the minor radius: ");
        this.minorRadius = input.nextDouble();

        input.close();
    }

    /**
     * Initializes the Ellipse using the user's input.
     */
    public void initializeEllipse() {
        Point2D.Double centerPoint =
                new Point2D.Double(this.xCoordinate, this.yCoordinate);

        this.ellipse = new Ellipse(centerPoint,
                this.majorRadius, this.minorRadius);
    }

    /**
     * Displays information about the Ellipse.
     */
    public void demoEllipse() {
        System.out.println("Center point: "
                + this.ellipse.getCenterPoint());

        System.out.println("Major radius: "
                + this.ellipse.getMajorRadius());

        System.out.println("Minor radius: "
                + this.ellipse.getMinorRadius());

        System.out.println("Top point: "
                + this.ellipse.getTopPoint());

        System.out.println("Right point: "
                + this.ellipse.getRightPoint());

        System.out.println("Focal length: "
                + this.ellipse.getFocalLength());

        System.out.println("Left focus point: "
                + this.ellipse.getLeftFocusPoint());

        System.out.println("Right focus point: "
                + this.ellipse.getRightFocusPoint());

        System.out.println("Eccentricity: "
                + this.ellipse.getEccentricity());

        System.out.println("Circumference 1: "
                + this.ellipse.getCircumference1());

        System.out.println("Circumference 2: "
                + this.ellipse.getCircumference2());
    }
}