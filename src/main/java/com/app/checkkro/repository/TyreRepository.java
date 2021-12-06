package com.app.checkkro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.checkkro.entity.Tyre;

@Repository
public interface TyreRepository extends JpaRepository<Tyre, Integer> {


}
