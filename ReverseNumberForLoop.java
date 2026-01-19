public class ReverseStringForLoop{
	public static void main(String[]args){
		int num = 250107,rev =0;
		for(;num>0;num/=10){
			rev=rev*10+num%10;
		}
		System.out.println("reversed number:"+rev);
	}
}
