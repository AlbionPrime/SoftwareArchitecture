public class LightDimCommand implements Command{
    private Light light1;
    private int level;
    private int beforeLevel;

    public LightDimCommand(Light light1, int level){
        this.light1 = light1;
        this.level = level;
    }

    @Override
    public void execute(){
        if (light1 instanceof KitchenRoomLight){
            beforeLevel = ((KitchenRoomLight) light1).getBrightnessFull();
        } else if (light1 instanceof LivingRoomLight){
            beforeLevel = ((LivingRoomLight) light1).getBrightnessFull();
        }
    }

    @Override
    public void undo(){
        light1.dim(beforeLevel);
    }
}
