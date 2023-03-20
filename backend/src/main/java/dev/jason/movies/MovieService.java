package dev.jason.movies;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

  @Autowired
  private MovieRepository movieRespository;

  public List<Movie> allMovies() {
    return movieRespository.findAll();
  }
}
