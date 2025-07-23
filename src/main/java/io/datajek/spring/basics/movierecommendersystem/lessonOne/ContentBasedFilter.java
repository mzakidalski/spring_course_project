package io.datajek.spring.basics.movierecommendersystem.lessonOne;

import org.springframework.stereotype.Component;

@Component("CBF")
public class ContentBasedFilter implements Filter{

    public String[] getRecommendations(String movie) {
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
