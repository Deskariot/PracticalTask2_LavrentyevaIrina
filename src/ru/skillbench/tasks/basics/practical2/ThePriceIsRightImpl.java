package ru.skillbench.tasks.basics.practical2;

/**
 * todo Document type ThePriceIsRightImpl
 */
public class ThePriceIsRightImpl implements ThePriceIsRight{

    private int price = 1000;

    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String checkPrice(int price) {
            if (this.getPrice() > price)
                return "lower";
            else if (this.getPrice() < price)
                return "higher";
            else if (this.getPrice() == price)
                return "The price is right!";
            else
                return "Something went wrong";
    }
}
