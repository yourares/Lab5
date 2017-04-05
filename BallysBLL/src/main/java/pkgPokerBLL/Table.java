package pkgPokerBLL;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

public class Table implements Serializable {

	private UUID TableID;

	// Change this from ArrayList to HashMap.
	private ArrayList<Player> TablePlayers = new ArrayList<Player>();

	public Table() {
		super();
		TableID = UUID.randomUUID();
	}

	public Table AddPlayerToTable(Player p) {
		// TODO: Lab #4 Add a player to the table (should be pretty easy)
		return this;
	}

	public Table RemovePlayerFromTable(Player p) {
		// TODO: Lab #4 Remove a player from the table
		return this;
	}
}
