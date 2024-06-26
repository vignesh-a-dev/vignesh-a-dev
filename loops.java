public class loops {
    public static void main(String[] args) {
       
        
        for (char i = 'a'; i <= 'z'; i++) {
           System.out.println(i);
        } 
        System.out.println("for loop finished");

        //while loops
        int i = 0;
        while (i < 100) {
            if(i % 2 != 0) { // odd
                i++;
                continue; // skip
            }
             System.out.println(i);
            if(i == 50) {
                break; // exit the loop
            }
            i++; // update statement 
           
        }
        System.out.println("while loop finished");

        // do-while loops (atleast 1 times)
        int j = 20;
        do {
             System.out.println(j);
            j--;
        } while(j > 0);


    }
}