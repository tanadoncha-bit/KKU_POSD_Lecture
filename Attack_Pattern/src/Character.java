public class Character {
    private String name;
    private AttackStrategy attackStrategy;
    public Character(String name) {
        this.name = name;
    }
    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
    public void attack() {
        System.out.print(name + " ");
        attackStrategy.attack();
    }
}