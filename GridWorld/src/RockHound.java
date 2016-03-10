import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Critter;

import java.util.ArrayList;


public class RockHound extends Critter
{
	public void processActors(ArrayList<Actor> actors)
    {
        for (Actor a : actors)
        {
            if (!(a instanceof Bug) && !(a instanceof Critter))
                a.removeSelfFromGrid();
        }
    }
}
