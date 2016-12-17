package com.example.battledisplay;
import java.util.Random;

public class player {

	private int life = 100;
	private int power = 0;
	private int maxLife = 100;
	private int maxPower = 100;
	private int defense = 0;
	private String status;
	private String name;
	
	public player (String name) {
		
		this.name = name;
		
	}
	
	public void attack(player Enemy) {
		
	//  Damage dealt to enemy by player:
		
		int attack;
		
		if (this.getPower() > 0) {
		
			 attack = this.getPower();
			
		} else {
		
			 attack = 1;
			
		}
		
        int damage =  attack - Enemy.getDefense();
        
        if (damage < 0) {
        	
        	damage = 0;
        	
        }
        
        Enemy.setLife(Enemy.getLife()  - damage);
               
    //  Resets opponent defense:    
        Enemy.setDefense(0);
        
    //  Resets player power:
        this.setPower(0);
  
    //  Updates status:
        this.setStatus(this.getName() + " attacks " 
                + Enemy.getName()  + " for " 
                + damage + " point(s) of damage!");
		
		
	}
	
	  public void defend() {
	      
	    //  Converts player 'power' into player 'defense':  
	        this.setDefense(this.getDefense() + this.getPower() + 1);
	        
	    //  Resets player power:  
	        this.setPower(0);
	        
	    //  Updates status:
	        this.setStatus(this.getName() + " defends!");
		       
	}
		    
	public void focus() {
		    
    //  Ensure that power level is never greater than maximum value:
        if (this.getPower() < this.getMaxPower()) {
                   
       /* 
        *  Increases player's 'power' by a random threshold 
        *  that grows as player's life decreases: 
        */
        	     
           
           int powerIncrease = (int) (Math.random() * (this.getMaxLife()  - this.getLife()) + 1);
           
           if (powerIncrease <= 0) {
        	   
        	   powerIncrease = 1;
        	   
           }
           
           int newPower = this.getPower() + powerIncrease;
           
	           	if (newPower > 0 && newPower < this.getMaxPower()) {
	           		
	           		this.setPower(newPower);
	           		
	           	} else if (newPower >= this.getMaxPower()) {
	           		
	           		this.setPower(this.getMaxPower());
	           		
	           	} else {
	           		
	           		this.setPower(1);
	           	}
          
    
        //  Updates status:
            this.setStatus(this.getName() + " increases power by "
                           + powerIncrease + " point(s)!");
          
        } else {
           
            // Update status:
               this.setStatus("MAX POWER level reached!!!111");
            
        }
        
     gameComponents.playerLifeDisplay.setText("Life " + gameComponents.knight.getLife() + " / " + gameComponents.knight.getMaxLife());
     
    }
		    
	public void pray() {
		    
	    //  Ensure that life is never greater than maximum value:
	        if (this.getLife() < this.getMaxLife()) {   
	            
	        //  Convert player power into player life: 
	            int lifeIncrease = this.getPower() + 1;
	            
	            if ((lifeIncrease + this.getLife()) > this.getMaxLife()) {
	            	
	            	this.setLife(this.getMaxLife());
	            	this.setStatus("Maximum Life REACHED!!!");
	            	
	            } else {
	            	
	            	this.setLife(lifeIncrease + this.getLife());
	            	this.setStatus(this.getName() + " increases life by " + lifeIncrease + " point(s)!");
	            }
	            
	            

	        //  Reset player power:    
	            this.setPower(0);
	           
	        
	        } else {
	            
	             // Update status:
	                this.setStatus("You can't be anymore healthy!!! :(");
	        
	        }
	        
	    } 
	
	public String getName() {
		
		return this.name;
		
	}
	
	
	public int getLife() {
		
		return this.life;
		
	}
	
	public int getMaxLife() {
		
		return this.maxLife;
		
	}
	
	public int getPower() {
		
		return this.power;
		
	}
	
	public int getMaxPower() {
		
		return this.maxPower;
		
	}
	
	
	public int getDefense() {
		
		return this.defense;
		
	}
	
	public String getStatus() {
		
		return this.status;
		
	}
	
	public void setLife(int life) {
		
		this.life = life;
		
	}
	
	public void setDefense(int defense) {
	
		this.defense = defense;
		
	}
	
	public void setPower(int power) {
		
		this.power = power;
		
	}
	
	public void setStatus(String status) {
		
		this.status = status;
		
	}
 	
}
