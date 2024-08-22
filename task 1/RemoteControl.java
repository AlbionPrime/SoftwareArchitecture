public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command beforeCommand;
    
    public RemoteControl(int number){
        onCommands = new Command[number];
        offCommands = new Command[number];
        beforeCommand = null;
    }
    
    public void setCommand(int place, Command onCommands, Command offCommands){
        if (place < 0 || place >= onCommands.length){
            System.out.println("Invalid slot number.");
            return;
        }
        onCommands[place] = onCommands;
        offCommands[place] = offCommands;
    }

    public void pressOnButton(int place){
        if (place < 0 || place >= onCommands.length || onCommands[place] == null){
            System.out.println("No command is set for this slot.");
            return;
        }
        onCommands[place].execute();
        beforeCommand = onCommands[place];
    }

    public void pressOffButton(int place){
        if (place < 0 || place >= offCommands.length || offCommands[place] == null){
            System.out.println("No command is set for this slot.");
            return;
        }
        offCommands[place].execute();
        beforeCommand = offCommands[place];
    }

    public void pressUndoButton(){
        if (beforeCommand != null){
            beforeCommand.undo();
            beforeCommand = null;
        } else {
            System.out.println("No command to undo.");
        }
    }
}
