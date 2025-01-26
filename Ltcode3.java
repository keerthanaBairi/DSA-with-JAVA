class Ltcode3 {
    public static void main(String[] args){
        String address="1.123.1.234.5"; 
        String ans="";
        for(int i=0;i<address.length();i++){
            char ch=address.charAt(i);
            if(ch== '.'){
                ans=ans+"[.]";
            }
            else{
                ans=ans+ch;
            }
        }
        System.out.println(ans);
        
    }
}
