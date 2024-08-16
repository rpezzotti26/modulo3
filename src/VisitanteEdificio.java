public class VisitanteEdificio {
    public static void main(String[] args) {
        // Información del visitante usando tipos de datos primitivos
        byte piso = 5; // Piso que visitará
        short numeroDepartamento = 101; // Número de departamento
        int idVisitante = 123456; // ID del visitante
        long numeroTelefono = 6745123456L; // Número de teléfono del visitante
        float altura = 1.75f; // Altura del visitante en metros
        double peso = 70.5; // Peso del visitante en kilogramos
        char inicialNombre = 'R'; // Inicial del nombre del visitante
        boolean esResidente = false; // Si es residente o no

        // Imprimir la información del visitante
        System.out.println("Información del visitante:");
        System.out.println("Piso a visitar: " + piso);
        System.out.println("Número de departamento: " + numeroDepartamento);
        System.out.println("ID del visitante: " + idVisitante);
        System.out.println("Número de teléfono: " + numeroTelefono);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Inicial del nombre: " + inicialNombre);
        System.out.println("Es residente: " + esResidente);
    }
}

