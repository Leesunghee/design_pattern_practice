package com.ready2die.observer;

public class NewsChannel implements Channel<String> {

    private String news;

    @Override
    public void update(String news) {

        this.setNews((String) news);
        System.out.println(this.getNews());
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
