package com.sriyansh.jpa.repositories;

import com.sriyansh.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {
    

}
