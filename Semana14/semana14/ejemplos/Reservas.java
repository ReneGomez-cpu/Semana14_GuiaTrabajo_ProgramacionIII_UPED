public class Reservas {
    static void reservar(String nombre, int noches) throws Exception {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre requerido");
        if (noches <= 0) throw new IllegalArgumentException("Noches inválidas");
        if (noches > 30) throw new Exception("La reserva supera el límite permitido");
        System.out.println("Reserva confirmada para " + nombre + " (" + noches + " noches)");
    }
    public static void main(String[] args) { for (int noches : new int[]{3, 0, 40}) try { reservar("Ana", noches); } catch (IllegalArgumentException e) { System.out.println("Validación: " + e.getMessage()); } catch (Exception e) { System.out.println("Reserva: " + e.getMessage()); } }
}
