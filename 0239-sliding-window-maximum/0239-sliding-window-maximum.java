class Solution {
    // public int[] maxSlidingWindow(int[] nums, int k) {
    //     return maxSlidingWindow(nums,k);
    // }
    public static int[] maxSlidingWindow(int[] arr, int k){
        Deque<Integer> dq = new LinkedList<>();
        int j=1;
        int ans[]= new int[arr.length-k+1];
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[i] > arr[dq.getLast()]){
                dq.removeLast();
            }
            dq.add(i); // add last
        }
        ans[0] = arr[dq.getFirst()];
        for (int i = k; i < arr.length; i++) {
            while (!dq.isEmpty() && arr[i] > arr[dq.getLast()]){
                dq.removeLast();
            }
            dq.add(i);
            if(!dq.isEmpty() && dq.getFirst() == i-k){
                dq.removeFirst();
            }
            ans[j]= arr[dq.getFirst()];
            j++;
        }
        
        return ans;
    }
}