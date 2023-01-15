public class MaxMovePiles {

    public int maximumScore(int a, int b, int c) {

        PriorityQueue<Integer> pq= new PriorityQueue<Integer>(Collections.reverseOrder());
         pq.add(a); pq.add(b) ; pq.add(c); int ans = 0;

        while(pq.size() > 1){

            int fh = pq.poll() - 1;
            int sh = pq.poll() - 1;

            if(fh > 0) pq.add(fh);
            if(sh > 0) pq.add(sh);

            ans++;
        }

        return  ans;

     }
}
    
