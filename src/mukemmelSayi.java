
public class mukemmelSayi {

	public static void main(String[] args) {
		int sayi=6;
		int top=0;
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
				top+=i;
			}
		}
		if(top==sayi) {
			System.out.println(sayi+" mükemmel sayıdır.");
		}
		else {
			System.out.println(sayi+" mükemmel sayı değildir.");
		}
	}

}
