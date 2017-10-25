package Georgia_CWJobs.enums;


public enum EducationDropdown {
    UNIVERSITY_DEGREE ("University Degree");

    private final String type;

    private EducationDropdown (String education) {
        type = education;
    }

    public String toString() {
        return type;
    }
}
