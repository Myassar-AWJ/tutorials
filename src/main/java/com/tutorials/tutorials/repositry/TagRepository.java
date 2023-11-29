package com.tutorials.tutorials.repositry;

import java.util.List;

import com.tutorials.tutorials.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TagRepository extends JpaRepository<Tag, Long> {
    List<Tag> findTagsByTutorialsId(Long tutorialId);
}