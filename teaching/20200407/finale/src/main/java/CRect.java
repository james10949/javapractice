/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author H708
 */
class CRect extends CShape {
	protected double length, width;

	public CRect(double i, double j) {
		length = i;
		width = j;
	}

	@Override
	public void computeArea() {
		area = length * width;
	}
}
