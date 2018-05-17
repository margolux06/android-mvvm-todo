package com.gosia.taskmanager;

import java.util.Date;

public class Task {
    private String name;
    private Date terminateDate;
    private boolean isActive;

    public Task(String name, Date terminateDate, boolean isActive) {
        this.name = name;
        this.terminateDate = terminateDate;
        this.isActive = isActive;
    }

    public Task() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTerminateDate() {
        return terminateDate;
    }

    public void setTerminateDate(Date terminateDate) {
        this.terminateDate = terminateDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
