import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lee
{

    public Lee()
    {
    }

    public static int numeroE()
    {
        return Integer.parseInt(cadena());
    }

    public static double numeroD()
    {
        return Double.parseDouble(cadena());
    }

    public static String cadena()
    {
        String s = "";
        try
        {
            BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
            s = bufferedreader.readLine();
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        return s;
    }

    public static void pausa(int i)
    {
        try
        {
            Thread.sleep(i);
        }
        catch(Exception exception) { }
    }
}
