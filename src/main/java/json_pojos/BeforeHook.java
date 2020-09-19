package json_pojos;

import com.google.gson.annotations.SerializedName;

/**
 * @author Manjunath Prabhakar (Manjunath-PC)
 * @created 19/09/2020
 * @project cooker-cucumber-reporter
 *
 * <p>Read all tags within "before" tag</p>
 * <p>It Might Exist for Scenario(s), Step(s) Only</p>
 */
public class BeforeHook {
    @SerializedName(value = "result")
    private Result result;

    @SerializedName(value = "match")
    private Match match;


    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

}
