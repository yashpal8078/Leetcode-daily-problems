public class TreeToLinkedList {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int item) {
            val = item;
            left = right = null;
        }
    }

    public static  void flatten(TreeNode root){
        if(root == null){
            return;
        }

        while(root != null){
            if(root.left != null){
                TreeNode curr  = root.left;
                while(curr.right != null)
                {
                    curr = curr.right;
                }

                curr.right = root.right;
                root.right = root.left;
                root.left = null;
            }
            root = root.right;
        }


    }
    public static void main(String[] args) {
        TreeToLinkedList solution = new TreeToLinkedList();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        flatten(root);

        TreeNode curr = root;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.right;
        }
    }
}
