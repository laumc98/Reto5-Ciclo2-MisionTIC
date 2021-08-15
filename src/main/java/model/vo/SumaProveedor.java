package model.vo;

public class SumaProveedor {

    private String sumaCantidades;

    public SumaProveedor(){
    }

    public SumaProveedor(String sumaCantidades){
        this.sumaCantidades = sumaCantidades;
    }

    public String getSumaCantidades() {
        return sumaCantidades;
    }

    public void setSumaCantidades(String sumaCantidades) {
        this.sumaCantidades = sumaCantidades;
    }
}
