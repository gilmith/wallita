package org.wallita.spring.bbdd;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class H2DS {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    DataSource datasourceSP() {
        return DataSourceBuilder.create().build();
    }
    
    @Bean
    @ConfigurationProperties(prefix = "spring.wallitadatasource")
    DataSource datasourceWallita() {
        return DataSourceBuilder.create().build();
    }
    
	
	@Bean
	EntityManagerFactory h2EntityManagerFactory() {
		LocalContainerEntityManagerFactoryBean lem = 
				new LocalContainerEntityManagerFactoryBean();
		lem.setDataSource(datasourceWallita());
		lem.setPackagesToScan("org.wallita.entity");
		lem.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		lem.setPersistenceProviderClass(HibernatePersistenceProvider.class);
		lem.afterPropertiesSet();
		return lem.getObject();
	}

    @Bean
    @Primary
    JpaTransactionManager jpaTransactionManager() {
        JpaTransactionManager jpaTransactionManager = new
                JpaTransactionManager();
        jpaTransactionManager.setDataSource(datasourceWallita());
        jpaTransactionManager.setEntityManagerFactory(h2EntityManagerFactory());
        return jpaTransactionManager;
    }
	
}
