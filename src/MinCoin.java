
public class MinCoin {

	static int getMinCoinCount(int[] nums,int rp){
		int c=0,d=0,r=rp,i=0;
		while(r>0){
			if(r>=nums[i])
			{d=r/nums[i];
			r=r%nums[i];
			c+=d;
			//System.out.println("num "+nums[i]+" d="+d+" r="+r+" c"+c);
			System.out.println("No. of "+nums[i]+"rp coin = "+d);
			}
			i++;
		}
		if(r==0) return c;
		else
			return 0;
	}
	public static void main(String args[]){
		int coins[]={10,5,2,1};
		System.out.println(getMinCoinCount(coins,10));
	}
}
