package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;

import java.net.http.HttpClient;
import java.net.http.HttpResponse;

@SpringBootApplication
public class Demo2Application {

    //commnet
    public static void main(String[] args) {
        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = Unirest.post("localhost:8071/sync/test/Patient/v2/synctool/SyncPatientsListInOldFacility")
                .header("Content-Type", "application/json")
                .header("Authorization", "Basic YWRtaW46MTIzNDU2")
                .body("{\r\n    \"size\" : \"50\",\r\n    \"facilitySourceId\" : 1103\r\n}")
                .asString();
    }

}
