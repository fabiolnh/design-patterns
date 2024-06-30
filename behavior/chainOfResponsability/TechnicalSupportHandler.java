package behavior.chainOfResponsability;

public class TechnicalSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("technical")) {
            System.out.println("TechnicalSupportHandler: Handling technical request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}