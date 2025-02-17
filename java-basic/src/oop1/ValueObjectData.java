package oop1;

public class ValueObjectData {
    int value;

    void add(ValueObjectData valueData) {
        valueData.value++;
        System.out.println("숫자 증가 value=" + valueData.value);
    }
}
