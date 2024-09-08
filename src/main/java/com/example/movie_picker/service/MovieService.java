package com.example.movie_picker.service;

import com.example.movie_picker.misc.HiddenInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class MovieService {
    HiddenInfo hiddenInfo = new HiddenInfo();

    private final String apiKey = hiddenInfo.getApi_key();
    private final String baseUrl = "https://api.themoviedb.org/3";
    @Autowired
    private final RestTemplate restTemplate = new RestTemplate();

    public String getPopularMovies() {
        String url = UriComponentsBuilder.fromHttpUrl(baseUrl + "/movie/popular")
                .queryParam("api_key", apiKey)
                .build()
                .toString();
        return restTemplate.getForObject(url, String.class);
    }

    public String getUpcomingMovies() {
        String url = UriComponentsBuilder.fromHttpUrl(baseUrl + "/movie/upcoming")
                .queryParam("api_key", apiKey)
                .build()
                .toString();
        return restTemplate.getForObject(url, String.class);
    }
}
