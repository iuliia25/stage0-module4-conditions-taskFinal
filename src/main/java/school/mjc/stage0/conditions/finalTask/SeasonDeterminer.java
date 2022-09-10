package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        String season;
        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
            season = "winter";
        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            season = "spring";
        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            season = "summer";
        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            season = "autumn";
        } else {
            season = "Wrong month number";
        }
        System.out.println(season);
    }
}
