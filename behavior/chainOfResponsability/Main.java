package behavior.chainOfResponsability;

public class Main {
    public static void main(String[] args) {
        SupportHandler basicHandler = new BasicSupportHandler();
        SupportHandler technicalHandler = new TechnicalSupportHandler();
        SupportHandler managerHandler = new ManagerSupportHandler();

        basicHandler.setNextHandler(technicalHandler);
        technicalHandler.setNextHandler(managerHandler);

        System.out.println("Request: Basic");
        basicHandler.handleRequest("basic");

        System.out.println("\nRequest: Technical");
        basicHandler.handleRequest("technical");

        System.out.println("\nRequest: Manager");
        basicHandler.handleRequest("manager");

        System.out.println("\nRequest: Unknown");
        basicHandler.handleRequest("unknown");
    }
}