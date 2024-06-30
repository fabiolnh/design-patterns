package behavior.command;

public class ServeOrderCommand implements IOrderCommand {
    private Waiter waiter;

    public ServeOrderCommand(Waiter waiter) {
        this.waiter = waiter;
    }

    @Override
    public void execute() {
        waiter.serve();
    }
}
