class colorsdifference {
   public static void main(String[] args) {
    int colors[]={1,1,1,6,1,1,1};
       int n=colors.length;
       int max=0;
       for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(colors[i]!=colors[j]){
                int temp=j-i;
                max=Math.max(max,temp);
            }
        }
       }
       System.out.println(max); 
    }
}