package behavior.chainOfResponsability;

public class BasicSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("basic")) {
            System.out.println("BasicSupportHandler: Handling basic request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}