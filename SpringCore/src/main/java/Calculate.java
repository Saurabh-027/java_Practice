import org.springframework.stereotype.Component;

@Component
public class Calculate {
    void add(int a, int b)
    {
        System.out.println("Sum in student class: " +(a+b));
    }
}
