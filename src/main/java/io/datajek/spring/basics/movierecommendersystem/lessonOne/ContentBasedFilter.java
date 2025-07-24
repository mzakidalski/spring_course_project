package io.datajek.spring.basics.movierecommendersystem.lessonOne;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //for keeping track of instances created
    private static int instances= 0;

    @Autowired
    private Movie movie;

    public ContentBasedFilter() {
        instances++;
        System.out.println("In ContentBasedFilter constructor called");
    }

    @PostConstruct
    public void init() {
        System.out.println("In ContentBasedFilter post-construct called");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("In ContentBasedFilter preDestroy called");
    }

    public Movie getMovie() {
        return movie;
    }

    public static int getInstances(){
        return ContentBasedFilter.instances;
    }

    public String[] getRecommendations(String movie) {
        var a = getMovie();
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
