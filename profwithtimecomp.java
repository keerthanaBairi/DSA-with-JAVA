class timecomplexx{
    public static void main(String[] args){
        int arr[]={7,1,5,3,6,4};
        int profit=0;
        int low=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
            int temp=arr[i]-low;
            profit=Math.max(profit,temp);
            low=Math.min(low,arr[i]);
        }
        System.out.println(profit);
    }
}