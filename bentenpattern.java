class bentenpattern{
    public static void main(String[] args) {
       int r=4;
       for(int i=r-1;i>=0;i--){
        for(int j=0;j<r-i-1;j++){
            System.out.print(" ");
        }
        for(int k=0;k<2*i+1;k++){
            System.out.print("*");
        }
        System.out.println();
       }
       for(int i=1;i<r;i++){
        for(int j=0;j<r-i-1;j++){
            System.out.print(" ");
        }
        for(int k=0;k<2*i+1;k++){
            System.out.print("*");
        }
        System.out.println();
       }
       
    }
}