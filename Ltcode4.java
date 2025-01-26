class  Ltcode4 {
    public static void main(String[] args){
        String jewels="aA";
        String stones="aAAbbbb";
            int ans=0;
            for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            for(int j=0;j<jewels.length();j++){
            if(ch==jewels.charAt(j)){
            ans+=1;
            break;
            }
            }
            }
            System.out.println(ans);
        }
        
    }
