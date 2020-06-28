package com.mycatdoitbetter.crud.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycatdoitbetter.crud.models.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
  List<Tutorial> findByPublished(boolean published);

  List<Tutorial> findByTitleContaining(String title);
}