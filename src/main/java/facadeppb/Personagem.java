package facadeppb;


public class Personagem {
    String trabalho;
    int jobLevel;

    public Personagem(){
        this.trabalho ="aprendiz";
        this.jobLevel=0;
    }

    public String getTrabalho() {
        return trabalho;
    }

    public int getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(int jobLevel) {
        this.jobLevel = jobLevel;
    }
    public void mudarTrabalho(String novoTrabalho) {
        if (PersonagemFacade.verificarMudancaDeTrabalho(this)){
            trabalho = novoTrabalho;
            jobLevel = 0;
        }
    }
}
