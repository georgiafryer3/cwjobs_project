package Georgia_CWJobs.utilities;

import java.util.concurrent.TimeUnit;

public class RandomHelper {

    public static String generateUniqueEmail() {
        return generateUniqueEmail("");
    }

    public static String generateUniqueEmail(String purpose) {
        return purpose + uniqueTimestamp() + "@gfryer.dev.jobsite.co.uk";
    }

    public static long uniqueTimestamp() {
        try {
            TimeUnit.MILLISECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return System.currentTimeMillis();
    }
}
