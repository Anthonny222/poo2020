package polimorfismoautomotriz;

public class Vendedor extends Empleado {
    private double salario;
    private double valor;
    public Vendedor(String rfc, String nom, String dep, String puest, double salario, double valor){
        this.rfc = rfc;
        this.nom = nom;
        this.dep = dep;
        this.puest = puest;
        this.salario = salario;
        this.valor = valor;
    }

    public double getSalario() {
        return salario;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public void calcularQuin() {
        quin = salario + (valor * 0.02);
    }
}
