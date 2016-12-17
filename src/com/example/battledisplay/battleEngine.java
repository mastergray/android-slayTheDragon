package com.example.battledisplay;

import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.widget.TextView;

public class battleEngine {
	
	public static void playerAttacks() {
		
		battleEngine.disableMenu();
		gameComponents.knightView.startAnimation(gameComponents.knightAttack_1);
		
		
	}
	
	public static void playerFocuses() {

		//		Menu animation:	
		gameComponents.attackButton.startAnimation(gameComponents.animAlpha);
		gameComponents.defenseButton.startAnimation(gameComponents.animAlpha);
		gameComponents.focusButton.startAnimation(gameComponents.animTranslate);
		gameComponents.prayButton.startAnimation(gameComponents.animAlpha);
		
		// Initiates play action:
		gameComponents.knight.focus();
		
		// Turn animation:
		gameComponents.statusBarDisplay.setText(gameComponents.knight.getStatus());
		gameComponents.knightView.setBackgroundResource(R.anim.knight_focus);
	    AnimationDrawable knightFocus = (AnimationDrawable) gameComponents.knightView.getBackground();
	    knightFocus.start();
    	knightFocus.setVisible(true,true); // Resets animation for 'one shot' 
	    
    	battleEngine.disableMenu();
	    
    	// Pause before player ends:
    	Handler mAnimationHandler = new Handler();
	    mAnimationHandler.postDelayed(new Runnable() {

         public void run() {

             gameComponents.playerPowerDisplay.setText("Power " + gameComponents.knight.getPower() + " / " + gameComponents.knight.getMaxPower());
             
             if (battleEngine.gameContinues()) {
                 
            	 dragonLogic.counterFocus();
             
             } 
            
        	 
         	}
	    }, 1500);
	     
	}
	
	public static void playerDefends() {
		
		battleEngine.disableMenu();
		gameComponents.knightView.startAnimation(gameComponents.knightDefends_1);
	
	}
	
	public static void playerPrays() {
		
		//		Menu animation:	
		gameComponents.attackButton.startAnimation(gameComponents.animAlpha);
		gameComponents.defenseButton.startAnimation(gameComponents.animAlpha);
		gameComponents.focusButton.startAnimation(gameComponents.animAlpha);
		gameComponents.prayButton.startAnimation(gameComponents.animTranslate);
		
		// Initiates play action:
		gameComponents.knight.pray();
		
		// Turn animation:
		gameComponents.statusBarDisplay.setText(gameComponents.knight.getStatus());
		gameComponents.knightView.setBackgroundResource(R.anim.knight_pray);
        AnimationDrawable knightPray = (AnimationDrawable) gameComponents.knightView.getBackground();
        knightPray.start();
        knightPray.setVisible(true,true); // Resets animation for 'one shot' 
	    
    	battleEngine.disableMenu();
	
    	// Pause before player ends:
    	Handler mAnimationHandler = new Handler();
	    mAnimationHandler.postDelayed(new Runnable() {

         public void run() {

             gameComponents.playerLifeDisplay.setText("Life " + gameComponents.knight.getLife() + " / " + gameComponents.knight.getMaxLife());
             gameComponents.playerPowerDisplay.setText("Power " + gameComponents.knight.getPower() + " / " + gameComponents.knight.getMaxPower());
             
             // Check if game is over:
             if (battleEngine.gameContinues()) {
             
            	 dragonLogic.counterPray();
             
             }
             
            
        	 
         	}
	    }, 1500);
	    
	}
	
	public static void dragonAttacks() {
		
		gameComponents.dragonView.startAnimation(gameComponents.dragonAttack_1);
		
	}
	
	public static void dragonDefends() {
	
		gameComponents.dragonView.startAnimation(gameComponents.dragonDefends_1);
		
	}
	
	public static void dragonFocuses() {
		
//		Menu animation:	
		gameComponents.attackButton.startAnimation(gameComponents.animAlpha);
		gameComponents.defenseButton.startAnimation(gameComponents.animAlpha);
		gameComponents.focusButton.startAnimation(gameComponents.animTranslate);
		gameComponents.prayButton.startAnimation(gameComponents.animAlpha);
		
		// Initiates play action:
		gameComponents.dragon.focus();
		
		// Turn animation:
		gameComponents.statusBarDisplay.setText(gameComponents.dragon.getStatus());
		gameComponents.dragonView.setBackgroundResource(R.anim.dragon_focus);
	    AnimationDrawable dragonFocus = (AnimationDrawable) gameComponents.dragonView.getBackground();
	    dragonFocus.start();
    	dragonFocus.setVisible(true,true); // Resets animation for 'one shot' 
	    
    	// Pause before player ends:
    	Handler mAnimationHandler = new Handler();
	    mAnimationHandler.postDelayed(new Runnable() {

         public void run() {

        	 gameComponents.statusBarDisplay.setText("Dragon " + gameComponents.dragon.getLife() + " / " + gameComponents.dragon.getMaxLife());
             gameComponents.playerPowerDisplay.setText("Power " + gameComponents.knight.getPower() + " / " + gameComponents.knight.getMaxPower());     
             
             // Check if game is over:
             if (battleEngine.gameContinues()) {
             
            	 battleEngine.enableMenu();
             
             }
        	 
         	}
	    }, 1000);
		
	}
	
	public static void dragonPrays() {
		
		//		Menu animation:	
		gameComponents.attackButton.startAnimation(gameComponents.animAlpha);
		gameComponents.defenseButton.startAnimation(gameComponents.animAlpha);
		gameComponents.focusButton.startAnimation(gameComponents.animAlpha);
		gameComponents.prayButton.startAnimation(gameComponents.animTranslate);
		
		// Initiates play action:
		gameComponents.dragon.pray();
		
		// Turn animation:
		gameComponents.statusBarDisplay.setText(gameComponents.dragon.getStatus());
		gameComponents.dragonView.setBackgroundResource(R.anim.dragon_pray);
        AnimationDrawable knightPray = (AnimationDrawable) gameComponents.dragonView.getBackground();
        knightPray.start();
        knightPray.setVisible(true,true); // Resets animation for 'one shot' 
	
    	// Pause before player ends:
    	Handler mAnimationHandler = new Handler();
	    mAnimationHandler.postDelayed(new Runnable() {

         public void run() {

        	 gameComponents.statusBarDisplay.setText("Dragon " + gameComponents.dragon.getLife() + " / " + gameComponents.dragon.getMaxLife());
             gameComponents.playerLifeDisplay.setText("Life " + gameComponents.knight.getLife() + " / " + gameComponents.knight.getMaxLife());
             gameComponents.playerPowerDisplay.setText("Power " + gameComponents.knight.getPower() + " / " + gameComponents.knight.getMaxPower());
             
             // Check if game is over:
             if (battleEngine.gameContinues()) {
             
            	 battleEngine.enableMenu();
             
             }
        	 
         	}
	    }, 1000);
		
	}
	
	public static void disableMenu() {
		
		gameComponents.attackButton.setEnabled(false);
    	gameComponents.defenseButton.setEnabled(false);
    	gameComponents.focusButton.setEnabled(false);
    	gameComponents.prayButton.setEnabled(false);	
		
	}
	
	public static void enableMenu() {
		
		gameComponents.attackButton.setEnabled(true);
    	gameComponents.defenseButton.setEnabled(true);
    	gameComponents.focusButton.setEnabled(true);
    	gameComponents.prayButton.setEnabled(true);
		
	}
	
	public static int getStatus(player Player) {
		
		int life = Player.getLife();
		
			if (life <= 100 && life > 75) {
				
				return 0;
				
			}
			
			if (life <= 75 && life > 50) {
				
				return 1;
				
			}
			
			if (life <= 50 && life > 25) {
							
				return 2;
							
			}
			
			return 3;
		
	}
	
	public static boolean gameContinues() {
	
	//	Player loses:
		if (gameComponents.knight.getLife() <= 0) {
			
			gameComponents.knightView.startAnimation(gameComponents.gameOver);
			gameComponents.knightView.setVisibility(gameComponents.currentView.INVISIBLE);
			gameComponents.statusBarDisplay.setText("You Lose!");
			
			gameComponents.attackButton.setVisibility(gameComponents.currentView.INVISIBLE);
			gameComponents.defenseButton.setVisibility(gameComponents.currentView.INVISIBLE);
			gameComponents.focusButton.setVisibility(gameComponents.currentView.INVISIBLE);
			gameComponents.prayButton.setVisibility(gameComponents.currentView.INVISIBLE);
			
			gameComponents.statusBarDisplay.setVisibility(gameComponents.currentView.INVISIBLE);
            gameComponents.playerLifeDisplay.setVisibility(gameComponents.currentView.INVISIBLE);
			return false;
			
		}
		
	//	Player wins:	
		if (gameComponents.dragon.getLife() <= 0) {
			
			gameComponents.dragonView.startAnimation(gameComponents.gameOver);
			gameComponents.dragonView.setVisibility(gameComponents.dragonView.INVISIBLE);
	        gameComponents.statusBarDisplay.setText("You Win!");
	        
	        gameComponents.attackButton.setVisibility(gameComponents.currentView.INVISIBLE);
			gameComponents.defenseButton.setVisibility(gameComponents.currentView.INVISIBLE);
			gameComponents.focusButton.setVisibility(gameComponents.currentView.INVISIBLE);
			gameComponents.prayButton.setVisibility(gameComponents.currentView.INVISIBLE);
	        
			gameComponents.statusBarDisplay.setVisibility(gameComponents.currentView.INVISIBLE);
            gameComponents.playerLifeDisplay.setVisibility(gameComponents.currentView.INVISIBLE);
			
			return false;
					
		}
		
	//	Game Continues:
		return true;
		
	}
}
