package com.luv2code.springdemo;



public class BaseballCoach implements Coach {
	
    
    private FurtuneService furtuneServiceImp;

    public BaseballCoach(FurtuneService furtuneServiceImp) {
        this.furtuneServiceImp = furtuneServiceImp;
    }

    
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

    @Override
    public String getDailyFurtune() {
        return furtuneServiceImp.getDailyFurtune();
    }


    

}








