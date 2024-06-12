/*
* Der Code demonstriert die Verwendung von Lambda-Ausdrücken und der Predicate-Funktionalschnittstelle, um eine Liste von Employee-Objekten zu filtern.
*
* Zuerst wird die Klasse Employee definiert, die die Eigenschaften name, age und salary eines Mitarbeiters repräsentiert.
*
* Dann wird die Klasse test69 mit der main-Methode definiert.
*
* In der main-Methode werden einige Employee-Objekte erstellt und einer Liste list hinzugefügt.
*
* Die process-Methode wird aufgerufen, um die list mit Hilfe eines Lambda-Ausdrucks zu filtern.
* Der Lambda-Ausdruck (Employee e) -> e.getSalary() >= 10000 gibt an, dass ein Employee-Objekt ausgewählt wird,
* wenn sein Gehalt größer oder gleich 10000 ist.
* Dies wird durch die Predicate-Funktionalschnittstelle ermöglicht, die als Parameter an die process-Methode übergeben wird.
*
* Die process-Methode durchläuft die Liste der Employee-Objekte mithilfe eines Iterators und entfernt diejenigen,
* die das vom Predicate definierte Kriterium erfüllen.
* ----------------------------------------------------------------------------------------------------------------------
* Schließlich wird die gefilterte Liste ausgegeben.
* Die beiden Ausdrücke:
* process(list, (Employee e) -> { return e.getSalary() >= 10000; });
* process(list, (Employee e) -> e.getSalary() >= 10000);
*
* sind äquivalent. Der erste verwendet eine geschweifte Klammer für den Lambda-Körper und ein return-Schlüsselwort,
* um den Wert zurückzugeben, während der zweite den Pfeiloperator verwendet, um den Wert direkt zurückzugeben.
* Beide Ausdrücke führen zum gleichen Ergebnis.
* */

package JAVA_OCA_Simulation.JAVA_OCA_Test_1.Aufgaben_60_bis_69;
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

public class test69 {
    public static void main(String [] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("James", 25, 15000));
        list.add(new Employee("Lucy", 23, 12000));
        list.add(new Employee("Bill", 27, 10000));
        list.add(new Employee("Jack", 19, 5000));
        list.add(new Employee("Liya", 20, 8000));

        process(list, (Employee e) -> { return e.getSalary() >= 10000; });      //<--
        process(list, (Employee e) -> e.getSalary() >= 10000);                  //<--


        System.out.println(list);
    }

    private static void process(List<Employee> list, Predicate<Employee> predicate) {
        Iterator<Employee> iterator = list.iterator();
        while(iterator.hasNext()) {
            if(predicate.test(iterator.next()))
                iterator.remove();
        }
    }
}
