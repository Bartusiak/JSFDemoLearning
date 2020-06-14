public class CounterThree {

    private int value = 0;

    public CounterThree(){

    }

    public String increment(){
        value++;
        return "counter_three";
    }

    public int getValue() {
        return value;
    }
}
