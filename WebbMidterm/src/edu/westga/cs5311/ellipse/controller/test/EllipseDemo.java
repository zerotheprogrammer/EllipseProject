package edu.westga.cs5311.ellipse.controller.test;

import java.awt.geom.Point2D;

import edu.westga.cs5311.ellipse.model.Ellipse;

/**
 * Demonstrates and tests the Ellipse class.
 * 
 * @author Asia Webb
 * @version 9/16/2026
 */
public class EllipseDemo {

	private Ellipse ellipse;

	/**
	 * Creates an EllipseDemo object.
	 */
	public EllipseDemo() {
		Point2D.Double centerPoint = new Point2D.Double(10.0, 8.4);
		this.ellipse = new Ellipse(centerPoint, 8.0, 4.0);
	}

	/**
	 * Displays information about a point.
	 * 
	 * @param point     - the point being tested
	 * @param expectedX - the expected x coordinate
	 * @param expectedY - the expected y coordinate
	 */

	public void displayPointInformation(Point2D.Double point, double expectedX, double expectedY) {
		System.out.println("Actual X: " + point.getX());
		System.out.println("Expected X: " + expectedX);
		System.out.println("Actual Y: " + point.getY());
		System.out.println("Expected Y: " + expectedY);
	}

	/**
	 * Tests the Ellipse methods
	 */
	public void testEllipsePart01() {
		Point2D.Double centerPoint = this.ellipse.getCenterPoint();

		System.out.println("Testing center point:");
		displayPointInformation(centerPoint, 10.0, 8.4);

		double majorRadius = this.ellipse.getMajorRadius();

		System.out.println("Testing major radius:");
		System.out.println("Actual major radius: " + majorRadius);
		System.out.println("Expected major radius: 8.0");

		double minorRadius = this.ellipse.getMinorRadius();

		System.out.println("Testing minor radius:");
		System.out.println("Actual minor radius: " + minorRadius);
		System.out.println("Expected minor radius: 4.0");

		Point2D.Double topPoint = this.ellipse.getTopPoint();

		System.out.println("Testing top point:");
		displayPointInformation(topPoint, 10.0, 4.4);

		Point2D.Double rightPoint = this.ellipse.getRightPoint();

		System.out.println("Testing right point: ");
		displayPointInformation(rightPoint, 18.0, 8.4);

		double focalLength = this.ellipse.getFocalLength();

		System.out.println("Testing focal length:");
		System.out.println("Actual focal length: " + focalLength);
		System.out.println("Expected focal length: " + Math.sqrt(48.0));

		Point2D.Double leftFocusPoint = this.ellipse.getLeftFocusPoint();

		System.out.println("Testing left focus point:");
		displayPointInformation(leftFocusPoint, 3.0717967697244912, 8.4);

		Point2D.Double rightFocusPoint = this.ellipse.getRightFocusPoint();

		System.out.println("Testing right focus point:");
		displayPointInformation(rightFocusPoint, 16.928203230275507, 8.4);
	}

	/**
	 * Tests the Part 2 Ellipse methods.
	 */
	public void testEllipsePart02() {
		double eccentricity = this.ellipse.getEccentricity();

		System.out.println("Testing eccentricity:");
		System.out.println("Actual eccentricity: " + eccentricity);
		System.out.println("Expected eccentricity: " + (Math.sqrt(48.0) / 8.0));

		double circumference1 = this.ellipse.getCircumference1();

		System.out.println("Testing circumference 1:");
		System.out.println("Actual circumference 1: " + circumference1);
		System.out.println("Expected circumference 1: " + (Math.PI
				* (3 * (8.0 + 4.0) - Math.sqrt((10 * 8.0 * 4.0) + 3 * (Math.pow(8.0, 2) + Math.pow(4.0, 2))))));

		double circumference2 = this.ellipse.getCircumference2();

		System.out.println("Testing circumference 2:");
		System.out.println("Actual circumference 2: " + circumference2);

		double h = Math.pow(8.0 - 4.0, 2) / Math.pow(8.0 + 4.0, 2);

		System.out.println(
				"Expected circumference 2: " + (Math.PI * (8.0 + 4.0) * (1 + ((3 * h) / (10 + Math.sqrt(4 - 3 * h))))));
	}
}
