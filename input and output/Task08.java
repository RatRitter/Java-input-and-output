import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sound = 343;
		double time;
		
		System.out.println("���������� ����� �������� � ��������(�������): ");
		time = sc.nextDouble();
		double second = time * sound;
		System.out.println("���������� " + second + " ������");
		
		sc.close();
		

	}

}
