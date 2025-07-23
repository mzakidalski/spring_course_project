package io.datajek.spring.basics.movierecommendersystem;

import io.datajek.spring.basics.movierecommendersystem.lessonOne.CollaborativeFilter;
import io.datajek.spring.basics.movierecommendersystem.lessonOne.ContentBasedFilter;
import io.datajek.spring.basics.movierecommendersystem.lessonOne.RecommenderImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        //SpringApplication.run(MovieRecommenderSystemApplication.class, args);
        //RecommenderImpl recommender = new RecommenderImpl(new CollaborativeFilter());
        RecommenderImpl recommender = new RecommenderImpl(new ContentBasedFilter());
        String[] result = recommender.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(result));
    }

}
