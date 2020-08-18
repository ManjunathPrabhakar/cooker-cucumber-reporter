package cookerplugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;


@Mojo(name = "taste", threadSafe = true, defaultPhase = LifecyclePhase.POST_INTEGRATION_TEST)
public class TasterMOJO extends AbstractMojo {

    @Parameter(property = "cucumberJsonPath", required = true, defaultValue = "")
    private String generatedCucumberJSONPath;

    @Parameter(property = "generateInPath", required = true, defaultValue = "")
    private String generateInPath;

    private Log LOGGER = getLog();

    /**
     * This Method is First Executed during INITILIZE (cook) LifeCycle of Maven, Its Thread Safe
     * <h5> Author : Manjunath Prabhakar (manjunath189@gmail.com) </h5>
     *
     * @throws MojoExecutionException If Any
     * @throws MojoFailureException   If Any
     */
    public void execute() throws MojoExecutionException, MojoFailureException {
        // The logic of our plugin will go here
        try {

            LOGGER.info("hello from cooker-cucumber-reporter");
            LOGGER.info("generatedCucumberJSONPath = " + generatedCucumberJSONPath);
            LOGGER.info("generateInPath = " + generateInPath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}