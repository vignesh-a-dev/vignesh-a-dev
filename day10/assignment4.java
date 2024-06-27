package day10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class assignment4 {
    
        private String name;
        private int age;
    
        public assignment4(String name, int age) {
            this.name = name;
            this.age = age;
        }
    
        public String getName() {
            return name;
        }
    
        public int getAge() {
            return age;
        }
    
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        } 
         public static void main(String[] args) {
        // Create a list of Person objects
        List<assignment4> persons = new ArrayList<>();
        persons.add(new assignment4("Alice", 30));
        persons.add(new assignment4("Bob", 25));
        persons.add(new assignment4("Charlie", 35));
        persons.add(new assignment4("David", 20));

        // Sort the list by age using a lambda expression
        persons.sort(Comparator.comparingInt(assignment4::getAge));

        // Print the sorted list
        persons.forEach(System.out::println);
    }
    }
     

