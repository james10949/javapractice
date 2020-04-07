/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author H708
 */
interface IColorCircle extends IColor, ICircle {
    public abstract void show();

    public abstract void draw(int i);

    // public abstract int draw(int i);
    public abstract void draw(int i, int j);
}
