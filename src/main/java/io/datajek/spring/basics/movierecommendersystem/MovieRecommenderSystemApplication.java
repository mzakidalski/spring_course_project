package io.datajek.spring.basics.movierecommendersystem;

import io.datajek.spring.basics.movierecommendersystem.lessonOne.CollaborativeFilter;
import io.datajek.spring.basics.movierecommendersystem.lessonOne.ContentBasedFilter;
import io.datajek.spring.basics.movierecommendersystem.lessonOne.RecommenderImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;
import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        //SpringApplication.run(MovieRecommenderSystemApplication.class, args);
        //RecommenderImpl recommender = new RecommenderImpl(new CollaborativeFilter());
        //RecommenderImpl recommender = new RecommenderImpl(new ContentBasedFilter());
        //String[] result = recommender.recommendMovies("Finding Dory");
        //System.out.println(Arrays.toString(result));

        ApplicationContext ctx = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
        RecommenderImpl recommender = ctx.getBean(RecommenderImpl.class);

        String[] result = recommender.recommendMovies("Finding Dory");
        System.out.printf("result = " + Arrays.toString(result) + "\n");

    }

}
