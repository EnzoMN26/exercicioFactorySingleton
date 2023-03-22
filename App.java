public class App {
    
    public static void main(String args[]){
        Singleton instancia = Singleton.getInstance();
        instancia.addElement(1, 3, 5, 4, 2, 6, 7);
        System.out.println(instancia.getElement(4)); 
        System.out.println(instancia.getElements());
    }
}
