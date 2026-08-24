class Task{
    int freq;
    int time;

    public Task(int f, int t ){
        this.freq = f;
        this.time = t;
    }
}
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int time = 0;
        PriorityQueue<Task> maxheap = new PriorityQueue<>((a, b) -> b.freq - a.freq);
        Queue<Task> queue = new LinkedList<>();
        int[] counts = new int[26];

        for(char t : tasks){
            counts[t-'A'] = counts[t-'A'] +1;
        }

        for(int c : counts){
            if(c >0){
               maxheap.add(new Task(c, 1));
            }
        }

        while(!maxheap.isEmpty() || !queue.isEmpty()){
            time = time +1;

            while(!queue.isEmpty() && queue.peek().time == time){
                maxheap.add(queue.poll());
            }
            if(!maxheap.isEmpty()){
                Task taskToEx  = maxheap.poll();

                taskToEx.freq = taskToEx.freq -1;

                taskToEx.time = time + (n+1);

                if(taskToEx.freq > 0){
                    queue.add(new Task(taskToEx.freq, taskToEx.time));
                }
            }
        }



        return time;
    }
}