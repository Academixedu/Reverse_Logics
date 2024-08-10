import java.util.*;
public class Reverse2 {
public static void rev(String s) {
	
	String rev="";

    System.out.println("Reverse of a String");
	for(int i=s.length()-1;i>=0;i--) {
		rev+=s.charAt(i);
	}
	System.out.println(rev);
}
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.nextLine();
	rev(s);
}
}
