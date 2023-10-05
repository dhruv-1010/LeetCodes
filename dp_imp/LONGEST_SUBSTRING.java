//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2, n, m));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int longestCommonSubstr(String S1, String S2, int n, int m){
      int[][] dp = new int[m+1][n+1];
        for(int[] i : dp) Arrays.fill(i,-1);
        int res = 0;
        for(int i = 0;i<=m;i++){
            for(int j = 0;j<=n;j++){
                if(i == 0 || j == 0) dp[i][j]=0;
                else{
                    if(S1.charAt(j-1) == S2.charAt(i-1)) {
                        dp[i][j] = 1 + dp[i-1][j-1];
                        res = Math.max(res,dp[i][j]);
                    }
                    else dp[i][j] = 0;
                }
            }
        }
        // your code her
        return res;
    }
    // int rec(String text1,String text2,int i,int j,int[][] dp){
    //     if(i==0 || j==0) return 0;
    //     if(dp[i][j]!=-1) return dp[i][j];
    //     int count = 0;
    //     if(text1.charAt(i-1) == text2.charAt(j-1)) {
    //         count = 1+rec(text1,text2,i-1,j-1,dp);
    //     }
    //     count = Math.max(rec(text1,text2,i,j-1,dp),rec(text1,text2,i-1,j,dp));
    //     return dp[i][j] = count;
    // }
}
