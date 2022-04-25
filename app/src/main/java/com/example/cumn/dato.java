package com.example.cumn;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class dato {
    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("longitude")
    @Expose
    private Integer longitude;
    @SerializedName("latitude")
    @Expose
    private Integer latitude;
    @SerializedName("dtstart")
    @Expose
    private String dtstart;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }
    public void setDtstart(String dtstart) {
        this.dtstart = dtstart;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public Integer getLatitude() {
        return latitude;
    }
    public String getDtstart() {
        return dtstart;
    }

    public dato(Integer id, String title, String description, Integer longitude, Integer latitude, String dtstart) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.longitude = longitude;
        this.latitude = latitude;
        this.dtstart = dtstart;
    }
}