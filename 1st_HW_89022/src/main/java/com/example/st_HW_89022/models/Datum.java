package com.example.st_HW_89022.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Datum {

    @SerializedName("mold_level")
    @Expose
    private Integer moldLevel;
    @SerializedName("aqi")
    @Expose
    private Integer aqi;
    @SerializedName("pm10")
    @Expose
    private Double pm10;
    @SerializedName("co")
    @Expose
    private Double co;
    @SerializedName("o3")
    @Expose
    private Double o3;
    @SerializedName("predominant_pollen_type")
    @Expose
    private String predominantPollenType;
    @SerializedName("so2")
    @Expose
    private Double so2;
    @SerializedName("pollen_level_tree")
    @Expose
    private Integer pollenLevelTree;
    @SerializedName("pollen_level_weed")
    @Expose
    private Integer pollenLevelWeed;
    @SerializedName("no2")
    @Expose
    private Double no2;
    @SerializedName("pm25")
    @Expose
    private Double pm25;
    @SerializedName("pollen_level_grass")
    @Expose
    private Integer pollenLevelGrass;

    /**
     * No args constructor for use in serialization
     *
     */
    public Datum() {
    }

    /**
     *
     * @param moldLevel
     * @param no2
     * @param o3
     * @param pm25
     * @param so2
     * @param pollenLevelGrass
     * @param aqi
     * @param pm10
     * @param co
     * @param pollenLevelWeed
     * @param pollenLevelTree
     * @param predominantPollenType
     */
    public Datum(Integer moldLevel, Integer aqi, Double pm10, Double co, Double o3, String predominantPollenType, Double so2, Integer pollenLevelTree, Integer pollenLevelWeed, Double no2, Double pm25, Integer pollenLevelGrass) {
        super();
        this.moldLevel = moldLevel;
        this.aqi = aqi;
        this.pm10 = pm10;
        this.co = co;
        this.o3 = o3;
        this.predominantPollenType = predominantPollenType;
        this.so2 = so2;
        this.pollenLevelTree = pollenLevelTree;
        this.pollenLevelWeed = pollenLevelWeed;
        this.no2 = no2;
        this.pm25 = pm25;
        this.pollenLevelGrass = pollenLevelGrass;
    }

    public Integer getMoldLevel() {
        return moldLevel;
    }

    public void setMoldLevel(Integer moldLevel) {
        this.moldLevel = moldLevel;
    }

    public Integer getAqi() {
        return aqi;
    }

    public void setAqi(Integer aqi) {
        this.aqi = aqi;
    }

    public Double getPm10() {
        return pm10;
    }

    public void setPm10(Double pm10) {
        this.pm10 = pm10;
    }

    public Double getCo() {
        return co;
    }

    public void setCo(Double co) {
        this.co = co;
    }

    public Double getO3() {
        return o3;
    }

    public void setO3(Double o3) {
        this.o3 = o3;
    }

    public String getPredominantPollenType() {
        return predominantPollenType;
    }

    public void setPredominantPollenType(String predominantPollenType) {
        this.predominantPollenType = predominantPollenType;
    }

    public Double getSo2() {
        return so2;
    }

    public void setSo2(Double so2) {
        this.so2 = so2;
    }

    public Integer getPollenLevelTree() {
        return pollenLevelTree;
    }

    public void setPollenLevelTree(Integer pollenLevelTree) {
        this.pollenLevelTree = pollenLevelTree;
    }

    public Integer getPollenLevelWeed() {
        return pollenLevelWeed;
    }

    public void setPollenLevelWeed(Integer pollenLevelWeed) {
        this.pollenLevelWeed = pollenLevelWeed;
    }

    public Double getNo2() {
        return no2;
    }

    public void setNo2(Double no2) {
        this.no2 = no2;
    }

    public Double getPm25() {
        return pm25;
    }

    public void setPm25(Double pm25) {
        this.pm25 = pm25;
    }

    public Integer getPollenLevelGrass() {
        return pollenLevelGrass;
    }

    public void setPollenLevelGrass(Integer pollenLevelGrass) {
        this.pollenLevelGrass = pollenLevelGrass;
    }

}