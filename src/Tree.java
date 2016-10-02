/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 4g3nt_47
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Tree {
    int code, height, base, time, ucode, uheight, ubase, utime;
    Tree(int c, int h, int b, int t)
    {
        code=c;
        height=h;
        base=b;
        time=t;
    }
    void display()
    {
        System.out.println("Tree Code is: "+code);
        System.out.println("Tree height is: "+height+" feet.");
        System.out.println("Tree base is: "+base+" cm wide.");
        System.out.println("amount of time spent so far on the tree is: "+time+" hours");   
    }
    void update() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter updated Tree Code");
        ucode=Integer.parseInt(br.readLine());
        System.out.println("Enter updated Tree Height");
        uheight=Integer.parseInt(br.readLine());
        System.out.println("Enter updated Tree base");
        ubase=Integer.parseInt(br.readLine());
        System.out.println("Enter updated time spent on a tree");
        utime=Integer.parseInt(br.readLine());
        code=ucode;
        height=uheight;
        base=ubase;
        time=utime;
    }
}
