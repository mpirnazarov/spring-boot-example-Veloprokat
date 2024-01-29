package com.javatpoint.springbootexample.entity;

import java.time.LocalDateTime;

public class BikeRequests {
    int userID;
    int stationID;
    int portID;
    int bikeID;
    LocalDateTime dateTimeTaken;

    public BikeRequests(int userID, int stationID, int portID, int bikeID) {
        this.userID = userID;
        this.stationID = stationID;
        this.portID = portID;
        this.bikeID = bikeID;
        this.dateTimeTaken = LocalDateTime.now();
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getStationID() {
        return stationID;
    }

    public void setStationID(int stationID) {
        this.stationID = stationID;
    }

    public int getPortID() {
        return portID;
    }

    public void setPortID(int portID) {
        this.portID = portID;
    }

    public int getBikeID() {
        return bikeID;
    }

    public void setBikeID(int bikeID) {
        this.bikeID = bikeID;
    }

    public LocalDateTime getDateTimeTaken() {
        return dateTimeTaken;
    }

    public void setDateTimeTaken(LocalDateTime dateTimeTaken) {
        this.dateTimeTaken = dateTimeTaken;
    }
}
