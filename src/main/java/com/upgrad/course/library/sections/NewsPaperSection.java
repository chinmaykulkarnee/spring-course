package com.upgrad.course.library.sections;

public class NewsPaperSection {

    String[] newsPapers = {"news-paper-1", "news-paper-2", "news-paper-3"};

    public String getNewsPaper(int index) {
        return newsPapers[index-1];
    }
}
