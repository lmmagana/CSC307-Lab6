import java.util.ArrayList;
import java.util.Observable;

public class Board extends Observable {

    private ArrayList<String> info = new ArrayList<String>();

    public ArrayList<String>  getAll(){

        return info;
    }

    public String getLast(){
        return info.get(info.size() - 1);
    }

    public void add(String s){
        info.add(s);
        setChanged();
        notifyObservers();
    }
}
