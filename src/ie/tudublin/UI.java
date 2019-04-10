package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{	
	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	ArrayList<Colour> colours = new ArrayList<Colour>();


	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void loadColours()
	{
		Table table = loadTable("colours.csv", "header");
		for(TableRow row: table.rows())
		{
			Colour c = new Colour(row); 
			colours.add(c);
		}
	}

	public void printColours()
	{
		for(Colour c: colours)
		{
			System.out.println(c);
		}


	}

	public void findColor(int value)
	{
		

	}

	public void setup() 
	{
		loadColours();
		printColours();
	}
	
	public void draw()
	{			
	}
}
