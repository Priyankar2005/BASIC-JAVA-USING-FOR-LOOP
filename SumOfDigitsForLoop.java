public class SumOfDigitsForLoop{
	public static void main(String[]args){
		int num = 999999999,sum=0;
		for(;num>0;num/=10){
			sum+=num%10;
		}
		System.out.println("sum of digits:"+sum);
	}
}
