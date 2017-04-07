import java.util.*;

class Solution {
    public int[] solution(int[] A, int K) {
        if (A.length==0) {
            return A;
        }
        
        int shift=K%A.length;
        int [] arrayShifted = new int[A.length];
        
        for(int i=0; i<A.length; i++) {
            if(i+shift<A.length) {
                arrayShifted[i+shift]=A[i];
            } else {
                arrayShifted[(i+K)%A.length]=A[i];
            }
        }
        return arrayShifted;
    }
}