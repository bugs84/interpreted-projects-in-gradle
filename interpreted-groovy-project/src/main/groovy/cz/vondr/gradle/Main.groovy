package cz.vondr.gradle

class Main {
    static void main(String[] args) {
        def weather = new WeatherService("Pardubice,cz").forecast
        println weather
    }
}
