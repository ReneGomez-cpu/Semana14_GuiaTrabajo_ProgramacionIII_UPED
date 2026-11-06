public class Ej2 { public static void main(String[] args) { try { throw new RuntimeException("unchecked"); } catch (RuntimeException e) { System.out.println(e.getMessage()); } } }
