import java.util.ArrayList;
import java.util.List;

public class Squad
{
    private final List<String> players = new ArrayList<>();

    private String captain;

    public void setCaptain(String c)
    {
        this.captain = c;
    }

    public void addPlayer(String name)
    {
        players.add(name); // Add a player to the squad
    }

    public void print()
    {
        for(int i = 0; i < players.size(); i++)
        {
            System.out.println((i+1) + " " + players.get(i));
        }
        System.out.println("Captain: " + captain);
    }

    public static void main(String[] args)
    {
        Squad india = new Squad();

        india.addPlayer("Dhoni");
        india.addPlayer("Yuvraj");
        india.addPlayer("Sachin");
        india.addPlayer("Raina");

        india.setCaptain("Raina");

        india.print();
    }
}