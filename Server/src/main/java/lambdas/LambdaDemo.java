package lambdas;

import sandbox.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaDemo {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("A", "Aa", 20),
                new Person("B", "Bb", 30),
                new Person("C", "Cc", 80)
        );
        List<Person> adults = new ArrayList<>();
//        for(Person person : people){
//            if(person.getAge() >= 18){
//                adults.add(person);
//            }
//        }
        List<Person> adults2 = people.stream()
                .filter(person -> person.getAge() >= 18)
                .collect(Collectors.toList());

        adults2.forEach(x -> System.out.println(x.getName()));

//        for (Person person : adults){
//            System.out.println(person.getName());
//        }
    }
}
