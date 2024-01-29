package com.javatpoint.springbootexample.controller;

import com.javatpoint.springbootexample.entity.BikeRequestResponse;
import com.javatpoint.springbootexample.entity.BikeRequests;
import com.javatpoint.springbootexample.entity.ListOfStations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Controller
public class MainController {


    List<BikeRequests> bikeRequests = new ArrayList<>();

    @ResponseBody
    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

    @ResponseBody
    @RequestMapping("/enterRequest")
    public String getEnterRequest() {

        BikeRequests bikeRequests1 = new BikeRequests(1, 1, 2, 16);
        bikeRequests.add(bikeRequests1);
        return "Data inserted";
    }

    @ResponseBody
    @RequestMapping("/enterRequest/{userId}/{bikeId}/{stationId}/{portId}")
    public String getEnterRequest(@PathVariable String userId, @PathVariable String bikeId, @PathVariable int stationId, @PathVariable int portId) {

        BikeRequests bikeRequests1 = new BikeRequests(Integer.getInteger(userId), stationId, portId, Integer.getInteger(bikeId));
        bikeRequests.add(bikeRequests1);
        return "Data inserted";
    }

    @ResponseBody
    @RequestMapping("/printAll")
    public List<BikeRequests> printAll() {
        return bikeRequests;
    }

    @ResponseBody
    @RequestMapping(value = "/bikeInserted/{bikeId}/{stationId}/{portId}", method = RequestMethod.POST)
    public ResponseEntity postBikeInserted(@PathVariable String bikeId, @PathVariable int stationId, @PathVariable int portId) {
        System.out.println("Bike inserted | bikeId: " + bikeId + " | station Id: " + stationId + " | portId: " + portId);
        return ResponseEntity.ok().build();
    }

    @ResponseBody
    @RequestMapping("/bikeRequest/{stationId}")
    public ResponseEntity<BikeRequestResponse> getBikeRequest(@PathVariable int stationId) {
        System.out.println("Station ID: " + stationId);
        if (bikeRequests.size() != 0){
            for (int i = 0; i < bikeRequests.size(); i++) {
                if (bikeRequests.get(i).getStationID() == stationId){
                    int portCurrentID = bikeRequests.get(i).getPortID();
                    bikeRequests.remove(i);
                    return ResponseEntity.ok(new BikeRequestResponse(stationId, portCurrentID));
                }
            }
        }


//        for (BikeRequests bikeRequest :
//                bikeRequests) {
//            if (bikeRequest.getStationID() == stationId){
//
//                return ResponseEntity.ok(new BikeRequestResponse(stationId, bikeRequest.getPortID()));
//            }
//        }
        return ResponseEntity.status(202).build();
    }

    @ResponseBody
    @RequestMapping(value = "/bikeAllInfo/{bikeId}/{stationId}/{portId}", method = RequestMethod.GET)
    public ResponseEntity getAllBikeInfo(@PathVariable String bikeId, @PathVariable int stationId, @PathVariable int portId) {

        System.out.println("Bike ID: " + bikeId + " | Station ID: " + stationId + " | Port ID: " + portId);

        return ResponseEntity.ok().build();
    }

}
