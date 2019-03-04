import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MainApplication extends SpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
}
