
import gui.GameFrame;
import gui.GamePanel;

import core.GameManager;

public class Main {
	
	

	public static void main(String [] args){

		//Crea un nuevo espacio jugable
		GamePanel gamePanel=new GamePanel();
		
		//Une el espacio conla mecanicas de juego
		GameManager gameManager = new GameManager(gamePanel);
		gameManager.start();
				
		//Inserta las gui dentro de una ventana
		@SuppressWarnings("unused")
		GameFrame gameFrame = new GameFrame(gamePanel);
		
	}
}
