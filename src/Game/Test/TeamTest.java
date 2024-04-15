package Game.Test;

import Game.Students;
import Game.Team;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {

    @Test
    void addNewParticipant() {
        String consoleOutPut=null;//та переменная в которую мы будем сохранять то что будет печататься на консоле
        PrintStream originalOutPut=System.out;//та переменная чернез которую мы будем перехватывать то что выводится на экран
        Team<Students> team=null;
        Students students=null;
    try {
        ByteArrayOutputStream outPutStream=new ByteArrayOutputStream(100);
        PrintStream capture=new PrintStream(outPutStream);//та переменная куда будем печатать то что получим
        System.setOut(capture);
        students=new Students("Olga", 19);
        team=new Team<>("Drakoni");
        team.addNewParticipant(students);
        capture.flush();//запись данных в capture
        consoleOutPut=outPutStream.toString();
        System.setOut(originalOutPut);
    }
    catch (Exception e){
        e.printStackTrace();
    }
    assertEquals("V komandu "+team+" dobavilsya noviy ucastnik po imeni "+students.getName()+"\r\n",consoleOutPut);
    }

    @Test
    void playWith() {
        String consoleOutPut=null;
        Team<Students> team=null;
        PrintStream originalOutPut=System.out;

        try {
            ByteArrayOutputStream outputStream=new ByteArrayOutputStream(100);
            PrintStream capture=new PrintStream(outputStream);
            System.setOut(capture);
            team=new Team<>("Drakoni");
            team.playWith(team);
            capture.flush();
            consoleOutPut=outputStream.toString();
            System.setOut(originalOutPut);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        assertEquals("Viiqrala komanda "+team+"\r\n",consoleOutPut);
    }
}