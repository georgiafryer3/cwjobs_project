package Georgia_CWJobs.entities;


import Georgia_CWJobs.utilities.RandomHelper;
import net.serenitybdd.core.Serenity;

public class Candidate {

    private String firstName;
    private String surname;
    private String emailAddress;
    private String password;
    private String currentJobTitle;
    private String salary;

    public Candidate() {
        firstName =  "Georgia";
        surname = "Fryer";
        emailAddress = RandomHelper.generateUniqueEmail();
        password = "";
        currentJobTitle = "";
    }

    public static void putCandidate(Candidate candidate) {
        Serenity.getCurrentSession().put("candidate", candidate);
    }

    public static Candidate getCandidate() {
        return (Candidate) Serenity.getCurrentSession().get("candidate");
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
