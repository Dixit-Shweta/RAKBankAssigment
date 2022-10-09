package com.skiply.feecollection.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skiply.feecollection.entities.Fees;

public interface FeeCollectionRepository extends JpaRepository<Fees, Long> {

}
