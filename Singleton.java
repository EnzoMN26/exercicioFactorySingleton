import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton{

    static Singleton instance;
    LinkedList<Object> elementos;

    private Singleton(){
        elementos = new LinkedList();
    }

    static public Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void addElement(Object e){
        if(!elementos.contains(e)){
            elementos.add(e);
        }    
    }

    public void addElement(Object... args){
        for (Object object : args) {
            if(!elementos.contains(object)){
                elementos.add(object);
            }
        }
    }

    public Object getElement(int index){
        elementos.sort(null);
        return elementos.get(index);
    }

    public LinkedList getElements(){
        elementos.sort(null);
        return new LinkedList(elementos);
    }
}