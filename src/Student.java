import java.util.Observable;
import java.util.Observer;

public class Student implements Observer {


    @Override
    public void update(Observable o, Object arg) {
        String msg = ((Board)o).getLast();
        System.out.println(msg);
    }
}
