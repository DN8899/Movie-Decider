package com.example.movie_picker.controller;
import com.example.movie_picker.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/popular")
    public String getPopularMovies() {
        System.out.println("Entered");
        return movieService.getPopularMovies();
    }

    @GetMapping()
    public String test() {
        System.out.println("Testing please work");
        return "IT WORKED";
    }

    @GetMapping("/upcoming")
    public String getUpcomingMovies() {
        return movieService.getUpcomingMovies();
    }
}
