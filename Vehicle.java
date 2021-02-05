

public class Vehicle {

  public static final int MAX_PASSENGERS = 10000000;
  public static final float MAX_SPEED = 10000000.0F; // TODO: set to speed of light - NOTE: may require double??

  protected boolean failOnNegativeNumberOfPassengers = true;
  private int passengers;
  private float speed;

  public Vehicle() throws NegativePassengerException {
    //try {
      this(0,0.0F);
    //}
    //catch(NegativePassengerException e) {
      // my  Car subclass wouldn't compile without this.. so I guess I need it..
      // if even..
    //}
  }

  public Vehicle(int passengers,float speed) throws NegativePassengerException {
    setPassengers(passengers);
    setSpeed(speed);
  }

  public int getPassengers() {
    return passengers;
  }

  public void setPassengers(int passengers) throws NegativePassengerException {
    if(passengers < 0) {
      if(failOnNegativeNumberOfPassengers) {
        throw new NegativePassengerException("negative number of passengers!!");
      }
      else {
        passengers = 0;
      }
    }
    if(passengers < MAX_PASSENGERS) {
       this.passengers = passengers;
    }
  }

  public float getSpeed() {
    return speed;
  }

  public void setSpeed(float speed) {
    if(speed < MAX_SPEED) {
      this.speed = speed;
    }
    else {
      this.speed = MAX_SPEED; // !! what if the vehicle exceeds max speeds.. on its own???? or if.. someone sees its a spaceship at "warp speed" breaking the rules of Physics.. I wonder what the specification for this software says.. hmmm...
    }
  }

  /** first set(?) of (crude) tests.. TODO: JUINIT!!
   *
   **/
  public static void main(String[] args) throws NegativePassengerException {
     Vehicle theBestRedCarEver = new Vehicle();
     theBestRedCarEver.setPassengers(0);
  }

  class NegativePassengerException extends Exception {
    public NegativePassengerException(String message) {
      super(message);
    }
  }

}
