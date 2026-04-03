package com.et.EnabledAfricaPlatform.repository.Jobs;

import com.et.EnabledAfricaPlatform.models.jobs.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface JobSeekerProfileRepository
        extends JpaRepository<JobSeekerProfile, Long> {

    Optional<JobSeekerProfile> findByEmail(String email);

    List<JobSeekerProfile> findByEmailIn(Collection<String> emails);
}

