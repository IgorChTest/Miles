public class BonusMilesService {

    public int calculate(int price) {
        int base = 20;
        int miles = (price / base);
        return miles;
    }
}