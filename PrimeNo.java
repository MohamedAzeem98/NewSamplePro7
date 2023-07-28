public class EvenOdd {
	public static void main(String args[]){
	int a;
	for(int i=2;i<=100;i++){
		a=0;
		for(int j=1;j<=i;j++){
			if(i%j==0){
				a++;
			}
	    }
		if(a==2){
			System.out.print(i+" ");

		}
	}
	
	
	
	
	
	
	}
  }