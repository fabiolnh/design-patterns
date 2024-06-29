package structure.composite;

import java.util.ArrayList;
import java.util.List;

// Composite class
public class Directory implements IFileSystemComponent {
    private String name;
    private List<IFileSystemComponent> components = new ArrayList<>();
    

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(IFileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(IFileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (IFileSystemComponent component : components) {
            component.showDetails();
        }
    }
}