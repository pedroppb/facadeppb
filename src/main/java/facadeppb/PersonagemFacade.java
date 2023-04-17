package facadeppb;

public class PersonagemFacade {

    public static boolean verificarMudancaDeTrabalho(Personagem personagem) {
        if(PrimeiroTrabalho.habilitadoTrocaPrimeiroTrabalho(personagem)){
            return true;
        }
        if(SegundoTrabalho.habilitadoTrocaSegundoTrabalho(personagem)){
            return true;
        }
        return false;
    }
}
