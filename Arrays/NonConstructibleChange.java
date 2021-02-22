public class NonConstructibleChange {
	public int NonConstructibleChangeMethod(int[] coins) {
		// sort array in asceding order
		Arrays.sort(coins);

		// a variable tracks how many combinations can be made so far
		int numberOfCombinations = 0;

		for(int coin : coins) {
			// e.g. [1, 1, 2, 3, 5, 7, 22]
			// before traversing 22, the numberOfCombinations is 19 (have a try brute-force)
			// so 20 is the answer
			if (coin > numberOfCombinations + 1) {
				return numberOfCombinations + 1;
			} else {
				// two scaniaros : whether included the newly one item or not 
				// with additional substracting the duplciated ones 
				numberOfCombinations += coin;
			}
		}
		return numberOfCombinations + 1;
	}
}
