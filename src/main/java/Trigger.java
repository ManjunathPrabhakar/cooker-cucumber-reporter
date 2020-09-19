import com.google.gson.Gson;
import fileFactory.FileUtils;
import json_pojos.FeaturePOJO;
import kloggers.pojos.AllScenariosPageCollection;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Manjunath Prabhakar (Manjunath-PC)
 * @created 19/09/2020
 * @project cooker-cucumber-reporter
 */
public class Trigger {

    public static void main(String[] args) throws Exception {
        List<FeaturePOJO> total = new ArrayList<>();
        Gson gson = new Gson();

        FileUtils featurecontent = new FileUtils("json");
        //Get all *.feature files from existing feature files directory
        List<File> featurefiles = featurecontent.getFiles(".json");

        if (featurefiles.size() > 0) {
            for (File jsonFile : featurefiles) {
                String str = FileUtils.readAndGetFileContent(jsonFile.getPath());
                FeaturePOJO[] featurePOJOS = gson.fromJson(str, FeaturePOJO[].class);
                total.addAll(Arrays.asList(featurePOJOS));

                System.out.println(jsonFile.getName() /*+ "-> " + gson.toJson(featurePOJOS)*/);
                AllScenariosPageCollection a = new AllScenariosPageCollection(featurePOJOS[0], "Title");
                String s = "" + (a.getTotalNumberOfScenarios());
                System.out.println(s);

                // System.out.println(featurePOJOS[0].getElements().get(0).getSteps().get(0).getName());
            }
        }

        System.out.println("total files : " + total.size());


    }


}
