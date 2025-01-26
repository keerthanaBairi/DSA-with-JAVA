class andor{
    public static void main(String[] args) {
        int num[]={2,4,3,5,6,8,9,10,11,12,15,16};
        int count=0;
        int count1=0;
        for(int i=0;i<num.length;i++){
            int temp=num[i];
            if(temp%2==0 || temp%3==0){
                count++;
            }
            if(temp%2==0 && temp%3==0){
                count1++;
            }
    }
    System.out.println(count);
    System.out.println(count1);

  }
}
