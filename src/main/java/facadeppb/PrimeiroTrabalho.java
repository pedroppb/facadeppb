package facadeppb;

public class PrimeiroTrabalho {
    public static boolean habilitadoTrocaPrimeiroTrabalho(Personagem personagem){
        if (personagem.getTrabalho().equals("aprendiz") && personagem.getJobLevel()>9) return true;
        return false;
    }
}
