package com.example.friendsbook;

import java.io.Serializable;

public class Friends implements Serializable {
    private String name;
    private String job;
    private String characteristic;
    private int pictureId;

    public Friends(String name, String job, String characteristic, int pictureId) {
        this.name = name;
        this.job = job;
        this.characteristic = characteristic;
        this.pictureId = pictureId;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public int getPictureId() {
        return pictureId;
    }
}
