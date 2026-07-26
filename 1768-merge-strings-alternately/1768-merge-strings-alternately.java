class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        if(word1.length()>word2.length()){
            int i=0;
        for( i=0;i<word2.length();i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        sb.append(word1.substring(i,word1.length()));
        }
        else if(word1.length()<word2.length()){
            int j=0;
        for( j=0;j<word1.length();j++){
            sb.append(word1.charAt(j));
            sb.append(word2.charAt(j));
        }
        sb.append(word2.substring(j,word2.length()));
        }
        else{
            int i=0;
        for( i=0;i<word2.length();i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        //sb.append(word1.substring(i,word1.length()));
        
        }
        return sb.toString();
    }
}