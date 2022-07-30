public class Barrack {
    Unit createUnit(String typeOfTroops) {
        Unit unit = null;
        switch (typeOfTroops) {
            case "Mage":
                unit = new Mage();
                break;
            case "Warrior":
                unit = new Warrior();
                break;
            case "Archer":
                unit = new Archer();
                break;
            default:
                System.out.println("type Warrior, Mage or Archer to create unit");
        }
        return unit;
    }
}
