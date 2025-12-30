package problem_solving.filtered_list;

import problem_solving.list_method.ListManipulation;

import java.util.List;
import java.util.stream.Stream;

public class ListFilter {
    public static void main(String[] args) {
        List<Employee> developer = List.of(
                new Employee(1, "Osman", 120_000, "developer"),
                new Employee(2, "Goni", 200_000, "developer"),
                new Employee(3, "Md", 150_000, "developer")
        );

        List<Employee> tester = List.of(
                new Employee(4, "ashi", 20_000, "tester"),
                new Employee(5, "Sharma", 150_000, "tester"),
                new Employee(6, "Chicken Sharma", 150_000, "tester")
        );

        List<Employee> manager = List.of(
                new Employee(7, "John", 100_000,  "manager"),
                new Employee(8, "Jack", 150_000, "manager"),
                new Employee(9, "Peter", 150_000, "manager")
        );

        Stream<Employee> employeeStream = Stream.concat(
                Stream.concat(developer.stream(), tester.stream()),
                manager.stream());

        //employeeStream.forEach(System.out::println);

        employeeStream.filter(employee -> employee.designation.equals("manager")).forEach(System.out::println);

    }

    static record Employee(long id, String name, int salary, String designation) {

    }
}
