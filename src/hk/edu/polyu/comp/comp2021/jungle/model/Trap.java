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
}
