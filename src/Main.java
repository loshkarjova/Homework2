import com.loshkarova.Car;
import com.loshkarova.Employee;
import com.loshkarova.secondEmployee.SameName;

public class Main {
    public static void main(String[] args) {
        Employee employee = SameName.getEmployee();
        System.out.println(employee);
        Employee employee1 = com.loshkarova.firstEmployee.SameName.getEmployee();
        System.out.println(employee1);

        Car car = new Car();
        car.start();


    }
}
