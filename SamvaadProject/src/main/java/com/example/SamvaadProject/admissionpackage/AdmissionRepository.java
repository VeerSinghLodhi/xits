package com.example.SamvaadProject.admissionpackage;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdmissionRepository extends JpaRepository<AdmissionMaster ,String> {

    @Query("select count(a) from  AdmissionMaster a")
    public Long getCount();

    List<AdmissionMaster> findByUserMaster_UserId(Long userId);

    @Query("SELECT a FROM AdmissionMaster a WHERE a.userMaster.userId=:userId")
    List<AdmissionMaster> findByUserMaster(@Param("userId") Long userId);

    @Query("SELECT a FROM AdmissionMaster a WHERE a.course.courseId=:courseId")
    List<AdmissionMaster> findByCourse(@Param("courseId") Long courseId);

    @Query("SELECT a FROM AdmissionMaster a WHERE a.userMaster.userId=:userId And a.course.courseId=:courseId")
    List<AdmissionMaster> findByUserMasterAndCourseMaster(@Param("userId") Long userId,@Param("courseId") Long courseId);

    @Query("SELECT sbm.admission FROM StudentBatchMap sbm WHERE sbm.batch.batchId = :batchId")
    List<AdmissionMaster> findByBatchId(@Param("batchId") Long batchId);

    @Query("select sum(a.netFees) from AdmissionMaster a WHERE a.userMaster.userId=:userId")
    Double getBalanceByStudent(@Param("userId")Long userId);




}
