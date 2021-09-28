package com.christineeloriaga;

public class PlayerNode {
    private Player player;

    public PlayerNode(Player player) {
        this.player = player;
    }

    private PlayerNode nextPlayer;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public PlayerNode getNextPlayer() {
        return nextPlayer;
    }

    public void setNextPlayer(PlayerNode nextPlayer) {
        this.nextPlayer = nextPlayer;
    }
}
