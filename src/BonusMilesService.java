public class BonusMilesService {
    int costOneMile = 20;

    public int milesAmount(int ticketPrice) {
        return ticketPrice / costOneMile;
    }

}

