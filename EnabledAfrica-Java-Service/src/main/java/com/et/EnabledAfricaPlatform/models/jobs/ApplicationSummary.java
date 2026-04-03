package com.et.EnabledAfricaPlatform.models.jobs;

import com.et.EnabledAfricaPlatform.models.jobs.ApplicationStatus;

public interface ApplicationSummary {

    ApplicationStatus getStatus();
    long getCount();
}
