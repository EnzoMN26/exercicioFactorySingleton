public class App {
    
    public static void main(String args[]){

        PersonagemFactory factory = new PersonagemFactory();

        Singleton instancia = Singleton.getInstance();
        instancia.addElement(1, 3, 5, 4, 2, 6, 7);
        System.out.println(instancia.getElement(4)); 
        System.out.println(instancia.getElements());

        Personagem personagem1 = factory.getPersonagem();
        Personagem personagem2 = factory.getPersonagem("poderoso", 89);
        Personagem personagem3 = factory.getPersonagem("soturno", 9);

        System.out.println(personagem1.toString());
        System.out.println(personagem2.toString());
        System.out.println(personagem3.toString());
    }
}
