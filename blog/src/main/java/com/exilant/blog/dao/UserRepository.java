package com.exilant.blog.dao;

import javax.persistence.NamedQuery;

import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.exilant.blog.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>,UserRepositoryCust {

}
