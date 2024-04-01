public class FolhaPagamento {

    // Atributos, Getters & Setters
    private String nomeF;
    public String getNomeF() {
        return nomeF;
    }
    public void setNomeF(String nomeF) {
        this.nomeF = nomeF;
    }

    private double horasT;
    public double getHorasT() {
        return horasT;
    }
    public void setHorasT(double horasT) {
        this.horasT = horasT;
    }

    private double valorHora;
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    // Construtores
    public FolhaPagamento(){
    }
    public FolhaPagamento(String nomeF, int horasT, double valorHora){
        this.nomeF = nomeF;
        this.horasT = horasT;
        this.valorHora = valorHora;
    }

    // Member functions
    public double salarioBruto() {
        return horasT * valorHora;
    }

    public double ir() {
        double irV = salarioBruto();
        if (irV <= 1372.81) {
            irV = 0;
        } else if (irV >= 1372.81 && irV <= 2743.25) {
            irV = irV * 0.15 - 205.92;
        } else if (irV >= 2743.25) {
            irV = irV * 0.275 - 548.82;
        }
        return irV;
    }

    public double inss() {
        double inssV = salarioBruto();
        if (inssV <= 868.29) {
            inssV = inssV * 0.08;
        } else if (inssV >= 868.30 && inssV <= 1447.140) {
            inssV = inssV * 0.09;
        } else if (inssV >= 1447.15 && inssV <= 2894.27) {
            inssV = inssV * 0.11;
        } else if (inssV >= 2894.28) {
            inssV = 318.37;
        }
        return inssV;
    }

    public double fgts() {
        double fgtsV = salarioBruto() * 0.08;
        return fgtsV;
    }

    public double salarioLiquido() {
        double sLiquido = salarioBruto() - (ir() + fgts());
        return sLiquido;
    }

}
