/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int minr=0;
        int minc =0;
        int maxc = n-1;
        int maxr= m-1;
        ListNode temp = head;
        int [][] mat = new int[m][n];
        for(int[] x: mat) Arrays.fill(x,-1);
        while(minr<=min){
            for(int i= minc;i<=maxc;i++){
                if(temp==null )break;
                mat[minr][i] =temp.val;
                temp = temp.next;
                }
            minr++;
            for(int i = minr;i<=maxr;i++){
                if(temp==null )break;
                mat[i][maxc] = temp.val;
                temp = temp.next;
                }
            maxc--;
            for(int i = maxc;i>=minc;i--){
                     if(temp==null )break;
                mat[maxr][i] = temp.val;
              temp =  temp.next;
                }
            maxr--;
            for(int i= maxr;i>=minr;i--){
                     if(temp==null )break;
                mat[i][minc]= temp.val;
                temp = temp.next;
                }
            minc++;
            }
        return mat;
    }
}