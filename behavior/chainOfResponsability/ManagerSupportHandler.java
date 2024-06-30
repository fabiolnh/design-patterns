package behavior.chainOfResponsability;

public class ManagerSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("manager")) {
            System.out.println("ManagerSupportHandler: Handling manager request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}