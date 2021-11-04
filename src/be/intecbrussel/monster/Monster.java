package be.intecbrussel.monster;

import java.util.Objects;

public abstract class Monster {
    private int hitPoints;
    private int maxHP;

    public Monster(int maxHP) {
       setMaxHP(maxHP);

    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public  int getMaxHP() {return maxHP;}

    public  int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void heal(int h){
        this.hitPoints=h;
        if(this.hitPoints<=0){
            System.out.println("the monster is defeated");
        }
    }

    public boolean takeDamage(int d){
        if (this.hitPoints <=0) {
            return false;
        } else {
           setHitPoints( this.hitPoints-=d);
            return true;
        }

    }

    @Override
    public String toString() {
        return "Monster{" +
                "hitPoints=" + hitPoints +
                ", maxHP=" + maxHP +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return hitPoints == monster.hitPoints && maxHP == monster.maxHP;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hitPoints, maxHP);
    }
}
