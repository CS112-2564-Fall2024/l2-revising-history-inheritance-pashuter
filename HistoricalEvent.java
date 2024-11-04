 public class HistoricalEvent {
    // Instance variables
    private String description;
    private Date date;

    // Constructor
    public HistoricalEvent(String description, Date date) {
        this.description = description;
        this.date = new Date(date); // Deep copy for immutability
    }

    // Getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return new Date(date); // Return a deep copy for immutability
    }

    public void setDate(Date date) {
        this.date = new Date(date); // Deep copy for immutability
    }

    // toString method
    @Override
    public String toString() {
        return "Date: " + date + "\nDescription: " + description;
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        HistoricalEvent other = (HistoricalEvent) obj;
        return description.equals(other.description) && date.equals(other.date);
    }
}
