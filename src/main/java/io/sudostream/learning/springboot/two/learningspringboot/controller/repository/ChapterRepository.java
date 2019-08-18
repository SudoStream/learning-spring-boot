package io.sudostream.learning.springboot.two.learningspringboot.controller.repository;

import io.sudostream.learning.springboot.two.learningspringboot.model.Chapter;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ChapterRepository extends ReactiveCrudRepository<Chapter, String> {

}
