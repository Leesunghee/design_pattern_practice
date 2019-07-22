package com.ready2die.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Publisher<Channel> {

    private String news;
    private List<Channel> channelList = new ArrayList<>();

    @Override
    public void addObserver(Channel channel) {
        this.channelList.add(channel);
    }

    @Override
    public void removeObserver(Channel channel) {
        this.channelList.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        for (Channel channel : channelList) {
            channel.update(this.news);
        }
    }
}
