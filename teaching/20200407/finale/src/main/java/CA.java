/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author H708
 */
class CA implements IA {
	public int varB;

	public CA() {
		varB = 0;
	}

	public CA(int i) {
		varB = i;
	}

	@Override
	public void show1() {
		System.out.println("This is CA's show1()");
	}

	public void show2() {
		System.out.println("This is CA's show2()");
	}
}