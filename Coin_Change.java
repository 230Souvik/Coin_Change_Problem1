
package coin_change;
import java.util.*;

public class Coin_Change {
   public static int coinChange(int[] S, int sum){
        Scanner sc=new Scanner(System.in);
          int[] dp = new int[sum + 1];

        for (int i = 1; i <= sum; i++)
        {
            dp[i] = Integer.MAX_VALUE;
            int result = Integer.MAX_VALUE;

            for (int c: S)
            {
                if (i - c >= 0) {
                    result = dp[i - c];
                }

                if (result != Integer.MAX_VALUE) {
                    dp[i] = Integer.min(dp[i], result + 1);
                }
            }
        }

        return dp[sum];
    }


    public static void main(String[] args) {
        // TODO code application logic here
        Coin_Change v=new Coin_Change();
        Scanner sc=new Scanner(System.in);
        System.out.println("sum of ammount");
        int a=sc.nextInt();
        //System.out.println("no of coin");
        //int c=sc.nextInt();
        int s[]={1,2,3};
        //int w=v.way(a,c);
        int res=v.coinChange(s,a);
        System.out.println("result is "+res);
    }
    
}
