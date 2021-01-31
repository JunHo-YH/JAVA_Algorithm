package chapter1;

// 이것이 코딩테스트다 준비

class Max3m {
	static int max3(int a, int b, int c, int d) {
		int max = a; // �ִ�
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;

		return max;
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
		System.out.println("3���� �ִ��� : " + max3(3, 2, 1, 0));	 	// 3
		System.out.println("3���� �ּҰ��� : " + min3(3, 2, 1)); 		// 1
		System.out.println("4���� �ּҰ��� : " + min4(4, 3, 2, 1));		// 1
	}
}
