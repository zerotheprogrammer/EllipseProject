package edu.westga.cs5311.ellipse.model;

import java.awt.geom.Point2D;

/**
 * Represents an ellipse with a center point, major radius, and minor radius.
 *
 * @author Asia Webb
 * @version 9/16/2026
 */
public class Ellipse {

	private Point2D.Double centerPoint;
	private double majorRadius;
	private double minorRadius;

	/**
	 * Creates an Ellipse with the specified center point and radii.
	 *
	 * @param centerPoint the center point of the ellipse
	 * @param majorRadius the major radius of the ellipse
	 * @param minorRadius the minor radius of the ellipse
	 */
	public Ellipse(Point2D.Double centerPoint, double majorRadius, double minorRadius) {
		this.centerPoint = centerPoint;
		this.majorRadius = majorRadius;
		this.minorRadius = minorRadius;
	}

	/**
	 * Gets the center point of this ellipse.
	 *
	 * @return the center point of this ellipse
	 */
	public Point2D.Double getCenterPoint() {
		return this.centerPoint;
	}

	/**
	 * Gets the major radius of this ellipse.
	 *
	 * @return the major radius of this ellipse
	 */
	public double getMajorRadius() {
		return this.majorRadius;
	}

	/**
	 * Gets the minor radius of this ellipse.
	 *
	 * @return the minor radius of this ellipse
	 */
	public double getMinorRadius() {
		return this.minorRadius;
	}

	/**
	 * Gets the top point of this ellipse.
	 *
	 * @return the top point of this ellipse
	 */
	public Point2D.Double getTopPoint() {
		double topX = this.centerPoint.getX();
		double topY = this.centerPoint.getY() - this.minorRadius;
		Point2D.Double topPoint = new Point2D.Double(topX, topY);
		return topPoint;
	}

	/**
	 * Gets the right point of this ellipse.
	 *
	 * @return the right point of this ellipse
	 */
	public Point2D.Double getRightPoint() {
		double rightX = this.centerPoint.getX() + this.majorRadius;
		double rightY = this.centerPoint.getY();
		Point2D.Double rightPoint = new Point2D.Double(rightX, rightY);
		return rightPoint;
	}

	/**
	 * Gets the focal length of this ellipse.
	 *
	 * @return the focal length of this ellipse
	 */
	public double getFocalLength() {
		double difference = (this.majorRadius * this.majorRadius) - (this.minorRadius * this.minorRadius);
		double focalLength = Math.sqrt(difference);
		return focalLength;
	}

	/**
	 * Gets the left focus point of this ellipse.
	 *
	 * @return the left focus point of this ellipse
	 */
	public Point2D.Double getLeftFocusPoint() {
		double leftFocusX = this.centerPoint.getX() - this.getFocalLength();
		double leftFocusY = this.centerPoint.getY();
		Point2D.Double leftFocusPoint = new Point2D.Double(leftFocusX, leftFocusY);
		return leftFocusPoint;
	}

	/**
	 * Gets the right focus point of this ellipse.
	 *
	 * @return the right focus point of this ellipse
	 */
	public Point2D.Double getRightFocusPoint() {
		double rightFocusX = this.centerPoint.getX() + this.getFocalLength();
		double rightFocusY = this.centerPoint.getY();
		Point2D.Double rightFocusPoint = new Point2D.Double(rightFocusX, rightFocusY);
		return rightFocusPoint;
	}

	/**
	 * Gets the eccentricity of this ellipse.
	 *
	 * @return the eccentricity of this ellipse
	 */
	public double getEccentricity() {
		double focalLength = this.getFocalLength();
		double eccentricity = focalLength / this.getMajorRadius();
		return eccentricity;
	}

	/**
	 * Gets the circumference of this ellipse using the first approximation.
	 *
	 * @return the approximate circumference of this ellipse
	 */
	public double getCircumference1() {
		double majorRadius = this.getMajorRadius();
		double minorRadius = this.getMinorRadius();

		double circumference = Math.PI * (3 * (majorRadius + minorRadius) - Math
				.sqrt((10 * majorRadius * minorRadius) + 3 * (Math.pow(majorRadius, 2) + Math.pow(minorRadius, 2))));

		return circumference;
	}

	/**
	 * Gets the circumference of this ellipse using the second approximation.
	 *
	 * @return the approximate circumference of this ellipse
	 */
	public double getCircumference2() {
		double majorRadius = this.getMajorRadius();
		double minorRadius = this.getMinorRadius();

		double ratio = Math.pow(majorRadius - minorRadius, 2) / Math.pow(majorRadius + minorRadius, 2);

		double circumference = Math.PI * (majorRadius + minorRadius)
				* (1 + ((3 * ratio) / (10 + Math.sqrt(4 - 3 * ratio))));

		return circumference;
	}
}