class reverse{
    public static void main(String[] args) {
        String s="abcde";
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            ans=ans+s.charAt(i);
        }
        System.out.println(ans);
}
    }
    