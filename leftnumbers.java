class leftnumbers{
    public static void main(String[] args) {
        int r=4;
        for(int i=0;i<r;i++){
            for(int j=0;j<r-i-1;j++){
                System.out.print("  ");
            }
            for(int k=i;k>=0;k--){
                System.out.print((k+1)+" ");
            }
            System.out.println();
        }
    }
}