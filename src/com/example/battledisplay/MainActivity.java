package com.example.battledisplay;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.*;
import android.view.animation.Animation;
import android.graphics.drawable.AnimationDrawable;
import android.view.animation.AnimationUtils;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    
 /** Activity Setup **/
    
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  
        //   Views:
		gameComponents.statusBarDisplay   = (TextView) findViewById(R.id.statusBarDisplay);
		gameComponents.playerLifeDisplay  = (TextView) findViewById(R.id.playerLifeDisplay);
		gameComponents.playerPowerDisplay = (TextView) findViewById(R.id.playerPowerDisplay);
		
		//	Image Views:
		gameComponents.knightView = (ImageView) findViewById(R.id.knightView);
	    gameComponents.dragonView = (ImageView) findViewById(R.id.dragonView);
		
		// Buttons:
		gameComponents.attackButton   = (Button) findViewById(R.id.button1);
		gameComponents.defenseButton  = (Button) findViewById(R.id.button2);
		gameComponents.focusButton 	  = (Button) findViewById(R.id.button3);
		gameComponents.prayButton     = (Button) findViewById(R.id.button4);
		
		// Button Animations:
		gameComponents.animAlpha     = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
		gameComponents.animTranslate = AnimationUtils.loadAnimation(this, R.anim.anim_translate);
		gameComponents.gameOver      = AnimationUtils.loadAnimation(this, R.anim.game_over);
		
		//	Knight Animations:
		gameComponents.knightAttack_1 =  AnimationUtils.loadAnimation(this, R.anim.knight_attack_1);
        gameComponents.knightAttack_2  =  AnimationUtils.loadAnimation(this, R.anim.knight_attack_2);
        gameComponents.knightDefends_1 = AnimationUtils.loadAnimation(this, R.anim.dragon_defends_1);
        
        //	Dragon Animations:
        gameComponents.dragonAttack_1 =  AnimationUtils.loadAnimation(this, R.anim.dragon_attack_1);
        gameComponents.dragonAttack_2  =  AnimationUtils.loadAnimation(this, R.anim.dragon_attack_2);
        gameComponents.dragonDefends_1  =  AnimationUtils.loadAnimation(this, R.anim.dragon_defends_1);
		
		//	Game Character Data:
        gameComponents.knight = new player("Player");
        gameComponents.dragon = new player("Dragon");
           
        //	Sets custom font:      
        Typeface customFont = Typeface.createFromAsset(getAssets(), "8bitoperator.ttf");
        gameComponents.statusBarDisplay.setTypeface(customFont);
        gameComponents.playerLifeDisplay.setTypeface(customFont);
        gameComponents.playerPowerDisplay.setTypeface(customFont);
        
        //	Sets animation listeners:
        gameComponents.knightAttack_1.setAnimationListener(battleEngineAnimations.knightAttacks_1_Listener);
        gameComponents.knightAttack_2.setAnimationListener(battleEngineAnimations.knightAttacks_2_Listener);
        gameComponents.knightDefends_1.setAnimationListener(battleEngineAnimations.knightDefends_1_Listener);
        
        gameComponents.dragonAttack_1.setAnimationListener(battleEngineAnimations.dragonAttacks_1_Listener);
        gameComponents.dragonAttack_2.setAnimationListener(battleEngineAnimations.dragonAttacks_2_Listener);
        gameComponents.dragonDefends_1.setAnimationListener(battleEngineAnimations.dragonDefends_1_Listener);
        
        //	End of Game Animation:
        gameComponents.gameOver.setAnimationListener(battleEngineAnimations.gameOver_Listener);
         
 /** Event Handlers **/
        
        gameComponents.attackButton.setOnClickListener( new View.OnClickListener() {

            public void onClick(View v) {
            	
            	gameComponents.currentView = v;
            	 battleEngine.playerAttacks();
            }
            	
        });
        
        gameComponents.defenseButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	
            	gameComponents.currentView = v;
            	battleEngine.playerDefends();
            	
            	
            }
        });
        
        gameComponents.focusButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	
            	gameComponents.currentView = v;
            	battleEngine.playerFocuses();
                 
            }
        });
        
        gameComponents.prayButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	
            	gameComponents.currentView = v;
            	battleEngine.playerPrays();
                 
                 
            }
        });
        
    }

    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
 public void menuAnimation() {
        
    	
    
    }
    
}
