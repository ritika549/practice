import java.util.List;

public class Person {
    private String name ;
    private String work;
    private int age;
    private List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Person(String name, String work, int age, List<Car> cars) {
        this.name = name;
        this.work = work;
        this.age = age;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", work='" + work + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
