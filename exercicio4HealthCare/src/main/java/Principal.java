public class Principal {

    public static void main(String[] args) {
        Paciente paciente1 = new Paciente(85,1.57);
        Paciente paciente2 = new Paciente(65,1.55);
        Paciente paciente3 = new Paciente(95,1.56);
        paciente1.setNome("Marcelo");
        paciente2.setNome("Juliana");
        paciente3.setNome("Michelle");

        paciente1.calcularIMC();
        paciente2.calcularIMC();
        paciente3.calcularIMC();
        paciente1.diagnostico();
        paciente2.diagnostico();
        paciente3.diagnostico();


    }
}
