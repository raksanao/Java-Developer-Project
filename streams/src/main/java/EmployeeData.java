import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAll() {

        return Stream.of(
                new Employee(100, "Mike", "mikeCyedo@.com", Arrays.asList("12345566", "122344556")),
                new Employee(101, "Ozi", "oziCyedo@.com", Arrays.asList("1282828", "27272727")),
                 new Employee(102, "Peter", "peterCyedo@.com", Arrays.asList("987272727", "9767564")));

    }
}
