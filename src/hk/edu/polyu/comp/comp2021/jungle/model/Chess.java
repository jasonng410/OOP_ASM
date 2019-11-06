package hk.edu.polyu.comp.comp2021.jungle.model;

public class Chess extends Enviroment {
    public rank rank;
    public String name;
    public String site;

    public Chess(String s,String name){
        this.site=s;
        this.name=name;
        switch (name){
            case "Rat":
                this.rank=rank.Rat;
                break;
            case "Cat":
                this.rank=rank.Cat;
                break;
            case "Dog":
                this.rank=rank.Dog;
                break;
            case "Wolf":
                this.rank=rank.Wolf;
                break;
            case "Leopard":
                this.rank=rank.Leopard;
                break;
            case "Tiger":
                this.rank=rank.Tiger;
                break;
            case "Lion":
                this.rank=rank.Lion;
                break;
            case "Elephant":
                this.rank=rank.Elephant;
                break;

        }

        }
    public String toString(){
        return name.charAt(0)+"";
    }
    public String getSite(){return this.site;}
    public int getRank(){return this.rank.getRank();}
}
