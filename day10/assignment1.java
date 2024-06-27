package day10;

public class assignment1<T, U> {
    private T first;
    private U second;

    public assignment1(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public assignment1<U, T> reversed() {
        return new assignment1<>(second, first);
    } 
    public static void main(String[] args) {
        
        assignment1<String, Integer> pair = new assignment1<>("today i got medal",123);
        System.out.println("Original Pair: " + pair);

        
        assignment1<Integer, String> reversedPair = pair.reversed();
        System.out.println("Reversed Pair: " + reversedPair);
    }
}
