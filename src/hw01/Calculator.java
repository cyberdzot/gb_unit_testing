package hw01;

public class Calculator {

    /**
     * @param purchaseAmount сумма покупки
     * @param discountAmount размер скидки
     * @return возвращает сумму покупки с учетом скидки
     */
    public static double calculateDiscount(double purchaseAmount, int discountAmount) {
        // в дз только непонятка, что нужно бросать ArithmeticException
        // но тут явное деление только на 100 будет...
        // логичнее будет сделать так:
        if (purchaseAmount < 0 || discountAmount < 0 || discountAmount > 100) {
            throw new IllegalArgumentException("Incorrect discount amount");
        }
        return purchaseAmount - (purchaseAmount * discountAmount / 100);
    }
}