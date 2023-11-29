package com.tutorials.tutorials.repositry;

import java.util.List;

import com.tutorials.tutorials.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    // ...
    List<Tutorial> findTutorialsByTagsId(Long tagId);

    List<Tutorial> findByPublished(boolean b);

    List<Tutorial> findByTitleContaining(String title);

}
