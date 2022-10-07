public class Converter {
    double oneStepLength = 0.75;
    double oneStepCalories = 50.0;
    double convertTheDistance(int userSteps) {
        double kilometers = (userSteps * oneStepLength) / 1000;
        return kilometers;
    }
    double convertToCalories(int userSteps) {
        double burntCalories = oneStepCalories * userSteps;
        double burntKilocalories = burntCalories / 1000;
        return burntKilocalories;
    }
}
