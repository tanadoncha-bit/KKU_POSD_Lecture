public class Main {
        public static void main(String[] args) {
                Character knight = new Character("Knight");

                knight.setAttackStrategy(new SwordAttack());
                knight.attack();

                knight.setAttackStrategy(new BowAttack());
                knight.attack();

                knight.setAttackStrategy(new MagicAttack());
                knight.attack();
        }
}