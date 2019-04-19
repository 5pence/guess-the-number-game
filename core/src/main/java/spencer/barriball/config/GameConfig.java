package spencer.barriball.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spencer.barriball.GuessCount;
import spencer.barriball.MaxNumber;

@Configuration
public class GameConfig {

    // == fields ==
    private int maxNumber = 50;
    private int guessCount = 5;

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
