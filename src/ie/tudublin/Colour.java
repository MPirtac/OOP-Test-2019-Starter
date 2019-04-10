package ie.tudublin;

public class Colour
{
   private String colour;
   public float r;
   public float g;
   public float b;

   public Colour(String colour, float r, float g, float b)
   {
       this.colour = colour;
       this.r = r;
       this.g = g;
       this.b = b;
   }

   public String toString()
   {
       return colour + "/t" + r + "/t" + g + "/t" + b;
    }
}