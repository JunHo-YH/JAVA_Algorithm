package chapter1;

// 3개의 정숫값 가운데 최대값을 구하여 출력합니다.

class Max3m {
	static int max3(int a, int b, int c, int d) {
		int max = a; // 최댓값
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;

		return max; // 구한 최댓값을 호출한 곳으로 반환
	}
	
	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		
		return min;
	}
	
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		if (d < min) min = d;
		
		return min;
	}

	public static void main(String[] args) {
		System.out.println("3개중 최댓값은 : " + max3(3, 2, 1, 0));	 	// 3
		System.out.println("3개중 최소값은 : " + min3(3, 2, 1)); 		// 1
		System.out.println("4개중 최소값은 : " + min4(4, 3, 2, 1));		// 1
	}
}
