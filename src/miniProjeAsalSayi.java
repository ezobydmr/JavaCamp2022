
public class miniProjeAsalSayi {

	public static void main(String[] args) {
		int sayi=0;
		int top=0;
		if(sayi==1) {
			System.out.println("Sayı Asal Değildir");
			return;
		}
		if(sayi<1) {
			System.out.println("Gecersiz Sayı");
			return;
		}
		for(int i=2;i<sayi;i++) {
			if(sayi % i==0) {
				top+=i;
			}
		}
		if(top==0) {
				System.out.println("Sayı Asal Sayıdır");
			}
		else {
				System.out.println("Sayı Asal Değildir");
			}
	}	
}
