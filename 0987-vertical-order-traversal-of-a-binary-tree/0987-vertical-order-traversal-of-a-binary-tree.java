/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class Pair{
        TreeNode node;
        int vertical;
        int level;

        Pair(TreeNode node , int vertical ,int level){
            this.node  = node;
            this.vertical = vertical;
            this.level = level;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        TreeMap<Integer,TreeMap<Integer, PriorityQueue<Integer>>> map  = new TreeMap<>();
        Queue<Pair> pq = new LinkedList<>();
         
         pq.offer(new Pair(root,0,0));

         while(!pq.isEmpty()){
            Pair pair = pq.poll();
            TreeNode node = pair.node;
            int vertical = pair.vertical;
            int level = pair.level;

            map.putIfAbsent(vertical , new TreeMap<>());
            map.get(vertical).putIfAbsent(level , new PriorityQueue<>());
            map.get(vertical).get(level).offer(node.val);

            if(node.left != null) pq.offer(new Pair(node.left ,vertical-1 ,level+1));
            if(node.right != null) pq.offer(new Pair(node.right , vertical+1,level+1));

         }

         for(TreeMap<Integer,PriorityQueue<Integer>> tree : map.values()){

            List<Integer> curr = new ArrayList<>();

            for(PriorityQueue<Integer> p : tree.values()){
                  while(!p.isEmpty()){
                    curr.add(p.poll());
                  }
            }

            ans.add(curr);

         }


         return ans;


    }
}