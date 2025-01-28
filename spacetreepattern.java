class spacetree{
    public static void main(String[] args) {
        int r=7;
        for(int i=0;i<r;i++){
            for(int j=0;j<r-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                if(i==r-1|| k==0 ||k==2*i){
                    System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println();
           }
    }
}