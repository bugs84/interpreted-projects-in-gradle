package cz.vondr.gradle

import com.jcabi.http.request.JdkRequest

class DistanceCalculator {
    private String from
    private String to

    DistanceCalculator(String from, String to) {
        this.from = from
        this.to = to
    }

    public String getDistance() {
        new JdkRequest("https://maps.googleapis.com/maps/api/distancematrix/json?origins=$from&destinations=$to")
                .fetch()
    }
}
