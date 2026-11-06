public class Hotel {
    static void reservar(int habitaciones) throws Exception {
        if (habitaciones <= 0) throw new IllegalArgumentException("Cantidad inválida");
        if (habitaciones > 10) throw new Exception("No hay disponibilidad");
    }
    public static void main(String[] args) { try { reservar(20); } catch (IllegalArgumentException e) { System.out.println("Argumento: " + e.getMessage()); } catch (Exception e) { System.out.println("General: " + e.getMessage()); } }
}
