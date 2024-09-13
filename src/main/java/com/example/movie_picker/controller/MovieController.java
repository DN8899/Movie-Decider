package com.example.movie_picker.controller;
import com.example.movie_picker.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/discover")
    public String getMovies(@RequestParam(value = "year", required = false) Integer year,
                            @RequestParam(value = "genre", required = false) String genre) {
        return movieService.findMovies(year, genre);
    }
}
