/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 4g3nt_47
 */
public class Mango extends Tree {
    int yeild;

    public Mango(int c, int h, int b, int t, int y) {
        super(c, h, b, t);
        yeild=y;
    }
    @Override
    void display()
    {
        System.out.println("Mango Tree Code is: "+code);
        System.out.println("Mango Tree height is: "+height+" feet.");
        System.out.println("Mango Tree base is: "+base+" cm wide.");
        System.out.println("amount of time spent so far on the mango tree is: "+time+" hours");
        System.out.println("Yeild of the Mango Tree is: "+yeild+" fruits.");
    }
}