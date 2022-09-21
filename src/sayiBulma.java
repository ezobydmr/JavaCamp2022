
public class sayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[]{1,2,5,7,9,0};
        int ara= 7;
        boolean varMi = false;


        for (int sayi:sayilar){
            if(sayi == ara) {
                varMi= true;
                break;
            }
        }
        if(varMi) {
        	System.out.println("Sayi dizide var.");
       
        }
        else {
        	System.out.println("Sayi dizide yok!");
        }
	}

}
