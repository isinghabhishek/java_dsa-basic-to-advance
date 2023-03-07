import java.util.*;
public class MergeBST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if(root == null){
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    public static Node createBST(ArrayList<Integer> arr, int st, int end) {
        if(st > end) {
            return null;
        }
        int mid = (st + end)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }

    public static Node mergeBSTs(Node root1, Node root2){
        //Step1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        //step2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        // merge
        int i=0, j=0;
        ArrayList<Integer> finalArr = new ArrayList<>();
        while(i < arr1.size() && j<arr2.size()) {
            if(arr1.get(i) <= arr2.get(j)) {
                finalArr.add(arr1.get(i));
                i++;
            } else {
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()) {
            finalArr.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()) {
            finalArr.add(arr2.get(j));
            j++;
        }

        // Sorted ArrayList --> balanced BST
        return createBST(finalArr, 0, finalArr.size()-1);
    }

    public static void preOrder(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
         /*
                     1
                   /   \
                  2     3   
                  BST1                    
         */
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(3);

         /*
                     9
                   /   \
                  3     12
                  BST2
         */
        Node root2 = new Node(9);
        root2.left = new Node(4);
        root2.right = new Node(12);

         /*
                              3
                            /   \
                           1     9
                           \    / \
                            2  4  12 
                    Final Ans
            */
        Node root = mergeBSTs(root1, root2);
        preOrder(root);
    }
}
