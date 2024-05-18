package J01_basis;

import java.util.Scanner;
public class J01008_pHANTICHLUYTHUA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        int dem=1;
        while(dem<=t) {
        	long n=sc.nextLong();
        	System.out.printf("Test %d: ",dem);
        	for(int i=2;i*i<=n;i++) {
        		int d=0;
        		while(n%i==0) {
        			d++;
        			n/=i;
        		}
        		if(d>0) {
        			System.out.printf("%d(%d) ",i,d);
        		}
        	}
        	if(n>1) System.out.printf("%d(1) ",n);
        	System.out.println();
        	
        	
        	
        	
        	dem++;
        }
	}
}