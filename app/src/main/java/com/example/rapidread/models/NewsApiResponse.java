package com.example.rapidread.models;

import java.util.List;

public class NewsApiResponse {
    String status = "";
    int totalResults;
    List<newsHeadlines> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<newsHeadlines> getArticles() {
        return articles;
    }

    public void setArticles(List<newsHeadlines> articles) {
        this.articles = articles;
    }
}
