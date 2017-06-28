package mx.infotec.dads.essence;

import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = { "mx.infotec.dads.essence.repository" })
@Import(value = MongoAutoConfiguration.class)
public class DatabaseConfiguration {

}
