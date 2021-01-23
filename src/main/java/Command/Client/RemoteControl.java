package Command;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[2];
        offCommands = new Command[2];
        Command noCommand = new NoCommand();

        for(int i = 0; i < 2; i++) {
            onCommands[i] = noCommand;
            onCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, MacroCommand onCommand, MacroCommand offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
