public class WaterBottle {

    private Integer volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public Integer getVolume(){
        return this.volume;
    }

    public void drink(){
        this.volume -= 10;
    }

    public void empty(){
        this.volume = 0;
    }

    public void fill(){
        this.volume = 100;
    }

}
