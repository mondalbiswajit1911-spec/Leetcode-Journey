class Solution {

    PriorityQueue<Integer> maxHeap =
        new PriorityQueue<>(Collections.reverseOrder());

    PriorityQueue<Integer> minHeap =
        new PriorityQueue<>();

    Map<Integer, Integer> delayed =
        new HashMap<>();

    int maxSize = 0;
    int minSize = 0;

    public double[] medianSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        double[] result = new double[n - k + 1];

        for (int i = 0; i < n; i++) {

            // Add new number
            add(nums[i]);

            // Remove number outside window
            if (i >= k) {
                remove(nums[i - k]);
            }

            // Balance heaps
            balance();

            // Calculate median
            if (i >= k - 1) {

                if (k % 2 == 1) {
                    result[i - k + 1] = maxHeap.peek();
                } else {
                    result[i - k + 1] =
                        ((double) maxHeap.peek()
                        + (double) minHeap.peek()) / 2.0;
                }
            }
        }

        return result;
    }

    private void add(int num) {

        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.add(num);
            maxSize++;
        } else {
            minHeap.add(num);
            minSize++;
        }
    }

    private void remove(int num) {

        delayed.put(num,
            delayed.getOrDefault(num, 0) + 1);

        if (!maxHeap.isEmpty() && num <= maxHeap.peek()) {
            maxSize--;
        } else {
            minSize--;
        }

        clean(maxHeap);
        clean(minHeap);
    }

    private void balance() {

        if (maxSize > minSize + 1) {

            minHeap.add(maxHeap.poll());
            maxSize--;
            minSize++;

            clean(maxHeap);

        } else if (maxSize < minSize) {

            maxHeap.add(minHeap.poll());
            minSize--;
            maxSize++;

            clean(minHeap);
        }
    }

    private void clean(PriorityQueue<Integer> heap) {

        while (!heap.isEmpty()) {

            int num = heap.peek();

            if (delayed.containsKey(num)) {

                int count = delayed.get(num);

                if (count == 1) {
                    delayed.remove(num);
                } else {
                    delayed.put(num, count - 1);
                }

                heap.poll();

            } else {
                break;
            }
        }
    }
}



        // int n = nums.length;
        // double[] res = new double[nums.length -k+1];

        // int j =0;

        // int[] window = new int[k];

        // for(int i =0;i<k;i++){
        //     window[i] = nums[i];
        // }

        // Arrays.sort(window);

        // res[j] = k%2==1 ? window[k/2] : ((double) window[k/2] + window[k/2-1])/2.0;

        // for(int i =k; i<n;i++){
        //     int m=0;
        //     for(int l = i-k+1;l<=i;l++){
        //         window[m] =nums[l];
        //         m++;
        //     }
        //     Arrays.sort(window);
        //     j++;
        //     res[j] = k%2==1 ? window[k/2] : ((double) window[k/2] + window[k/2-1])/2.0;
        // }
        // return res;
    
