package JavaConcepts_And_Programs;

public class IndiaCountry implements interfaceConcept,continentalTraffic {
    public static void main(String args[]) {
        interfaceConcept india=new IndiaCountry();
india.greenLight();
india.redlight();
india.yellowlight();
IndiaCountry i=new IndiaCountry();
continentalTraffic c=new IndiaCountry();
c.followBasicRules();
// if other class has their own method we cannot call by Interface Object
        // to access  we should create specific class object and should call the inner class mehods
i.walkOn();
    }
    @Override
    public void greenLight() {
        System.out.println("GO");
    }

    @Override
    public void redlight() {
        System.out.println("STOP");

    }
public void walkOn(){
        System.out.println("Should walk on zebra crossing");
}
    @Override
    public void yellowlight() {
        System.out.println("READY");

    }

    @Override
    public void followBasicRules() {
        System.out.println("follow symbol rules");
    }

}
