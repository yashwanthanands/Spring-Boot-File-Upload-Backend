package com.yash.dev.fub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.dev.fub.model.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}
