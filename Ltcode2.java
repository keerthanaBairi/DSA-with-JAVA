class oper{
    public static void main(String[] args){
        String operations[]={"++X","X++","--X","X--"};
        int ans=1;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("++x")||operations[i].equals("x++")){
                ans=ans+1;
            }
            if(operations[i].equals("--x")||operations[i].equals("x--")){
                ans=ans-1;
            }
        }
        System.out.println(ans);
        }
       

    }
