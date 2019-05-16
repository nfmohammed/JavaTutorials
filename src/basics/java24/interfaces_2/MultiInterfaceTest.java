package basics.java24.interfaces_2;

public class MultiInterfaceTest {
  public static void main(String[] args) {

    Football f = new FootballImpl();
    f.setHomeTeam("Chicago"); //method coming from Sports
    f.setVisitingTeam("Ohio"); //method coming from Sports
    f.homeTeamScored(100); //method coming from Football
    f.visitingTeamScored(50); //method coming from Football
    f.endOfQuarter(75); //method coming from Football

    Hockey h = new HockeyImpl();
    h.setHomeTeam("India");
    h.setVisitingTeam("Pakistan");
    h.homeGoalScored();
    h.visitingGoalScored();
    h.endOfPeriod(90);
    h.overtimePeriod(10);

  }
}
