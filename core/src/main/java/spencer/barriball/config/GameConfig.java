package spencer.barriball.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import spencer.barriball.GuessCount;
import spencer.barriball.MaxNumber;

@Configuration
@PropertySource("classpath:config/game.properties")
public class GameConfig {

    // == fields ==
    @Value("${game.maxNumber}")
    private int maxNumber;

    @Value("${game.guessCount}")
    private int guessCount;

    // == beans methods ==
    @Bean
    @MaxNumber
    public int maxNumber() {
        return maxNumber;
    }

    @Bean
    @GuessCount
    public int guessCount() {
        return guessCount;
    }
}
