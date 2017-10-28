import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static java.time.DayOfWeek.SUNDAY;

public class Person {
    int zipCode;
    String state;
    boolean canBuy;
    Person(int zipCode){
        this.zipCode = zipCode;
        this.state = returnState(zipCode);
        this.canBuy = canBuyBeer(this.state);
    }
    public String returnState(int zipCode){
        if (zipCode >= 73301 && zipCode <= 88595 ){
            return "TEXAS";
        }
        else{
            return "UNKNOWN";
        }
    }
    public boolean canBuyBeer(String state){

        LocalDateTime currentTime = LocalDateTime.now();
        LocalTime time = LocalTime.parse("11:22");
        DayOfWeek dayOfWeek = currentTime.getDayOfWeek();

        if(state == "TEXAS"){
            if(dayOfWeek != SUNDAY){
                if(time.isAfter( LocalTime.of(7,0)) &&  time.isBefore(LocalTime.of(23,59))){
                    return true;
                }
            }
            else if(dayOfWeek == SUNDAY){
                if(time.isBefore(LocalTime.of(1,0)) || time.isAfter(LocalTime.of(12,0))){
                    return true;
                }
            }
            else{
                return false;
            }
        }
        return false;
    }
}
