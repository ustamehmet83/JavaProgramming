package day31_Constructors;

public class Offer {

    public String location,companyName,jobTitle;
    public double salary;
    public boolean hasBenefit,hasPTO,hasWFH,isFullTime;

    public void setInfo(String location, String companyName, String jobTitle, int salary,
                 boolean hasBenefit, boolean hasPTO, boolean hasWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.hasWFH = hasWFH;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", hasWFH=" + hasWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
