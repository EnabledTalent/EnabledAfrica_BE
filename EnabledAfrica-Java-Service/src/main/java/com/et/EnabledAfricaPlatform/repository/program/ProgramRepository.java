package com.et.EnabledAfricaPlatform.repository.program;

import com.et.EnabledAfricaPlatform.models.program.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramRepository extends JpaRepository<Program, Long> {
}
