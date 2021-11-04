package be.intecbrussel.monster;

import java.util.Objects;

public class Bear extends MightMonster {
    private int holeNr;

    public Bear() {
        this(0);
    }

    public Bear(int hitPoints) {
        this(hitPoints, 8);
    }

    public Bear(int hitPoints, int ragePoints) {
        this(0, hitPoints,ragePoints );
    }


    public Bear(int holeNr, int hitPoints, int ragePoints){
        super(100,100);
        this.holeNr=holeNr;
        super.setHitPoints(hitPoints);
        super.setRagePoints(ragePoints);
    }

    public int bearClawAttack() {
        if (useRp(8)) {
            System.out.println("rooaar!!");
            setRagePoints(getRagePoints()-8);
            return 10;
        } else {
            System.out.println("bear claw attack out of ragePoints points");
            return 0;
        }
    }




    @Override
    public String toString() {
        return "Bear{" +
                "holeNr=" + holeNr +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bear bear = (Bear) o;
        return holeNr == bear.holeNr;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), holeNr);
    }
}

