package org.example.projectmanager.entity.prioritylevel;

public class LowPriority implements PriorityLevel {
    @Override
    public String getPriority() {
        return "Low Priority";
    }
}
