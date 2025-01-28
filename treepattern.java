class treepattern{
    public static void main(String[] args) {
       int r=4;
       for(int i=0;i<r;i++){
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