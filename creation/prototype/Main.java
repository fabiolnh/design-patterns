package creation.prototype;

public class Main {
    public static void main(String[] args) {
        // Creating initial prototypes
        Contract contractPrototype = new Contract("This is a contract template.", "John Doe");
        Report reportPrototype = new Report("This is a report template.", "Jane Doe");

        // Cloning and modifying the prototypes
        Contract clonedContract = (Contract) contractPrototype.clone();
        clonedContract.setContractor("Alice Johnson");

        Report clonedReport = (Report) reportPrototype.clone();
        clonedReport.setAuthor("Bob Smith");

        // Using the cloned documents.
        contractPrototype.print(); // Output: Contract [content=This is a contract template., contractor=John Doe]
        clonedContract.print(); // Output: Contract [content=This is a contract template., contractor=Alice Johnson]

        reportPrototype.print(); // Output: Report [content=This is a report template., author=Jane Doe]
        clonedReport.print(); // Output: Report [content=This is a report template., author=Bob Smith]
    }
}
