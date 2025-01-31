class maxdifference{
    public static void main(String[] args) {
        
        int nums[]={7,1,5,4};
        int n=nums.length;
        int max=-1;
        int leftmin=nums[0];
        for(int i=1;i<n;i++){
            int val=nums[i];
            if(leftmin<val){
             max=Math.max(max,val-leftmin);
            }
            leftmin=Math.min(leftmin,val);
     }  
      System.out.println(max);
    }
}