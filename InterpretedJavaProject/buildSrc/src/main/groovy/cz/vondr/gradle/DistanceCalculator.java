package cz.vondr.gradle;

import com.jcabi.http.request.JdkRequest;

import java.io.IOException;

public class DistanceCalculator {

    private String from;
    private String to;

    public DistanceCalculator(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String getDistance() throws IOException {
        String url = "https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + from + "&destinations=" + to;
        return new JdkRequest(url)
                .fetch().toString();
    }
}
