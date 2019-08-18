package io.sudostream.learning.springboot.two.learningspringboot.controller;

import io.sudostream.learning.springboot.two.learningspringboot.controller.repository.ChapterRepository;
import io.sudostream.learning.springboot.two.learningspringboot.model.Chapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ChapterController {

    private final ChapterRepository chapterRepository;

    public ChapterController(ChapterRepository chapterRepository) {
        this.chapterRepository = chapterRepository;
    }

    @GetMapping("/chapters")
    public Flux<Chapter> listing() {
        return chapterRepository.findAll();
    }

}
