package pacote2;

import java.io.Serializable;

public class Cotacao implements Serializable{

    private String dia, tcm, tvm, pcm, pvm, pbm;

    static String vencimento = "01/03/2023";

    public Cotacao(String dia, String tcm, String tvm, String pcm, String pvm, String pbm) {
        this.dia = dia;
        this.tcm = tcm;
        this.tvm = tvm;
        this.pcm = pcm;
        this.pvm = pvm;
        this.pbm = pbm;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getTcm() {
        return tcm;
    }

    public void setTcm(String tcm) {
        this.tcm = tcm;
    }

    public String getTvm() {
        return tvm;
    }

    public void setTvm(String tvm) {
        this.tvm = tvm;
    }

    public String getPcm() {
        return pcm;
    }

    public void setPcm(String pcm) {
        this.pcm = pcm;
    }

    public String getPvm() {
        return pvm;
    }

    public void setPvm(String pvm) {
        this.pvm = pvm;
    }

    public String getPbm() {
        return pbm;
    }

    public void setPbm(String pbm) {
        this.pbm = pbm;
    }

    public static String getVencimento() {
        return vencimento;
    }

    public static void setVencimento(String vencimento) {
        Cotacao.vencimento = vencimento;
    }

    @Override
    public String toString() {
        return "Cotacao{" + "dia=" + dia + ", tcm=" + tcm + ", tvm=" + tvm + ", pcm=" + pcm + ", pvm=" + pvm + ", pbm=" + pbm + '}';
    }

}
