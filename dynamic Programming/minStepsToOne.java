//import java.util.Math;
class minStepsToOne{
	public static int minStep(int n){
		if(n==1){
			return 0;
		}
		int ans1=minStep(n-1);
		int ans2=Integer.MAX_VALUE;
		if(n%2==0){
			ans2=minStep(n/2);
		}
		int ans3=Integer.MAX_VALUE;
		if(n%3==0){
			ans3=minStep(n/3);
		}
		int ans=Math.min(ans1,Math.min(ans2,ans3))+1;
		return ans;
	}
	public static void main(String[]args){
		minStepszToOne o=new minStepszToOne();
		System.out.println(o.minStep(111));
	}
}