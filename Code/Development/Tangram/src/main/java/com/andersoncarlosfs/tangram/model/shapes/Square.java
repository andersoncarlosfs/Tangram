/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andersoncarlosfs.tangram.model.shapes;

/**
 *
 * @author Anderson Carlos Ferreira da Silva
 */
public class Square extends Polygon {

    public Square(int size) {
        super(size);
    }

    /**
     *
     * @return
     */
    @Override
    public int getNpoints() {
        return 4;
    }

    /**
     *
     */
    @Override
    protected void init() {

        int size = (int) Math.sqrt(2 * Math.pow(super.size / 2, 2)) / 2;

        //setPoint(0, xpoints[0], ypoints[0]);
        setPoint(1, xpoints[0] + size, ypoints[0]);
        setPoint(2, xpoints[0] + size, ypoints[0] + size);
        setPoint(3, xpoints[0], ypoints[0] + size);

    }

}
