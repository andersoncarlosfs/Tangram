/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andersoncarlosfs.tangram.model.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Point;
import java.awt.Stroke;
import java.awt.geom.Point2D;

/**
 *
 * @author Anderson Carlos Ferreira da Silva
 */
public abstract class Polygon extends java.awt.Polygon {

    protected int size;
    private double rotation;
    private Color color;
    private Stroke stroke;

    public Polygon() {
        npoints = getNpoints();
        color = Color.LIGHT_GRAY;
        stroke = new BasicStroke();
    }

    public Polygon(Point point, int size) {
        this();
        this.size = size;
        this.xpoints[0] = point.x;
        this.ypoints[0] = point.y;
        render();
    }

    /**
     *
     */
    protected abstract void render();

    /**
     *
     * @return the npoints
     */
    public abstract int getNpoints();

    /**
     *
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     *
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
        render();
    }

    /**
     *
     * @return the rotation
     */
    public double getRotation() {
        return rotation;
    }

    /**
     *
     * @param rotation the rotation to set
     */
    public void setRotation(double rotation) {
        this.rotation = rotation;
    }

    /**
     *
     * @param index
     * @return the point
     */
    public final Point getPoint(int index) {
        return new Point(xpoints[index], ypoints[index]);
    }

    /**
     *
     * @param index
     * @param point
     */
    protected final void setPoint(int index, Point point) {
        xpoints[index] = point.x;
        ypoints[index] = point.y;
    }

    /**
     *
     * @param index
     * @param x
     * @param y
     */
    protected final void setPoint(int index, int x, int y) {
        xpoints[index] = x;
        ypoints[index] = y;
    }

    /**
     *
     * @return the location
     */
    public Point getLocation() {
        return new Point(xpoints[0], ypoints[0]);
    }

    /**
     *
     * @param point the location to set
     */
    public void setLocation(Point point) {
        this.xpoints[0] = point.x;
        this.ypoints[0] = point.y;
        render();
    }

    /**
     *
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     *
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     *
     * @return the stroke
     */
    public Stroke getStroke() {
        return stroke;
    }

    /**
     *
     * @param stroke the stroke to set
     */
    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
    }

    /**
     *
     * @return the centroid
     */
    public final Point2D getCentroid() {
        double x = 0;
        double y = 0;
        for (int index = 0; index < npoints; index++) {
            x += xpoints[index];
            y += ypoints[index];
        }
        x = x / npoints;
        y = y / npoints;
        return new Point.Double(x, y);
    }

    /**
     *
     */
    @Override
    public void reset() {
        npoints = getNpoints();
        bounds = null;
    }

}
