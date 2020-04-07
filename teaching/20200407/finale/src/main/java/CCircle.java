/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author H708
 */

class CCircle extends CShape implements IShape, IColorCircle {
	protected double radius;

	public CCircle(double i) {
		radius = i;
	}

	@Override
	public void computeArea() {
		area = radius * radius * pi;
	}

	@Override
	public void draw(int i) {
		if (i == 0) {
			System.out.println("圖形為藍色圓形");
		} else if (i == 1) {
			System.out.println("圖形為紅色圓形");
		} else if (i == 2) {
			System.out.println("圖形為綠色圓形");
		} else {
			System.out.println("圖形錯誤");
		}
	}

	@Override
	public void draw(int i, int j) {
		draw(i);
		if (j == 0) {
			System.out.println("圖形為空心");
		} else if (j == 1) {
			System.out.println("圖形為實心");
		} else {
			System.out.println("填入錯誤");
		}
	}

	@Override
	public void show() {
		System.out.println("area = + area");
	}
}
