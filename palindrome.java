package leetcode;

import java.util.*;
//RAJVEER SINGH
class Solution
{
  public int median(int A[],int N)
    {
      
       Arrays.sort(A);
       
       if (N % 2 != 0) {
            return A[N / 2];
        }
        int mid1 = A[(N / 2) - 1];
        int mid2 = A[N / 2];
        return (mid1 + mid2) / 2;
    }
    public int mean(int A[], int N) {
        long sum = 0; 
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }
        return (int) (sum / N); 
    }
}
