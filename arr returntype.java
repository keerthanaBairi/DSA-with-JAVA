class arrreturntype {
    public static int[] fun(){
        int arr[]={3,4,5,6};
        return arr;
    }
    public static void main(String[] args) {
        int keerthana[]=fun();
        for(int i=0;i<keerthana.length;i++){
            System.out.println(keerthana[i]);
        }
    }
}
