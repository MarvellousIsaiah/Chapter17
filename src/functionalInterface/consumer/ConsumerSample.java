package functionalInterface;

import java.awt.*;
import java.util.function.Consumer;

public class ConsumerSample {

        public static void main(String[] args) {
            Consumer<String> consumer = (s) -> {
                System.out.println("you have entered " + s);
                System.out.println("printing" + s);

            };
            consumer.accept("jummy");
            List<String> name = List.Of("Mobaba","Dayo","jummy");
            names.forEach(consumer);
        }
    }

