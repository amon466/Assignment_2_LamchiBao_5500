package lec07_String;

import java.util.Scanner;

public class Stringconcat {
    public static String concattenwithplus(String frist,String second){
        return frist+" "+second;
    }
    public static String concattenwithconcat(String frist,String second ){
        return frist.concat("").concat(second);
    }
    public static void main(String[] args) {
        String frist = "duy tan ";
        String second="university";
        System.out.println("usning+:"+concattenwithplus(frist, second));
        System.out.println("concat+:"+concattenwithconcat(frist, second));
        frist.concat("university");
        System.out.println("frist after concat without reassigment:"+frist);
    }
}
