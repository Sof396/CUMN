package com.example.cumn.model;

import android.location.Location;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//

public class actividad {

    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("dtend")
    @Expose
    private String dtend;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("event-location")
    @Expose
    private String eventLocation;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("relation")
    @Expose
    private String relation;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("organization")
    @Expose
    private Organization organization;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("dtstart")
    @Expose
    private String dtstart;
    @SerializedName("references")
    @Expose
    private String references;
    @SerializedName("recurrence")
    @Expose
    private Recurrence recurrence;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("excluded-days")
    @Expose
    private String excludedDays;

    public class Location{
        @SerializedName("longitude")
        @Expose
        private double longitude;
        @SerializedName("latitude")
        @Expose
        private double latitude;

        public Location(double longitude, double latitude) {
            this.longitude = longitude;
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }
    }

    public class Organization{
        @SerializedName("accesibility")
        @Expose
        private String accesibility;
        @SerializedName("services")
        @Expose
        private String services;
        @SerializedName("schedule")
        @Expose
        private String schedule;
        @SerializedName("organization-name")
        @Expose
        private String organizationName;
        @SerializedName("organization-desc")
        @Expose
        private String organizationDesc;

        public Organization(String accesibility, String services, String schedule, String organizationName, String organizationDesc) {
            this.accesibility = accesibility;
            this.services = services;
            this.schedule = schedule;
            this.organizationName = organizationName;
            this.organizationDesc = organizationDesc;
        }
    }

    public class Recurrence{
        private Integer interval;
        private String days;
        private String frequency;

        public Recurrence(Integer interval, String days, String frequency) {
            this.interval = interval;
            this.days = days;
            this.frequency = frequency;
        }
    }

    public class Address{
        private String area;
        private String locality;
        private String district;
        private String streetAddress;
        private String postalCode;

        public Address(String area, String locality, String district, String streetAddress, String postalCode) {
            this.area = area;
            this.locality = locality;
            this.district = district;
            this.streetAddress = streetAddress;
            this.postalCode = postalCode;
        }
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getDtend() {
        return dtend;
    }

    public void setDtend(String dtend) {
        this.dtend = dtend;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDtstart() {
        return dtstart;
    }

    public void setDtstart(String dtstart) {
        this.dtstart = dtstart;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }

    public Recurrence getRecurrence() {
        return recurrence;
    }

    public void setRecurrence(Recurrence recurrence) {
        this.recurrence = recurrence;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExcludedDays() {
        return excludedDays;
    }

    public void setExcludedDays(String excludedDays) {
        this.excludedDays = excludedDays;
    }

    public actividad(String uid, String dtend, Location location, String eventLocation, String link, String relation, String id, Organization organization, String title, String dtstart, String references, Recurrence recurrence, String price, Address address, String description, String excludedDays) {

        this.uid = uid;
        this.dtend = dtend;
        this.location = location;
        this.eventLocation = eventLocation;
        this.link = link;
        this.relation = relation;
        this.id = id;
        this.organization = organization;
        this.title = title;
        this.dtstart = dtstart;
        this.references = references;
        this.recurrence = recurrence;
        this.price = price;
        this.address = address;
        this.description = description;
        this.excludedDays = excludedDays;
    }
}
