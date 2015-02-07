package tilegame;

import static org.junit.Assert.*;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;

public class TestTileGame extends TestCase
{

	@Test
	public void testGetIndexForFit()
	{
		ArrayList<NumberTile> tiles = new ArrayList<NumberTile>();
		tiles.add(new NumberTile(4, 3, 7, 4));
		tiles.add(new NumberTile(6, 4, 3, 3));
		tiles.add(new NumberTile(1, 2, 3, 4));
		tiles.add(new NumberTile(3, 2, 5, 2));
		tiles.add(new NumberTile(5, 9, 2, 2));
		TileGame game = new TileGame(tiles);
		NumberTile toInsert = new NumberTile(4, 2, 9, 2);
		assertEquals(3, game.getIndexForFit(toInsert));
		toInsert = new NumberTile(4, 2, 9, 8);
		assertEquals(-1, game.getIndexForFit(toInsert));
	}

}
