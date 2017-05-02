import java.util.Scanner;


public class SegregateZerosAndOnes {
	public static void segregateZerosAndOnes(int[] a) {
		int i=0,n=a.length-1,j=n,temp;
		while(i<j) {
			while(i<=n && a[i]==0)
				i++;
			while(j>=0 && a[j]==1) 
				j--;
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		for(i=0;i<=n;i++)
			System.out.print(a[i]+" ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		
		segregateZerosAndOnes(a);		
		
		//closing scanner Object
		sc.close();
	}
}
