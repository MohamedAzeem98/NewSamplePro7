package Practicing;

public class Fibi123 {
	public static void main(String[] args) {
		
		
		int n1=0,n2=1;
		int N;
		int count =7;
		
		for(int i=0;i<=count;i++) {
			System.out.print(n1+" ");
			N=n1+n2;
			n1=n2;
			n2=N;
		}
		
		
		
		
		
	}

}
