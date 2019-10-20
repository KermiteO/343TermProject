/*******************************************************************************
 * File Name:			
 * Project:			
 * 
 * Designer(s):		Garrett Cross,
 * 					Omar Kermiche,
 * 					Autumn Nguyen,
 * 					Thomas Pridy
 * 
 * Copyright � 2019. All rights reserved.
 ******************************************************************************/
package game.players;

import game.TicTacToe;

public class Human extends Player
{
    /***************************************************************************
     *      VARIABLES
     **************************************************************************/
    
    private String name;

    /***************************************************************************
     *      CONSTRUCTOR
     **************************************************************************/
    
    public Human(TicTacToe game)
    {
        super(game);
        setType(PlayerType.HUMAN);
    }
    
    /***************************************************************************
     *      SETTERS/GETTERS
     **************************************************************************/
    
    
    
    /***************************************************************************
     *      METHODS
     **************************************************************************/

    @Override
    public void takeTurn()
    {
        game.setCurrentPlayer(this);
        incTurn();
    }
}