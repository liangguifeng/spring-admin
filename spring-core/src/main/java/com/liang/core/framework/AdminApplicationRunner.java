package com.liang.core.framework;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoaderListener;

@Slf4j
@Component
public class AdminApplicationRunner extends ContextLoaderListener implements ApplicationRunner {

    @Value("${server.port}")
    private int port;

    @Override
    public void run(final ApplicationArguments applicationArguments) {
        log.info("访问地址：http://localhost:" + port);
    }
}
