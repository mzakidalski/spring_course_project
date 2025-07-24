package io.datajek.spring.basics.movierecommendersystem.lessonOne;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {
    @Override
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }

    @PreDestroy
    public void destroy() {
        System.out.println("In CollaborativeFilter destroy");
    }
}
