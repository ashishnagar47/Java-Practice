package BST;

import java.util.Arrays;

public class binarySearchTree {
    private Node root;

    public void insert(int val){
            this.root= insert(root,val);
        }

        private Node insert(Node node, int val) {
            if(node==null){
            //Node node1 =new Node(value);
                return new Node(val);
            }

            if(node.value>val){
                node.left=insert(node.left,val);
            }

            else{
                node.right=insert(node.right,val);
            }
            node.height=Math.max(height(node.left),height(node.right))+1;
            node=balancing(node);
            return node;

    }



    private Node balancing(Node node){
            if(height(node.left)-height(node.right)>1) {
                if (height(node.left.left) - height(node.left.right) < 0) {
                    node.left = leftRotation(node.left);
                }
                return rightRotation(node);
            }
            if(height(node.left)-height(node.right)<-1) {
                if (height(node.right.right) - height(node.right.left) > 0) {
                    node.right = rightRotation(node.right);
                }
                return leftRotation(node);
            }
            return node;
        }

        private Node leftRotation(Node y){

        Node x =y.right;
        Node temp= x.left;

        x.left=y;
        y.right=temp;

        y.height=Math.max(height(y.left),height(y.right))+1;
        x.height=Math.max(height(x.left),height(x.right))+1;

        return x;
        }

        private Node rightRotation(Node x){
        Node y= x.left;
        Node temp=y.right;

        y.right=x;
        x.left=temp;

        x.height=Math.max(height(x.left),height(x.right))+1;
        y.height=Math.max(height(y.left),height(y.right))+1;

        return y;
    }



    public void preorder(){
            preorder(root,"");
        }

        private void preorder(Node node, String indent){

            if(node==null){
                return;
            }

            System.out.println(indent+node.value);

            preorder(node.left,indent+"\t");
            preorder(node.right,indent+"\t");

        }



    public void populatebyprein(int pre[],int in[]){

            this.root=populatebyprein(root,pre,in);
        }

        private binarySearchTree.Node populatebyprein(binarySearchTree.Node node, int[] pre, int[] in){
        if(in.length==0){

        }
        int ele=pre[0];
        int index=find(in ,ele);

        int preleft[]= Arrays.copyOfRange(pre,1,index+1);
        int preright[]=Arrays.copyOfRange(pre,index+1,pre.length);
        int inleft[]=Arrays.copyOfRange(in,0,index);
        int inright[] =Arrays.copyOfRange(in,index,in.length);

        binarySearchTree.Node node1=new binarySearchTree.Node(ele);
        node1.left=populatebyprein(node1.left,preleft,inleft);
        node1.right=populatebyprein(node1.right,preright,inright);
        return node1;
            }

            public int find(int in[],int ele){
        for (int i = 0; i <in.length ; i++) {
            if(in[i]==ele){
                return i;
            }
        }
        return 0;
    }



    public int successor(int value){
            Node success=null;
            Node current =root;
            while(current!=null){
                if(current.value>value){
                    if(success==null || success.value>current.value){
                        success=current;
                    }
                    current=current.left;
                }
                else{
                    current=current.right;
                }
            }
            return success.value;
    }



    public void inrange(int k1, int k2){

            inrange(root,k1,k2);
        }

        private void inrange(Node node, int k1, int k2){

        if(node==null){
            return;
        }

        if(node.value>k1 &&node.value<k2){
            System.out.println(node.value);
        }


        if(node.value>k1){
            inrange(node.left,k1,k2);
        }

        if(node.value<k2){
            inrange(node.right,k1,k2);
        }

    }



    public void sort() {
        sort(root);
        }

        private void sort(Node node){
            if(node==null){
                return;
            }

            sort(node.left);
            System.out.println(node.value);
            sort(node.right);
    }



    public void makefromsorted(int ar[],int start, int end){
            if(start>end){
                return;
            }

            int mid=(start+end)/2;

            insert(ar[mid]);

            makefromsorted(ar,start,mid-1);
            makefromsorted(ar,mid+1,end);
    }


    public int height(){
            return height(root);
        }

        public int height(Node node){
            if(node==null){
                return 0;
            }
            return node.height;
            //return Math.max(height(node.left),height(node.right)+1);
    }



    private class Node{

            int value;
            Node left;
            Node right;
            int height;

            public Node(int value) {
                this.value = value;
                this.height=1;
            }
        }

}
