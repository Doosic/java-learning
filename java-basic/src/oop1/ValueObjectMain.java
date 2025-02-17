package oop1;

public class ValueObjectMain {

    public static void main(String[] args) {
        ValueObjectData valueData = new ValueObjectData();
        valueData.add(valueData);
        valueData.add(valueData);
        valueData.add(valueData);
        System.out.println("최종 숫자=" + valueData.value);
    }

}
