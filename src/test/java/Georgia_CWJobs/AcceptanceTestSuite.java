package Georgia_CWJobs;

import net.serenitybdd.jbehave.SerenityStories;

public class AcceptanceTestSuite extends SerenityStories {

    public AcceptanceTestSuite(){
        String story = System.getProperty("run.story");
        String storiesFolder = System.getProperty("run.folder");
            if (story != null) {
            System.out.println("Running " + story);
            findStoriesCalled(story);
        } else if (storiesFolder != null) {
            System.out.println("Running " + storiesFolder);
            findStoriesIn("**/" + storiesFolder + "/");
        } else {
            System.out.println("Running all stories");
            findStoriesIn("**/stories/");
        }
    }
}
