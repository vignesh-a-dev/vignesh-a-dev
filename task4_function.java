

public class task4_function {
    public void sum(int a, int b) {
        System.out.println("The sum is: " + (a + b));
    }

    public static void sub(int a, int b) {
        System.out.println("Sub: " + (a - b));
    }

    public static int prod(int a, int b) {
        return a * b;
    }

    public static double sine(int a) {
        return Math.sin(a);
    } 
    public static double cosine(int a){
        return Math.cos(a);
    }
    public static double tan(int a){
        return Math.tan(a);
    }

    public static void main(String[] args) {
        task4_function m = new task4_function();
        m.sum(5, 6);
        m.sum(6, 9);

        sub(4, 1);
        int result = prod(5, 6);
        System.out.println("product: " + result); 

        //TODO: calculator methods

        System.out.println("sine: " + sine(0)); // 1 radians
        System.out.println("cosine: "+ cosine(23));
        System.out.println("tan: "+ tan(23));
    }
}

