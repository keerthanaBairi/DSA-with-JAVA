class palindrome2 {
    public static void main(String[] args) {
        boolean palindrome=true;
        String s="ababa";
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                palindrome=false;
                break;
            }
        }
        if(palindrome){
            System.out.println("its a palindrome number");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
