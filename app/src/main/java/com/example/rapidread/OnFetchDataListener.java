package com.example.rapidread;

import com.example.rapidread.models.newsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {
    void onFetchData(List<newsHeadlines> list, String message);
    void onError(String message);
}
