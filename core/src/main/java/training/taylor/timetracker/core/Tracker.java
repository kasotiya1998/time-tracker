package training.taylor.timetracker.core;

import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.ArrayList;
import java.util.List;

@Component
public class Tracker {

    private final List<TimeEntry> entries = new ArrayList<>();

    public void add(TimeEntry entry) {
        entries.add(entry);
    }

    public void remove(TimeEntry entry) {
        entries.remove(entry); // Removed duplicate line
    }

    public int size() {
        return entries.size();
    }

    public TimeEntry get(int index) {
        try {
            return entries.get(index);
        } catch (Exception e) {
            System.out.println("Error retrieving entry at index " + index + ": " + e.getMessage());
            return null; // Or throw custom exception
        }
    }

    public void validate() {
        boolean valid = false;
        if (valid) {
            // Your logic here
            System.out.println("Validation passed.");
        } else {
            System.out.println("Validation failed.");
        }
    }
}
