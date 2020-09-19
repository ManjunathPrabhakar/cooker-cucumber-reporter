package kloggers.pojos;

import json_pojos.Elements;
import json_pojos.FeaturePOJO;
import json_pojos.Steps;
import json_pojos.Tags;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Manjunath Prabhakar (Manjunath-PC)
 * @created 19/09/2020
 * @project cooker-cucumber-reporter
 */
public class AllScenariosPageCollection {
    private List<FeaturePOJO> reports = new ArrayList<>();
    private Tags tagFilter;
    private Steps stepFilter;


    public AllScenariosPageCollection(FeaturePOJO fpm, final String pageTitle) {
        reports.add(fpm);
        System.out.println(pageTitle);
    }

    public int getTotalNumberOfScenarios() {
        int count = 0;
        for (FeaturePOJO fp : reports) {
            for (Elements e : fp.getElements()) {
                if (e.isScenario()) {
                    count++;
                }
            }
        }
        return count;
    }


}
