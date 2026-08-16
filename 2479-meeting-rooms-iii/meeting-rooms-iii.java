class Roomendtime {
    long endTime;
    int idx;

    public Roomendtime(long _endTime, int _idx) {
        this.endTime = _endTime;
        this.idx = _idx;
    }
}

class Solution {
    public int mostBooked(int n, int[][] meetings) {

        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        // Rooms that are currently available
        PriorityQueue<Integer> availableRoom =
            new PriorityQueue<>();

        // Rooms that are currently occupied
        PriorityQueue<Roomendtime> occupiedRoom =
            new PriorityQueue<>((a, b) -> {

                if (a.endTime == b.endTime) {
                    return a.idx - b.idx;
                }

                return Long.compare(a.endTime, b.endTime);
            });

        // Initially all rooms are available
        for (int i = 0; i < n; i++) {
            availableRoom.add(i);
        }

        int[] counts = new int[n];

        for (int i = 0; i < meetings.length; i++) {

            int startTime = meetings[i][0];
            int endTime = meetings[i][1];

            // Free all rooms whose meetings have ended
            while (!occupiedRoom.isEmpty()
                    && occupiedRoom.peek().endTime <= startTime) {

                Roomendtime room = occupiedRoom.poll();

                availableRoom.add(room.idx);
            }

            // If a room is available
            if (!availableRoom.isEmpty()) {

                int room = availableRoom.poll();

                counts[room]++;

                occupiedRoom.add(
                    new Roomendtime(endTime, room)
                );

            } else {

                // No room available.
                // Take the room that becomes free earliest.
                Roomendtime room = occupiedRoom.poll();

                long duration = endTime - startTime;

                room.endTime += duration;

                counts[room.idx]++;

                occupiedRoom.add(room);
            }
        }

        // Find room with maximum meetings
        int maxRoomCountIdx = 0;

        for (int i = 1; i < n; i++) {

            if (counts[i] > counts[maxRoomCountIdx]) {
                maxRoomCountIdx = i;
            }
        }

        return maxRoomCountIdx;
    }
}