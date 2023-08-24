public class Eagle extends Bird implements Fly {

    private boolean isFlying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.isFlying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return isFlying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!isFlying) {
            isFlying = true;
            System.out.println(getName() + " takes off in the sky.");
        }
    }

    @Override
    public int ascend(int meter) {
        if (isFlying) {
            altitude += meter;
            System.out.println(getName() + " flies upward ,altitude : " + altitude);
        }
        return altitude;  }

    @Override
    public int descend(int meters) {
        if (isFlying) {
            altitude -= meters;
            if (altitude < 0) altitude = 0;
            System.out.println(getName() + " flies downward, altitude: " + altitude);
        }
        return altitude;
    }

    @Override
    public void land() {
        if (altitude > 10) {
            System.out.println(getName() + " is too high, it can't land!");
        } else if (isFlying) {
            isFlying = false;
            altitude = 0;
            System.out.println(getName() + " lands on the ground.");
        }
    }

    @Override
    public void glide() {
        if (isFlying) {
            System.out.println(getName() + " glides into the air.");
        } else {
            Fly.super.glide();
        }
    }

}