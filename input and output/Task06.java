import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������� �����: ");
		int w = sc.nextInt();
		System.out.print("������� �����: ");
		int h = sc.nextInt();	
		
		int s = w * h;
		System.out.println("���������: ");
		int p = (w + h) * 2;
		
		System.out.println(s);
		System.out.println(p);
		
		
		sc.close();

	}

	
	}


