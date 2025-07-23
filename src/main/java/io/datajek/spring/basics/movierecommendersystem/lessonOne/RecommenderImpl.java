package io.datajek.spring.basics.movierecommendersystem.lessonOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImpl {

    @Autowired
    private Filter filter;

    public RecommenderImpl(Filter filter) {
        this.filter = filter;
    }

    public String[] recommendMovies(String movie) {
        System.out.println(this.filter);
        return filter.getRecommendations(movie);
    }
}
