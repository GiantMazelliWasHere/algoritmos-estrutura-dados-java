import java.util.LinkedList;
import java.util.Queue;

public class Ex07_Un02 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        String[] pacientes = {"Ana", "Bruno", "Carla", "Diego", "Elisa"};

        System.out.println("Fila de espera para atendimento médico:");
        for(String paciente : pacientes){
            fila.offer(paciente);
            System.out.println(paciente + " entrou na fila.");
        }
        System.out.println("Fila atual: " + fila);
        System.out.println("Proximo paciente a ser atendido: " + fila.peek());

        while(!fila.isEmpty()){
            String pacienteAtendido = fila.poll();
            System.out.println(pacienteAtendido + " foi atendido.");
            System.out.println("Fila atual: " + fila);
        }
    }
}
