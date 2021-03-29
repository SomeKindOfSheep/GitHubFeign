
package Search.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta_ {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("engine")
    @Expose
    private String engine;
    @SerializedName("score")
    @Expose
    private Double score;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

}
