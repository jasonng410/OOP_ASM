package hk.edu.polyu.comp.comp2021.jungle.model;

public abstract class Enviroment {
     public abstract String toString();
     public abstract String getSite();
     public int getRank(){return 0;}
     public abstract String getType();
     public abstract void setChess(Chess a);
     public abstract void removeChess();
     public abstract Chess getChess();
     public abstract boolean haveChess();
}
