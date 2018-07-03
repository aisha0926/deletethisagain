import java.util.ArrayList;

public abstract class ItemHandler {
    ArrayList<Items> items = new ArrayList<Items>();

    public void addItem(Items item){
        items.add(item);
    }

    public void removeItem(Items item){
        items.remove(item);
    }


}
