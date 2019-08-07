package org.sakaiproject.core.persistence.grades.repository;

import org.springframework.data.repository.CrudRepository;

import org.sakaiproject.core.persistence.grades.entity.Category;
import org.sakaiproject.core.persistence.grades.entity.Gradebook;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    long countByNameAndGradebookAndRemovedIsFalse(String name, Gradebook gb);
    long countByNameAndGradebookAndIdAndRemovedIsFalse(String name, Gradebook gb, Long id);
    long countByNameAndGradebookAndIdNotAndRemovedIsFalse(String name, Gradebook gb,  Long id);
    List<Category> findByGradebook_IdAndRemovedIsFalse(Long gradebookId);
    List<Category> findByGradebook_Uid(String gradebookUid);
}
