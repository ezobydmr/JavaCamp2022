
public class recapDemo2 {

	public static void main(String[] args) {
		double[] myList= {2.4,7.4,6.2,5.1,2.2};
		double sum=0;
		double max=myList[0];
		for(double number:myList) {
			if(max<number) {
				max=number;
			}
			sum+=number;
			System.out.println(number);
		}
		System.out.println("Sayıların toplamı:" + sum);
		System.out.println("En büyük sayı:" + max);
		
		
	}

}
