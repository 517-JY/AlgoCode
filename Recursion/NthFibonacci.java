// Method 1 Naive Recursive Method 
// 		Time complexity  -- O(2^N)
// 		Space compleixty -- O(N)

public class NthFibonacci {
	public static int getNthFib(int n) {
		if (n == 2) {
			return 1;
		} else if(n == 1) {
			return 0;
		} else {
			return getNthFib(n-2) + getNthFib(n-1);
		}
	}
}


// Method 2 Recursive with cashing
// 		Time complexity  -- O(N)
// 		Space compleixty -- O(N)

import java.util.*;

public class NthFibonacci {
	public static int getNthFib(int n) {
		Map<Integer, Integer> memoize = new HashMap<Integer, Integer>();
		memoize.put(1, 0);
		memoize.put(2, 1);
		return getNthFib(n, memoize);

	}

	private static int getNthFib(int n, Map<Integer, Integer> memoize) {
		if(memoize.containsKey(n)) {
			return memoize.get(n);
		} else {
			memoize.put(n, getNthFib(n-1, memoize) + getNthFib(n-2, memoize));
			return memoize.get(n);
		}
	}
}



// Method 3 Iterative Solution
// 		Time complexity  -- O(N)
// 		Space compleixty -- O(1)

public class NthFibonacci {
	public static int getNthFib(int n) {


		int[] result = new int[2];
		result[0] = 0;
		result[1] = 1;
		int count = 3;
		while (count <= n) {
			int nextFib = result[0] + result[1];
			result[0] = result[1];
			result[1] = nextFib;
			count++;
		}

		// Edge case n == 1;
		return n > 1 ? result[1] : result[0];
	}
}