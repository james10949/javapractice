/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author H708
 */
class CB extends CA {
	public void show3(IA obj) {
		System.out.println("�ǤJ������varA��쬰" + obj.varA);
		obj.show1();
		// obj.show2();
	}

	public IA set(int i) {
		CA obj = new CA(i);
		return obj;
	}
}
