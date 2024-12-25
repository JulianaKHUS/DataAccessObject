package program.dataaccessobject.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import program.dataaccessobject.repository.ProductRepository;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); // Укажите ваш драйвер
        dataSource.setUrl("jdbc:mysql://localhost:3306/your_database"); // Укажите ваш URL
        dataSource.setUsername("your_username"); // Укажите ваше имя пользователя
        dataSource.setPassword("your_password"); // Укажите ваш пароль
        return dataSource;
    }

    @Bean
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate() {
        return new NamedParameterJdbcTemplate(dataSource());
    }

    @Bean
    public ProductRepository productRepository() {
        return new ProductRepository(namedParameterJdbcTemplate());
    }
}

