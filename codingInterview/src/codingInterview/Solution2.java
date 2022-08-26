package codingInterview;

public class Solution2 {
	public boolean isValid(int[]A, int N) {
		int count = 0;
		for (int i = count; i< N; i++) {
			for(int j = 0; j<N; j++) {
				if(Math.abs(A[i]-A[j]) == 1 ) return true;
				continue;
			}
			count++;
		}
		return false;
	}
}
