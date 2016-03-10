import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;

import java.util.ArrayList;


public class SurvivorCritter extends Critter
{
	private Color color = new Color(255,255,255);
	private int strength;
	
	
	public SurvivorCritter()
	{
		setColor(color);
		strength = (int)(Math.random()*10)+1;
	}
	
	public void processActors(ArrayList<Actor> actors)
    {
        for (Actor a : actors)
        {
        	if ((a instanceof ZombieCritter))
        	{
        		int zStrength = (int)(Math.random()*10)+1;
        		
                if(strength > zStrength)
                	a.removeSelfFromGrid();
                else
                {
                	Location loc = a.getLocation();
                	removeSelfFromGrid();
                	
                	Critter zombie = new ZombieCritter();
                    Grid<Actor> gr = getGrid();
            	
                    zombie.putSelfInGrid(gr, loc);
                }
        	}
        }
    }
	
	public int getStrength()
	{
		return strength;
	}
}
