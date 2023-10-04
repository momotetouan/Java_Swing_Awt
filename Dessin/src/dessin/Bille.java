/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessin;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author moham
 */
public class Bille {
    private int pasX,pasY;//position du centre en pixels
    private int rayon;//en pixels
    private Color couleur;
    
    //constructeur par défaut 
    //valeurs en priori
    
    public Bille(){
        this.pasX=50;
        this.pasY=50;
        this.rayon=20;
        this.couleur=Color.RED;
    }
    
    public Bille(int px,int py,int r){
        this.pasX=px;
        this.pasY=py;
        this.rayon=r;
        this.couleur=Color.RED;
        
    }
    
    //accesseurs get,set
    public void setCouleur(Color c){
        this.couleur=c;
    }
    
    public Color getCouleur(){
        return this.couleur;
    }
    public void setX(int x){
        this.pasX=x;
    }
    public void setY(int y){
        this.pasY=y;
    }
    
    
    public void deplaceBille(int dx,int dy){
        this.pasX+=dx;
        this.pasY+=dy;
    }
    
    //méthode spécifique qui donne la bille dans le panneau en paramètre
    
    public void dessineBille(JPanel pan){
        
        //récupération du graphics associé à pan
        Graphics g = pan.getGraphics();
        //on peut dessiner avec cet objet g
        g.setColor(this.couleur);
        g.fillOval(this.pasX-this.rayon, this.pasY-this.rayon, 2*this.rayon, 2*this.rayon);
        
    }
    
    

    
    
    
    
    
    
    
    
}
