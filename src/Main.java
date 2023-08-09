import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int yil;
		Scanner inp = new Scanner(System.in);
		System.out.print("Yil Giriniz: ");
		yil = inp.nextInt();
		
		
		if(yil % 100 != 0) {
		    if (yil % 4 == 0) {
			System.out.println(yil+" bir artik yildir !");
		   }
		    else {
				System.out.print(yil+" bir artik yil degildir !");
			}
		}
		else if (yil % 100 == 0) {
			
			if (yil % 400 == 0) {
				System.out.print(yil+ " bir artik yildir !");
				}
			else {
				System.out.print(yil+" bir artik yil degildir !");
			}
			}

	}

}
