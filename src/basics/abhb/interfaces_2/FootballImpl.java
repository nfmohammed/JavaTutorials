package basics.abhb.interfaces_2;


public class FootballImpl implements Football {
  @Override
  public void setHomeTeam(String name) {
    System.out.println("Football home team to "+ name);
  }

  @Override
  public void setVisitingTeam(String name) {
    System.out.println("Football visiting team to "+name);
  }

  @Override
  public void homeTeamScored(int points) {
    System.out.println("Football Home team scored "+points);
  }

  @Override
  public void visitingTeamScored(int points) {
    System.out.println("Football Visiting team scored "+points);
  }

  @Override
  public void endOfQuarter(int quarter) {
    System.out.println("Football End of Quarter: "+quarter);
  }
}
