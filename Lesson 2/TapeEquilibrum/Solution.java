import java.util.*;
import java.lang.Math;

class Solution {
    public int solution(int[] A) {
        int [] partialSum = new int[A.length];
        int totalSum;
        for(int i = 0; i<A.length; i++) {
            if(i==0) {
                partialSum[i]=A[i];
            } else {
            partialSum[i]=partialSum[i-1]+A[i];
            }
        }
        totalSum=partialSum[A.length-1];
        double half=totalSum/(double)2;

        double minimum=0;
        for(int i = 0; i<A.length; i++) {
            double currentDifference=half-partialSum[i];
            if (i==0 || Math.abs(currentDifference)<minimum) {
                minimum=Math.abs(currentDifference)*2;
            } else {
                continue;
            }
        }
       
        return (int)minimum;
    }
}