package json_pojos;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Manjunath Prabhakar (Manjunath-PC)
 * @created 19/09/2020
 * @project cooker-cucumber-reporter
 *
 * <p>This is used ot hold Elements, An Element can be Background or Scenario</p>
 */
public class Elements {

    @SerializedName(value = "line")
    private int line;

    @SerializedName(value = "name")
    private String name = "";

    @SerializedName(value = "id")
    private String id = "";

    @SerializedName(value = "description")
    private String description = "";

    @SerializedName(value = "type")
    private String type = "";

    @SerializedName(value = "keyword")
    private String keyword = "";

    @SerializedName(value = "steps")
    private List<Steps> steps = new ArrayList<Steps>();

    @SerializedName(value = "tags")
    private List<Tags> tags = new ArrayList<Tags>();

    @SerializedName(value = "start_timestamp")
    private String start_timestamp = "";

    @SerializedName(value = "before")
    private List<BeforeHook> before = new ArrayList<BeforeHook>();

    @SerializedName(value = "after")
    private List<AfterHook> after = new ArrayList<AfterHook>();

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public List<Steps> getSteps() {
        return steps;
    }

    public void setSteps(List<Steps> steps) {
        this.steps = steps;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    public String getStart_timestamp() {
        return start_timestamp;
    }

    public void setStart_timestamp(String start_timestamp) {
        this.start_timestamp = start_timestamp;
    }

    public List<BeforeHook> getBefore() {
        return before;
    }

    public void setBefore(List<BeforeHook> before) {
        this.before = before;
    }

    public List<AfterHook> getAfter() {
        return after;
    }

    public void setAfter(List<AfterHook> after) {
        this.after = after;
    }

    public boolean isScenario() {
        return type.equalsIgnoreCase("scenario");
    }
}
