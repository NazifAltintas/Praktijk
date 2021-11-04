package be.intecbrussel.monster;

import java.util.Objects;

public class Witch extends MagicMonster{
    private String name;

    public Witch(){
        this(8);
    }
    public Witch(int hitPoints){
        this(hitPoints,5);
    }
    public Witch(int hitPoints,int magicPoints){
        this("WITCH",hitPoints, magicPoints);
    }
    public Witch(String name,int hitPoints, int magicPoints){

        super(100,100);
        this.name=name;
        super.setHitPoints(hitPoints);
        super.setMagicPoints(magicPoints);
    }


    public int fireballAttack(){

        if (useMp(5)) {
            System.out.println("fwooosh!!");
            setMagicPoints(getMagicPoints()-5);

            return 8;
        } else {
            System.out.println("fire ball attack out of magic points");
            return 0;
        }

    }


    @Override
    public String toString() {
        return "Witch{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Witch witch = (Witch) o;
        return Objects.equals(name, witch.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }
}
