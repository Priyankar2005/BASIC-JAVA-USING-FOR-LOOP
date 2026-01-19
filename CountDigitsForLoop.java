public class CountDigitsForLoop{
	public static void main(String[]args){
		int num = 9999999,count=0;
		for(;num>0;num/=10){
			count++;
		}
		System.out.println("number of digits:"+count);
	}
}

		