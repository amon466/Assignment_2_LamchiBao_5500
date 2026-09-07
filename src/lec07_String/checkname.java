
package lec07_String;

public class checkname {
    public static void main(String[] args) {
        String name="report_final.pdf";
        System.out.println("enterfilename:"+"strat with "+name.startsWith(name, 0));
        System.out.println(name.endsWith(".pdf"));
        System.out.println("frist character: "+name.charAt(0));
        System.out.println("frist character: "+name.charAt(name.length()-1));
        
    }
}
