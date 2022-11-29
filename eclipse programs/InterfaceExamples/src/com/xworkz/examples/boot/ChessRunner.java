package com.xworkz.examples.boot;

import com.xworkz.examples.Chess;
import com.xworkz.examples.Players;

public class ChessRunner {

	public static void main(String[] args) {

		Chess chess=new Chess();
		chess.pawnMoveOneStepAhead();
		chess.protectKing();
		chess.queenMoveInAllDirections();
		chess.skipTurn();
		chess.whiteMovesFirst();
		System.out.println(System.lineSeparator());
		Players player=new Chess();
		player.pawnMoveOneStepAhead();
		player.protectKing();
		player.queenMoveInAllDirections();
		player.skipTurn();
		player.whiteMovesFirst();
		
		
	}

}
