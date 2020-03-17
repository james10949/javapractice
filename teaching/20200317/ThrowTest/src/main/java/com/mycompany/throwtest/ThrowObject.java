/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.throwtest;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

/**
 *
 * @author H708
 */
public class ThrowObject {
    private final double g = 9.8;
    double x, y, v,alpha;

    ThrowObject(){
        x = 0;
        y = 0;
    }
    ThrowObject(double v){
        x = 0;
        y = 0;
        this.v = v;
    }
    ThrowObject(double v,double alpha){
        x = 0;
        y = 0;
        this.v = v;
        this.alpha = alpha;
    }
    public double getX(int t){
        x = v*Math.cos(radian(alpha))*t;
        return x;
    }
    public double getY(int t){
        y = v*Math.sin(radian(alpha))*t-g*t*t/2;
        return y;
    }
    public void traceXY(){
        int t = 0;
        while (getY(t) >= 0){
            System.out.println("t = " + t + "\tx = " + getX(t) + "\ty = " + getY(t));
            t++;
        }
    }
    private double radian(double a){
        double r = a*Math.PI/180;
        return r;
    }
}
