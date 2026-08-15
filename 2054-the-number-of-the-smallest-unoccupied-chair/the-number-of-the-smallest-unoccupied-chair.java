class Solution {
    public int smallestChair(int[][] times, int targetFriend) {

        // int targetFriendArrivalTime = times[targetFriend][0];
        // Arrays.sort(times, (a,b) -> a[0] - b[0]);

        // int[] chairs = new int[times.length];

        // for(int i =0; i < times.length; i++){
        //     for(int j = 0; j < chairs.length;j++){
        //         if(times[i][0] >= chairs[j]){
        //             if(targetFriendArrivalTime == times[i][0]){
        //                 return j;
        //             }
        //             chairs[j] = times[i][1];
        //             break;
        //         }
        //     }
        // }
        // return -1;

         //class Solution {
     //public int smallestChair(int[][] times, int targetFriend) {

        int n = times.length;

        // Keep original friend index
        int[][] friends = new int[n][3];

        for (int i = 0; i < n; i++) {
            friends[i][0] = times[i][0]; // arrival
            friends[i][1] = times[i][1]; // leaving
            friends[i][2] = i;           // friend index
        }

        // Sort by arrival time
        Arrays.sort(friends, (a, b) -> a[0] - b[0]);

        // Available chairs: smallest chair first
        PriorityQueue<Integer> available =
            new PriorityQueue<>();

        // Occupied chairs: [leavingTime, chairNumber]
        PriorityQueue<int[]> occupied =
            new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int i = 0; i < n; i++) {
            available.add(i);
        }

        for (int[] friend : friends) {

            int arrival = friend[0];
            int leaving = friend[1];
            int index = friend[2];

            // Free chairs whose friend has already left
            while (!occupied.isEmpty()
                    && occupied.peek()[0] <= arrival) {

                int chair = occupied.poll()[1];
                available.add(chair);
            }

            // Get smallest available chair
            int chair = available.poll();

            // Is this the target friend?
            if (index == targetFriend) {
                return chair;
            }

            // Occupy the chair
            occupied.add(new int[]{leaving, chair});
        }

        return -1;
    }
}
