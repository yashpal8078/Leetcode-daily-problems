public class KthClosestNode {
  
   static  class  Node {
        int value;
        Node left, right;

        Node(int item) {
            value = item;
            left = right = null;
        }
    }

    public static  void printKthdown(Node node, int k) {
        if (node == null || k < 0) {
            return;
        }
        if (k == 0) {
            System.out.print(node.value + " ");
            return;
        }
        printKthdown(node.left, k - 1);
        printKthdown(node.right, k - 1);
    }

    public static  int printKthDistance(Node root, Node target, int k) {
        if (root == null) {
            return -1;
        }
        if (root == target) {
            printKthdown(root, k);
            return 0;
        }

        int dl = printKthDistance(root.left, target, k);
        if (dl != -1) {
            if (dl + 1 == k) {
                System.out.print(root.value + " ");
            } else {
                printKthdown(root.right, k - dl - 2);
            }
            return 1 + dl;
        }
        int dr = printKthDistance(root.right, target, k);
        if (dr != -1) { 
            if (dr + 1 == k) {
                System.out.print(root.value + " ");
            } else {
                printKthdown(root.left, k - dr - 2);
            }
            return 1 + dr;
        }

        return -1;
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);            
        root.right = new Node(22);
        root.left.left = new Node(4);
        root.left.right = new Node(12);

        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        Node target = root.left;
        int k = 2;
        printKthDistance(root, target, k);
    }
}
