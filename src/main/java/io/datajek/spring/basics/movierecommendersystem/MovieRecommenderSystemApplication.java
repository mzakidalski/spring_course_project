package io.datajek.spring.basics.movierecommendersystem;

import io.datajek.spring.basics.movierecommendersystem.lessonOne.CollaborativeFilter;
import io.datajek.spring.basics.movierecommendersystem.lessonOne.ContentBasedFilter;
import io.datajek.spring.basics.movierecommendersystem.lessonOne.Movie;
import io.datajek.spring.basics.movierecommendersystem.lessonOne.RecommenderImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import java.sql.SQLOutput;
import java.util.Arrays;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        //SpringApplication.run(MovieRecommenderSystemApplication.class, args);
        //RecommenderImpl recommender = new RecommenderImpl(new CollaborativeFilter());
        //RecommenderImpl recommender = new RecommenderImpl(new ContentBasedFilter());
        //String[] result = recommender.recommendMovies("Finding Dory");
        //System.out.println(Arrays.toString(result));

        ApplicationContext ctx = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
        RecommenderImpl recommender = ctx.getBean(RecommenderImpl.class);

        String favoriteMovie = recommender.getFavoriteMovie();
        System.out.println("Favorite movie: " + favoriteMovie);
        String[] result = recommender.recommendMovies(favoriteMovie);
        System.out.printf("result = " + Arrays.toString(result) + "\n");

        ContentBasedFilter filter = ctx.getBean(ContentBasedFilter.class);
        Movie movieOne = filter.getMovie();
        Movie movieTwo = filter.getMovie();
        Movie movieThree = filter.getMovie();
        Movie movieFour = filter.getMovie();

        System.out.println(movieOne);
        System.out.println(movieTwo);
        System.out.println(movieThree);
        System.out.println(movieFour);

        System.out.println("\nContentBasedFilter instances created: " + ContentBasedFilter.getInstances());
        System.out.println("Movie instances created: "+ Movie.getInstances());
    }

}
