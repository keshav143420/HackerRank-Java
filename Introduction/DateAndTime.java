import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String m = in.next();
        String d = in.next();
        String y = in.next();
        String date = d + "/" + m + "/" + y;
        SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
        try 
        {
            DateFormat f2 = new SimpleDateFormat("EEEE"); 
            String day = f2.format(f1.parse(date));
            System.out.println(day.toUpperCase());
        }
        catch(Exception e){}
    }
}

/*
Other code: using java 8

import java.io.*;
import java.util.*;
import java.text.*;
import java.time.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mm = in.nextInt();
        int dd = in.nextInt();
        int yy = in.nextInt();
        in.close();
        LocalDate dt = LocalDate.of(yy, mm, dd);
        System.out.print(dt.getDayOfWeek());
    }
}
*/