package com.xworkz.examples;

public class Chess implements Players {

	@Override
	public boolean skipTurn() {
		System.out.println("running skip turn method");
		return false;
	}

	@Override
	public boolean whiteMovesFirst() {
		System.out.println("running white moves first method");
		return true;
	}

	@Override
	public boolean protectKing() {
		System.out.println("running protect king method");
		return true;
	}

	@Override
	public boolean queenMoveInAllDirections() {
		System.out.println("running queen move in all directions method");
		return true;
	}

	@Override
	public boolean pawnMoveOneStepAhead() {
		System.out.println("running pawn move one step ahead method");
		return true;
	}

}
