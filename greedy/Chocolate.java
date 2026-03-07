public class Chocolate {
    
    public static void main(String[] args) {
        
        int n =4, m = 6;

        Integer chocolates[] = {1, 2, 3, 4, 5, 6};
        Integer students[] = {2, 3, 4, 5};

        int h = 0,v = 0;
        int hp = 1,vp = 1;

        while(h < chocolates.length && v < students.length){

            if(chocolates[h] == students[v]){
                hp *= chocolates[h];
                vp *= students[v];
                h++;
                v++;
            }
            else if(chocolates[h] < students[v]){
                h++;
            }
            else{
                v++;
            }
        }
        System.out.println("Maximum product for chocolates: " + hp);
        System.out.println("Maximum product for students: " + vp);
    }
}
