package day10;


    public class assignment2 {

        public static <T> void swap(T[] array, int index1, int index2) {
            if (index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
                throw new IndexOutOfBoundsException("Invalid indices provided");
            }
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    
        public static void main(String[] args) {
            
    
            // Integer array
            Integer[] intArray = {1, 2, 3, 4, 5};
            System.out.println("Original Integer array: ");
            printArray(intArray);
            swap(intArray, 1, 3);
            System.out.println("Swapped Integer array: ");
            printArray(intArray);
    
            // String array
            String[] strArray = {"apple", "banana", "cherry", "date"};
            System.out.println("Original String array: ");
            printArray(strArray);
            swap(strArray, 0, 2);
            System.out.println("Swapped String array: ");
            printArray(strArray);
    
            // Double array
            Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
            System.out.println("Original Double array: ");
            printArray(doubleArray);
            swap(doubleArray, 1, 2);
            System.out.println("Swapped Double array: ");
            printArray(doubleArray);
        }
    
        // Helper method to print array
        public static <T> void printArray(T[] array) {
            for (T element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    
