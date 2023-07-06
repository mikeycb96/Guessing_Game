public class WeatherCheck {

    public static void main(String[] args) {

        int temperature = 9;
        boolean currentlyRaining = false;

        if(temperature <= 10 && currentlyRaining){
            System.out.println("Wear a waterproof coat");
        } else if(temperature <= 10 && currentlyRaining == false){
            System.out.println("Wear a coat");
        } else if(temperature >= 11 && temperature <= 20 && currentlyRaining){
            System.out.println("Light raincoat needed");
        } else if(temperature >= 11 && temperature <= 20 && currentlyRaining == false){
            System.out.println("Fine weather");
        } else if(temperature >= 21 && currentlyRaining) {
            System.out.println("Hot but need an umbrella");
        } else if(temperature >= 21 && currentlyRaining == false){
            System.out.println("Hot so need shorts!");
        }





    }
}
