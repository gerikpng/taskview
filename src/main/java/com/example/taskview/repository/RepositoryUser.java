package com.example.taskview.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.taskview.model.user;

@Repository
public interface RepositoryUser extends JpaRepository<user, UUID> {

}
