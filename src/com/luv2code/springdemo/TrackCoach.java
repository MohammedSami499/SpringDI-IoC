package com.luv2code.springdemo;



public class TrackCoach implements Coach {
    
    private FurtuneService fsi;

    public TrackCoach(FurtuneService fsi) {
        this.fsi = fsi;
    }
    

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

    @Override
    public String getDailyFurtune() {
        return fsi.getDailyFurtune();
    }


}










