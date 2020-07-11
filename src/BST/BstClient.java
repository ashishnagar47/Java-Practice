package BST;

public class BstClient {
    public static void main(String[] args) {


        binarySearchTree tree = new binarySearchTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(7);
        tree.insert(4);
        tree.insert(3);

       // System.out.println(tree.successor(3));

       // tree.preorder();
        //tree.inrange(0,10);

      // int ar[]={1,2,3,4,5,6,7};
      // tree.makefromsorted(ar,0,ar.length-1);
        //System.out.println(tree.successor(2));
        System.out.println(tree.height());
        tree.preorder();


    }
}
