class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] -b[0]);

        long[] endtimesOfRooms = new long[n];

        int[] counts = new int[n];

        for(int i =0; i< meetings.length; i++){
            int startTime = meetings[i][0];
            int endTime = meetings[i][1];

            int minendIndex = 0;
            boolean isRoom = false;
            for(int room = 0 ; room < n; room++){
                if(startTime >= endtimesOfRooms[room]){
                    endtimesOfRooms[room] = endTime;
                    counts[room]++;
                    isRoom = true;
                    break;
                }
                if(endtimesOfRooms[room] < endtimesOfRooms[minendIndex]){
                    minendIndex = room;
                }

            }
            if(!isRoom){
                endtimesOfRooms[minendIndex] = endtimesOfRooms[minendIndex] + endTime - startTime;
                counts[minendIndex]++;
            }

        }
        int maxRoomCountIdx =0;

        for(int i = 0; i <n; i++){
            if(counts[i] >counts[maxRoomCountIdx] ){
                maxRoomCountIdx = i;
            }
        }
        return maxRoomCountIdx;


    }
}