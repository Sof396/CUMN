//-----------------------------------com.example.Address.java-----------------------------------

        package com.example.cumn;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


class Address {

    @SerializedName("area")
    @Expose
    private String area;
    @SerializedName("locality")
    @Expose
    private String locality;
    @SerializedName("district")
    @Expose
    private String district;
    @SerializedName("street-address")
    @Expose
    private String streetAddress;
    @SerializedName("postal-code")
    @Expose
    private String postalCode;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

}
//-----------------------------------com.example.Example.java-----------------------------------


class ExampleOcio {

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
    private Integer price;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("excluded-days")
    @Expose
    private String excludedDays;

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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
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

}
//-----------------------------------com.example.Location.java-----------------------------------


class LocationOcio {

    @SerializedName("longitude")
    @Expose
    private Integer longitude;
    @SerializedName("latitude")
    @Expose
    private Integer latitude;

    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

}
//-----------------------------------com.example.Organization.java-----------------------------------


class OrganizationOcio {

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

    public String getAccesibility() {
        return accesibility;
    }

    public void setAccesibility(String accesibility) {
        this.accesibility = accesibility;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationDesc() {
        return organizationDesc;
    }

    public void setOrganizationDesc(String organizationDesc) {
        this.organizationDesc = organizationDesc;
    }

}
//-----------------------------------com.example.Recurrence.java-----------------------------------


class RecurrenceOcio {

    @SerializedName("interval")
    @Expose
    private Integer interval;
    @SerializedName("days")
    @Expose
    private String days;
    @SerializedName("frequency")
    @Expose
    private String frequency;

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

}