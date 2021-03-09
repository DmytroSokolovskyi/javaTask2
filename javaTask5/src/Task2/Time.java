package Task2;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode

public class Time {
    private int hour;
    private int min;


    public void setMin(int min) {
        if (0 > min || min > 59) {
            this.min = 0;
        } else {
            this.min = min;
        }
    }

    public void setHour(int hour) {
        if (0 > hour || hour > 24) {
            this.min = 0;
        } else {
            this.hour = hour;
        }
    }




    public Time sumTime(Time somehour) {
        int sumH = somehour.getHour() + this.hour;
        int sumM = somehour.getMin() + this.min;
        if (sumH > 24) {
            sumH = sumH - 24;
        }
        if (sumM > 60) {
            sumH++;
            sumM = sumM - 60;
        }
        return new Time(sumH, sumM);
    }


    @Override
    public String toString() {
        return  hour +
                ":" + min;
    }
}
