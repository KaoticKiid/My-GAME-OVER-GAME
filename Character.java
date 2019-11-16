public class Character{
    private String name;
    private int lifePoints;
    private int attackPoints;

    //create a constructor
    public Character(String name, int lifePoints, int attackPoints){
        this.name=name;
        this.lifePoints=lifePoints;
        this.attackPoints=attackPoints;
    }

    //getters
    public String getName(){
        return this.name;
    }

    public int getLifepoints(){
        return this.lifePoints;
    }

    public int getAttackpoints(){
        return this.attackPoints;
    }
  
    //methods
    public void display(){
        System.out.println("----------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Life Points: " + this.lifePoints);
        System.out.println("Attack Points: " + this.attackPoints);

    }

    public void attack(Character opponent){
        System.out.prrintln(this.name + " is attacking... " + opponent.name);

        int newLP = opponent.energy-this.attackPoints;


        opponent.energy=newLP;
        opponent.display();

        if(opponent.energy <= 0){
            opponent.lifes=opponent.lifes-1;
            opponent.energy=100;
            opponent.display();

        if(opponent.lifes == 0){
            System.out.println("Game Over");
            System.exit(1);
        }
        }
    }

}