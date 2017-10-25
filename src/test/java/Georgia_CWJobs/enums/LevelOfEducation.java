package Georgia_CWJobs.enums;


public enum  LevelOfEducation {
    UNIVERSITY_DEGREE ("University Degree"),
    BTEC ("BTEC"),
    DIPLOMA ("Diploma"),
    PHD ("PhD");

    private final String type;

    LevelOfEducation (String e) {
        type = e;
    }

    public String toString() {
        return type;
    }
}
