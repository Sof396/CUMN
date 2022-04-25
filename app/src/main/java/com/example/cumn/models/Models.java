
package com.example.cumn.models;
import java.util.List;

import com.example.cumn.models.Graph;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Models {

    @SerializedName("@context")
    @Expose
    private Context context;
    @SerializedName("@graph")
    @Expose
    private List<Graph> graph = null;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public List<Graph> getGraph() {
        return graph;
    }

    public void setGraph(List<Graph> graph) {
        this.graph = graph;
    }

}
