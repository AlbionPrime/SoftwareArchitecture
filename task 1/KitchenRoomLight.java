public class KitchenRoomLight implements Light {
    //Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes
    private int brightnessLevel;

    @Override
    public void on(){
        brightnessLevel = 100;
        System.out.println("Kitchen Room light is ON at full Brightness.");
    }

    @Override
    public void off(){
        brightnessLevel = 0;
        System.out.println("Kitchen Room light is OFF.");
    }

    @Override
    public void dim(int level){
        if(level<0){
            brightnessLevel = 0;
        } else if (level>100){
            brightnessLevel = 100;
        } else {
            brightnessLevel = level;
        }
        System.out.println("Kitchen Room Light dimmed to "+brightnessLevel+"%.");
    }

    public int getBrightnessFull(){
        return brightnessLevel;
    }

}
