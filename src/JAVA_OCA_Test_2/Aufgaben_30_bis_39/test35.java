/*
Gesamterklärung
process(List, Predicate) druckt alle Datensätze, die den Test des Prädikats bestehen, und der Test besteht darin,
die Datensätze mit einem Alter von mehr als 20 Jahren zu verarbeiten.

Es gibt 3 Datensätze mit einem Alter > 20 Jahren, die im Anzeigenauftrag gedruckt werden.
HINWEIS: Die Methode toString() gibt nur den Namen zurück.
 * */
package JAVA_OCA_Test_2.Aufgaben_30_bis_39;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return name;
    }
}

public class test35 {
    public static void main(String [] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("James", 25, 15000));
        list.add(new Employee("Lucy", 23, 12000));
        list.add(new Employee("Bill", 27, 10000));
        list.add(new Employee("Jack", 19, 5000));
        list.add(new Employee("Liya", 20, 8000));

        process(list, e -> e.getAge() > 20);
    }

    private static void process(List<Employee> list, Predicate<Employee> predicate) {
        Iterator<Employee> iterator = list.iterator();
        while(iterator.hasNext()) {
            Employee e = iterator.next();
            if(predicate.test(e))
                System.out.print(e + " ");
        }
    }
}
