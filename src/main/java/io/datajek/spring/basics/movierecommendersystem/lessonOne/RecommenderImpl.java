package io.datajek.spring.basics.movierecommendersystem.lessonOne;

public class RecommenderImpl {

    private Filter filter;

    public RecommenderImpl(Filter filter) {
        this.filter = filter;
    }

    public String[] recommendMovies(String movie) {
        System.out.println(this.filter);
        return filter.getRecommendations(movie);
    }
}
