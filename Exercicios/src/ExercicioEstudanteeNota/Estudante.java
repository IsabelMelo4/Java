package ExercicioEstudanteeNota;
import java.util.ArrayList;
import java.util.Scanner;

public class Estudante {
        String nome;
        long matricula;

        float[] notas = new float[4];

        //metodos

        void inserirNotas() {

            for(int i = 0; i < notas.length; i++) {

                System.out.println("digite sua nota");
                Scanner lerNota = new Scanner(System.in);
                notas[i]= lerNota.nextFloat();

            }

                }
        }


