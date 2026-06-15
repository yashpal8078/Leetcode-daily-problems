class Solution 
{
    public boolean isCircularSentence(String sentence) 
    {
        if(sentence.charAt(0) != sentence.charAt(sentence.length()-1)) 
            return false;

        int spaceIdx = sentence.indexOf(' ');

        while(spaceIdx != -1)
        {
            if(sentence.charAt(spaceIdx-1) != sentence.charAt(spaceIdx+1)) 
                return false;
            spaceIdx = sentence.indexOf(' ',spaceIdx+1);
        }

        return true;
    }
}