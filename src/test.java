import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kavan on 11/10/15.
 */
public class test {

    public static void main(String[] args){


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        try {
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
