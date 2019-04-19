package spencer.barriball.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spencer.barriball.AppConfig;
import spencer.barriball.MessageGenerator;
import spencer.barriball.NumberGenerator;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Guess the number game!");

        // create context (container)
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // get the number generator bean from context (container)
        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);

        // call method next() to get a random number
        int number = numberGenerator.next();

        // log generated number
        log.info("number = {}", number);

        // get the message generator bean from context (container)
        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);

        log.info("Main message = {}", messageGenerator.getMainMessage());
        log.info("Result message = {}", messageGenerator.getResultMessage());

        // close context (container)
        context.close();
    }
}
