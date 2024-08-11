public class Estudiante {
    String nombre;
    int edad;
    int codigo;
    int anioGraduacion;
    double nota1;
    double nota2;
    double nota3;
    double notaFinal;

    public Estudiante(String name, int edad, int codigo, double nota1, double nota2, double nota3, int gradYear) {
        this.nota1 = nota1;
        this.nombre = name;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.edad = edad;
        this.codigo = codigo;
        this.anioGraduacion = gradYear;
    }

    public double notaFinal(){
        notaFinal = ((this.nota1*0.3) + (this.nota2*0.3) + (this.nota3*0.4));
        return notaFinal;
    }

    public String estado(){
        if(this.notaFinal >= 3){
            return "aprobado";
        } else {
            return "suspendido";
        }
    }
    public int findGradAge(){
        int yearsLeft = this.anioGraduacion - 2024;
        return (this.edad + yearsLeft);
    }
    /*
    static void welcomePage(){
        System.out.println("Hola! Bienvenido a la clase amigos de Cata.");
        System.out.println("Puede consultar la edad del estudiante al graduarse");
    }
     */
}