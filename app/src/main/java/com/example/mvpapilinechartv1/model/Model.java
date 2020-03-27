package com.example.mvpapilinechartv1.model;

import com.google.gson.annotations.SerializedName;

public class Model {

    @SerializedName("critical_chance")
    private String criticalChance;

    @SerializedName("duration")
    private int duration;

//    @SerializedName("energy_delta")
//    private float energyDelta;

    @SerializedName("move_id")
    private int moveId;

    @SerializedName("name")
    private String name;

    @SerializedName("stamina_loss_scaler")
    public String staminaLoss;

    @SerializedName("type")
    private String type;

    @SerializedName("power")
    public int power;


    public Model(String criticalChance, int duration, int moveId, String name, int power, String staminaLoss, String type) {
        this.criticalChance = criticalChance;
        this.duration = duration;
//        this.energyDelta = energyDelta;
        this.moveId = moveId;
        this.name = name;
        this.staminaLoss = staminaLoss;
        this.type = type;
        this.power = power;
    }


    public void setCriticalChance(String criticalChance) {
        this.criticalChance = criticalChance;
    }

    public String getCriticalChance() {
        return criticalChance;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    //    public void setEnergyDelta(float energyDelta) {
//        this.energyDelta = energyDelta;
//    }

    public void setMoveId(int moveId) {
        this.moveId = moveId;
    }

    public int getMoveId() {
        return moveId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStaminaLoss(String staminaLoss) {
        this.staminaLoss = staminaLoss;
    }

    public String getStaminaLoss() {
        return staminaLoss;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
