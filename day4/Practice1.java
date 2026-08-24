public class Practice1 {
public static void main(String[] args){
    String text = "  Java Backend  ";

System.out.println(text.length());
System.out.println(text.trim().length());
System.out.println(text.toUpperCase());
System.out.println(text.contains("Backend"));
System.out.println(text.substring(2, 6));
System.out.println(text.replace("Backend", "Developer"));

  }
}