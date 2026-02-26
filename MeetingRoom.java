import java.util.TreeMap;

public class MeetingRoom {

    public static int minMeetingRooms(int[][] intervals) {
       
        TreeMap <Integer, Integer> timeline = new TreeMap<>();
        for (int[] interval : intervals) {
            timeline.put(interval[0], timeline.getOrDefault(interval[0], 0) + 1);
            timeline.put(interval[1], timeline.getOrDefault(interval[1], 0) - 1);
        }
        int ans = 0;
        int ongoingMeetings = 0;

        for(int i : timeline.keySet()) {
           ongoingMeetings += timeline.get(i);
           ans = Math.max(ans, ongoingMeetings);
        }

        return ans;
       
    }

    public static void main(String[] args) {
        int[][] intervals = { { 0, 30 }, { 5, 10 }, { 15, 20 } };
        System.out.println("Minimum number of meeting rooms required: " + minMeetingRooms(intervals));
    }
}
