package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Locacao {

    private int id;
    private Calendar dataLocacao;
    private Calendar DataDevolucao;
    private int quilometragem;
    private double valorCalcao;
    private double valor_locacao;
    private boolean devolvido;

    public Locacao() {
    }

    public Locacao(int id, Calendar dataLocacao, Calendar DataDevolucao, int quilometragem, double valorCalcao, double valor_locacao, boolean devolvido) {
        this.id = id;
        this.dataLocacao = dataLocacao;
        this.DataDevolucao = DataDevolucao;
        this.quilometragem = quilometragem;
        this.valorCalcao = valorCalcao;
        this.valor_locacao = valor_locacao;
        this.devolvido = devolvido;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getDataLocacao() {return calendarToString(dataLocacao);}
    public void setDataLocacao(Calendar dataLocacao) {this.dataLocacao = dataLocacao;}

    public String getDataDevolucao() {return calendarToString(DataDevolucao);}
    public void setDataDevolucao(Calendar DataDevolucao) {this.DataDevolucao = DataDevolucao;}

    public int getQuilometragem() {return quilometragem;}
    public void setQuilometragem(int quilometragem) {this.quilometragem = quilometragem;}

    public double getValorCalcao() {return valorCalcao;}
    public void setValorCalcao(double valorCalcao) {this.valorCalcao = valorCalcao;}

    public double getValor_locacao() {return valor_locacao;}
    public void setValor_locacao(double valor_locacao) {this.valor_locacao = valor_locacao;}

    public boolean isDevolvido() {return devolvido;}
    public void setDevolvido(boolean devolvido) {this.devolvido = devolvido;}

    @Override
    public String toString() {
        return "\nLocacao{" + "id=" + id + ", dataLocacao e horaLocacao=" + ", DataDevolucao e horaDevolucao=" +
                ", quilometragem=" + quilometragem + ", valorCalcao=" + valorCalcao + ", valor_locacao=" + ", devolvido=" + devolvido + '}';
    }

    private static String calendarToString(Calendar data) {
        if (data != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm");
            return sdf.format(data.getTime());
        }
        return "00/00/0000 00:00";
    }
}
