
package Search.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Faqs {

    @SerializedName("raw")
    @Expose
    private Object raw;

    public Object getRaw() {
        return raw;
    }

    public void setRaw(Object raw) {
        this.raw = raw;
    }

}
