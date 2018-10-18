package com.company;

public class Education {

    private String degreeType;
    private String major;
    private String school;
    private String yearGraduated;

    public Education() {
    }

    public Education(String degreeType, String major, String school, String yearGraduated) {
        this.degreeType = degreeType;
        this.major = major;
        this.school = school;
        this.yearGraduated = yearGraduated;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getYearGraduated() {
        return yearGraduated;
    }

    public void setYearGraduated(String yearGraduated) {
        this.yearGraduated = yearGraduated;
    }
}
