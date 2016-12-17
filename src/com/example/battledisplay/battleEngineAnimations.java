package com.example.battledisplay;

import android.graphics.drawable.AnimationDrawable;
import android.view.animation.Animation;

public class battleEngineAnimations {

	static Animation.AnimationListener knightAttacks_1_Listener = new Animation.AnimationListener() {
		
		@Override
		public void onAnimationStart(Animation animation) {
		
			//	Menu animation:	
			gameComponents.attackButton.startAnimation(gameComponents.animTranslate);
    		gameComponents.defenseButton.startAnimation(gameComponents.animAlpha);
    		gameComponents.focusButton.startAnimation(gameComponents.animAlpha);
    		gameComponents.prayButton.startAnimation(gameComponents.animAlpha);
    		
    		// Initiates player's action:
         	gameComponents.knight.attack(gameComponents.dragon);
         	gameComponents.statusBarDisplay.setText(gameComponents.knight.getStatus());
			
		}
		
		@Override
		public void onAnimationRepeat(Animation animation) {}
		
		@Override
		public void onAnimationEnd(Animation animation) {
			
			gameComponents.dragonView.setBackgroundResource(R.anim.dragon_damage);
            AnimationDrawable dragonDamage = (AnimationDrawable) gameComponents.dragonView.getBackground();
            dragonDamage.start();
            dragonDamage.setVisible(true,true); // Resets animation for 'one shot
       	 
       	 	gameComponents.knightView.startAnimation(gameComponents.knightAttack_2);
			
		}
	};
	
	static Animation.AnimationListener knightAttacks_2_Listener = new Animation.AnimationListener() {
		
		@Override
		public void onAnimationStart(Animation animation) {}
		
		@Override
		public void onAnimationRepeat(Animation animation) {}
		
		@Override
		public void onAnimationEnd(Animation animation) {
			
			
			//gameComponents.statusBarDisplay.setText("Dragon " + gameComponents.dragon.getLife() + " / " + gameComponents.dragon.getMaxLife());
			gameComponents.playerPowerDisplay.setText("Power " + gameComponents.knight.getPower() + " / " + gameComponents.knight.getMaxPower());
			gameComponents.playerLifeDisplay.setText("Life " + gameComponents.knight.getLife() + " / " + gameComponents.knight.getMaxLife());
			
			 // TODO: add dragon logic
            if (battleEngine.gameContinues()) {
                
           	 dragonLogic.counterAttack();
            
            } 
			
		}
	};
	
	static Animation.AnimationListener knightDefends_1_Listener = new Animation.AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {
			
				//	Menu animation:	
				gameComponents.attackButton.startAnimation(gameComponents.animAlpha);
	    		gameComponents.defenseButton.startAnimation(gameComponents.animTranslate);
	    		gameComponents.focusButton.startAnimation(gameComponents.animAlpha);
	    		gameComponents.prayButton.startAnimation(gameComponents.animAlpha);
	    		
	    		// Initiates player's action:
	         	gameComponents.knight.defend();
	         	gameComponents.statusBarDisplay.setText(gameComponents.knight.getStatus());
				
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) {}
			
			@Override
			public void onAnimationEnd(Animation animation) {
				
				//gameComponents.statusBarDisplay.setText("Dragon " + gameComponents.dragon.getLife() + " / " + gameComponents.dragon.getMaxLife());
				//battleEngine.enableMenu(); // Enables game play at end of round
				 // TODO: add dragon logic
	            if (battleEngine.gameContinues()) {
	                
	            	dragonLogic.counterDefend();
	            
	            } 
				
			}
		};
	
		static Animation.AnimationListener dragonAttacks_1_Listener = new Animation.AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {
			
				//	Menu animation:	
				gameComponents.attackButton.startAnimation(gameComponents.animTranslate);
	    		gameComponents.defenseButton.startAnimation(gameComponents.animAlpha);
	    		gameComponents.focusButton.startAnimation(gameComponents.animAlpha);
	    		gameComponents.prayButton.startAnimation(gameComponents.animAlpha);
				
	    		// Initiates dragon action:
	         	gameComponents.dragon.attack(gameComponents.knight);
	         	gameComponents.statusBarDisplay.setText(gameComponents.dragon.getStatus());
				
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) {}
			
			@Override
			public void onAnimationEnd(Animation animation) {
				
				gameComponents.knightView.setBackgroundResource(R.anim.knight_damage);
	            AnimationDrawable dragonDamage = (AnimationDrawable) gameComponents.knightView.getBackground();
	            dragonDamage.start();
	            dragonDamage.setVisible(true,true); // Resets animation for 'one shot
	       	 
	       	 	gameComponents.dragonView.startAnimation(gameComponents.dragonAttack_2);
				
			}
		};
		
		static Animation.AnimationListener dragonAttacks_2_Listener = new Animation.AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {}
			
			@Override
			public void onAnimationRepeat(Animation animation) {}
			
			@Override
			public void onAnimationEnd(Animation animation) {
				
				
				gameComponents.statusBarDisplay.setText("Dragon " + gameComponents.dragon.getLife() + " / " + gameComponents.dragon.getMaxLife());
				gameComponents.playerPowerDisplay.setText("Power " + gameComponents.knight.getPower() + " / " + gameComponents.knight.getMaxPower());
				gameComponents.playerLifeDisplay.setText("Life " + gameComponents.knight.getLife() + " / " + gameComponents.knight.getMaxLife());
				
				 if (battleEngine.gameContinues()) {
		                
					 battleEngine.enableMenu(); // Enables game play at end of round
		            
		        } 

			}
		};
		
		static Animation.AnimationListener dragonDefends_1_Listener = new Animation.AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {
			
				//	Menu animation:	
				gameComponents.attackButton.startAnimation(gameComponents.animAlpha);
	    		gameComponents.defenseButton.startAnimation(gameComponents.animTranslate);
	    		gameComponents.focusButton.startAnimation(gameComponents.animAlpha);
	    		gameComponents.prayButton.startAnimation(gameComponents.animAlpha);
	    		
	    		// Initiates player's action:
	         	gameComponents.dragon.defend();
	         	gameComponents.statusBarDisplay.setText(gameComponents.dragon.getStatus());
				
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) {}
			
			@Override
			public void onAnimationEnd(Animation animation) {
				
				gameComponents.statusBarDisplay.setText("Dragon " + gameComponents.dragon.getLife() + " / " + gameComponents.dragon.getMaxLife());
				
				 if (battleEngine.gameContinues()) {
		                
					 battleEngine.enableMenu(); // Enables game play at end of round
		            
		        } 
				
				
			}
		};
		
		static Animation.AnimationListener gameOver_Listener = new Animation.AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {}
			
			@Override
			public void onAnimationRepeat(Animation animation) {}
			
			@Override
			public void onAnimationEnd(Animation animation) {
				
				gameComponents.playerLifeDisplay.setVisibility(0);
		        gameComponents.playerPowerDisplay.setVisibility(0);

			}
		};
}
