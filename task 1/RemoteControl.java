public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command lastCommand;

    public RemoteControl(int numberOfSlots) {
        onCommands = new Command[numberOfSlots];
        offCommands = new Command[numberOfSlots];
        lastCommand = null;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        if (slot < 0 || slot >= onCommands.length) {
            System.out.println("Invalid slot number.");
            return;
        }
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void pressOnButton(int slot) {
        if (slot < 0 || slot >= onCommands.length || onCommands[slot] == null) {
            System.out.println("No command is set for this slot.");
            return;
        }
        onCommands[slot].execute();
        lastCommand = onCommands[slot];
    }

    public void pressOffButton(int slot) {
        if (slot < 0 || slot >= offCommands.length || offCommands[slot] == null) {
            System.out.println("No command is set for this slot.");
            return;
        }
        offCommands[slot].execute();
        lastCommand = offCommands[slot];
    }

    public void pressUndoButton() {
        if (lastCommand != null) {
            lastCommand.undo();
            lastCommand = null;
        } else {
            System.out.println("No command to undo.");
        }
    }
}
