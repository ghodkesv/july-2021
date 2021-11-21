import java.util.*;

public class palindromeString{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your String : ");
String s=sc.next();
String rev="";

for(int i=s.length()-1; i>=0;i--){
	rev=rev+s.charAt(i);
}
if(s.equals(rev)){
	System.out.println("String is a palindrome String.");
}else{

	System.out.println("String is not a palindrome String.");
}

}
}