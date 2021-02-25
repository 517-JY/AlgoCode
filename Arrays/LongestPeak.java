public class LongestPeak {
	public int LongestPeakMethod(int[] array) {
		int longestPeakLength = 0; 
		int i = 1;

		while(i < array.length - 1) {
			boolean isPeak = array[i-1] < array[i] &&
								array[i] > array[i+1];
		    if(!isPeak) {
		    	i += 1;
		    	continue;
		    }
		}
	}
}