package urfn.imd.jv.springconfigserver;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;

@EnableConfigServer
@SpringBootApplication
public class SpringConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringConfigServerApplication.class, args);
    }

    @Bean
    public Sampler alwaysSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
