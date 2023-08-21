package cn.cnn.nnlogtraceexample.config;

import org.springframework.stereotype.Component;

import io.github.stxyg.nnlogtrace.annotation.LoginUserConfigurer;

/**
 * @author stxyg
 * @since 2022/12/29
 **/
@Component
public class LogUserConfig implements LoginUserConfigurer {
    @Override
    public String getCurrentName() {
        return "小白";
    }
}
