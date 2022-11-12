/**
 * Student
 */
public class Student {

    // Classe Student que armazena o nme e a média de um aluno

    private String name;
    private double average;

    // construtur inializa variávei de instância
    public Student(String name, double average) {
        this.name = name;
        // valida que a média é > 0.0 e <= 100.0; cas contrario
        // armazena o valor padrão da média da variáve de instancia (.0.0)

        if (average > 0.0) {
            if (average <= 100.0) {
                this.average = average; // atribi a variavel de instancia
            }
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    // recupera o nime de Student
    public String getName() {
        return name;
    }

    // define a média de Student
    public void setAverage(double studentAverage) {
        if (studentAverage > 0.0) {
            if (studentAverage <= 100.0) {
                this.average = studentAverage;
            }
        }
    }
}