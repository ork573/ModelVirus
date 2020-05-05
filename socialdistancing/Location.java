package socialdistancing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
/**
 * Write a description of class Store here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Location
{
    Building view;
    public Wall ab;
    public Wall xy;
    private int a;
    private int b;
    private int x;
    private int y;
    private int n;
    private int m;
    private String name;
    public Location(int a, int b, int x, int y, String name, int n, int m){
        this.a = a;
         this.b = b; 
        this.x = x;
         this.y = y;
         this.n = n;
         this.m = m;
         this.name = name;
         ab = new Wall(a, b, "SocialDistancingImages/wall2.png", true);
         xy = new Wall(x, y, "SocialDistancingImages/wall1.png", false);
    }
    public void paintWalls(Graphics g){
        g.drawImage(ab.getImage(), ab.getX(), ab.getY(), view);
        g.drawImage(xy.getImage(), xy.getX(), xy.getY(), view);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Roboto", Font.BOLD, 20));
	g.drawString(name, n, m);
    }
    public Wall getVertical(){
        return ab;
    }
    public Wall getHorizontal(){
        return xy;
    }
}
