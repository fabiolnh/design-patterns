package behavior.command;

public class PrepareOrderCommand implements IOrderCommand {
    private Chef chef;

    public PrepareOrderCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.prepare();
    }
}
