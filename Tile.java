/*
	5.Create a class Tile to store the edge length of a square tile, and create another class Floor to store length and width of a rectangular floor.
Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.
*/
import java.util.*;

class Tile{
     int edgelength;
     int area;

    Tile(int edge){
        this.edgelength=edge;
        this.area=edge*edge;
    }

    int getArea(){
        return area;
    }
}

class Floor{
     int length;
     int width;

    Floor(int length, int width){
        this.length = length;
        this.width = width;
    }

    void totalTiles(Tile t){
        int tileArea = t.getArea();
        int floorArea = length*width;
        double noOfTiles = floorArea/tileArea;
        System.out.println("Number of Tiles needed for your room is : "+noOfTiles);
    }
}

class floorPrgm{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the edgelength of Tile in meters: ");
        int tileLength = sc.nextInt();
//Tile object
        Tile t = new Tile(tileLength);

        System.out.println("Enter the length and width of your house Floor in meters: ");
        int fLength = sc.nextInt();
        int fWidth = sc.nextInt();
//Floor Object
        Floor f = new Floor(fLength,fWidth);

        f.totalTiles(t);
    }
}