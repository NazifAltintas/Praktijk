package be.intecbrussel.monster;

import java.util.Objects;

public abstract class MightMonster extends Monster{
    private int ragePoints;
    private int maxRP;

    public MightMonster(int maxRP, int maxHP){
        super(maxHP);
        this.maxRP=maxRP;
    }

    public  int getRagePoints() {
        return ragePoints;
    }

    public void setRagePoints(int h) {
        this.ragePoints = h;
    }

    public void restoreRp(int h){
        ragePoints += h;
        if (ragePoints >maxRP){
            ragePoints=maxRP;
        }

    }

    public boolean useRp(int d){

        return (d <= ragePoints) ;
    }


    @Override
    public String toString() {
        return "MightMonster{" +
                "ragePoints=" + ragePoints +
                ", maxRP=" + maxRP +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MightMonster that = (MightMonster) o;
        return ragePoints == that.ragePoints && maxRP == that.maxRP;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ragePoints, maxRP);
    }
}
