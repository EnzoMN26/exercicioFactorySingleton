import java.util.ArrayList;
import java.util.LinkedList;

public class Singleton{

    static Singleton instance;
    ArrayList<Object> elementos;

    private Singleton(){
        elementos = new ArrayList(10);
    }

    static public Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void addElement(Object e){
        elementos.add(e);    
    }

    public void addElement(Object... args){
        for (Object object : args) {
            elementos.add(object);
        }
    }

    public Object getElement(int index){
        return elementos.get(index);
    }

    public ArrayList getElements(){
        return new ArrayList(elementos);
    }
}