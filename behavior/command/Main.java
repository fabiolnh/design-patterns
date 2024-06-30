package behavior.command;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Waiter waiter = new Waiter();

        IOrderCommand prepareOrder = new PrepareOrderCommand(chef);
        IOrderCommand cookOrder = new CookOrderCommand(chef);
        IOrderCommand serveOrder = new ServeOrderCommand(waiter);

        WaiterInvoker waiterInvoker = new WaiterInvoker();
        waiterInvoker.takeOrder(prepareOrder);
        waiterInvoker.takeOrder(cookOrder);
        waiterInvoker.takeOrder(serveOrder);

        waiterInvoker.placeOrders();
    }
}
