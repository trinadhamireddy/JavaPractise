import java.util.ArrayList;
import java.util.Scanner;

public class UnionAndIntersectionOfTwoArrays {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int[] a1 = new int[n1];
		for(int i=0;i<n1;i++)
			a1[i] = s.nextInt();
		int n2 = s.nextInt();	
		int[] a2 = new int[n2];
		for(int i=0;i<n2;i++)
			a2[i] = s.nextInt();
		
		int i1=0,i2=0;
		//u is union of a1,a2 arrays
		ArrayList<Integer> u = new ArrayList<Integer>();
		while(i1<n1 && i2<n2) {
			if(a1[i1]==a2[i2]) {
				u.add(a1[i1++]);
				i2++;
			} else if(a1[i1]<a2[i2]) {
				u.add(a1[i1++]);
			} else {
				u.add(a2[i2++]);
			}
		}
		while(i1<n1)
			u.add(a1[i1++]);
		while(i2<n2)
			u.add(a2[i2++]);
		
		for(Integer i:u)
			System.out.print(i+" ");
		System.out.println();
		//inter is interstion of a1 & a2
		ArrayList<Integer> inter = new ArrayList<Integer>();
		i1=0;i2=0;
		while(i1<n1 && i2<n2) {
			if(a1[i1]==a2[i2]) {
				inter.add(a1[i1++]);
				i2++;
			} else if(a1[i1] < a2[i2]) {
				i1++;
			} else {
				i2++;
			}
		}
		
		for(Integer i:inter)
			System.out.print(i +" ");
		
		s.close();
	}
}
