package com.et.EnabledAfricaPlatform.repository.Jobs;

import com.et.EnabledAfricaPlatform.models.jobs.SavedJob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SavedJobRepository
        extends JpaRepository<SavedJob, Long> {

    List<SavedJob> findByEmail(String email);
}

