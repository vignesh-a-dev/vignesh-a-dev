public class sorting {
    
    public static void main(String[] args) {
       
        int[] arr = {10, 9, 0, 46, 85, 27};
        

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        
    }
}