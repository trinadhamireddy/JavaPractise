import java.util.Scanner;

public class FindMaxNoTwoElementsAdjacent {
	public static int findMaxNoTwoElementsAdjacent(int[] a) {
		int incl=a[0],excl=0,temp;
		for(int i=1;i<a.length;i++) {
			temp = incl>excl ? incl : excl;
			
			incl = excl+a[i];
			excl = temp;
		}
		return incl>excl ? incl : excl;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();		
		
		System.out.println(findMaxNoTwoElementsAdjacent(a));
		
		sc.close();
	}
}
