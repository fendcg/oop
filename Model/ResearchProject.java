public class ResearchProject {
    private String projectName;
    private String projectLead;
    private java.util.Date startDate;
    private java.util.Date endDate;

    public ResearchProject(String projectName, String projectLead, java.util.Date startDate, java.util.Date endDate) {
        this.projectName = projectName;
        this.projectLead = projectLead;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectLead() {
        return projectLead;
    }

    public void setProjectLead(String projectLead) {
        this.projectLead = projectLead;
    }

    public java.util.Date getStartDate() {
        return startDate;
    }

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    public java.util.Date getEndDate() {
        return endDate;
    }

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }
}
