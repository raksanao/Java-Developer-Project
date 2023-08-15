import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        //Print all emails
        EmployeeData.readAll().
                map(Employee::getEmpEmail).
                forEach(System.out::println);

        //Print all phone numbers
        EmployeeData.readAll().
                map(Employee::getEmpPhoneNumber)
                .forEach(System.out::println);

        EmployeeData.readAll().flatMap(employee -> employee.getEmpPhoneNumber().stream()).forEach(System.out::println);

//or the other way we can do with colling method name
        System.out.println("***********************");
        EmployeeData.readAll().
                map(Employee::getEmpPhoneNumber)
                .flatMap(List::stream).
                forEach(System.out::println);





    }
}
