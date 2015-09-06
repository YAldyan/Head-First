/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.ObserverPattern;

import java.util.ArrayList;

/**
 *
 * @author 7
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature ;
    private float humidity;
    private float pressure ;
    
    public WeatherData(){
        this.observers = new ArrayList<Observer>();
    }
    
    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeObserver(Observer o) {
        int i = this.observers.indexOf(o);
        if(i>=0){
            this.observers.remove(i);
        }
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyObserver() {
        for(int i=0;i<this.observers.size();i++){
            Observer observer = (Observer) this.observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
        //To change body of generated methods, choose Tools | Templates.
    }
    
    public void measurementChanged(){
        notifyObserver();
    }
    
    public void setMeasurement(float temperature, float humadity, float pressure){
        this.temperature = temperature;
        this.humidity = humadity;
        this.pressure = pressure;
        measurementChanged();
    }
}
