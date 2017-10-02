package media.raa.raa_android_player;

import media.raa.raa_android_player.lineup.Lineup;

/**
 * Singleton container
 * Created by hamid on 9/30/17.
 */

public class RaaContext {
    private static RaaContext instance;

    static {
        instance = new RaaContext();
    }

    public static RaaContext getInstance() {
        return instance;
    }

    private Lineup currentLineup;

    private RaaContext() {
        currentLineup = new Lineup();
    }

    public Lineup getLineup() {
        return currentLineup;
    }
}
