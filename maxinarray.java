class marray {
    public static void main(String[] args) {
        int ans=0;
        int arr[]={20,30,10,2,4,6,64};
        for(int i=0;i<arr.length;i++){
            ans=Math.max(ans,arr[i]);
        }
        System.out.println(ans);
    }
}
