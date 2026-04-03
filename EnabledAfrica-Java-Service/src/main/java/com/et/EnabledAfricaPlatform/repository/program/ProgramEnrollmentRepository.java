package com.et.EnabledAfricaPlatform.repository.program;

import com.et.EnabledAfricaPlatform.models.program.Program;
import com.et.EnabledAfricaPlatform.models.program.ProgramEnrollment;
import com.et.EnabledAfricaPlatform.models.program.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramEnrollmentRepository
        extends JpaRepository<ProgramEnrollment, Long> {

    boolean existsByProgramAndUser(Program program, User user);
}
