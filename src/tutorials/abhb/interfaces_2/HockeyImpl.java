package tutorials.abhb.interfaces_2;

/**
 * Created by nmohammed on 2/24/17.
 */
public class HockeyImpl implements Hockey{
  @Override
  public void setHomeTeam(String name) {
    System.out.println("Hockey home team is "+name);
  }

  @Override
  public void setVisitingTeam(String name) {
    System.out.println("Hockey visiting team is "+name);
  }

  @Override
  public void homeGoalScored() {
    System.out.println("Hockey home goal is 100");
  }

  @Override
  public void visitingGoalScored() {
    System.out.println("Hockey visiting team goal is 50");
  }

  @Override
  public void endOfPeriod(int period) {
    System.out.println("Hockey end of period: "+period);
  }

  @Override
  public void overtimePeriod(int ot) {
    System.out.println("Hockey overtime period: "+ot);
  }
}
