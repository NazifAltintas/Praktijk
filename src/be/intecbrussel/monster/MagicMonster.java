package be.intecbrussel.monster;

import java.util.Objects;

public abstract class MagicMonster extends Monster {

    private int magicPoints;
    private int maxMP;

    public MagicMonster(int maxMP, int maxHP) {
        super(maxHP);
        this.maxMP=maxMP;

    }


    public  int getMagicPoints(){
        return magicPoints;
    }

    public void setMagicPoints(int h) {
        this.magicPoints = h;
    }

    public void restoreMp(int h) {
        magicPoints +=h;
        if (magicPoints >maxMP){
            magicPoints=maxMP;
        }

    }


    public boolean useMp(int d) {

        return (d <= magicPoints );
    }


    @Override
    public String toString() {
        return "MagicMonster{" +
                "magicPoints=" + magicPoints +
                ", maxMP=" + maxMP +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MagicMonster that = (MagicMonster) o;
        return magicPoints == that.magicPoints && maxMP == that.maxMP;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), magicPoints, maxMP);
    }
}

