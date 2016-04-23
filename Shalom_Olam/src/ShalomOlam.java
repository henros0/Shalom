import java.util.Scanner;

public class ShalomOlam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Shalom Olam");
		System.out.println("New fits");
		System.out.println("write something");
		String resp = sc.nextLine();
		char []arr = resp.toCharArray();
		char[]arr2 = new char[arr.length*2];
		for(int i=0,j=1 ; i<arr2.length; i+=2, j+=2){
			arr2[i]=arr[i/2];
			arr2[j]=' ';		
		}
		String out = "";
		for (int i=0; i<arr2.length; i++)
			out+=arr2[i];
		System.out.println(out);
	}

}
