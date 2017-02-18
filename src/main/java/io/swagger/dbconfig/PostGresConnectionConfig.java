package io.swagger.dbconfig;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;

/**
 * Created by Z062541 on 12/26/2016.
 */

@Configuration

@EnableJpaRepositories(
        entityManagerFactoryRef = "pgEntityManager",
        transactionManagerRef = "pgTransactionManager",
        basePackages = {"io.swagger.repository"})

public class PostGresConnectionConfig {

    private Logger log = Logger.getLogger(this.getClass().getName());

    @Autowired
    private Environment env;

    @Bean(name = "pgEntityManager")
    @Primary
    public LocalContainerEntityManagerFactoryBean pgEntityManager() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(pgDataSource());
        em.setPackagesToScan(new String[] { "io.swagger.repository", "io.swagger.model" });
        em.setPersistenceUnitName("pgUnit");

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        HashMap<String, Object> properties = new HashMap<String, Object>();
        properties.put("hibernate.hbm2ddl.auto", env.getProperty("pg.hibernate.hbm2ddl.auto"));
        properties.put("hibernate.dialect", env.getProperty("pg.hibernate.dialect"));
        properties.put("hibernate.temp.use_jdbc_metadata_defaults", "false");
        properties.put("hibernate.default_schema", env.getProperty("pg.jdbc.schema"));

        em.setJpaPropertyMap(properties);

        return em;
    }

    @Bean
    @Primary
    public DataSource pgDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("pg.jdbc.driverClassName"));
        dataSource.setUrl(env.getProperty("pg.jdbc.url"));
        dataSource.setUsername(env.getProperty("pg.jdbc.user"));
        dataSource.setPassword(env.getProperty("pg.jdbc.pass"));
        log.info("Data Source Of PG is : "+ dataSource.getUsername());
        return dataSource;
    }

    @Bean
    @Primary
    public PlatformTransactionManager pgTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(pgEntityManager().getObject());
        return transactionManager;
    }

}
