class Twitter {

    class Tweet {
        int tweetId;
        int time;

        Tweet(int tweetId, int time) {
            this.tweetId = tweetId;
            this.time = time;
        }
    }

    
    HashMap<Integer, Set<Integer>> followMap;
    HashMap<Integer, List<Tweet>> tweetMap;

    int timestamp;

    public Twitter() {
        followMap = new HashMap<>();
        tweetMap = new HashMap<>();
        timestamp = 0;
    }

    public void postTweet(int userId, int tweetId) {

        tweetMap.putIfAbsent(userId, new ArrayList<>());

        tweetMap.get(userId).add(new Tweet(tweetId, timestamp++));

    }

    public List<Integer> getNewsFeed(int userId) {

        List<Integer> ans = new ArrayList<>();

        PriorityQueue<Tweet> pq = new PriorityQueue<>(
                (a, b) -> b.time - a.time);

        if (tweetMap.containsKey(userId)) {
            pq.addAll(tweetMap.get(userId));
        }

        if (followMap.containsKey(userId)) {

            for (int followee : followMap.get(userId)) {

                if (tweetMap.containsKey(followee)) {
                    pq.addAll(tweetMap.get(followee));
                }

            }
        }

        while (!pq.isEmpty() && ans.size() < 10) {
            ans.add(pq.poll().tweetId);
        }

        return ans;
    }

    public void follow(int followerId, int followeeId) {

        if (followerId == followeeId)
            return;

        followMap.putIfAbsent(followerId, new HashSet<>());

        followMap.get(followerId).add(followeeId);

    }

    public void unfollow(int followerId, int followeeId) {

        if (!followMap.containsKey(followerId))
            return;

        followMap.get(followerId).remove(followeeId);

    }
}