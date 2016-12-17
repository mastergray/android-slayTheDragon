package com.example.battledisplay;
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.*;

public class gameComponents {

	// Views:
	static public TextView statusBarDisplay;
	static public TextView playerLifeDisplay;
	static public TextView playerPowerDisplay;
	
	//	Image Views:
	static public ImageView knightView;
	static public ImageView dragonView;
	
	// Buttons:
	static public Button attackButton;
	static public Button defenseButton;
	static public Button focusButton;
	static public Button prayButton;
	
	// Button Animations:
	static public Animation animAlpha;
	static public Animation animTranslate;
	static public Animation gameOver;
	
	//	Knight Animations:
	static public Animation knightAttack_1;
	static public Animation knightAttack_2;
	static public Animation knightDefends_1;
	
	//	Dragon Animations:
	static public Animation dragonAttack_1;
	static public Animation dragonAttack_2;
	static public Animation dragonDefends_1;

	//	Game Character Data:
	static public player knight;
	static public player dragon;
	
	//	Current View;
	static public View currentView;
	
	
	
}
