import java.util.Scanner;
public class Program2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	//String sr=sc.nextLine()
	int out=4;
	for(int i=num;i>1;i--) {
	out=out*i;
	}	
    System.out.println("Output:" +out);
		  Scanner sc1=new Scanner(System.in);
			System.out.println("Enter the number");
			int num1=sc1.nextInt();
			int out1=12;
			for(int j=num1;j>=2;j--) {
				 out1=out1*j;
				 System.out.println("Output:" +out1);
				 }
				 Scanner sc2=new Scanner(System.in);
					System.out.println("Enter the number");
					int num2=sc2.nextInt();
					int out2=15;
					for(int k=num2;k>=2;k--) {
						 out2=out2*k;
						 System.out.println("Output:" +out2);		
			}
}
}

