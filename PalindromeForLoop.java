public class PalindromeForLoop{
	public static void main(String[]args){
		int num=1220,temp=num=num,rev=0;
		for(;num>0;num/=10){
			rev=rev*10+num%10;
		}
		if(rev==temp)
			System.out.println("palindorme");
		else
			System.out.println("not palindorme");
	}
}
