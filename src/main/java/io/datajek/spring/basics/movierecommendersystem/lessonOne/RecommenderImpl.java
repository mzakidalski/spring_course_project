package io.datajek.spring.basics.movierecommendersystem.lessonOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImpl {

    private Filter filter;

    public RecommenderImpl(@Qualifier("collaborativeFilter") Filter filter) {
        this.filter = filter;
        System.out.println("Constructure invoked");
    }

    public String[] recommendMovies(String movie) {
        System.out.println(this.filter);
        return filter.getRecommendations(movie);
    }
}
