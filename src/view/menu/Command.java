package view.menu;

import view.Console;
import view.View;

public abstract class Command {
    private String description;
    private Console console;

    public Command(String description, Console console) {
        this.description = description;
        this.console = console;
    }

    public String getDescription() {
        return description;
    }

    protected Console getConsole() {
        return console;
    }

    protected abstract void execute();
}
