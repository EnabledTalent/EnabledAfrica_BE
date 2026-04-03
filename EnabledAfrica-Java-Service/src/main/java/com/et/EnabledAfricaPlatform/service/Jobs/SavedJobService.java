package com.et.EnabledAfricaPlatform.service.Jobs;

import com.et.EnabledAfricaPlatform.exception.ResourceNotFoundException;
import com.et.EnabledAfricaPlatform.models.jobs.Job;
import com.et.EnabledAfricaPlatform.models.jobs.SavedJob;
import com.et.EnabledAfricaPlatform.repository.Jobs.JobRepository;
import com.et.EnabledAfricaPlatform.repository.Jobs.SavedJobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SavedJobService {

    private final SavedJobRepository repo;
    private final JobRepository jobRepo;

    public SavedJobService(SavedJobRepository repo, JobRepository jobRepo) {
        this.repo = repo;
        this.jobRepo = jobRepo;
    }

    public void save(String email, Long jobId) {
        Job job = jobRepo.findById(jobId)
                .orElseThrow(() -> new ResourceNotFoundException("Job not found"));

        SavedJob sj = new SavedJob();
        sj.setEmail(email);
        sj.setJob(job);

        repo.save(sj);
    }

    public List<Job> getSaved(String email) {
        return repo.findByEmail(email)
                .stream()
                .map(SavedJob::getJob)
                .toList();
    }
}

