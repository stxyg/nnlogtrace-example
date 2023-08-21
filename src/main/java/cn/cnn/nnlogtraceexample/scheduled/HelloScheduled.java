package cn.cnn.nnlogtraceexample.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import io.github.stxyg.nnlogtrace.annotation.LogTrace;
import lombok.extern.slf4j.Slf4j;

/**
 * @author stxyg
 * @since 2022/12/29
 **/
@Slf4j
@Component
public class HelloScheduled {

    @Scheduled(fixedRate = 2000)
    @LogTrace
    public void scheduled(){
        log.info("开始scheduled的演示");
    }

}
