//You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.

//Return the score of s.

class leet{
    public static void main(String[] args){
        String k="hello";
        int score=0;
        for(int i=0;i<k.length()-1;i++){
            score+=Math.abs(k.charAt(i)-k.charAt(i+1));
        }
        System.out.println(score);
    }
}
