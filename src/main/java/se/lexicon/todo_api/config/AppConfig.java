package se.lexicon.todo_api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import se.lexicon.notify.config.NotifyUtilConfig;

@Configuration
@Import(NotifyUtilConfig.class)
public class AppConfig {
}
