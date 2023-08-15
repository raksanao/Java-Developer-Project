import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Student {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
//    private final int age;


}
