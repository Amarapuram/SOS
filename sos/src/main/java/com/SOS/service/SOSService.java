package com.SOS.service;

import com.SOS.domain.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SOSService {

    private final RestTemplate restTemplate = new RestTemplate();

    public ApiResponse getNearbyHospitals(double lat, double lon) {
        String query = "[out:json];node[\"amenity\"=\"hospital\"](around:5000," + lat + "," + lon + ");out;";
        String url = "https://overpass-api.de/api/interpreter?data=" + query;

        try {
            ResponseEntity<ApiResponse> response = restTemplate.getForEntity(url, ApiResponse.class);
            return response.getBody();
        } catch (Exception e) {
            e.printStackTrace(); // Log the exception for debugging
            return null; // Or handle this as appropriate
        }
    }

    public ApiResponse getNearbyFireStations(double lat, double lon) {
        String query = "[out:json];node[\"amenity\"=\"fire_station\"](around:5000," + lat + "," + lon + ");out;";
        String url = "https://overpass-api.de/api/interpreter?data=" + query;

        try {
            ResponseEntity<ApiResponse> response = restTemplate.getForEntity(url, ApiResponse.class);
            return response.getBody();
        } catch (Exception e) {
            e.printStackTrace(); // Log the exception for debugging
            return null; // Or handle this as appropriate
        }
    }

    public ApiResponse getNearbyPoliceStations(double lat, double lon) {
        String query = "[out:json];node[\"amenity\"=\"police\"](around:5000," + lat + "," + lon + ");out;";
        String url = "https://overpass-api.de/api/interpreter?data=" + query;

        try {
            ResponseEntity<ApiResponse> response = restTemplate.getForEntity(url, ApiResponse.class);
            return response.getBody();
        } catch (Exception e) {
            e.printStackTrace(); // Log the exception for debugging
            return null; // Or handle this as appropriate
        }
    }
}

