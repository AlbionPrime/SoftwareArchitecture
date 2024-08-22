public class LightOnCommand implements Command{
    private Light light1;

    public LightOnCommand(Light light1){
        this.light1 = light1;
    }

    @Override
    public void execute(){
        light1.on();
    }

    @Override
    public void undo(){
        light1.off();
    }
}
