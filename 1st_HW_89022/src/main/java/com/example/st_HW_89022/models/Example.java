package com.example.st_HW_89022.models;

import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Example {

    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("city_name")
    @Expose
    private String cityName;
    @SerializedName("lon")
    @Expose
    private String lon;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("state_code")
    @Expose
    private String stateCode;

    /**
     * No args constructor for use in serialization
     *
     */
    public Example() {
    }

    /**
     *
     * @param data
     * @param cityName
     * @param timezone
     * @param countryCode
     * @param lon
     * @param stateCode
     * @param lat
     */
    public Example(List<Datum> data, String cityName, String lon, String timezone, String lat, String countryCode, String stateCode) {
        super();
        this.data = data;
        this.cityName = cityName;
        this.lon = lon;
        this.timezone = timezone;
        this.lat = lat;
        this.countryCode = countryCode;
        this.stateCode = stateCode;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

}