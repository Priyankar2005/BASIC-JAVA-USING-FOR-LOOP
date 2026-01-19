public class PowerOfNumbers{
	public static void main(String[]args){
		int base=2,exp=5;
		long result=1;
		for(int i=1;i<=exp;i++){
			result*=base;
		}
		System.out.println("7^9="+result);
	}
}
