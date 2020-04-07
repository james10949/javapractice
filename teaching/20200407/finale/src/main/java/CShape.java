/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author H708
 */
abstract class CShape {
	protected double area;

	public void show() {
		System.out.println("area = " + area);
	}

	public abstract void computeArea();
}
