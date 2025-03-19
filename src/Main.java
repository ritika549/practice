import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Car> myCars = new ArrayList<>();
        Car car1 = new Car("benz",2000,"xuv101");
        Car car2 = new Car("audi",2000,"xuv102");
        myCars.add(car1);
        myCars.add(car2);
        Person person1 = new Person("ritika","developer",16,myCars);
        System.out.println(person1);
    }
}