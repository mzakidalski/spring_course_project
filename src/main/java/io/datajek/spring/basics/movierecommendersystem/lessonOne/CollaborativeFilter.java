package io.datajek.spring.basics.movierecommendersystem.lessonOne;

public class CollaborativeFilter implements Filter {
    @Override
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
