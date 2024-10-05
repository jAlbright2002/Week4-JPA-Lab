package ie.atu.week3taskmanagement;

import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MsgCon {

    @Bean
    public HttpMessageConverters customHttpMessageConverters() {
        List<HttpMessageConverter<?>> converters = new ArrayList<>();
        return new HttpMessageConverters(converters);
    }
}
