package samples;

import java.util.Scanner;

public class GullyCricket {

	public static void main(String[] args) {
		int n,testcase,k=0;
		boolean t;
		Scanner sc=new Scanner(System.in);
		testcase=sc.nextInt();
		
		while(k<testcase) {
			t=false;
			n=sc.nextInt();
		String player[][]=new String[n][2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				player[i][j]=sc.next();
				
			}
		}
		 t=test(n,player);
		if(t) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
		k++;
	}
		
	}

	public static boolean test(int n, String[][] player) {
		int x=n;
		boolean flag=false;
		for(int i=0;i<n-1;i++) {
			
		
			if(x<=6&&player[i][0].equals(player[i+1][0])){
				flag= true;
			}
			else {
				flag=false;
			}
		
		
		}
				
		return flag;
	}

}
