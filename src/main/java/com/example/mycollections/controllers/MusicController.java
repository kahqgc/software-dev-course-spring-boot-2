package com.example.mycollections.controllers;
import com.example.mycollections.models.Music;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/music")
public class MusicController {
    private List<Music> music = new ArrayList<>()
    {{
        add(new Music("The Cranberries", "Everybody Else Is Doing It, Why Can't We?", "1993"));
        add(new Music("Alanis Morisette", "Jagged Little Pill", "1995"));
        add(new Music("Miley Cyrus", "Bangerz", "2014" ));
    }};

    @GetMapping("/json")
    public List<Music> getStudents() {
        return music;
    }

    @GetMapping("/html")
    public String getMusic() {
        String html = """
 <html>
    <body>
        <ul>
 """;

        for (Music musics: music) {
            html += "<li>" + musics.getArtist() + ": " + musics.getAlbum() + " (" + musics.getYear() + ")  </li>";
        }

        html += """
        </ul>
    </body>
 </html>""";

        return html;
    }
}
