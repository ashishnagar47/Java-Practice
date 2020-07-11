package Binary_tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BTClient {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("Input");
        Scanner s=new Scanner(file);
        BT Tree=new BT();
//        Tree.insert(s);
//        Tree.insert(s);
//        Tree.insert(s);
//        Tree.insert(s);
//        Tree.insert(s);
//        Tree.display();
       // System.out.println("Sum"+Tree.sum());
       // Tree.display();
       // System.out.println(Tree.diameter());
       // Tree.levelOrder();
        int[] pre={1,2,3};
        int[] in={3,2,1};
        Tree.populatebyprein(pre,in);
       // System.out.println(Tree.height());
        //BT.populatebyprein(pre,in);

    }
}
