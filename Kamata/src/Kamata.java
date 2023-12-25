import java.util.Scanner;
public class Kamata {

	public static void main(String[] args) {
		Scanner tastatura=new Scanner(System.in);
		System.out.println("Vnesi depozit:");
		double d=tastatura.nextDouble();
		System.out.println("Vnesi kamata:");
		double k=tastatura.nextDouble();
		double il;
		il=d*k/100+d;
		System.out.println("Iznos za 1god e:");
		d+=il*12;
		System.out.println("depozitot posle 1god e:"+d);
	}

}
