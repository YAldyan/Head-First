/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.ObserverPattern;

/**
 *
 * @author 7
 */
public class CurrentConditionDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humadity;
    @SuppressWarnings("unused")
	private Subject weatherData;
    
    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData ;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp ;
        this.humadity = humidity;
        display();
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        
        System.out.println("Current Condition Display : "+temperature+ " F degrees and "+
                           humadity+" % humadity");
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
