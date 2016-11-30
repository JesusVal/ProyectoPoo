package core;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

public class World {
	
	public static BufferedImage CURRENT_BACKGROUND;
	public static Tile[][] tiledMap;
	public static final int ROWS = 18;//9;
	public static final int COLS = 20;//20;
	
	
	public World(){
		tiledMap = new Tile[ROWS][COLS];
	}
	
	public void initializeStage(int level){
		try {
			CURRENT_BACKGROUND = ImageIO.read(getClass().getResource("/items/background"+String.valueOf(level)+".png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		InputStream is = this.getClass().getResourceAsStream("/levels/level"+String.valueOf(level)+".txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		String line = null;
		String[] tilesInLine = new String[ROWS];
		
		try {
			int i=0;
			while( (line = reader.readLine())  != null){
				tilesInLine = line.split(" ");
				for(int j=0; j<COLS; j++){
					if(!tilesInLine[j].equalsIgnoreCase("empt")){
						tiledMap[i][j] = newTileInstance(tilesInLine[j],i,j);
					} else {
						tiledMap[i][j] = null;
					}
				}
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private Tile newTileInstance(String name, int i, int j) {
		switch (name) {
			case "trg1":
				return new Block(name, i, j);
			case "trg2":
				return new Block(name, i, j);
			case "trg3":
				return new Block(name, i, j);
			case "trg4":
				return new Block(name, i, j);
			case "trg5":
				return new Block(name, i, j);
			case "trg6":
				return new Block(name, i, j);
			case "trg7":
				return new Block(name, i, j);
			case "trg8":
				return new Block(name, i, j);
				
			case "trs1":
				return new Block(name, i, j);
			case "trs2":
				return new Block(name, i, j);
			case "trs3":
				return new Block(name, i, j);
			case "trs4":
				return new Block(name, i, j);
			case "trs5":
				return new Block(name, i, j);
			case "trs6":
				return new Block(name, i, j);
			case "trs7":
				return new Block(name, i, j);
			case "trs8":
				return new Block(name, i, j);
				
			case "tri1":
				return new Block(name, i, j);
			case "tri2":
				return new Block(name, i, j);
			case "tri3":
				return new Block(name, i, j);
			case "tri4":
				return new Block(name, i, j);
			case "tri5":
				return new Block(name, i, j);
			case "tri6":
				return new Block(name, i, j);
			case "tri7":
				return new Block(name, i, j);
			case "tri8":
				return new Block(name, i, j);
				
			case "trc1":
				return new Block(name, i, j);
			case "trc2":
				return new Block(name, i, j);
			case "trc3":
				return new Block(name, i, j);
			case "trc4":
				return new Block(name, i, j);
			case "trc5":
				return new Block(name, i, j);
			case "trc6":
				return new Block(name, i, j);
			case "trc7":
				return new Block(name, i, j);
			case "trc8":
				return new Block(name, i, j);
				
			case "coin":
				return new Coins("coin_1", i, j);
			case "peak":
				return new spikes(name, i, j);
			
			case "bl01":
				return new Block(name, i, j);
			case "bl02":
				return new Block(name, i, j);
			case "bl03":
				return new Block(name, i, j);
			case "bl04":
				return new Block(name, i, j);
			case "bl05":
				return new Block(name, i, j);
			case "bl06":
				return new Block(name, i, j);
			case "bl07":
				return new Block(name, i, j);
		}
		return null;
	}
	
	
	
}
