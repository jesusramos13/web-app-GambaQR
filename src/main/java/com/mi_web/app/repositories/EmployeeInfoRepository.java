package com.mi_web.app.repositories;

import com.mi_web.app.models.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeInfoRepository extends JpaRepository<EmployeeInfo, Integer> {
    List<EmployeeInfo> findByUserId(Integer userId);
    List<EmployeeInfo> findByRestaurantId(Integer restaurantId);
}