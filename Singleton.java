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
}