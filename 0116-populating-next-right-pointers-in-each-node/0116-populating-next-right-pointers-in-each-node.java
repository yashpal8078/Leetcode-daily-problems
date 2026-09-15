class Solution {
    public Node connect(Node root) {

        if (root == null) return root;

        Queue<Node> pq = new LinkedList<>();

        pq.offer(root);

        while (!pq.isEmpty()) {

            int size = pq.size();
            Node prev = null;

            for (int i = 0; i < size; i++) {

                Node curr = pq.poll();

                if (prev != null) {
                    prev.next = curr;
                }

                prev = curr;

                if (curr.left != null) {
                    pq.offer(curr.left);
                }

                if (curr.right != null) {
                    pq.offer(curr.right);
                }
            }


            prev.next = null;
        }

        return root;
    }
}