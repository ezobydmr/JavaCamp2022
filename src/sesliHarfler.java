
public class sesliHarfler {

	public static void main(String[] args) {
		char harf='A';
		switch(harf) {
		case 'A','I','O','U':
		case 'a','ı','o','u':
				System.out.println("Kalın sesli harf");	
		break;
		case 'E','İ','Ö','Ü':
		case 'e','i','ö','ü':
			    System.out.println("İnce sesli harf");
		break;
		default:
			System.out.println("Sessiz harf");
		
		}

	}

}
