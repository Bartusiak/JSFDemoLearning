public class CounterOne{

    private int value = 0;

    public CounterOne(){

    }

    public String increment(){
        value++;
        return "counter_one";
    }

    public int getValue() {
        return value;
    }
}
