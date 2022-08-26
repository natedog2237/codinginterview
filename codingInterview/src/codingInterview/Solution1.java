package codingInterview;

public class Solution1 {
	public boolean isValid(int []A, int N) {
		for (int i = 0; i< N; i++) {
			for(int j = 0; j<N; j++) {
				if(Math.abs(A[i]-A[j]) == 1 ) return true;
				continue;
			}
		}
		return false;
	}
}
