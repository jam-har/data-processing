package com.pluralsight;
import java.util.Comparator;
import java.util.Scanner;
import com.pluralsight.loops.Person;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        people.add(new Person("Reed", "McBride", 94));
        people.add(new Person("Fern", "Zhang", 26));
        people.add(new Person("Winston", "Mullins",81 ));
        people.add(new Person("Chris", "Burnett", 99));
        people.add(new Person("Lily", "Wilerkson", 5));
        people.add(new Person("Grover", "Roman", 86));
        people.add(new Person("Louella", "Browning", 35));
        people.add(new Person("Fermin", "York", 93));
        people.add(new Person("Kimberly", "Dudley", 66));
        people.add(new Person("Malinda", "Contreras", 54));

        System.out.println("Step 2");
        System.out.println();
        System.out.println("Enter first or last name to search");
        String search = scanner.nextLine().trim();
        List<Person> results = new ArrayList<>();
        boolean found = false;

        for (Person person : people) {
            if (person.getFirstName().toLowerCase().contains(search.toLowerCase()) || person.getLastName().toLowerCase().contains(search.toLowerCase())) {
                results.add(person);
                found = true;
            }

        }
        if (!found) {
            System.out.println("No results found");
        }
        System.out.println(results);
        System.out.println();

        System.out.println("Step 3");
        int totalAge = 0;
        for (Person person : people) {
            totalAge += person.getAge();
        }
        double averageAge = (double) totalAge / people.size();
        System.out.println("Average age: " + averageAge);
        //could use for each loops for finding min and max age, not sure which is best
        //it is better to save as variables or can I just print the results?
        people.sort(Comparator.comparingInt(Person::getAge));
        System.out.println("Oldest person: " + (people.get(people.size() - 1)));
        System.out.println("Youngest person" + (people.get(0)));
    }


}
