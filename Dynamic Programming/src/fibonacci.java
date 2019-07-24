
public class fibonacci {

public static int fib(int n) { //Simple Recursion
	if(n==0||n==1) {
		return n;
	}
	return fib(n-1)+fib(n-2);
}

public static int fibM(int n) { // Using Memoization
	int storage[]= new int[n+1];
	for(int i=0;i<=n;i++) {
		storage[i]=-1;
	}
	return fibM(n,storage);
}

public static int fibM(int n,int[] storage) {
	if(n==0||n==1) {
		storage[n]=n;
		return storage[n];
	}
	
	if(storage[n]!=-1) {
		return storage[n];
	}
	storage[n]= fibM(n-1,storage) + fibM(n-2,storage);
	return storage[n];
}
	
	public static int fibdp(int n) {
		int[] storage = new int[n+1];
		storage[0]=1;
		storage[1]=1 ;
		for(int i=2;i<=n;i++) {
			storage[i]=storage[i-1]+storage[i-2];
		}
		return storage[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 45;
		System.out.println(fibdp(n));
		System.out.println(fibM(n));// order of n+1
		System.out.println(fib(n));// order of 2^n
	}

}
