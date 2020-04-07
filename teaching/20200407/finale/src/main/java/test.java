/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author H708
 */
public class test {
	public static void main(String[] args) {
		CA objCA = new CA();
		CB objCB = new CB();

		objCB.show3(objCA);

		objCA = (CA) objCB.set(10);
		System.out.println("objCAªºÄæ¦ìvarB = " + objCA.varB);
	}
}
