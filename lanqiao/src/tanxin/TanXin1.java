package tanxin;
import java.util.Scanner;
public class TanXin1 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int total=sc.nextInt();
		while(total>0) {
			total--;
			int length=sc.nextInt()*2;
			String example=sc.next();
			int AB=0;
			int BA=0;
			for(int i=0;i<length;i++) {
				char current=example.charAt(i);
					if(i%2==0) {
						if(current=='B') {
						AB++;
					}
					if(current=='A'){
						BA++;
					}
				}
					else {
						if(current=='A') {
							AB++;
						}
						if(current=='B'){
							BA++;
						}
					}
				
			}
			int result=Math.min(AB, BA)/2;
			
			System.out.println(result);
		}
		
		
	}
}
