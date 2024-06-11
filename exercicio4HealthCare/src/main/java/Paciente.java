public class Paciente {

    private double peso;
    private double altura;
    private String nome;

    public Paciente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularIMC(){
        return peso/(altura*altura);
    }

    public void diagnostico(){
        System.out.println("\nO diagnóstico do Paciente " + getNome() + " é ");
        if(calcularIMC() < 16){
            System.out.println("Baixo peso muito grave = IMC abaixo de 16 kg/m²");
        } else if(calcularIMC() >= 16 && calcularIMC() <= 16.99){
            System.out.println("Baixo peso grave = IMC entre 16 e 16,99 kg/m²");
        } else if(calcularIMC() >= 17 && calcularIMC() <= 18.49){
            System.out.println("Baixo peso = IMC entre 17 e 18,49 kg/m²");
        } else if (calcularIMC() >= 18.50 && calcularIMC() <= 24.99) {
            System.out.println("Peso normal = IMC entre 18,50 e 24,99 kg/m²");
        } else if (calcularIMC() >= 25 && calcularIMC() <= 29.99) {
            System.out.println("Sobrepeso = IMC entre 25 e 29,99 kg/m²");
        } else if (calcularIMC() >= 30 && calcularIMC() <= 34.99) {
            System.out.println("Obesidade grau I = IMC entre 30 e 34,99 kg/m²");
        } else if (calcularIMC() >= 35 && calcularIMC() <= 39.99) {
            System.out.println("Obesidade grau II = IMC entre 35 e 39,99 kg/m²");
        } else {
            System.out.println("Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²");
        }
    }
}
