package com.ready2die.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

    List<Component> componentList = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public boolean addComponent(Component component) {
        return componentList.add(component);
    }

    public boolean removeComponent(Component component) {
        return componentList.remove(component);
    }

    public List<Component> getChildren() {
        return componentList;
    }
}
