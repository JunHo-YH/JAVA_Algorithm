package chapter1;

import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ��� ���մϴ�.");
		System.out.print("a�� ��: " ); int a = scan.nextInt();
		System.out.print("b�� ��: " ); int b = scan.nextInt();
		System.out.print("c�� ��: " ); int c = scan.nextInt();
		
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println("�ִ��� " + max + "�Դϴ�.");

	}

}
