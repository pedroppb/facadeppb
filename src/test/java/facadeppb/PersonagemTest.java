package facadeppb;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonagemTest {
    @Test
    void deveFalharTrocaParaPrimeiraClassePorFaltaDeJobLevel() {
        Personagem pedro =new Personagem();
        pedro.mudarTrabalho("Espadachim");
        assertEquals("aprendiz", pedro.getTrabalho());
    }
    @Test
    void deveTrocaParaPrimeiraClasse() {
        Personagem pedro =new Personagem();
        pedro.setJobLevel(10);
        pedro.mudarTrabalho("Espadachim");
        assertEquals("Espadachim", pedro.getTrabalho());
    }
    @Test
    void deveFalharTrocaParasegundaClassePorFaltaDeJobLevel() {
        Personagem pedro =new Personagem();
        pedro.setJobLevel(10);
        pedro.mudarTrabalho("Espadachim");
        pedro.mudarTrabalho("Cavaleiro");
        assertEquals("Espadachim", pedro.getTrabalho());
    }
    @Test
    void deveTrocaParasegundaClasse() {
        Personagem pedro =new Personagem();
        pedro.setJobLevel(10);
        pedro.mudarTrabalho("Espadachim");
        pedro.setJobLevel(50);
        pedro.mudarTrabalho("Cavaleiro");
        assertEquals("Cavaleiro", pedro.getTrabalho());
    }
}
