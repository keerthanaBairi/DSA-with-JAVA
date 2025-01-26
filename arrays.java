class arrays{
    public static void main(String[] args){
       int numbers[]={7,4,5,8,9,3,5};
       System.out.println(numbers[0]);
       System.out.println(numbers[1]);
       System.out.println(numbers[2]);
       System.out.println(numbers[3]);
       System.out.println(numbers[4]);
       System.out.println(numbers[5]);
       System.out.println(numbers[6]);

       //array in strings

       String words[]={"apple","ball","cat","dog"};
       System.out.println(words[0]);
       System.out.println(words[1]);
       System.out.println(words[2]);
       System.out.println(words[3]);

       // instead of writing multiple print statements we can write the code in single line by using for loop.
       for(int i=0;i<numbers.length;i++){
        System.out.println(numbers[i]);
       }
       for(int i=0;i<words.length;i++){
        System.out.println(words[i]);
       }
    }
}
