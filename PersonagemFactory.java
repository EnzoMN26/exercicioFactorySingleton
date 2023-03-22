public class PersonagemFactory {
    
    public Personagem getPersonagem(){
        return new PersonagemNormal();
    }

    public Personagem getPersonagem(String tipo, int fator){
        if(tipo == "poderoso"){
            return new PersonagemPoderoso(fator);
        }
        else if(tipo == "soturno"){
            return new PersonagemSoturno(fator);
        }
        return null;
    }
}
