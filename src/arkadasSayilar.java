
public class arkadasSayilar {

	public static void main(String[] args) {
		 int s1=220,s2=284;
		 int t1=0,t2=0;
		 for(int i=1;i<s1;i++) {
			 if(s1%i==0) {
				 t1+=i;
			 }
		 }
		for(int j=1;j<s1;j++) {
				 if(s2%j==0) {
					 t2+=j;
				 }
		}
		if(t1==s2 && t2==s1) {
			System.out.println(s1 +" ve "+ s2+ " arkadaş sayılardır.");

		}
		else {
			System.out.println(s1 +" ve "+ s2+ " arkadaş sayılar değildir.");

		}

	}

}
