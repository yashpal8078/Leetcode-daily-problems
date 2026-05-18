class Solution {

    public int minJumps(int[] arr) {

        int n = arr.length;

        if(n == 1) return 0;

        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n];

        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < n; i++){

            map.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
        }

        q.offer(0);
        vis[0] = true;

        int steps = 0;

        while(!q.isEmpty()){

            int size = q.size();

            for(int i = 0; i < size; i++){

                int curr = q.poll();

                if(curr == n - 1){
                    return steps;
                }

                int left = curr - 1;
                int right = curr + 1;

               
                if(left >= 0 && !vis[left]){

                    vis[left] = true;
                    q.offer(left);
                }

            
                if(right < n && !vis[right]){

                    vis[right] = true;
                    q.offer(right);
                }

                
                List<Integer> neighbors = map.get(arr[curr]);

                if(neighbors != null){

                    for(int j : neighbors){

                        if(!vis[j]){

                            vis[j] = true;
                            q.offer(j);
                        }
                    }

                 
                    map.remove(arr[curr]);
                }
            }

            steps++;
        }

        return -1;
    }
}