package vic.ren.hellospring;

public class Person {

    private final IAir mAir;

    public Person(IAir air) {
        mAir = air;
    }

    public void Breath() {
        System.out.print(mAir.airName());
    }
}
