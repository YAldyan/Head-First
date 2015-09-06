/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.IteratorPattern;

/**
 *
 * @author 7
 */
public class DinnerMenuIterator implements Iterator{

    Item[] items ;
    int position = 0 ;
    
    public DinnerMenuIterator(Item[] items){
        this.items = items ;
    }
    
    @Override
    public boolean hasNext() {
        if(position>=items.length || items[position] == null){
            return false;
        }
        else
            return true;
    }

    @Override
    public Object next() {
        Item item = items[position];
        position = position + 1;
        return item ;
    }
    
}
