public class RevisedHistoricalEvent extends HistoricalEvent {
    // Instance variables
    private String revisedDescription;
    private String citation;

    // Constructor
    public RevisedHistoricalEvent(String originalDescription, Date date, String revisedDescription, String citation) {
        super(originalDescription, date);
        this.revisedDescription = revisedDescription;
        this.citation = citation;
    }

    // Getters and setters
    public String getRevisedDescription() {
        return revisedDescription;
    }

    public void setRevisedDescription(String revisedDescription) {
        this.revisedDescription = revisedDescription;
    }

    public String getCitation() {
        return citation;
    }

    public void setCitation(String citation) {
        this.citation = citation;
    }

    // teach method
    public void teach() {
        System.out.println("Date: " + getDate());
        System.out.println("Revised Description: " + revisedDescription);
        System.out.println("Citation: " + citation);
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + "\nRevised Description: " + revisedDescription + "\nCitation: " + citation;
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        RevisedHistoricalEvent other = (RevisedHistoricalEvent) obj;
        return revisedDescription.equals(other.revisedDescription) && citation.equals(other.citation);
    }
}