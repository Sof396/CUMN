package com.example.cumn.model;

import android.location.Location;

//

public class actividad {

    private String uid;
    private String dtend;
    private Location location;
    private String eventLocation;
    private String link;
    private String relation;
    private String id;
    private Organization organization;
    private String title;
    private String dtstart;
    private String references;
    private Recurrence recurrence;
    private String price;
    private Address address;
    private String description;
    private String excludedDays;

    public class Location{
        private double longitude;
        private double latitude;

        public Location(double longitude, double latitude){
            this.longitude = longitude;
            this.latitude = latitude;
        }
    }

    public class Organization{
        private String accesibility;
        private String services;
        private String schedule;
        private String organizationName;
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
}
