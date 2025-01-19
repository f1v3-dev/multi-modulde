package com.f1v3.demo.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * {class name}.
 *
 * @author 정승조
 * @version 2025. 01. 19.
 */
@Configuration
@EnableTransactionManagement
@EntityScan(basePackages = "com.f1v3.demo")
@EnableJpaRepositories(basePackages = "com.f1v3.demo")
public class CoreJpaConfig {
}
