import java.util.Scanner;

class BinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        long number = scanner.nextLong();

        System.out.println("Значение в бинарном виде (тип данных long): " + Long.toBinaryString(number));
        System.out.println("Значение в бинарном виде (тип данных int): " + Integer.toBinaryString((int) number));
        System.out.println("Значение в бинарном виде (тип данных short): " + Integer.toBinaryString((short) number));
        System.out.println("Значение в бинарном виде (тип данных byte): " + Integer.toBinaryString((byte) number));
        System.out.println("Значение в бинарном виде (тип данных double): " + Long.toBinaryString(Double.doubleToRawLongBits(number)));
        System.out.println("Значение в бинарном виде (тип данных float): " + Integer.toBinaryString(Float.floatToRawIntBits((float) number)));
    }
}