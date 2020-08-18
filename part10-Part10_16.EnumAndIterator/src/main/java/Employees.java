
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author micheal
 */
public class Employees {

    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        // adds the given person to the employees list
        this.employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        // adds the given list of people to the employees list
        peopleToAdd.stream().forEach(person -> employees.add(person));
    }

    public void print() {
        // prints all employees
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
        }
    }

    public void print(Education education) {
        // prints the employees whose education matches the education given as a parameter.
//        this.employees.stream()
//                .filter(person -> person.getEducation().equals(education))
//                .forEach(person -> System.out.println(person));

        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if(person.getEducation() == education){
                System.out.println(person);
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if(person.getEducation() == education){
                iterator.remove();
            }
        }
    }
}
