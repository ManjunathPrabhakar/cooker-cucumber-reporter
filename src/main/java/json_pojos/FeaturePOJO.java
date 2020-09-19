package json_pojos;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Manjunath Prabhakar (Manjunath-PC)
 * @created 19/09/2020
 * @project cooker-cucumber-reporter
 *
 * <p> This POJO Class reads all the Tag's of JSON File</p>
 */
public class FeaturePOJO {

    @SerializedName(value = "line")
    private int line;

    @SerializedName(value = "elements")
    private List<Elements> elements = new ArrayList<Elements>();

    @SerializedName(value = "name")
    private String name = "";

    @SerializedName(value = "description")
    private String description = "";

    @SerializedName(value = "id")
    private String id = "";

    @SerializedName(value = "keyword")
    private String keyword = "";

    @SerializedName(value = "uri")
    private String uri = "";

    @SerializedName(value = "tags")
    private List<Tags> tags = new ArrayList<Tags>();

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public List<Elements> getElements() {
        return elements;
    }

    public void setElements(List<Elements> elements) {
        this.elements = elements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

}
