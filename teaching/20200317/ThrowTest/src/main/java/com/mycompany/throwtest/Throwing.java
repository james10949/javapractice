/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.throwtest;

/**
 *
 * @author H708
 */
public class Throwing {
    public static void main(String[] args) {
        ThrowObject to = new ThrowObject(1200,45);
        System.out.println(to.getX(1));
        System.out.println(to.getY(1));
        to.traceXY();
    }
}
