public class Jerarquia {
    public static void main(String[] args) {
        try { throw new IllegalArgumentException("argumento inválido"); }
        catch (RuntimeException e) { System.out.println("RuntimeException"); }
        catch (Exception e) { System.out.println("Exception"); }
    }
}
