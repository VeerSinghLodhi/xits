package com.example.SamvaadProject.batchmaterialpackage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BatchMaterialRepository extends JpaRepository<BatchMaterialMaster,Long> {

    List<BatchMaterialMaster> findByBatch_BatchId(Long batchId);
}
