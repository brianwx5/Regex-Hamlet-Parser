import javafx.scene.Parent;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private String hamletData;

    public HamletParser(){
        this.hamletData = loadFile();
    }

    private String loadFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("hamlet.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getHamletData(){
        return hamletData;
    }

    public String changeHamletToLeon(String text) {
        // "\\bhamlet\\b"
        String regex = "hamlet";
        String replaceWith = "Leon";
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        text = p.matcher(text).replaceAll(replaceWith);
        return text;

    }

    public String changeHoratioToTariq(String text) {
        String regex = "horatio";
        String replaceWith = "Tariq";
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        text = p.matcher(text).replaceAll(replaceWith);
        return text;
    }

    public String changeHoratioAndHamletToLeonAndTariq(String text) {
        text = changeHamletToLeon(text);
        text = changeHoratioToTariq(text);
        return text;
    }
}
