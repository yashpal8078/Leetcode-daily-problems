class Solution {
    public int[] scoreValidator(String[] events) {
        int total   = 0;
        int counter = 0;

        for(String s : events){
            if(s.equals("W")){
                counter++;
                if(counter == 10) break;
            }else if(s.equals("WD") || s.equals("NB")){
                total++;
            }else{
                total+= Integer.parseInt(s);
            }
        }

        return new int[]{total,counter};
    }
}