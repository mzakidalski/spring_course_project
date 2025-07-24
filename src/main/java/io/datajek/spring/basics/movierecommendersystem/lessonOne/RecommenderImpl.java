package io.datajek.spring.basics.movierecommendersystem.lessonOne;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private Filter filter;

    public RecommenderImpl() {
        System.out.println("In RecommenderImplementation Constructure invoked");
    }

    @Autowired
    public void setFilter(@Qualifier("collaborativeFilter") Filter filter) {
        logger.info("In RecommenderImplementation setter method .. dependency injection");
        this.filter = filter;
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("In RecommenderImplementation postConstruct method");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("In RecommenderImplementation preDestroy method");
    }

    public String[] recommendMovies(String movie) {
        System.out.println(this.filter);
        return filter.getRecommendations(movie);
    }
}
