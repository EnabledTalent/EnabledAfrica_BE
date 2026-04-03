package com.et.EnabledAfricaPlatform.repository.Jobs;

import com.et.EnabledAfricaPlatform.models.jobs.EmployerOrganizationProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployerOrganizationProfileRepository extends JpaRepository<EmployerOrganizationProfile, Long> {
    Optional<EmployerOrganizationProfile> findByEmail(String email);
    void deleteByEmail(String email);
    boolean existsByEmail(String email);
}

