package org.mcrest.entity;

import org.mcrest.utils.PlayerHelper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a mcrest ues world class. It has subset member from bukkit world.
 * Created by frank on 2015/3/6.
 */
public class World implements Serializable {
    private boolean allowAnimals;
    private boolean allowMonsters;
    private boolean	thundering;
    private boolean	storm;

    private String[] gameRules;
    private String	name;
    private List<Player> players;


    public World(org.bukkit.World world){
        this.allowAnimals = world.getAllowAnimals();
        this.allowMonsters = world.getAllowMonsters();
        this.gameRules = world.getGameRules();
        this.name = world.getName();
        this.thundering = world.isThundering();
        this.storm = world.hasStorm();
        this.players =new ArrayList<Player>(PlayerHelper.convertBukkitPlayerToMcRest(world.getPlayers()));
    }

    public boolean isAllowAnimals() {
        return allowAnimals;
    }

    public boolean isAllowMonsters() {
        return allowMonsters;
    }

    public String[] getGameRules() {
        return gameRules;
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public boolean isThundering() {
        return thundering;
    }

    public boolean isStorm() {
        return storm;
    }
}
