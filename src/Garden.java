/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 4g3nt_47
 */
/*import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.io.*;
public class Garden {
    public static void main(String[] args) throws IOException{
        Tree t=new Tree(10,130,150,20);
        Mango m=new Mango(15,150,170,20,200);
        System.out.println("Information of the Tree is:");
        System.out.println("\n");
        t.display();
        System.out.println("\n");
        System.out.println("Information of the Mango Tree is:");
        System.out.println("\n");
        m.display();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input;
        System.out.println("press y to update and print the updated tree information");
        input=br.readLine();
        if(input.equals("y"))
        {
            t.update();
            System.out.println("\n");
            System.out.println("updated tree information is: ");
            System.out.println("\n");
            t.display();
        }
     }
}
