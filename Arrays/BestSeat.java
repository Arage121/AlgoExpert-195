public class BestSeat {
    public int bestSeat(int[] seats) {
        int bestSeat = -1;
        int maxSpace = 0;
        int left=0;

        while(left < seats.length){
            int right = left+1;
            while(right < seats.length && seats[right] == 0){ // this will help us to find the continuous subarray of zeroes
                right += 1;
            }
            // this loop will break when the second pointer i.e right will reach at 1
            // and then we will calculate the space between left and right which are consisting of zeroes or not
            int available_space = right - left - 1;
            if(available_space > maxSpace){
                bestSeat = left + (right-left)/2; // the middle of conitguous subarrays of zeroes will be the answer
                maxSpace = available_space;
            }
            left = right;
        }
        return bestSeat;
    }
}
