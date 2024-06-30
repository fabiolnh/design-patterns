package behavior.command;

import java.util.ArrayList;
import java.util.List;

public class WaiterInvoker {
    private List<IOrderCommand> orderCommands = new ArrayList<>();

    public void takeOrder(IOrderCommand orderCommand) {
        orderCommands.add(orderCommand);
    }

    public void placeOrders() {
        for (IOrderCommand command : orderCommands) {
            command.execute();
        }
        orderCommands.clear();
    }
}
