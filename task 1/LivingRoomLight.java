public class LivingRoomLight implements Light{
    private int brightnessLevel;

    @Override
    public void on(){
        brightnessLevel = 100;
        System.out.println("Living Room light is ON at full brightness.");
    }

    @Override
    public void off(){
        brightnessLevel = 0;
        System.out.println("Living Room light is OFF.");
    }

    @Override
    public void dim(int level){
        if (level<0){
            brightnessLevel = 0;
        } else if (level>100){
            brightnessLevel = 100;
        } else {
            brightnessLevel = level;
        }
        System.out.println("Living Room light dimmed to "+brightnessLevel+"%");
    }

    public int getBrightnessFull(){
        return brightnessLevel;
    }
}
