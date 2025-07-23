package io.datajek.spring.basics.movierecommendersystem.lessonOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImpl {

    @Autowired
    private Filter contentBasedFilter;

    public RecommenderImpl(Filter contentBasedFilter) {
        this.contentBasedFilter = contentBasedFilter;
    }

    public String[] recommendMovies(String movie) {
        System.out.println(this.contentBasedFilter);
        return contentBasedFilter.getRecommendations(movie);
    }
}
