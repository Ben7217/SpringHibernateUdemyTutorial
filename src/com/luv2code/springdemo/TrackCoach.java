package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {

    }

    @Override
    public String getDailyWorkout() {
        return "Run 5 miles";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }

    /**
     * The methods should be public void
     The methods should be no-arg, meaning they shouldn't accept any method arguments.
     */
    private void doMyStartupStuff() {
        System.out.println("inside trackcoach method domystartupstuff");
    }


    // add destroy method:
    private void doMyCleanupStuff() {
        System.out.println("inside trackoach method doMyCleanUp");
    }
}
