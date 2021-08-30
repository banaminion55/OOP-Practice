
public class BaseballPlayer {

    private String name;
    private String team;
    private double battingAverage;

    public BaseballPlayer(String name, String team, double battingAverage) {
        this.name = name;
        this.team = team;
        this.battingAverage = battingAverage;
    }
    //commas for concatenation?
    public String toString() {
        return name + " (" + team + "), " + battingAverage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    //float?
    public double getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
    }






}