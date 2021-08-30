import java.util.ArrayList;
import java.util.List; //?
//default empty constructor?
//array with objects?
//import baseball player
public class BaseballPlayerList {

    private List<BaseballPlayer> players = new ArrayList();

    public BaseballPlayerList() {

    }

    public void add(String name, String team, double battingAverage) {
        players.add(new BaseballPlayer(name, team, battingAverage));
    }

    public BaseballPlayer getHighestAvg(String team) {
        double maxAvg = 0.0;
        BaseballPlayer highAvgPlayer = null;
    /*for(BaseballPlayer player: players) {
      if (player.getTeam() == team && player.getBattingAverage() > maxAvg) {
        maxAvg = player.getBattingAverage();
        highAvgPlayer = player;
      }
    }*/
        for(int i = 0; i < players.size(); i++) {
            BaseballPlayer player = players.get(i);
            if (player.getTeam().equals(team) && player.getBattingAverage() > maxAvg) {
                maxAvg = player.getBattingAverage();
                highAvgPlayer = player;
            }
        }

        return highAvgPlayer;

    }

}







