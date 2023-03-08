import java.util.Scanner;

public class Task05 {

	private static final int R = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите радиус: ");
		double r = sc.nextDouble();
		double a = Math.PI * (R * R);
		System.out.println("Площадь круга: " + a);
		double c = Math.PI * 2 * R;
		System.out.println("Длина окружности: " + c);
		
		sc.close();	}
	private static double r(int i) {
		// TODO Auto-generated method stub
		return 0;
		
	} 

}
