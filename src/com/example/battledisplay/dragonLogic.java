package com.example.battledisplay;

public class dragonLogic {
	
	//	ATTACK
	
	static public void counterAttack() {
		switch(battleEngine.getStatus(gameComponents.dragon)) {
		case 0:
			dragonLogic.counterHighAttack();
			break;
		case 1:
			dragonLogic.counterMediumAttack();
			break;
		case 2:
			dragonLogic.counterLowAttack();
			break;
		case 3:
			dragonLogic.counterCriticalAttack();
			break;
		}
		
	}
	
	static public void counterHighAttack() {
		switch(battleEngine.getStatus(gameComponents.knight)) {
		case 0:
			battleEngine.dragonAttacks();
			break;
		case 1:
			battleEngine.dragonAttacks();
			break;
		case 2:
			battleEngine.dragonAttacks();
			break;
		case 3:
			battleEngine.dragonAttacks();
			break;
		}
		
	}
	
	static public void counterMediumAttack() {
		switch(battleEngine.getStatus(gameComponents.knight)) {
		case 0:
			battleEngine.dragonAttacks();
			break;
		case 1:
			battleEngine.dragonAttacks();
			break;
		case 2:
			battleEngine.dragonDefends();
			break;
		case 3:
			battleEngine.dragonDefends();
			break;
		}
	}
	
	static public void counterLowAttack() {
		switch(battleEngine.getStatus(gameComponents.knight)) {
		case 0:
			battleEngine.dragonDefends();
			break;
		case 1:
			battleEngine.dragonDefends();
			break;
		case 2:
			battleEngine.dragonAttacks();
			break;
		case 3:
			battleEngine.dragonAttacks();
			break;
		}
		
	}
	
	static public void counterCriticalAttack() {
		switch(battleEngine.getStatus(gameComponents.knight)) {
		case 0:
			battleEngine.dragonPrays();
			break;
		case 1:
			battleEngine.dragonPrays();
			break;
		case 2:
			battleEngine.dragonAttacks();
			break;
		case 3:
			battleEngine.dragonAttacks();
			break;
		}
		
	}
	
	//	DEFEND
	
	static public void counterDefend() {
		switch(battleEngine.getStatus(gameComponents.dragon)) {
		case 0:
			dragonLogic.counterHighDefend();
			break;
		case 1:
			dragonLogic.counterMediumDefend();
			break;
		case 2:
			dragonLogic.counterLowDefend();
			break;
		case 3:
			dragonLogic.counterCriticalDefend();
			break;
		}
		
	}
	
	static public void counterHighDefend() {
		switch(battleEngine.getStatus(gameComponents.knight)) {
		case 0:
			battleEngine.dragonFocuses();
			break;
		case 1:
			battleEngine.dragonFocuses();
			break;
		case 2:
			battleEngine.dragonFocuses();
			break;
		case 3:
			battleEngine.dragonFocuses();
			break;
		}
		
	}
	
	static public void counterMediumDefend() {
		switch(battleEngine.getStatus(gameComponents.knight)) {
		case 0:
			battleEngine.dragonPrays();
			break;
		case 1:
			battleEngine.dragonFocuses();
			break;
		case 2:
			battleEngine.dragonFocuses();
			break;
		case 3:
			battleEngine.dragonFocuses();
			break;
		}
	}
	
	static public void counterLowDefend() {
		switch(battleEngine.getStatus(gameComponents.knight)) {
		case 0:
			battleEngine.dragonPrays();
			break;
		case 1:
			battleEngine.dragonPrays();
			break;
		case 2:
			battleEngine.dragonFocuses();
			break;
		case 3:
			battleEngine.dragonPrays();
			break;
		}
		
	}
	
	static public void counterCriticalDefend() {
		switch(battleEngine.getStatus(gameComponents.knight)) {
		case 0:
			battleEngine.dragonPrays();
			break;
		case 1:
			battleEngine.dragonPrays();
			break;
		case 2:
			battleEngine.dragonPrays();
			break;
		case 3:
			battleEngine.dragonFocuses();
			break;
		}
		
	}

	//	FOCUS
	
	static public void counterFocus() {
		switch(battleEngine.getStatus(gameComponents.dragon)) {
		case 0:
			dragonLogic.counterHighFocus();
			break;
		case 1:
			dragonLogic.counterMediumFocus();
			break;
		case 2:
			dragonLogic.counterLowFocus();
			break;
		case 3:
			dragonLogic.counterCriticalFocus();
			break;
		}
		
	}
	
	static public void counterHighFocus() {
		switch(battleEngine.getStatus(gameComponents.knight)) {
		case 0:
			battleEngine.dragonDefends();
			break;
		case 1:
			battleEngine.dragonAttacks();
			break;
		case 2:
			battleEngine.dragonFocuses();
			break;
		case 3:
			battleEngine.dragonAttacks();
			break;
		}
		
	}
	
	static public void counterMediumFocus() {
		switch(battleEngine.getStatus(gameComponents.knight)) {
		case 0:
			battleEngine.dragonAttacks();
			break;
		case 1:
			battleEngine.dragonAttacks();
			break;
		case 2:
			battleEngine.dragonFocuses();
			break;
		case 3:
			battleEngine.dragonFocuses();
			break;
		}
	}
	
	static public void counterLowFocus() {
		switch(battleEngine.getStatus(gameComponents.knight)) {
		case 0:
			battleEngine.dragonFocuses();
			break;
		case 1:
			battleEngine.dragonAttacks();
			break;
		case 2:
			battleEngine.dragonFocuses();
			break;
		case 3:
			battleEngine.dragonDefends();
			break;
		}
		
	}
	
	static public void counterCriticalFocus() {
		switch(battleEngine.getStatus(gameComponents.knight)) {
		case 0:
			battleEngine.dragonFocuses();
			break;
		case 1:
			battleEngine.dragonFocuses();
			break;
		case 2:
			battleEngine.dragonDefends();
			break;
		case 3:
			battleEngine.dragonDefends();
			break;
		}
		
	}
	
	//	PRAY
	
//	FOCUS
	
	static public void counterPray() {
		switch(battleEngine.getStatus(gameComponents.dragon)) {
		case 0:
			dragonLogic.counterHighPray();
			break;
		case 1:
			dragonLogic.counterMediumPray();
			break;
		case 2:
			dragonLogic.counterLowPray();
			break;
		case 3:
			dragonLogic.counterCriticalPray();
			break;
		}
		
	}
	
	static public void counterHighPray() {
		switch(battleEngine.getStatus(gameComponents.knight)) {
		case 0:
			battleEngine.dragonAttacks();
			break;
		case 1:
			battleEngine.dragonAttacks();
			break;
		case 2:
			battleEngine.dragonAttacks();
			break;
		case 3:
			battleEngine.dragonAttacks();
			break;
		}
		
	}
	
	static public void counterMediumPray() {
		switch(battleEngine.getStatus(gameComponents.knight)) {
		case 0:
			battleEngine.dragonPrays();
			break;
		case 1:
			battleEngine.dragonAttacks();
			break;
		case 2:
			battleEngine.dragonFocuses();
			break;
		case 3:
			battleEngine.dragonAttacks();
			break;
		}
	}
	
	static public void counterLowPray() {
		switch(battleEngine.getStatus(gameComponents.knight)) {
		case 0:
			battleEngine.dragonPrays();
			break;
		case 1:
			battleEngine.dragonPrays();
			break;
		case 2:
			battleEngine.dragonFocuses();
			break;
		case 3:
			battleEngine.dragonAttacks();
			break;
		}
		
	}
	
	static public void counterCriticalPray() {
		switch(battleEngine.getStatus(gameComponents.knight)) {
		case 0:
			battleEngine.dragonPrays();
			break;
		case 1:
			battleEngine.dragonPrays();
			break;
		case 2:
			battleEngine.dragonPrays();
			break;
		case 3:
			battleEngine.dragonFocuses();
			break;
		}
		
	}
	
	
}
