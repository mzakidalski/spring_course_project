package io.datajek.spring.basics.movierecommendersystem.lessonOne;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Named
public class ContentBasedFilter implements Filter{

    //for keeping track of instances created
    private static int instances= 0;

    @Inject
    private Movie movie;

    public ContentBasedFilter() {
        instances++;
        System.out.println("ContentBasedFilter constructor called");
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
