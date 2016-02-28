package comp110;

class TarHeelTraditionAlgo extends BasketballAlgo {

  /** Instance Variables **/
  // None declared

  /** Constructor **/
  TarHeelTraditionAlgo() {
    // TarHeelTraditionAlgo _must_ have a 0-parameter constructor.
    // Don't let this stop you from using instance variables, if you'd like.
  }

  /** Methods **/
  Scorecard score(Team away, Team home) {
    Scorecard scorecard = new Scorecard(away, home);

    // Here is an example Scoreline being setup and added to
    // the Scorecard. We recommend breaking up each Scoreline into its
    // own method, but you're free to design this code however you would
    // like to.
    String label = "Example: Wins";
    double awayValue = away.getWins();
    double homeValue = home.getWins();
    Scoreline example = new Scoreline(label, awayValue, homeValue);
    scorecard.add(example);

    return scorecard;
  }

}