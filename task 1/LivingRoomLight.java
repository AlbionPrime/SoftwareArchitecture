public class LivingRoomLight implements Light {
    private int brightness;

    @Override
    public void on() {
        brightness = 100;
        System.out.println("Living room light is ON at full brightness.");
    }

    @Override
    public void off() {
        brightness = 0;
        System.out.println("Living room light is OFF.");
    }

    @Override
    public void dim(int level) {
        if (level < 0) {
            brightness = 0;
        } else if (level > 100) {
            brightness = 100;
        } else {
            brightness = level;
        }
        System.out.println("Living room light dimmed to " + brightness + "%.");
    }

    public int getBrightness() {
        return brightness;
    }
}