package spencer.barriball.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import spencer.barriball.*;

@Configuration
@Import(GameConfig.class)
@ComponentScan(basePackages = "spencer.barriball")
public class AppConfig {

    // == bean methods ==
    @Bean
    public Game game() {
        return new GameImpl();
    }

    @Bean
    public MessageGenerator messageGenerator() {
        return new MessageGeneratorImpl();
    }
}
