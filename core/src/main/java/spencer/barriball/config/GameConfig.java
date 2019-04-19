package spencer.barriball.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import spencer.barriball.GuessCount;
import spencer.barriball.MaxNumber;
import spencer.barriball.MinNumber;

@Configuration
@ComponentScan(basePackages = "spencer.barriball")
@PropertySource("classpath:config/game.properties")
public class GameConfig {

    // == fields ==
    @Value("${game.maxNumber:20}")
    private int maxNumber;

    @Value("${game.minNumber:0}")
    private int minNumber;

    @Value("${game.guessCount:5}")
    private int guessCount;

    // == beans methods ==
    @Bean
    @MaxNumber
    public int maxNumber() {
        return maxNumber;
    }

    @Bean
    @MinNumber
    public int getMinNumber() {
        return minNumber;
    }

    @Bean
    @GuessCount
    public int guessCount() {
        return guessCount;
    }
}
