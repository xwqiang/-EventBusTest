package com.kuyun.eventbus.multi;

import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.Subscribe;
import com.kuyun.eventbus.simple.TestEvent;

public class MultipleListener {
    public Integer lastInteger;  
    public Long lastLong;  
   
    @Subscribe  
    public void listenInteger(Integer event) {  
        lastInteger = event; 
        System.out.println("event Integer:"+lastInteger);
    }  
   
    @Subscribe  
    public void listenLong(Long event) {  
        lastLong = event; 
        System.out.println("event Long:"+lastLong);
    }  
    @Subscribe  
    public void listenEvent(TestEvent test) {  
//    	lastLong = event; 
    	System.out.println("event test:"+test);
    }  
    @Subscribe  
    public void listenEvent(DeadEvent test) {  
//    	lastLong = event; 
    	System.out.println("dead test:"+test);
    }  
   
    public Integer getLastInteger() {  
        return lastInteger;  
    }  
   
    public Long getLastLong() {  
        return lastLong;  
    }  
}