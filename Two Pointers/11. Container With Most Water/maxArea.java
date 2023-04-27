class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int a=0,b=height.length-1;
        while(a<b){
            if(height[a]<height[b]){
                maxarea=Math.max(maxarea,height[a]*(b-a));
                a+=1;
            }
            else{
               maxarea=Math.max(maxarea,height[b]*(b-a));
                b-=1; 
            }
        }
        return maxarea;
    }
}
