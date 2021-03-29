
package Search.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta {

    @SerializedName("alerts")
    @Expose
    private List<Object> alerts = null;
    @SerializedName("warnings")
    @Expose
    private List<Object> warnings = null;
    @SerializedName("page")
    @Expose
    private Page page;
    @SerializedName("engine")
    @Expose
    private Engine engine;
    @SerializedName("request_id")
    @Expose
    private String requestId;

    public List<Object> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<Object> alerts) {
        this.alerts = alerts;
    }

    public List<Object> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<Object> warnings) {
        this.warnings = warnings;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

}
