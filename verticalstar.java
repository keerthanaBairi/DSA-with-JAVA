class verticalstar {
    public static void main(String[] args) {
        int r=14;
        int c=3;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("* ");
                if(j!=c-1){
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
