package facadeppb;

public class SegundoTrabalho {
    public static boolean habilitadoTrocaSegundoTrabalho(Personagem personagem){
        if (!personagem.getTrabalho().equals("aprendiz") && personagem.getJobLevel()>39) return true;
        return false;
    }

}
