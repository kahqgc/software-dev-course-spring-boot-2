package com.example.mycollections.controllers;
import com.example.mycollections.models.Movie;
import com.example.mycollections.models.Music;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private List<Movie> movie = new ArrayList<>()
    {{
        add(new Movie("Jurassic Park", "Steven Spielberg", "1993"));
        add(new Movie("Titanic", "James Cameron", "1997"));
        add(new Movie("Jaws", "Steven Spielberg", "1975" ));
    }};

    @GetMapping("/json")
    public List<Movie> getStudents() {
        return movie;
    }

    @GetMapping("/html")
    public String getMovie() {
        String html = """
 <html>
    <body>
        <ul>
 """;

        for (Movie movies : movie) {
            html += "<li>" + movies.getTitle() + ": " + movies.getDirector() + " (" + movies.getYear() + ")  </li>";
        }

        html += """
        </ul>
    </body>
 </html>""";

        return html;
    }
}
