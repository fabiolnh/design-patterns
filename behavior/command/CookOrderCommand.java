package behavior.command;

public class CookOrderCommand implements IOrderCommand {
    private Chef chef;

    public CookOrderCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.cook();
    }
}
