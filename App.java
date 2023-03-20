public class App {
    
    public static void main(String args[]){
        Singleton instancia = Singleton.getInstance();
        instancia.addElement(1, 2, 3, 4, 5, 6, 7);
        System.out.println(instancia.getElement(4)); 
    }
}
