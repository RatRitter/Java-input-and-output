import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int sec = 259700;
		
		int days1 = sec / 86400;
		int hours1 = (sec % 86400) / 3600;
		int minutes1 = ((sec % 86400) % 3600) / 60;
		int sec1 = ((sec % 86400) % 3600) % 60;
		System.out.println(" days " + days1 + " hours " + hours1 + " minutes " + minutes1 + " seconds " + sec1);
		sc.close();
		
		
		
		

	
	}

	
		
	}


