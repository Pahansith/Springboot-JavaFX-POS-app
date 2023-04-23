package com.pahansith.proprietary.pointofsale;

import javafx.util.Builder;
import javafx.util.BuilderFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class ControllerBuilderFactory implements BuilderFactory {
    @Autowired
    private ConfigurableApplicationContext context;

    public ControllerBuilderFactory() {

    }

    @Override
    public Builder<?> getBuilder(Class<?> type) {
        try {
            Object bean = this.context.getBean(type);
            if (bean.getClass().isAssignableFrom(type))
                return new Builder() {
                    @Override
                    public Object build() {
                        return bean;
                    }
                };
            else
                return null;
        } catch (BeansException e) {
            return null;
        }
    }
}
