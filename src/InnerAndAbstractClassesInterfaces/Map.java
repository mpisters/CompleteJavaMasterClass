package InnerAndAbstractClassesInterfaces;

import java.util.ArrayList;

public class Map implements ISaveable<Document>{
    ArrayList<Document> documents;
    String name;

    public Map(ArrayList<Document> documents, String name) {
        this.documents = documents;
        this.name = name;
    }

    @Override
    public ArrayList<Document> valuesToBeSaved(Document document) {
        if (!findDocument(document)){
            this.documents.add(document);
        } else {
            System.out.println("Already in the map");
        }
        return this.documents;
    }

    @Override
    public void populateObject() {
        if(this.documents.size() > 0){
            Document document = this.documents.get(0);
            System.out.println(document.getContent());
            System.out.println(document.getName());
        } else {
            System.out.println("No items available");
        }

    }

    private boolean findDocument(Document document){
        for (Document current: this.documents){
            if( current.getName().equals(document.getName())){
                return true;
            }
        }
        return false;
    }
}
