class repeatednumbers{
    public static void main(String[] args) {
        int num[]={2,3,4,2,5,6,2,7,8,2,3,2};
        int count=0;
        for(int i=0;i<num.length;i++){
            if(num[i]==2){
              count++;
            }
        }
        System.out.println(count);
    }
}