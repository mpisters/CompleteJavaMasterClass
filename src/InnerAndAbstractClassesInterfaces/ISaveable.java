package InnerAndAbstractClassesInterfaces;

import java.util.ArrayList;

public interface ISaveable<T> {
    ArrayList<T> valuesToBeSaved(T item);
    void populateObject();
}
