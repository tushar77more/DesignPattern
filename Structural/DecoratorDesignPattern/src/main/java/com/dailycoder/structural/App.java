package com.dailycoder.structural;

import com.dailycoder.structural.decorator.Bike;
import com.dailycoder.structural.decorator.impl.LuxuryBike;
import com.dailycoder.structural.decorator.impl.NormalBike;
import com.dailycoder.structural.decorator.impl.SportBike;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
    		System.out.println("--------------------NormalBike-----------------------");
    		Bike basicBike = new NormalBike();
    		basicBike.assembledBike();
    		
    		System.out.println("---------------------LuxuryBike----------------------");
    		Bike luxuryBike = new LuxuryBike(basicBike);
    		luxuryBike.assembledBike();
    		
    		System.out.println("---------------------SportBike----------------------");
    		Bike sportBike = new SportBike(new NormalBike());
    		sportBike.assembledBike();
    		
    		System.out.println("---------------------Sport & luxury Bike----------------------");
    		
    		Bike sportLuxyBike = new SportBike(luxuryBike);
    		sportLuxyBike.assembledBike();
    }
}
