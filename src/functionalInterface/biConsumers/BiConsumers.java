package functionalInterface;

public class BiConsumers {

        public static void main(String[]arg){
            BiConsumers<String,Integer> biConsumers =(firstname, age)-> printFirstNameAndAge(firstname,age);
            biConsumers.accept("hey",you: 10);
        }
    }


