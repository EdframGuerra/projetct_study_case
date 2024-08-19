package com.example.CaseStudyProject.demo.Project.repository;


import com.example.CaseStudyProject.demo.Project.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
}
