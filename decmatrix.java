public class decmatrix {
    public static void main(String[] args) {
        int r=6;
        int c=5;;
        for(int i=0;i<r;i++){
            for(int j=0;j<c-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<3;k++){
                System.out.print("*");
            }
            for(int l=c-i;l<5;l++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
