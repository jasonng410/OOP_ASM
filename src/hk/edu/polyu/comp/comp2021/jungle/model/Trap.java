package hk.edu.polyu.comp.comp2021.jungle.model;

public class Trap extends Enviroment {

    public String site;
    public Trap(String site){
       this.site=site;
    }
    @Override
    public String toString() {
        return "^";
    }

    @Override
    public String getSite() {
        return this.site;
    }

    public String getType(){
        return "trap";
    }

    @Override
    public void setChess(Chess a) {

    }

    public void removeChess() {
    }

    @Override
    public Chess getChess() {
        return null;
    }

    @Override
    public boolean haveChess() {
        return false;
    }
}
