import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {

    @Bean
    @Scope
    public ItemImpl1 item1() {
        return new ItemImpl1();
    }

    @Bean
    @Scope("prototype")
    public Store store() {
        return new Store();
    }


}
