package io.corbel.oauth.filter.plugin;

import io.corbel.oauth.filter.FilterRegistry;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public abstract class AuthFilterPlugin implements InitializingBean {

    @Autowired private FilterRegistry registry;
    protected ApplicationContext context;

    @Override
    public final void afterPropertiesSet() throws Exception {
        init();
        register(registry);
    }

    protected abstract void init();

    protected abstract void register(FilterRegistry registry);
}