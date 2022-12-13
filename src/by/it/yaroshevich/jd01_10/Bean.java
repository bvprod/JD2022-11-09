package by.it.yaroshevich.jd01_10;

public class Bean {

    double min (int aValue, int bValue){
        return aValue<bValue
                ?aValue
                :bValue;
    }
    @Param(a = 34, b = 12)
    static double max (int aValue, int bValue){
        return aValue>bValue
                ?aValue
                :bValue;
    }
    @Param(a = 24, b = 56)
    static double sum (int aValue, int bValue){
        return aValue+bValue;
    }
    @Param(a = 11, b = 12)
    double avg (int aValue, int bValue){
        return (aValue+bValue)/2.0;
    }

}
