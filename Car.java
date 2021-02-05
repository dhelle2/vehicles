

public class Car extends Vehicle { 

  private Direction direction;

  public Car() throws Vehicle.NegativePassengerException {

  }

  public void setDirection(Direction direction) {
    this.direction = direction;
  }

  public Direction getDirection() {
    return direction;
  }

}

// 2d "arrow" to show directton.. but.. hmm:
// oh wow.. but if it was an airplane.. also if someone else needs to use this?
// and getters/setters?
// maybe I need an interface?? how do I solve this???

class Direction {
  int x;
  int y;
}
