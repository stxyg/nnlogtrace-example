package cn.cnn.nnlogtraceexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import io.github.stxyg.nnlogtrace.annotation.EnableLogRequest;
import io.github.stxyg.nnlogtrace.annotation.EnableLogTrace;

@SpringBootApplication
@EnableScheduling
@EnableLogTrace
@EnableLogRequest
public class NnlogtraceExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(NnlogtraceExampleApplication.class, args);
    }

}
