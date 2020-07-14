package com.github.perscholas.java_fundamentals;

/**
 * Created by Leon Hunter on 6/14/17.
 */
public class PredicateUtilities {
    /**
     * int x;
     * int y;
     * if(x>y)
     * return true;
     */
    public Boolean isGreaterThan(int x, int y) {
        if (x > y) return true;
        else return false;
    }

    /**
     * * @return true if `x` is less than `y`
     */
    public Boolean isLessThan(int x, int y) {


     if(x<y)
            return true;
     else
             return false;
}
    public Boolean isGreaterThanOrEqualTo(int x, int y) {
        if (x >= y)
            return true;
    else
        return false;

    }

    public Boolean isLessThanOrEqualTo(int x, int y) {
        if (x <= y)
            return true;
        else
            return false;
    }

    public Boolean returnTrue()
    {
        return true;
    }

    /**
     * @return false
     */
    public Boolean returnFalse() {
        return false;
    }

}